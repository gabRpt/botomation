/**
 * generated by Xtext 2.32.0
 */
package org.imta.botomation.botomation.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.imta.botomation.botomation.Action;
import org.imta.botomation.botomation.BotomationPackage;
import org.imta.botomation.botomation.VerifyPageContains;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.imta.botomation.botomation.impl.ActionImpl#getOpenURL <em>Open URL</em>}</li>
 *   <li>{@link org.imta.botomation.botomation.impl.ActionImpl#getVerifyPageContains <em>Verify Page Contains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
{
  /**
   * The default value of the '{@link #getOpenURL() <em>Open URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpenURL()
   * @generated
   * @ordered
   */
  protected static final String OPEN_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpenURL() <em>Open URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpenURL()
   * @generated
   * @ordered
   */
  protected String openURL = OPEN_URL_EDEFAULT;

  /**
   * The cached value of the '{@link #getVerifyPageContains() <em>Verify Page Contains</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerifyPageContains()
   * @generated
   * @ordered
   */
  protected VerifyPageContains verifyPageContains;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return BotomationPackage.Literals.ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOpenURL()
  {
    return openURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOpenURL(String newOpenURL)
  {
    String oldOpenURL = openURL;
    openURL = newOpenURL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BotomationPackage.ACTION__OPEN_URL, oldOpenURL, openURL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VerifyPageContains getVerifyPageContains()
  {
    return verifyPageContains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVerifyPageContains(VerifyPageContains newVerifyPageContains, NotificationChain msgs)
  {
    VerifyPageContains oldVerifyPageContains = verifyPageContains;
    verifyPageContains = newVerifyPageContains;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BotomationPackage.ACTION__VERIFY_PAGE_CONTAINS, oldVerifyPageContains, newVerifyPageContains);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVerifyPageContains(VerifyPageContains newVerifyPageContains)
  {
    if (newVerifyPageContains != verifyPageContains)
    {
      NotificationChain msgs = null;
      if (verifyPageContains != null)
        msgs = ((InternalEObject)verifyPageContains).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BotomationPackage.ACTION__VERIFY_PAGE_CONTAINS, null, msgs);
      if (newVerifyPageContains != null)
        msgs = ((InternalEObject)newVerifyPageContains).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BotomationPackage.ACTION__VERIFY_PAGE_CONTAINS, null, msgs);
      msgs = basicSetVerifyPageContains(newVerifyPageContains, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BotomationPackage.ACTION__VERIFY_PAGE_CONTAINS, newVerifyPageContains, newVerifyPageContains));
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
      case BotomationPackage.ACTION__VERIFY_PAGE_CONTAINS:
        return basicSetVerifyPageContains(null, msgs);
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
      case BotomationPackage.ACTION__OPEN_URL:
        return getOpenURL();
      case BotomationPackage.ACTION__VERIFY_PAGE_CONTAINS:
        return getVerifyPageContains();
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
      case BotomationPackage.ACTION__OPEN_URL:
        setOpenURL((String)newValue);
        return;
      case BotomationPackage.ACTION__VERIFY_PAGE_CONTAINS:
        setVerifyPageContains((VerifyPageContains)newValue);
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
      case BotomationPackage.ACTION__OPEN_URL:
        setOpenURL(OPEN_URL_EDEFAULT);
        return;
      case BotomationPackage.ACTION__VERIFY_PAGE_CONTAINS:
        setVerifyPageContains((VerifyPageContains)null);
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
      case BotomationPackage.ACTION__OPEN_URL:
        return OPEN_URL_EDEFAULT == null ? openURL != null : !OPEN_URL_EDEFAULT.equals(openURL);
      case BotomationPackage.ACTION__VERIFY_PAGE_CONTAINS:
        return verifyPageContains != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (openURL: ");
    result.append(openURL);
    result.append(')');
    return result.toString();
  }

} //ActionImpl
