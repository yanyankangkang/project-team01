

/* First created by JCasGen Sat Oct 18 19:40:19 EDT 2014 */
package edu.cmu.lti.oaqa.type.retrieval;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** A search result where the candidate answer is obtained as part of the search process and saved in the text field of the search result.
<<<<<<< HEAD
 * Updated by JCasGen Tue Dec 02 00:06:35 EST 2014
 * XML source: /home/mac/git/project-team01/project-team01/src/main/resources/type/OAQATypes.xml
=======
 * Updated by JCasGen Tue Dec 02 22:43:32 EST 2014
 * XML source: /Users/zhiyuel/git/project-team01/project-team01/src/main/resources/type/OAQATypes.xml
>>>>>>> origin/master
 * @generated */
public class AnswerSearchResult extends SearchResult {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerSearchResult.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AnswerSearchResult() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public AnswerSearchResult(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public AnswerSearchResult(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
}

    