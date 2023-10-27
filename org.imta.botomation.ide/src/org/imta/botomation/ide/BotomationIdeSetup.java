/*
 * generated by Xtext 2.32.0
 */
package org.imta.botomation.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.imta.botomation.BotomationRuntimeModule;
import org.imta.botomation.BotomationStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class BotomationIdeSetup extends BotomationStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new BotomationRuntimeModule(), new BotomationIdeModule()));
	}
	
}