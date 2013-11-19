/**
 */
package at.ac.tuwien.big.questionnaire.impl;

import at.ac.tuwien.big.questionnaire.LikertQuestion;
import at.ac.tuwien.big.questionnaire.QuestionnairePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Likert Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.LikertQuestionImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.LikertQuestionImpl#getHigher <em>Higher</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LikertQuestionImpl extends QuestionImpl implements LikertQuestion
{
  /**
   * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower()
   * @generated
   * @ordered
   */
  protected static final int LOWER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLower()
   * @generated
   * @ordered
   */
  protected int lower = LOWER_EDEFAULT;

  /**
   * The default value of the '{@link #getHigher() <em>Higher</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHigher()
   * @generated
   * @ordered
   */
  protected static final int HIGHER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHigher() <em>Higher</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHigher()
   * @generated
   * @ordered
   */
  protected int higher = HIGHER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LikertQuestionImpl()
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
    return QuestionnairePackage.Literals.LIKERT_QUESTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLower()
  {
    return lower;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLower(int newLower)
  {
    int oldLower = lower;
    lower = newLower;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.LIKERT_QUESTION__LOWER, oldLower, lower));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHigher()
  {
    return higher;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHigher(int newHigher)
  {
    int oldHigher = higher;
    higher = newHigher;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.LIKERT_QUESTION__HIGHER, oldHigher, higher));
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
      case QuestionnairePackage.LIKERT_QUESTION__LOWER:
        return getLower();
      case QuestionnairePackage.LIKERT_QUESTION__HIGHER:
        return getHigher();
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
      case QuestionnairePackage.LIKERT_QUESTION__LOWER:
        setLower((Integer)newValue);
        return;
      case QuestionnairePackage.LIKERT_QUESTION__HIGHER:
        setHigher((Integer)newValue);
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
      case QuestionnairePackage.LIKERT_QUESTION__LOWER:
        setLower(LOWER_EDEFAULT);
        return;
      case QuestionnairePackage.LIKERT_QUESTION__HIGHER:
        setHigher(HIGHER_EDEFAULT);
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
      case QuestionnairePackage.LIKERT_QUESTION__LOWER:
        return lower != LOWER_EDEFAULT;
      case QuestionnairePackage.LIKERT_QUESTION__HIGHER:
        return higher != HIGHER_EDEFAULT;
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
    result.append(" (lower: ");
    result.append(lower);
    result.append(", higher: ");
    result.append(higher);
    result.append(')');
    return result.toString();
  }

} //LikertQuestionImpl
