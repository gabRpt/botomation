/**
 * generated by Xtext 2.32.0
 */
package org.imta.botomation.botomation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.imta.botomation.botomation.Action#getOpenURL <em>Open URL</em>}</li>
 *   <li>{@link org.imta.botomation.botomation.Action#getVerifyPageContains <em>Verify Page Contains</em>}</li>
 * </ul>
 *
 * @see org.imta.botomation.botomation.BotomationPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
  /**
   * Returns the value of the '<em><b>Open URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Open URL</em>' attribute.
   * @see #setOpenURL(String)
   * @see org.imta.botomation.botomation.BotomationPackage#getAction_OpenURL()
   * @model
   * @generated
   */
  String getOpenURL();

  /**
   * Sets the value of the '{@link org.imta.botomation.botomation.Action#getOpenURL <em>Open URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Open URL</em>' attribute.
   * @see #getOpenURL()
   * @generated
   */
  void setOpenURL(String value);

  /**
   * Returns the value of the '<em><b>Verify Page Contains</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verify Page Contains</em>' containment reference.
   * @see #setVerifyPageContains(VerifyPageContains)
   * @see org.imta.botomation.botomation.BotomationPackage#getAction_VerifyPageContains()
   * @model containment="true"
   * @generated
   */
  VerifyPageContains getVerifyPageContains();

  /**
   * Sets the value of the '{@link org.imta.botomation.botomation.Action#getVerifyPageContains <em>Verify Page Contains</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verify Page Contains</em>' containment reference.
   * @see #getVerifyPageContains()
   * @generated
   */
  void setVerifyPageContains(VerifyPageContains value);

} // Action
