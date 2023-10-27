package org.imta.botomation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.imta.botomation.services.BotomationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBotomationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BROWSERNAME", "RULE_STRING", "RULE_TYPE", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'botomation'", "'actions'", "'browser'", "'openURL'", "'verifyPageContains'", "'type'", "'target'"
    };
    public static final int RULE_BROWSERNAME=4;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_TYPE=6;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;

    // delegates
    // delegators


        public InternalBotomationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBotomationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBotomationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBotomation.g"; }



     	private BotomationGrammarAccess grammarAccess;

        public InternalBotomationParser(TokenStream input, BotomationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Botomation";
       	}

       	@Override
       	protected BotomationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBotomation"
    // InternalBotomation.g:64:1: entryRuleBotomation returns [EObject current=null] : iv_ruleBotomation= ruleBotomation EOF ;
    public final EObject entryRuleBotomation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBotomation = null;


        try {
            // InternalBotomation.g:64:51: (iv_ruleBotomation= ruleBotomation EOF )
            // InternalBotomation.g:65:2: iv_ruleBotomation= ruleBotomation EOF
            {
             newCompositeNode(grammarAccess.getBotomationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBotomation=ruleBotomation();

            state._fsp--;

             current =iv_ruleBotomation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBotomation"


    // $ANTLR start "ruleBotomation"
    // InternalBotomation.g:71:1: ruleBotomation returns [EObject current=null] : (otherlv_0= 'botomation' this_Browser_1= ruleBrowser otherlv_2= 'actions' ( (lv_actions_3_0= ruleAction ) )* ) ;
    public final EObject ruleBotomation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Browser_1 = null;

        EObject lv_actions_3_0 = null;



        	enterRule();

        try {
            // InternalBotomation.g:77:2: ( (otherlv_0= 'botomation' this_Browser_1= ruleBrowser otherlv_2= 'actions' ( (lv_actions_3_0= ruleAction ) )* ) )
            // InternalBotomation.g:78:2: (otherlv_0= 'botomation' this_Browser_1= ruleBrowser otherlv_2= 'actions' ( (lv_actions_3_0= ruleAction ) )* )
            {
            // InternalBotomation.g:78:2: (otherlv_0= 'botomation' this_Browser_1= ruleBrowser otherlv_2= 'actions' ( (lv_actions_3_0= ruleAction ) )* )
            // InternalBotomation.g:79:3: otherlv_0= 'botomation' this_Browser_1= ruleBrowser otherlv_2= 'actions' ( (lv_actions_3_0= ruleAction ) )*
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBotomationAccess().getBotomationKeyword_0());
            		

            			newCompositeNode(grammarAccess.getBotomationAccess().getBrowserParserRuleCall_1());
            		
            pushFollow(FOLLOW_4);
            this_Browser_1=ruleBrowser();

            state._fsp--;


            			current = this_Browser_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getBotomationAccess().getActionsKeyword_2());
            		
            // InternalBotomation.g:95:3: ( (lv_actions_3_0= ruleAction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=16 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBotomation.g:96:4: (lv_actions_3_0= ruleAction )
            	    {
            	    // InternalBotomation.g:96:4: (lv_actions_3_0= ruleAction )
            	    // InternalBotomation.g:97:5: lv_actions_3_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getBotomationAccess().getActionsActionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_actions_3_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBotomationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_3_0,
            	    						"org.imta.botomation.Botomation.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBotomation"


    // $ANTLR start "entryRuleBrowser"
    // InternalBotomation.g:118:1: entryRuleBrowser returns [EObject current=null] : iv_ruleBrowser= ruleBrowser EOF ;
    public final EObject entryRuleBrowser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrowser = null;


        try {
            // InternalBotomation.g:118:48: (iv_ruleBrowser= ruleBrowser EOF )
            // InternalBotomation.g:119:2: iv_ruleBrowser= ruleBrowser EOF
            {
             newCompositeNode(grammarAccess.getBrowserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrowser=ruleBrowser();

            state._fsp--;

             current =iv_ruleBrowser; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBrowser"


    // $ANTLR start "ruleBrowser"
    // InternalBotomation.g:125:1: ruleBrowser returns [EObject current=null] : (otherlv_0= 'browser' ( (lv_name_1_0= RULE_BROWSERNAME ) ) ) ;
    public final EObject ruleBrowser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBotomation.g:131:2: ( (otherlv_0= 'browser' ( (lv_name_1_0= RULE_BROWSERNAME ) ) ) )
            // InternalBotomation.g:132:2: (otherlv_0= 'browser' ( (lv_name_1_0= RULE_BROWSERNAME ) ) )
            {
            // InternalBotomation.g:132:2: (otherlv_0= 'browser' ( (lv_name_1_0= RULE_BROWSERNAME ) ) )
            // InternalBotomation.g:133:3: otherlv_0= 'browser' ( (lv_name_1_0= RULE_BROWSERNAME ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getBrowserAccess().getBrowserKeyword_0());
            		
            // InternalBotomation.g:137:3: ( (lv_name_1_0= RULE_BROWSERNAME ) )
            // InternalBotomation.g:138:4: (lv_name_1_0= RULE_BROWSERNAME )
            {
            // InternalBotomation.g:138:4: (lv_name_1_0= RULE_BROWSERNAME )
            // InternalBotomation.g:139:5: lv_name_1_0= RULE_BROWSERNAME
            {
            lv_name_1_0=(Token)match(input,RULE_BROWSERNAME,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBrowserAccess().getNameBROWSERNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBrowserRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.imta.botomation.Botomation.BROWSERNAME");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrowser"


    // $ANTLR start "entryRuleAction"
    // InternalBotomation.g:159:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalBotomation.g:159:47: (iv_ruleAction= ruleAction EOF )
            // InternalBotomation.g:160:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalBotomation.g:166:1: ruleAction returns [EObject current=null] : ( (otherlv_0= 'openURL' ( (lv_openURL_1_0= RULE_STRING ) ) ) | (otherlv_2= 'verifyPageContains' ( (lv_verifyPageContains_3_0= ruleVerifyPageContains ) ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_openURL_1_0=null;
        Token otherlv_2=null;
        EObject lv_verifyPageContains_3_0 = null;



        	enterRule();

        try {
            // InternalBotomation.g:172:2: ( ( (otherlv_0= 'openURL' ( (lv_openURL_1_0= RULE_STRING ) ) ) | (otherlv_2= 'verifyPageContains' ( (lv_verifyPageContains_3_0= ruleVerifyPageContains ) ) ) ) )
            // InternalBotomation.g:173:2: ( (otherlv_0= 'openURL' ( (lv_openURL_1_0= RULE_STRING ) ) ) | (otherlv_2= 'verifyPageContains' ( (lv_verifyPageContains_3_0= ruleVerifyPageContains ) ) ) )
            {
            // InternalBotomation.g:173:2: ( (otherlv_0= 'openURL' ( (lv_openURL_1_0= RULE_STRING ) ) ) | (otherlv_2= 'verifyPageContains' ( (lv_verifyPageContains_3_0= ruleVerifyPageContains ) ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBotomation.g:174:3: (otherlv_0= 'openURL' ( (lv_openURL_1_0= RULE_STRING ) ) )
                    {
                    // InternalBotomation.g:174:3: (otherlv_0= 'openURL' ( (lv_openURL_1_0= RULE_STRING ) ) )
                    // InternalBotomation.g:175:4: otherlv_0= 'openURL' ( (lv_openURL_1_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getActionAccess().getOpenURLKeyword_0_0());
                    			
                    // InternalBotomation.g:179:4: ( (lv_openURL_1_0= RULE_STRING ) )
                    // InternalBotomation.g:180:5: (lv_openURL_1_0= RULE_STRING )
                    {
                    // InternalBotomation.g:180:5: (lv_openURL_1_0= RULE_STRING )
                    // InternalBotomation.g:181:6: lv_openURL_1_0= RULE_STRING
                    {
                    lv_openURL_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_openURL_1_0, grammarAccess.getActionAccess().getOpenURLSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"openURL",
                    							lv_openURL_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBotomation.g:199:3: (otherlv_2= 'verifyPageContains' ( (lv_verifyPageContains_3_0= ruleVerifyPageContains ) ) )
                    {
                    // InternalBotomation.g:199:3: (otherlv_2= 'verifyPageContains' ( (lv_verifyPageContains_3_0= ruleVerifyPageContains ) ) )
                    // InternalBotomation.g:200:4: otherlv_2= 'verifyPageContains' ( (lv_verifyPageContains_3_0= ruleVerifyPageContains ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getVerifyPageContainsKeyword_1_0());
                    			
                    // InternalBotomation.g:204:4: ( (lv_verifyPageContains_3_0= ruleVerifyPageContains ) )
                    // InternalBotomation.g:205:5: (lv_verifyPageContains_3_0= ruleVerifyPageContains )
                    {
                    // InternalBotomation.g:205:5: (lv_verifyPageContains_3_0= ruleVerifyPageContains )
                    // InternalBotomation.g:206:6: lv_verifyPageContains_3_0= ruleVerifyPageContains
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getVerifyPageContainsVerifyPageContainsParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_verifyPageContains_3_0=ruleVerifyPageContains();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"verifyPageContains",
                    							lv_verifyPageContains_3_0,
                    							"org.imta.botomation.Botomation.VerifyPageContains");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleVerifyPageContains"
    // InternalBotomation.g:228:1: entryRuleVerifyPageContains returns [EObject current=null] : iv_ruleVerifyPageContains= ruleVerifyPageContains EOF ;
    public final EObject entryRuleVerifyPageContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifyPageContains = null;


        try {
            // InternalBotomation.g:228:59: (iv_ruleVerifyPageContains= ruleVerifyPageContains EOF )
            // InternalBotomation.g:229:2: iv_ruleVerifyPageContains= ruleVerifyPageContains EOF
            {
             newCompositeNode(grammarAccess.getVerifyPageContainsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerifyPageContains=ruleVerifyPageContains();

            state._fsp--;

             current =iv_ruleVerifyPageContains; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerifyPageContains"


    // $ANTLR start "ruleVerifyPageContains"
    // InternalBotomation.g:235:1: ruleVerifyPageContains returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleVerifyPageContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_type_2_0=null;
        Token otherlv_3=null;
        Token lv_target_4_0=null;


        	enterRule();

        try {
            // InternalBotomation.g:241:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalBotomation.g:242:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalBotomation.g:242:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalBotomation.g:243:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalBotomation.g:243:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalBotomation.g:244:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getVerifyPageContainsAccess().getUnorderedGroup());
            			
            // InternalBotomation.g:247:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalBotomation.g:248:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalBotomation.g:248:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getVerifyPageContainsAccess().getUnorderedGroup(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getVerifyPageContainsAccess().getUnorderedGroup(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBotomation.g:249:3: ({...}? => ( ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) ) ) )
            	    {
            	    // InternalBotomation.g:249:3: ({...}? => ( ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) ) ) )
            	    // InternalBotomation.g:250:4: {...}? => ( ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerifyPageContainsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVerifyPageContains", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerifyPageContainsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalBotomation.g:250:112: ( ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) ) )
            	    // InternalBotomation.g:251:5: ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVerifyPageContainsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalBotomation.g:254:8: ({...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) ) )
            	    // InternalBotomation.g:254:9: {...}? => (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVerifyPageContains", "true");
            	    }
            	    // InternalBotomation.g:254:18: (otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) ) )
            	    // InternalBotomation.g:254:19: otherlv_1= 'type' ( (lv_type_2_0= RULE_TYPE ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_9); 

            	    								newLeafNode(otherlv_1, grammarAccess.getVerifyPageContainsAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalBotomation.g:258:8: ( (lv_type_2_0= RULE_TYPE ) )
            	    // InternalBotomation.g:259:9: (lv_type_2_0= RULE_TYPE )
            	    {
            	    // InternalBotomation.g:259:9: (lv_type_2_0= RULE_TYPE )
            	    // InternalBotomation.g:260:10: lv_type_2_0= RULE_TYPE
            	    {
            	    lv_type_2_0=(Token)match(input,RULE_TYPE,FOLLOW_10); 

            	    										newLeafNode(lv_type_2_0, grammarAccess.getVerifyPageContainsAccess().getTypeTYPETerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getVerifyPageContainsRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"type",
            	    											lv_type_2_0,
            	    											"org.imta.botomation.Botomation.TYPE");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerifyPageContainsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBotomation.g:282:3: ({...}? => ( ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalBotomation.g:282:3: ({...}? => ( ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalBotomation.g:283:4: {...}? => ( ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerifyPageContainsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVerifyPageContains", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerifyPageContainsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalBotomation.g:283:112: ( ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) ) )
            	    // InternalBotomation.g:284:5: ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getVerifyPageContainsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalBotomation.g:287:8: ({...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) ) )
            	    // InternalBotomation.g:287:9: {...}? => (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVerifyPageContains", "true");
            	    }
            	    // InternalBotomation.g:287:18: (otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) ) )
            	    // InternalBotomation.g:287:19: otherlv_3= 'target' ( (lv_target_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_7); 

            	    								newLeafNode(otherlv_3, grammarAccess.getVerifyPageContainsAccess().getTargetKeyword_1_0());
            	    							
            	    // InternalBotomation.g:291:8: ( (lv_target_4_0= RULE_STRING ) )
            	    // InternalBotomation.g:292:9: (lv_target_4_0= RULE_STRING )
            	    {
            	    // InternalBotomation.g:292:9: (lv_target_4_0= RULE_STRING )
            	    // InternalBotomation.g:293:10: lv_target_4_0= RULE_STRING
            	    {
            	    lv_target_4_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    										newLeafNode(lv_target_4_0, grammarAccess.getVerifyPageContainsAccess().getTargetSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getVerifyPageContainsRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"target",
            	    											lv_target_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerifyPageContainsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getVerifyPageContainsAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleVerifyPageContains", "getUnorderedGroupHelper().canLeave(grammarAccess.getVerifyPageContainsAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getVerifyPageContainsAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerifyPageContains"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0002L});

}
