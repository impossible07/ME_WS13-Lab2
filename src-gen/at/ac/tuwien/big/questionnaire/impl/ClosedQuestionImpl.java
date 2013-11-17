/**
 */
package at.ac.tuwien.big.questionnaire.impl;

import at.ac.tuwien.big.questionnaire.ClosedQuestion;
import at.ac.tuwien.big.questionnaire.QuestionnairePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Closed Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.ClosedQuestionImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.ClosedQuestionImpl#getAnswers <em>Answers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClosedQuestionImpl extends MinimalEObjectImpl.Container implements ClosedQuestion
{
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
   * The default value of the '{@link #getAnswers() <em>Answers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswers()
   * @generated
   * @ordered
   */
  protected static final String ANSWERS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAnswers() <em>Answers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswers()
   * @generated
   * @ordered
   */
  protected String answers = ANSWERS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClosedQuestionImpl()
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
    return QuestionnairePackage.Literals.CLOSED_QUESTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.CLOSED_QUESTION__QUESTION, oldQuestion, question));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAnswers()
  {
    return answers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnswers(String newAnswers)
  {
    String oldAnswers = answers;
    answers = newAnswers;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.CLOSED_QUESTION__ANSWERS, oldAnswers, answers));
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
      case QuestionnairePackage.CLOSED_QUESTION__QUESTION:
        return getQuestion();
      case QuestionnairePackage.CLOSED_QUESTION__ANSWERS:
        return getAnswers();
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
      case QuestionnairePackage.CLOSED_QUESTION__QUESTION:
        setQuestion((String)newValue);
        return;
      case QuestionnairePackage.CLOSED_QUESTION__ANSWERS:
        setAnswers((String)newValue);
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
      case QuestionnairePackage.CLOSED_QUESTION__QUESTION:
        setQuestion(QUESTION_EDEFAULT);
        return;
      case QuestionnairePackage.CLOSED_QUESTION__ANSWERS:
        setAnswers(ANSWERS_EDEFAULT);
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
      case QuestionnairePackage.CLOSED_QUESTION__QUESTION:
        return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
      case QuestionnairePackage.CLOSED_QUESTION__ANSWERS:
        return ANSWERS_EDEFAULT == null ? answers != null : !ANSWERS_EDEFAULT.equals(answers);
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
    result.append(" (question: ");
    result.append(question);
    result.append(", answers: ");
    result.append(answers);
    result.append(')');
    return result.toString();
  }

} //ClosedQuestionImpl
