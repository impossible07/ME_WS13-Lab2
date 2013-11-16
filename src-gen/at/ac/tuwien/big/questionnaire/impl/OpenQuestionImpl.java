/**
 */
package at.ac.tuwien.big.questionnaire.impl;

import at.ac.tuwien.big.questionnaire.OpenQuestion;
import at.ac.tuwien.big.questionnaire.QuestionnairePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.OpenQuestionImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.OpenQuestionImpl#isMultiline <em>Multiline</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.OpenQuestionImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenQuestionImpl extends MinimalEObjectImpl.Container implements OpenQuestion
{
  /**
   * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMandatory()
   * @generated
   * @ordered
   */
  protected static final boolean MANDATORY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMandatory()
   * @generated
   * @ordered
   */
  protected boolean mandatory = MANDATORY_EDEFAULT;

  /**
   * The default value of the '{@link #isMultiline() <em>Multiline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiline()
   * @generated
   * @ordered
   */
  protected static final boolean MULTILINE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMultiline() <em>Multiline</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiline()
   * @generated
   * @ordered
   */
  protected boolean multiline = MULTILINE_EDEFAULT;

  /**
   * The default value of the '{@link #getQuestion() <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestion()
   * @generated
   * @ordered
   */
  protected static final String QUESTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuestion() <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestion()
   * @generated
   * @ordered
   */
  protected String question = QUESTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OpenQuestionImpl()
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
    return QuestionnairePackage.Literals.OPEN_QUESTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMandatory()
  {
    return mandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMandatory(boolean newMandatory)
  {
    boolean oldMandatory = mandatory;
    mandatory = newMandatory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.OPEN_QUESTION__MANDATORY, oldMandatory, mandatory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMultiline()
  {
    return multiline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiline(boolean newMultiline)
  {
    boolean oldMultiline = multiline;
    multiline = newMultiline;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.OPEN_QUESTION__MULTILINE, oldMultiline, multiline));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQuestion()
  {
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuestion(String newQuestion)
  {
    String oldQuestion = question;
    question = newQuestion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.OPEN_QUESTION__QUESTION, oldQuestion, question));
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
      case QuestionnairePackage.OPEN_QUESTION__MANDATORY:
        return isMandatory();
      case QuestionnairePackage.OPEN_QUESTION__MULTILINE:
        return isMultiline();
      case QuestionnairePackage.OPEN_QUESTION__QUESTION:
        return getQuestion();
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
      case QuestionnairePackage.OPEN_QUESTION__MANDATORY:
        setMandatory((Boolean)newValue);
        return;
      case QuestionnairePackage.OPEN_QUESTION__MULTILINE:
        setMultiline((Boolean)newValue);
        return;
      case QuestionnairePackage.OPEN_QUESTION__QUESTION:
        setQuestion((String)newValue);
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
      case QuestionnairePackage.OPEN_QUESTION__MANDATORY:
        setMandatory(MANDATORY_EDEFAULT);
        return;
      case QuestionnairePackage.OPEN_QUESTION__MULTILINE:
        setMultiline(MULTILINE_EDEFAULT);
        return;
      case QuestionnairePackage.OPEN_QUESTION__QUESTION:
        setQuestion(QUESTION_EDEFAULT);
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
      case QuestionnairePackage.OPEN_QUESTION__MANDATORY:
        return mandatory != MANDATORY_EDEFAULT;
      case QuestionnairePackage.OPEN_QUESTION__MULTILINE:
        return multiline != MULTILINE_EDEFAULT;
      case QuestionnairePackage.OPEN_QUESTION__QUESTION:
        return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
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
    result.append(" (mandatory: ");
    result.append(mandatory);
    result.append(", multiline: ");
    result.append(multiline);
    result.append(", question: ");
    result.append(question);
    result.append(')');
    return result.toString();
  }

} //OpenQuestionImpl
