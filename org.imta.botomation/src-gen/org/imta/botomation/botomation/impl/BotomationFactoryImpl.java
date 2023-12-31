/**
 * generated by Xtext 2.32.0
 */
package org.imta.botomation.botomation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.imta.botomation.botomation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BotomationFactoryImpl extends EFactoryImpl implements BotomationFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BotomationFactory init()
  {
    try
    {
      BotomationFactory theBotomationFactory = (BotomationFactory)EPackage.Registry.INSTANCE.getEFactory(BotomationPackage.eNS_URI);
      if (theBotomationFactory != null)
      {
        return theBotomationFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BotomationFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BotomationFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BotomationPackage.BOTOMATION: return createBotomation();
      case BotomationPackage.BROWSER: return createBrowser();
      case BotomationPackage.ACTION: return createAction();
      case BotomationPackage.VERIFY_PAGE_CONTAINS: return createVerifyPageContains();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Botomation createBotomation()
  {
    BotomationImpl botomation = new BotomationImpl();
    return botomation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Browser createBrowser()
  {
    BrowserImpl browser = new BrowserImpl();
    return browser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VerifyPageContains createVerifyPageContains()
  {
    VerifyPageContainsImpl verifyPageContains = new VerifyPageContainsImpl();
    return verifyPageContains;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BotomationPackage getBotomationPackage()
  {
    return (BotomationPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BotomationPackage getPackage()
  {
    return BotomationPackage.eINSTANCE;
  }

} //BotomationFactoryImpl
