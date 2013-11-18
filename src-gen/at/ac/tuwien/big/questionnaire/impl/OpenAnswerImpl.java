/**
 */
package at.ac.tuwien.big.questionnaire.impl;

import at.ac.tuwien.big.questionnaire.OpenAnswer;
import at.ac.tuwien.big.questionnaire.QuestionnairePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.OpenAnswerImpl#getAnswer <em>Answer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenAnswerImpl extends MinimalEObjectImpl.Container implements OpenAnswer
{
  /**
   * The default value of the '{@link #getAnswer() <em>Answer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswer()
   * @generated
   * @ordered
   */
  protected static final String ANSWER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAnswer() <em>Answer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswer()
   * @generated
   * @ordered
   */
  protected String answer = ANSWER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OpenAnswerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return QuestionnairePackage.Literals.OPEN_ANSWER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAnswer()
  {
    return answer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnswer(String newAnswer)
  {
    String oldAnswer = answer;
    answer = newAnswer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.OPEN_ANSWER__ANSWER, oldAnswer, answer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case QuestionnairePackage.OPEN_ANSWER__ANSWER:
        return getAnswer();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QuestionnairePackage.OPEN_ANSWER__ANSWER:
        setAnswer((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case QuestionnairePackage.OPEN_ANSWER__ANSWER:
        setAnswer(ANSWER_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case QuestionnairePackage.OPEN_ANSWER__ANSWER:
        return ANSWER_EDEFAULT == null ? answer != null : !ANSWER_EDEFAULT.equals(answer);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (answer: ");
    result.append(answer);
    result.append(')');
    return result.toString();
  }

} //OpenAnswerImpl
