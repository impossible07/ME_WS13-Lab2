/**
 */
package at.ac.tuwien.big.questionnaire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.Answers#getAnswers <em>Answers</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.Answers#getAnswer <em>Answer</em>}</li>
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
   * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answers</em>' containment reference list.
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getAnswers_Answers()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getAnswers();

  /**
   * Returns the value of the '<em><b>Answer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answer</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answer</em>' reference.
   * @see #setAnswer(ClosedAnswer)
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getAnswers_Answer()
   * @model
   * @generated
   */
  ClosedAnswer getAnswer();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.Answers#getAnswer <em>Answer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Answer</em>' reference.
   * @see #getAnswer()
   * @generated
   */
  void setAnswer(ClosedAnswer value);

} // Answers
