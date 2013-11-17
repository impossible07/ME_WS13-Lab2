/**
 */
package at.ac.tuwien.big.questionnaire.impl;

import at.ac.tuwien.big.questionnaire.Answers;
import at.ac.tuwien.big.questionnaire.ClosedQuestion;
import at.ac.tuwien.big.questionnaire.QuestionnairePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.AnswersImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnswersImpl extends MinimalEObjectImpl.Container implements Answers
{
  /**
   * The cached value of the '{@link #getQuestion() <em>Question</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestion()
   * @generated
   * @ordered
   */
  protected ClosedQuestion question;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnswersImpl()
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
    return QuestionnairePackage.Literals.ANSWERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClosedQuestion getQuestion()
  {
    if (question != null && question.eIsProxy())
    {
      InternalEObject oldQuestion = (InternalEObject)question;
      question = (ClosedQuestion)eResolveProxy(oldQuestion);
      if (question != oldQuestion)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.ANSWERS__QUESTION, oldQuestion, question));
      }
    }
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClosedQuestion basicGetQuestion()
  {
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuestion(ClosedQuestion newQuestion)
  {
    ClosedQuestion oldQuestion = question;
    question = newQuestion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.ANSWERS__QUESTION, oldQuestion, question));
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
      case QuestionnairePackage.ANSWERS__QUESTION:
        if (resolve) return getQuestion();
        return basicGetQuestion();
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
      case QuestionnairePackage.ANSWERS__QUESTION:
        setQuestion((ClosedQuestion)newValue);
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
      case QuestionnairePackage.ANSWERS__QUESTION:
        setQuestion((ClosedQuestion)null);
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
      case QuestionnairePackage.ANSWERS__QUESTION:
        return question != null;
    }
    return super.eIsSet(featureID);
  }

} //AnswersImpl
