/**
 */
package at.ac.tuwien.big.questionnaire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Closed Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.ClosedAnswer#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getClosedAnswer()
 * @model
 * @generated
 */
public interface ClosedAnswer extends Answer
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' reference list.
   * The list contents are of type {@link at.ac.tuwien.big.questionnaire.Question}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' reference list.
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#getClosedAnswer_Id()
   * @model
   * @generated
   */
  EList<Question> getId();

} // ClosedAnswer
