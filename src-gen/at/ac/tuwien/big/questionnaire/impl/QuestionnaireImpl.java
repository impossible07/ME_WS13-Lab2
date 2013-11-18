/**
 */
package at.ac.tuwien.big.questionnaire.impl;

import at.ac.tuwien.big.questionnaire.Group;
import at.ac.tuwien.big.questionnaire.Questionnaire;
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
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.QuestionnaireImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link at.ac.tuwien.big.questionnaire.impl.QuestionnaireImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionnaireImpl extends MinimalEObjectImpl.Container implements Questionnaire
{
  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroups()
   * @generated
   * @ordered
   */
  protected EList<Group> groups;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuestionnaireImpl()
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
    return QuestionnairePackage.Literals.QUESTIONNAIRE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuestionnairePackage.QUESTIONNAIRE__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Group> getGroups()
  {
    if (groups == null)
    {
      groups = new EObjectContainmentEList<Group>(Group.class, this, QuestionnairePackage.QUESTIONNAIRE__GROUPS);
    }
    return groups;
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
      case QuestionnairePackage.QUESTIONNAIRE__GROUPS:
        return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
      case QuestionnairePackage.QUESTIONNAIRE__TITLE:
        return getTitle();
      case QuestionnairePackage.QUESTIONNAIRE__GROUPS:
        return getGroups();
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
      case QuestionnairePackage.QUESTIONNAIRE__TITLE:
        setTitle((String)newValue);
        return;
      case QuestionnairePackage.QUESTIONNAIRE__GROUPS:
        getGroups().clear();
        getGroups().addAll((Collection<? extends Group>)newValue);
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
      case QuestionnairePackage.QUESTIONNAIRE__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case QuestionnairePackage.QUESTIONNAIRE__GROUPS:
        getGroups().clear();
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
      case QuestionnairePackage.QUESTIONNAIRE__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case QuestionnairePackage.QUESTIONNAIRE__GROUPS:
        return groups != null && !groups.isEmpty();
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
    result.append(" (title: ");
    result.append(title);
    result.append(')');
    return result.toString();
  }

} //QuestionnaireImpl
