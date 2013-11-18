/**
 */
package at.ac.tuwien.big.questionnaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.OpenAnswer#getAnswer <em>Answer</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getOpenAnswer()
 * @model
 * @generated
 */
public interface OpenAnswer extends EObject
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
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getOpenAnswer_Answer()
   * @model
   * @generated
   */
  String getAnswer();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.OpenAnswer#getAnswer <em>Answer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Answer</em>' attribute.
   * @see #getAnswer()
   * @generated
   */
  void setAnswer(String value);

} // OpenAnswer
