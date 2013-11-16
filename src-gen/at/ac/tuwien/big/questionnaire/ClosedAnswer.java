/**
 */
package at.ac.tuwien.big.questionnaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Closed Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.ClosedAnswer#getAnswer <em>Answer</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.ClosedAnswer#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getClosedAnswer()
 * @model
 * @generated
 */
public interface ClosedAnswer extends EObject
{
  /**
   * Returns the value of the '<em><b>Answer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answer</em>' attribute.
   * @see #setAnswer(String)
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getClosedAnswer_Answer()
   * @model
   * @generated
   */
  String getAnswer();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.ClosedAnswer#getAnswer <em>Answer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Answer</em>' attribute.
   * @see #getAnswer()
   * @generated
   */
  void setAnswer(String value);

  /**
   * Returns the value of the '<em><b>Question</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question</em>' reference.
   * @see #setQuestion(ClosedQuestion)
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getClosedAnswer_Question()
   * @model
   * @generated
   */
  ClosedQuestion getQuestion();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.ClosedAnswer#getQuestion <em>Question</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' reference.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(ClosedQuestion value);

} // ClosedAnswer
