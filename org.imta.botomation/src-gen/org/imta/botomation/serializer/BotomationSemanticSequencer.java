/*
 * generated by Xtext 2.32.0
 */
package org.imta.botomation.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.imta.botomation.botomation.BotomationPackage;
import org.imta.botomation.botomation.Browser;
import org.imta.botomation.botomation.VerifyPageContains;
import org.imta.botomation.services.BotomationGrammarAccess;

@SuppressWarnings("all")
public class BotomationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BotomationGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BotomationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BotomationPackage.ACTION:
				sequence_Action(context, (org.imta.botomation.botomation.Action) semanticObject); 
				return; 
			case BotomationPackage.BROWSER:
				if (rule == grammarAccess.getBotomationRule()) {
					sequence_Botomation_Browser(context, (Browser) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getBrowserRule()) {
					sequence_Browser(context, (Browser) semanticObject); 
					return; 
				}
				else break;
			case BotomationPackage.VERIFY_PAGE_CONTAINS:
				sequence_VerifyPageContains(context, (VerifyPageContains) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (openURL=STRING | verifyPageContains=VerifyPageContains)+
	 * </pre>
	 */
	protected void sequence_Action(ISerializationContext context, org.imta.botomation.botomation.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Botomation returns Browser
	 *
	 * Constraint:
	 *     (name=BROWSERNAME actions+=Action*)
	 * </pre>
	 */
	protected void sequence_Botomation_Browser(ISerializationContext context, Browser semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Browser returns Browser
	 *
	 * Constraint:
	 *     name=BROWSERNAME
	 * </pre>
	 */
	protected void sequence_Browser(ISerializationContext context, Browser semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BotomationPackage.Literals.BROWSER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BotomationPackage.Literals.BROWSER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBrowserAccess().getNameBROWSERNAMETerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VerifyPageContains returns VerifyPageContains
	 *
	 * Constraint:
	 *     (type=TYPE | target=STRING)+
	 * </pre>
	 */
	protected void sequence_VerifyPageContains(ISerializationContext context, VerifyPageContains semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
