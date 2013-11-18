/**
 */
package at.ac.tuwien.big.questionnaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.OpenQuestion#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getOpenQuestion()
 * @model
 * @generated
 */
public interface OpenQuestion extends EObject
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
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getOpenQuestion_Question()
   * @model
   * @generated
   */
  String getQuestion();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.OpenQuestion#getQuestion <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' attribute.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(String value);

} // OpenQuestion
