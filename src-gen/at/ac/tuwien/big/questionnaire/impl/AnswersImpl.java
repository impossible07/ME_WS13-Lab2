/**
 */
package at.ac.tuwien.big.questionnaire.impl;

import at.ac.tuwien.big.questionnaire.Answer;
import at.ac.tuwien.big.questionnaire.Answers;
import at.ac.tuwien.big.questionnaire.DefAnswer;
import at.ac.tuwien.big.questionnaire.QuestionnairePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.AnswersImpl#getDefanswer <em>Defanswer</em>}</li>
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
  protected EList<Answer> answers;

  /**
   * The cached value of the '{@link #getDefanswer() <em>Defanswer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefanswer()
   * @generated
   * @ordered
   */
  protected DefAnswer defanswer;

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
  public EList<Answer> getAnswers()
  {
    if (answers == null)
    {
      answers = new EObjectContainmentEList<Answer>(Answer.class, this, QuestionnairePackage.ANSWERS__ANSWERS);
    }
    return answers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefAnswer getDefanswer()
  {
    return defanswer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefanswer(DefAnswer newDefanswer, NotificationChain msgs)
  {
    DefAnswer oldDefanswer = defanswer;
    defanswer = newDefanswer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuestionnairePackage.ANSWERS__DEFANSWER, oldDefanswer, newDefanswer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefanswer(DefAnswer newDefanswer)
  {
    if (newDefanswer != defanswer)
    {
      NotificationChain msgs = null;
      if (defanswer != null)
        msgs = ((InternalEObject)defanswer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.ANSWERS__DEFANSWER, null, msgs);
      if (newDefanswer != null)
        msgs = ((InternalEObject)newDefanswer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuestionnairePackage.ANSWERS__DEFANSWER, null, msgs);
      msgs = basicSetDefanswer(newDefanswer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.ANSWERS__DEFANSWER, newDefanswer, newDefanswer));
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
      case QuestionnairePackage.ANSWERS__DEFANSWER:
        return basicSetDefanswer(null, msgs);
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
      case QuestionnairePackage.ANSWERS__DEFANSWER:
        return getDefanswer();
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
        getAnswers().addAll((Collection<? extends Answer>)newValue);
        return;
      case QuestionnairePackage.ANSWERS__DEFANSWER:
        setDefanswer((DefAnswer)newValue);
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
      case QuestionnairePackage.ANSWERS__DEFANSWER:
        setDefanswer((DefAnswer)null);
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
      case QuestionnairePackage.ANSWERS__DEFANSWER:
        return defanswer != null;
    }
    return super.eIsSet(featureID);
  }

} //AnswersImpl
