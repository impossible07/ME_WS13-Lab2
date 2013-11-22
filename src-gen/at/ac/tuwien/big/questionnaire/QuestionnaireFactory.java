/**
 */
package at.ac.tuwien.big.questionnaire;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage
 * @generated
 */
public interface QuestionnaireFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QuestionnaireFactory eINSTANCE = at.ac.tuwien.big.questionnaire.impl.QuestionnaireFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Questionnaire</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Questionnaire</em>'.
   * @generated
   */
  Questionnaire createQuestionnaire();

  /**
   * Returns a new object of class '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group</em>'.
   * @generated
   */
  Group createGroup();

  /**
   * Returns a new object of class '<em>Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Question</em>'.
   * @generated
   */
  Question createQuestion();

  /**
   * Returns a new object of class '<em>Open Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Open Question</em>'.
   * @generated
   */
  OpenQuestion createOpenQuestion();

  /**
   * Returns a new object of class '<em>Closed Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Closed Question</em>'.
   * @generated
   */
  ClosedQuestion createClosedQuestion();

  /**
   * Returns a new object of class '<em>Likert Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Likert Question</em>'.
   * @generated
   */
  LikertQuestion createLikertQuestion();

  /**
   * Returns a new object of class '<em>Answers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Answers</em>'.
   * @generated
   */
  Answers createAnswers();

  /**
   * Returns a new object of class '<em>Answer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Answer</em>'.
   * @generated
   */
  Answer createAnswer();

  /**
   * Returns a new object of class '<em>Open Answer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Open Answer</em>'.
   * @generated
   */
  OpenAnswer createOpenAnswer();

  /**
   * Returns a new object of class '<em>Closed Answer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Closed Answer</em>'.
   * @generated
   */
  ClosedAnswer createClosedAnswer();

  /**
   * Returns a new object of class '<em>Def Answer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Def Answer</em>'.
   * @generated
   */
  DefAnswer createDefAnswer();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  QuestionnairePackage getQuestionnairePackage();

} //QuestionnaireFactory
