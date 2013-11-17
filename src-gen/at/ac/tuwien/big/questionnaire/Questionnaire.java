/**
 */
package at.ac.tuwien.big.questionnaire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.Questionnaire#getTitle <em>Title</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.Questionnaire#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getQuestionnaire()
 * @model
 * @generated
 */
public interface Questionnaire extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getQuestionnaire_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link at.ac.tuwien.big.questionnaire.Questionnaire#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
   * The list contents are of type {@link at.ac.tuwien.big.questionnaire.Group}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groups</em>' containment reference list.
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getQuestionnaire_Groups()
   * @model containment="true"
   * @generated
   */
  EList<Group> getGroups();

} // Questionnaire
