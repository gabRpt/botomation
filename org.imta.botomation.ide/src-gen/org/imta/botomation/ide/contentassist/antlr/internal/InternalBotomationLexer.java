package org.imta.botomation.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBotomationLexer extends Lexer {
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

    public InternalBotomationLexer() {;} 
    public InternalBotomationLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalBotomationLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalBotomation.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:11:7: ( 'botomation' )
            // InternalBotomation.g:11:9: 'botomation'
            {
            match("botomation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:12:7: ( 'actions' )
            // InternalBotomation.g:12:9: 'actions'
            {
            match("actions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:13:7: ( 'browser' )
            // InternalBotomation.g:13:9: 'browser'
            {
            match("browser"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:14:7: ( 'openURL' )
            // InternalBotomation.g:14:9: 'openURL'
            {
            match("openURL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:15:7: ( 'verifyPageContains' )
            // InternalBotomation.g:15:9: 'verifyPageContains'
            {
            match("verifyPageContains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:16:7: ( 'type' )
            // InternalBotomation.g:16:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:17:7: ( 'target' )
            // InternalBotomation.g:17:9: 'target'
            {
            match("target"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "RULE_TYPE"
    public final void mRULE_TYPE() throws RecognitionException {
        try {
            int _type = RULE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:724:11: ( ( 'link' | 'text' ) )
            // InternalBotomation.g:724:13: ( 'link' | 'text' )
            {
            // InternalBotomation.g:724:13: ( 'link' | 'text' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='l') ) {
                alt1=1;
            }
            else if ( (LA1_0=='t') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBotomation.g:724:14: 'link'
                    {
                    match("link"); 


                    }
                    break;
                case 2 :
                    // InternalBotomation.g:724:21: 'text'
                    {
                    match("text"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE"

    // $ANTLR start "RULE_BROWSERNAME"
    public final void mRULE_BROWSERNAME() throws RecognitionException {
        try {
            int _type = RULE_BROWSERNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:726:18: ( ( 'chrome' | 'firefox' | 'opera' | 'safari' ) )
            // InternalBotomation.g:726:20: ( 'chrome' | 'firefox' | 'opera' | 'safari' )
            {
            // InternalBotomation.g:726:20: ( 'chrome' | 'firefox' | 'opera' | 'safari' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 'c':
                {
                alt2=1;
                }
                break;
            case 'f':
                {
                alt2=2;
                }
                break;
            case 'o':
                {
                alt2=3;
                }
                break;
            case 's':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBotomation.g:726:21: 'chrome'
                    {
                    match("chrome"); 


                    }
                    break;
                case 2 :
                    // InternalBotomation.g:726:30: 'firefox'
                    {
                    match("firefox"); 


                    }
                    break;
                case 3 :
                    // InternalBotomation.g:726:40: 'opera'
                    {
                    match("opera"); 


                    }
                    break;
                case 4 :
                    // InternalBotomation.g:726:48: 'safari'
                    {
                    match("safari"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BROWSERNAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:728:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalBotomation.g:728:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalBotomation.g:728:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBotomation.g:728:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalBotomation.g:728:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBotomation.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:730:10: ( ( '0' .. '9' )+ )
            // InternalBotomation.g:730:12: ( '0' .. '9' )+
            {
            // InternalBotomation.g:730:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBotomation.g:730:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:732:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalBotomation.g:732:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalBotomation.g:732:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBotomation.g:732:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalBotomation.g:732:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBotomation.g:732:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBotomation.g:732:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalBotomation.g:732:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalBotomation.g:732:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBotomation.g:732:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalBotomation.g:732:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:734:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalBotomation.g:734:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalBotomation.g:734:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalBotomation.g:734:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:736:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalBotomation.g:736:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalBotomation.g:736:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBotomation.g:736:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalBotomation.g:736:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBotomation.g:736:41: ( '\\r' )? '\\n'
                    {
                    // InternalBotomation.g:736:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalBotomation.g:736:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:738:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalBotomation.g:738:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalBotomation.g:738:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBotomation.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalBotomation.g:740:16: ( . )
            // InternalBotomation.g:740:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalBotomation.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_TYPE | RULE_BROWSERNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=16;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalBotomation.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalBotomation.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalBotomation.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalBotomation.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalBotomation.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalBotomation.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalBotomation.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalBotomation.g:1:52: RULE_TYPE
                {
                mRULE_TYPE(); 

                }
                break;
            case 9 :
                // InternalBotomation.g:1:62: RULE_BROWSERNAME
                {
                mRULE_BROWSERNAME(); 

                }
                break;
            case 10 :
                // InternalBotomation.g:1:79: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 11 :
                // InternalBotomation.g:1:87: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 12 :
                // InternalBotomation.g:1:96: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // InternalBotomation.g:1:108: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 14 :
                // InternalBotomation.g:1:124: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // InternalBotomation.g:1:140: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // InternalBotomation.g:1:148: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\11\24\1\21\2\uffff\3\21\2\uffff\2\24\1\uffff\12\24\5\uffff\22\24\1\103\1\24\2\105\7\24\1\115\1\24\1\uffff\1\24\1\uffff\7\24\1\uffff\1\24\1\130\1\115\1\24\1\115\1\24\1\133\1\134\1\135\1\24\1\uffff\1\115\1\24\3\uffff\3\24\1\143\1\24\1\uffff\7\24\1\154\1\uffff";
    static final String DFA14_eofS =
        "\155\uffff";
    static final String DFA14_minS =
        "\1\0\1\157\1\143\1\160\1\145\1\141\1\151\1\150\1\151\1\141\1\101\2\uffff\2\0\1\52\2\uffff\1\164\1\157\1\uffff\1\164\1\145\1\162\1\160\1\162\1\170\1\156\2\162\1\146\5\uffff\1\157\1\167\1\151\1\156\1\151\1\145\1\147\1\164\1\153\1\157\1\145\1\141\1\155\1\163\1\157\1\125\1\141\1\146\1\60\1\145\2\60\1\155\1\146\1\162\1\141\1\145\1\156\1\122\1\60\1\171\1\uffff\1\164\1\uffff\1\145\1\157\1\151\1\164\1\162\1\163\1\114\1\uffff\1\120\2\60\1\170\1\60\1\151\3\60\1\141\1\uffff\1\60\1\157\3\uffff\1\147\1\156\1\145\1\60\1\103\1\uffff\1\157\1\156\1\164\1\141\1\151\1\156\1\163\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\162\1\143\1\160\1\145\1\171\1\151\1\150\1\151\1\141\1\172\2\uffff\2\uffff\1\57\2\uffff\1\164\1\157\1\uffff\1\164\1\145\1\162\1\160\1\162\1\170\1\156\2\162\1\146\5\uffff\1\157\1\167\1\151\1\162\1\151\1\145\1\147\1\164\1\153\1\157\1\145\1\141\1\155\1\163\1\157\1\125\1\141\1\146\1\172\1\145\2\172\1\155\1\146\1\162\1\141\1\145\1\156\1\122\1\172\1\171\1\uffff\1\164\1\uffff\1\145\1\157\1\151\1\164\1\162\1\163\1\114\1\uffff\1\120\2\172\1\170\1\172\1\151\3\172\1\141\1\uffff\1\172\1\157\3\uffff\1\147\1\156\1\145\1\172\1\103\1\uffff\1\157\1\156\1\164\1\141\1\151\1\156\1\163\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\13\uffff\1\12\1\13\3\uffff\1\17\1\20\2\uffff\1\12\12\uffff\1\13\1\14\1\15\1\16\1\17\37\uffff\1\6\1\uffff\1\10\7\uffff\1\11\12\uffff\1\7\2\uffff\1\3\1\2\1\4\5\uffff\1\1\10\uffff\1\5";
    static final String DFA14_specialS =
        "\1\0\14\uffff\1\1\1\2\136\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\15\4\21\1\16\7\21\1\17\12\14\7\21\32\13\3\21\1\12\1\13\1\21\1\2\1\1\1\7\2\13\1\10\5\13\1\6\2\13\1\3\3\13\1\11\1\5\1\13\1\4\4\13\uff85\21",
            "\1\22\2\uffff\1\23",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\31\3\uffff\1\32\23\uffff\1\30",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\0\40",
            "\0\40",
            "\1\41\4\uffff\1\42",
            "",
            "",
            "\1\44",
            "\1\45",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63\3\uffff\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\104",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\116",
            "",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\131",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\132",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\136",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\137",
            "",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | RULE_TYPE | RULE_BROWSERNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='b') ) {s = 1;}

                        else if ( (LA14_0=='a') ) {s = 2;}

                        else if ( (LA14_0=='o') ) {s = 3;}

                        else if ( (LA14_0=='v') ) {s = 4;}

                        else if ( (LA14_0=='t') ) {s = 5;}

                        else if ( (LA14_0=='l') ) {s = 6;}

                        else if ( (LA14_0=='c') ) {s = 7;}

                        else if ( (LA14_0=='f') ) {s = 8;}

                        else if ( (LA14_0=='s') ) {s = 9;}

                        else if ( (LA14_0=='^') ) {s = 10;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='d' && LA14_0<='e')||(LA14_0>='g' && LA14_0<='k')||(LA14_0>='m' && LA14_0<='n')||(LA14_0>='p' && LA14_0<='r')||LA14_0=='u'||(LA14_0>='w' && LA14_0<='z')) ) {s = 11;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 12;}

                        else if ( (LA14_0=='\"') ) {s = 13;}

                        else if ( (LA14_0=='\'') ) {s = 14;}

                        else if ( (LA14_0=='/') ) {s = 15;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 16;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_13 = input.LA(1);

                        s = -1;
                        if ( ((LA14_13>='\u0000' && LA14_13<='\uFFFF')) ) {s = 32;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_14 = input.LA(1);

                        s = -1;
                        if ( ((LA14_14>='\u0000' && LA14_14<='\uFFFF')) ) {s = 32;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}