/**
 * generated by Xtext 2.32.0
 */
package org.imta.botomation.botomation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verify Page Contains</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.imta.botomation.botomation.VerifyPageContains#getType <em>Type</em>}</li>
 *   <li>{@link org.imta.botomation.botomation.VerifyPageContains#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.imta.botomation.botomation.BotomationPackage#getVerifyPageContains()
 * @model
 * @generated
 */
public interface VerifyPageContains extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.imta.botomation.botomation.BotomationPackage#getVerifyPageContains_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.imta.botomation.botomation.VerifyPageContains#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see org.imta.botomation.botomation.BotomationPackage#getVerifyPageContains_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link org.imta.botomation.botomation.VerifyPageContains#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

} // VerifyPageContains
