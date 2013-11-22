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
 *   <li>{@link at.ac.tuwien.big.questionnaire.Answers#getDefanswer <em>Defanswer</em>}</li>
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
   * The list contents are of type {@link at.ac.tuwien.big.questionnaire.Answer}.
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
  EList<Answer> getAnswers();

  /**
   * Returns the value of the '<em><b>Defanswer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Defanswer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defanswer</em>' containment reference.
   * @see #setDefanswer(DefAnswer)
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getAnswers_Defanswer()
   * @model containment="true"
   * @generated
   */
  DefAnswer getDefanswer();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.Answers#getDefanswer <em>Defanswer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Defanswer</em>' containment reference.
   * @see #getDefanswer()
   * @generated
   */
  void setDefanswer(DefAnswer value);

} // Answers
