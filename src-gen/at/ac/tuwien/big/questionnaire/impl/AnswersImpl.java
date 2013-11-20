/**
 */
package at.ac.tuwien.big.questionnaire.impl;

import at.ac.tuwien.big.questionnaire.Answers;
import at.ac.tuwien.big.questionnaire.ClosedAnswer;
import at.ac.tuwien.big.questionnaire.QuestionnairePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.AnswersImpl#getAnswers <em>Answers</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.AnswersImpl#getAnswer <em>Answer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnswersImpl extends MinimalEObjectImpl.Container implements Answers
{
  /**
   * The cached value of the '{@link #getAnswers() <em>Answers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswers()
   * @generated
   * @ordered
   */
  protected EList<EObject> answers;

  /**
   * The cached value of the '{@link #getAnswer() <em>Answer</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswer()
   * @generated
   * @ordered
   */
  protected ClosedAnswer answer;

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
  public EList<EObject> getAnswers()
  {
    if (answers == null)
    {
      answers = new EObjectContainmentEList<EObject>(EObject.class, this, QuestionnairePackage.ANSWERS__ANSWERS);
    }
    return answers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClosedAnswer getAnswer()
  {
    if (answer != null && answer.eIsProxy())
    {
      InternalEObject oldAnswer = (InternalEObject)answer;
      answer = (ClosedAnswer)eResolveProxy(oldAnswer);
      if (answer != oldAnswer)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.ANSWERS__ANSWER, oldAnswer, answer));
      }
    }
    return answer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClosedAnswer basicGetAnswer()
  {
    return answer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnswer(ClosedAnswer newAnswer)
  {
    ClosedAnswer oldAnswer = answer;
    answer = newAnswer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.ANSWERS__ANSWER, oldAnswer, answer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case QuestionnairePackage.ANSWERS__ANSWERS:
        return ((InternalEList<?>)getAnswers()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case QuestionnairePackage.ANSWERS__ANSWERS:
        return getAnswers();
      case QuestionnairePackage.ANSWERS__ANSWER:
        if (resolve) return getAnswer();
        return basicGetAnswer();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QuestionnairePackage.ANSWERS__ANSWERS:
        getAnswers().clear();
        getAnswers().addAll((Collection<? extends EObject>)newValue);
        return;
      case QuestionnairePackage.ANSWERS__ANSWER:
        setAnswer((ClosedAnswer)newValue);
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
      case QuestionnairePackage.ANSWERS__ANSWERS:
        getAnswers().clear();
        return;
      case QuestionnairePackage.ANSWERS__ANSWER:
        setAnswer((ClosedAnswer)null);
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
      case QuestionnairePackage.ANSWERS__ANSWERS:
        return answers != null && !answers.isEmpty();
      case QuestionnairePackage.ANSWERS__ANSWER:
        return answer != null;
    }
    return super.eIsSet(featureID);
  }

} //AnswersImpl
