

/* First created by JCasGen Sat Oct 18 19:40:19 EDT 2014 */
package edu.cmu.lti.oaqa.type.answer;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;
import org.apache.uima.jcas.cas.TOP;


/** An exact answer text generated by the QA system.
<<<<<<< HEAD
 * Updated by JCasGen Tue Dec 02 00:06:35 EST 2014
 * XML source: /home/mac/git/project-team01/project-team01/src/main/resources/type/OAQATypes.xml
=======
 * Updated by JCasGen Tue Dec 02 22:43:32 EST 2014
 * XML source: /Users/zhiyuel/git/project-team01/project-team01/src/main/resources/type/OAQATypes.xml
>>>>>>> origin/master
 * @generated */
public class Answer extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Answer(JCas jcas) {
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
     
 
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets The actual answer string.
   * @generated
   * @return value of the feature 
   */
  public String getText() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "edu.cmu.lti.oaqa.type.answer.Answer");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Answer_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets The actual answer string. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setText(String v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "edu.cmu.lti.oaqa.type.answer.Answer");
    jcasType.ll_cas.ll_setStringValue(addr, ((Answer_Type)jcasType).casFeatCode_text, v);}    
   
    
  //*--------------*
  //* Feature: variants

  /** getter for variants - gets List of candidate answer variant ids that were merged into this final answer.
   * @generated
   * @return value of the feature 
   */
  public StringList getVariants() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_variants == null)
      jcasType.jcas.throwFeatMissing("variants", "edu.cmu.lti.oaqa.type.answer.Answer");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_variants)));}
    
  /** setter for variants - sets List of candidate answer variant ids that were merged into this final answer. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setVariants(StringList v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_variants == null)
      jcasType.jcas.throwFeatMissing("variants", "edu.cmu.lti.oaqa.type.answer.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_variants, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: rank

  /** getter for rank - gets Rank of this result in the original hit-list.
   * @generated
   * @return value of the feature 
   */
  public int getRank() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_rank == null)
      jcasType.jcas.throwFeatMissing("rank", "edu.cmu.lti.oaqa.type.answer.Answer");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Answer_Type)jcasType).casFeatCode_rank);}
    
  /** setter for rank - sets Rank of this result in the original hit-list. 
   * @generated
   * @param v value to set into the feature 
   */
  public void setRank(int v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_rank == null)
      jcasType.jcas.throwFeatMissing("rank", "edu.cmu.lti.oaqa.type.answer.Answer");
    jcasType.ll_cas.ll_setIntValue(addr, ((Answer_Type)jcasType).casFeatCode_rank, v);}    
   
    
  //*--------------*
  //* Feature: docScore

  /** getter for docScore - gets doc similarity with query

   * @generated
   * @return value of the feature 
   */
  public double getDocScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_docScore == null)
      jcasType.jcas.throwFeatMissing("docScore", "edu.cmu.lti.oaqa.type.answer.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_docScore);}
    
  /** setter for docScore - sets doc similarity with query
 
   * @generated
   * @param v value to set into the feature 
   */
  public void setDocScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_docScore == null)
      jcasType.jcas.throwFeatMissing("docScore", "edu.cmu.lti.oaqa.type.answer.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_docScore, v);}    
   
    
  //*--------------*
  //* Feature: posScore

  /** getter for posScore - gets positive terms
   * @generated
   * @return value of the feature 
   */
  public double getPosScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_posScore == null)
      jcasType.jcas.throwFeatMissing("posScore", "edu.cmu.lti.oaqa.type.answer.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_posScore);}
    
  /** setter for posScore - sets positive terms 
   * @generated
   * @param v value to set into the feature 
   */
  public void setPosScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_posScore == null)
      jcasType.jcas.throwFeatMissing("posScore", "edu.cmu.lti.oaqa.type.answer.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_posScore, v);}    
   
    
  //*--------------*
  //* Feature: negScore

  /** getter for negScore - gets negative term
   * @generated
   * @return value of the feature 
   */
  public double getNegScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_negScore == null)
      jcasType.jcas.throwFeatMissing("negScore", "edu.cmu.lti.oaqa.type.answer.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_negScore);}
    
  /** setter for negScore - sets negative term 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNegScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_negScore == null)
      jcasType.jcas.throwFeatMissing("negScore", "edu.cmu.lti.oaqa.type.answer.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_negScore, v);}    
   
    
  //*--------------*
  //* Feature: sectionScore

  /** getter for sectionScore - gets section in one paragraph
   * @generated
   * @return value of the feature 
   */
  public double getSectionScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_sectionScore == null)
      jcasType.jcas.throwFeatMissing("sectionScore", "edu.cmu.lti.oaqa.type.answer.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_sectionScore);}
    
  /** setter for sectionScore - sets section in one paragraph 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSectionScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_sectionScore == null)
      jcasType.jcas.throwFeatMissing("sectionScore", "edu.cmu.lti.oaqa.type.answer.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_sectionScore, v);}    
   
    
  //*--------------*
  //* Feature: goldAnswer

  /** getter for goldAnswer - gets 
   * @generated
   * @return value of the feature 
   */
  public double getGoldAnswer() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_goldAnswer == null)
      jcasType.jcas.throwFeatMissing("goldAnswer", "edu.cmu.lti.oaqa.type.answer.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_goldAnswer);}
    
  /** setter for goldAnswer - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setGoldAnswer(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_goldAnswer == null)
      jcasType.jcas.throwFeatMissing("goldAnswer", "edu.cmu.lti.oaqa.type.answer.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_goldAnswer, v);}    
  }

    