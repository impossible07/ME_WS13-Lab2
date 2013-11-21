/**
 */
package at.ac.tuwien.big.questionnaire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.DefAnswer#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getDefAnswer()
 * @model
 * @generated
 */
public interface DefAnswer extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' reference list.
   * The list contents are of type {@link at.ac.tuwien.big.questionnaire.Answer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' reference list.
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getDefAnswer_Id()
   * @model
   * @generated
   */
  EList<Answer> getId();

} // DefAnswer
