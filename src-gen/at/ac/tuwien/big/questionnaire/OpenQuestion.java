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
 *   <li>{@link at.ac.tuwien.big.questionnaire.OpenQuestion#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.OpenQuestion#isMultiline <em>Multiline</em>}</li>
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
   * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mandatory</em>' attribute.
   * @see #setMandatory(boolean)
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getOpenQuestion_Mandatory()
   * @model
   * @generated
   */
  boolean isMandatory();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.OpenQuestion#isMandatory <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mandatory</em>' attribute.
   * @see #isMandatory()
   * @generated
   */
  void setMandatory(boolean value);

  /**
   * Returns the value of the '<em><b>Multiline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiline</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiline</em>' attribute.
   * @see #setMultiline(boolean)
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getOpenQuestion_Multiline()
   * @model
   * @generated
   */
  boolean isMultiline();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.OpenQuestion#isMultiline <em>Multiline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiline</em>' attribute.
   * @see #isMultiline()
   * @generated
   */
  void setMultiline(boolean value);

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
