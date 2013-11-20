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
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.AnswersImpl#getName <em>Name</em>}</li>
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
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected ClosedAnswer name;

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
  public ClosedAnswer getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (ClosedAnswer)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuestionnairePackage.ANSWERS__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClosedAnswer basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(ClosedAnswer newName)
  {
    ClosedAnswer oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.ANSWERS__NAME, oldName, name));
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
      case QuestionnairePackage.ANSWERS__NAME:
        if (resolve) return getName();
        return basicGetName();
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
      case QuestionnairePackage.ANSWERS__NAME:
        setName((ClosedAnswer)newValue);
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
      case QuestionnairePackage.ANSWERS__NAME:
        setName((ClosedAnswer)null);
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
      case QuestionnairePackage.ANSWERS__NAME:
        return name != null;
    }
    return super.eIsSet(featureID);
  }

} //AnswersImpl
