/*
 * generated by Xtext 2.32.0
 */
package org.imta.botomation.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.imta.botomation.ide.contentassist.antlr.internal.InternalBotomationParser;
import org.imta.botomation.services.BotomationGrammarAccess;

public class BotomationParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(BotomationGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, BotomationGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
			builder.put(grammarAccess.getBotomationAccess().getGroup(), "rule__Botomation__Group__0");
			builder.put(grammarAccess.getBrowserAccess().getGroup(), "rule__Browser__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup_0(), "rule__Action__Group_0__0");
			builder.put(grammarAccess.getActionAccess().getGroup_1(), "rule__Action__Group_1__0");
			builder.put(grammarAccess.getVerifyPageContainsAccess().getGroup_0(), "rule__VerifyPageContains__Group_0__0");
			builder.put(grammarAccess.getVerifyPageContainsAccess().getGroup_1(), "rule__VerifyPageContains__Group_1__0");
			builder.put(grammarAccess.getBotomationAccess().getActionsAssignment_3(), "rule__Botomation__ActionsAssignment_3");
			builder.put(grammarAccess.getBrowserAccess().getNameAssignment_1(), "rule__Browser__NameAssignment_1");
			builder.put(grammarAccess.getActionAccess().getOpenURLAssignment_0_1(), "rule__Action__OpenURLAssignment_0_1");
			builder.put(grammarAccess.getActionAccess().getVerifyPageContainsAssignment_1_1(), "rule__Action__VerifyPageContainsAssignment_1_1");
			builder.put(grammarAccess.getVerifyPageContainsAccess().getTypeAssignment_0_1(), "rule__VerifyPageContains__TypeAssignment_0_1");
			builder.put(grammarAccess.getVerifyPageContainsAccess().getTargetAssignment_1_1(), "rule__VerifyPageContains__TargetAssignment_1_1");
			builder.put(grammarAccess.getVerifyPageContainsAccess().getUnorderedGroup(), "rule__VerifyPageContains__UnorderedGroup");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private BotomationGrammarAccess grammarAccess;

	@Override
	protected InternalBotomationParser createParser() {
		InternalBotomationParser result = new InternalBotomationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BotomationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BotomationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
