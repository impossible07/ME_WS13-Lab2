/**
 */
package at.ac.tuwien.big.questionnaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Likert Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.LikertQuestion#getQuestion <em>Question</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.LikertQuestion#getLower <em>Lower</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.LikertQuestion#getHigher <em>Higher</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getLikertQuestion()
 * @model
 * @generated
 */
public interface LikertQuestion extends EObject
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
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getLikertQuestion_Question()
   * @model
   * @generated
   */
  String getQuestion();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.LikertQuestion#getQuestion <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' attribute.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(String value);

  /**
   * Returns the value of the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower</em>' attribute.
   * @see #setLower(int)
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getLikertQuestion_Lower()
   * @model
   * @generated
   */
  int getLower();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.LikertQuestion#getLower <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower</em>' attribute.
   * @see #getLower()
   * @generated
   */
  void setLower(int value);

  /**
   * Returns the value of the '<em><b>Higher</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Higher</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Higher</em>' attribute.
   * @see #setHigher(int)
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getLikertQuestion_Higher()
   * @model
   * @generated
   */
  int getHigher();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.LikertQuestion#getHigher <em>Higher</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Higher</em>' attribute.
   * @see #getHigher()
   * @generated
   */
  void setHigher(int value);

} // LikertQuestion
