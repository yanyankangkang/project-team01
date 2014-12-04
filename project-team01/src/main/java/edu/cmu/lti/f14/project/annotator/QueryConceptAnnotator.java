package edu.cmu.lti.f14.project.annotator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.resource.ResourceInitializationException;

import util.ConcpetWebService;
import util.Utils;
import edu.cmu.lti.oaqa.bio.bioasq.services.GoPubMedService;
import edu.cmu.lti.oaqa.bio.bioasq.services.OntologyServiceResponse;
import edu.cmu.lti.oaqa.bio.bioasq.services.OntologyServiceResponse.Finding;
import edu.cmu.lti.oaqa.type.kb.Concept;
import edu.cmu.lti.oaqa.type.retrieval.AtomicQueryConcept;
import edu.cmu.lti.oaqa.type.retrieval.ComplexQueryConcept;
import edu.cmu.lti.oaqa.type.retrieval.ConceptSearchResult;

/**
 * Retrieve concepts with complex query.
 * 
 * @author xzhan
 *
 */

public class QueryConceptAnnotator extends JCasAnnotator_ImplBase  {

  GoPubMedService goService;
  
  /**
   * Initialize the PubMedService
   * 
   * @param UimaContext
   * 
   */
  public void initialize(UimaContext aContext) throws ResourceInitializationException {
    super.initialize(aContext);
    
    try {
      goService = new GoPubMedService("project.properties");
    } catch (ConfigurationException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();     
    }
    
    
  }
  
  /**
   * use service to get answers
   * 
   * @see org.apache.uima.analysis_component.JCasAnnotator_ImplBase#process(org.apache.uima.jcas.JCas)
   */
  @Override
  public void process(JCas aJCas) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    FSIterator<TOP> iter = aJCas.getJFSIndexRepository().getAllIndexedFS(ComplexQueryConcept.type);
    while(iter.hasNext()){
      //String result = "";
      ComplexQueryConcept cqc = (ComplexQueryConcept) iter.next();
      FSList fslist = cqc.getOperatorArgs();
      ArrayList<AtomicQueryConcept> arraylist = Utils.fromFSListToCollection(fslist, AtomicQueryConcept.class);
      
      // content in the query of each AtomicQuery
      String queryText = arraylist.get(0).getText();
      
      // 
//      OntologyServiceResponse.Result uniprotResult = null;
      List<Finding> result = null;
      //        uniprotResult = goService.findUniprotEntitiesPaged(queryText, 0);
      result = ConcpetWebService.getConceptWebService(goService, queryText);
      // store the rank of each answer
      int rank = 0;
      // store the concept name
      String conceptLabel = "";
      // System.out.println("Disease ontology: " + diseaseOntologyResult.getFindings().size());
//      for (OntologyServiceResponse.Finding finding : uniprotResult.getFindings()) {
      for (OntologyServiceResponse.Finding finding : result) {
        conceptLabel = finding.getConcept().getLabel();
        Concept concept = new Concept(aJCas);
        concept.setName(conceptLabel);
        concept.addToIndexes();
        
        ConceptSearchResult conceptSearchResult = new ConceptSearchResult(aJCas);
        // set concept
        conceptSearchResult.setConcept(concept);
        // set attribute in the SearchResult
        conceptSearchResult.setText(finding.getConcept().getLabel());
        conceptSearchResult.setUri(finding.getConcept().getUri());//.replace("2012", "2014"));
        conceptSearchResult.setScore(finding.getScore());
        conceptSearchResult.setRank(rank);
        conceptSearchResult.setQueryString(queryText);
        conceptSearchResult.addToIndexes();
        rank++;   
      }           
    }
    
  }
}
