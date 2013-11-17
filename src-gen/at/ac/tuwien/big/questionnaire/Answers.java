/**
 */
package at.ac.tuwien.big.questionnaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.Answers#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getAnswers()
 * @model
 * @generated
 */
public interface Answers extends EObject
{
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
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getAnswers_Question()
   * @model
   * @generated
   */
  ClosedQuestion getQuestion();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.Answers#getQuestion <em>Question</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' reference.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(ClosedQuestion value);

} // Answers
