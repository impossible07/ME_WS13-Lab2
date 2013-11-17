/**
 */
package at.ac.tuwien.big.questionnaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Closed Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.ClosedQuestion#getQuestion <em>Question</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.ClosedQuestion#getAnswers <em>Answers</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getClosedQuestion()
 * @model
 * @generated
 */
public interface ClosedQuestion extends EObject
{
  /**
   * Returns the value of the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question</em>' attribute.
   * @see #setQuestion(String)
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getClosedQuestion_Question()
   * @model
   * @generated
   */
  String getQuestion();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.ClosedQuestion#getQuestion <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' attribute.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(String value);

  /**
   * Returns the value of the '<em><b>Answers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answers</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answers</em>' attribute.
   * @see #setAnswers(String)
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getClosedQuestion_Answers()
   * @model
   * @generated
   */
  String getAnswers();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.ClosedQuestion#getAnswers <em>Answers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Answers</em>' attribute.
   * @see #getAnswers()
   * @generated
   */
  void setAnswers(String value);

} // ClosedQuestion
