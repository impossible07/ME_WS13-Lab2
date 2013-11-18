package at.ac.tuwien.big.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.services.QuestionnaireGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuestionnaireParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'questionnaire'", "'['", "']'", "'group'", "','", "'mandatory'", "'multiline'", "'open question'", "'closed question allowing'", "'single answer'", "'multiple answers'", "'likert question'", "'('", "'-'", "'..'", "')'", "'answers ['", "'default answer is'", "'...'", "'enables question ['"
    };
    public static final int RULE_ID=6;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalQuestionnaireParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQuestionnaireParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQuestionnaireParser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g"; }



     	private QuestionnaireGrammarAccess grammarAccess;
     	
        public InternalQuestionnaireParser(TokenStream input, QuestionnaireGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Questionnaire";	
       	}
       	
       	@Override
       	protected QuestionnaireGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleQuestionnaire"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:67:1: entryRuleQuestionnaire returns [EObject current=null] : iv_ruleQuestionnaire= ruleQuestionnaire EOF ;
    public final EObject entryRuleQuestionnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionnaire = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:68:2: (iv_ruleQuestionnaire= ruleQuestionnaire EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:69:2: iv_ruleQuestionnaire= ruleQuestionnaire EOF
            {
             newCompositeNode(grammarAccess.getQuestionnaireRule()); 
            pushFollow(FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire75);
            iv_ruleQuestionnaire=ruleQuestionnaire();

            state._fsp--;

             current =iv_ruleQuestionnaire; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionnaire85); 

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
    // $ANTLR end "entryRuleQuestionnaire"


    // $ANTLR start "ruleQuestionnaire"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:76:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'questionnaire' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_groups_3_0= ruleGroup ) )+ otherlv_4= ']' ) ;
    public final EObject ruleQuestionnaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_groups_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:79:28: ( (otherlv_0= 'questionnaire' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_groups_3_0= ruleGroup ) )+ otherlv_4= ']' ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:80:1: (otherlv_0= 'questionnaire' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_groups_3_0= ruleGroup ) )+ otherlv_4= ']' )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:80:1: (otherlv_0= 'questionnaire' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_groups_3_0= ruleGroup ) )+ otherlv_4= ']' )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:80:3: otherlv_0= 'questionnaire' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '[' ( (lv_groups_3_0= ruleGroup ) )+ otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleQuestionnaire122); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:84:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:85:1: (lv_title_1_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:85:1: (lv_title_1_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:86:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestionnaire139); 

            			newLeafNode(lv_title_1_0, grammarAccess.getQuestionnaireAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionnaireRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQuestionnaire156); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getLeftSquareBracketKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:106:1: ( (lv_groups_3_0= ruleGroup ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:107:1: (lv_groups_3_0= ruleGroup )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:107:1: (lv_groups_3_0= ruleGroup )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:108:3: lv_groups_3_0= ruleGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getGroupsGroupParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroup_in_ruleQuestionnaire177);
            	    lv_groups_3_0=ruleGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"groups",
            	            		lv_groups_3_0, 
            	            		"Group");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleQuestionnaire190); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleQuestionnaire"


    // $ANTLR start "entryRuleGroup"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:136:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:137:2: (iv_ruleGroup= ruleGroup EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:138:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup226);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup236); 

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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:145:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+ otherlv_4= ']' (otherlv_5= ',' )? ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_questions_3_1 = null;

        EObject lv_questions_3_2 = null;

        EObject lv_questions_3_3 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:148:28: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+ otherlv_4= ']' (otherlv_5= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:149:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+ otherlv_4= ']' (otherlv_5= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:149:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+ otherlv_4= ']' (otherlv_5= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:149:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '[' ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+ otherlv_4= ']' (otherlv_5= ',' )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleGroup273); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:153:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:154:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:154:1: (lv_name_1_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:155:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGroup290); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGroup307); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:175:1: ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=16 && LA3_0<=19)||LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:176:1: ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:176:1: ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:177:1: (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:177:1: (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion )
            	    int alt2=3;
            	    switch ( input.LA(1) ) {
            	    case 16:
            	    case 17:
            	    case 18:
            	        {
            	        alt2=1;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt2=2;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt2=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt2) {
            	        case 1 :
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:178:3: lv_questions_3_1= ruleOpenQuestion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsOpenQuestionParserRuleCall_3_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleOpenQuestion_in_ruleGroup330);
            	            lv_questions_3_1=ruleOpenQuestion();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"questions",
            	                    		lv_questions_3_1, 
            	                    		"OpenQuestion");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:193:8: lv_questions_3_2= ruleClosedQuestion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsClosedQuestionParserRuleCall_3_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleClosedQuestion_in_ruleGroup349);
            	            lv_questions_3_2=ruleClosedQuestion();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"questions",
            	                    		lv_questions_3_2, 
            	                    		"ClosedQuestion");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:208:8: lv_questions_3_3= ruleLikertQuestion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsLikertQuestionParserRuleCall_3_0_2()); 
            	            	    
            	            pushFollow(FOLLOW_ruleLikertQuestion_in_ruleGroup368);
            	            lv_questions_3_3=ruleLikertQuestion();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"questions",
            	                    		lv_questions_3_3, 
            	                    		"LikertQuestion");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleGroup384); 

                	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_4());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:230:1: (otherlv_5= ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:230:3: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleGroup397); 

                        	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getCommaKeyword_5());
                        

                    }
                    break;

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleOpenQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:242:1: entryRuleOpenQuestion returns [EObject current=null] : iv_ruleOpenQuestion= ruleOpenQuestion EOF ;
    public final EObject entryRuleOpenQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:243:2: (iv_ruleOpenQuestion= ruleOpenQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:244:2: iv_ruleOpenQuestion= ruleOpenQuestion EOF
            {
             newCompositeNode(grammarAccess.getOpenQuestionRule()); 
            pushFollow(FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion435);
            iv_ruleOpenQuestion=ruleOpenQuestion();

            state._fsp--;

             current =iv_ruleOpenQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenQuestion445); 

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
    // $ANTLR end "entryRuleOpenQuestion"


    // $ANTLR start "ruleOpenQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:251:1: ruleOpenQuestion returns [EObject current=null] : ( (otherlv_0= 'mandatory' )? (otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_question_3_0= RULE_STRING ) ) (otherlv_4= ',' )? ) ;
    public final EObject ruleOpenQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_question_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:254:28: ( ( (otherlv_0= 'mandatory' )? (otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_question_3_0= RULE_STRING ) ) (otherlv_4= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:255:1: ( (otherlv_0= 'mandatory' )? (otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_question_3_0= RULE_STRING ) ) (otherlv_4= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:255:1: ( (otherlv_0= 'mandatory' )? (otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_question_3_0= RULE_STRING ) ) (otherlv_4= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:255:2: (otherlv_0= 'mandatory' )? (otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_question_3_0= RULE_STRING ) ) (otherlv_4= ',' )?
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:255:2: (otherlv_0= 'mandatory' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:255:4: otherlv_0= 'mandatory'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleOpenQuestion483); 

                        	newLeafNode(otherlv_0, grammarAccess.getOpenQuestionAccess().getMandatoryKeyword_0());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:259:3: (otherlv_1= 'multiline' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:259:5: otherlv_1= 'multiline'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleOpenQuestion498); 

                        	newLeafNode(otherlv_1, grammarAccess.getOpenQuestionAccess().getMultilineKeyword_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleOpenQuestion512); 

                	newLeafNode(otherlv_2, grammarAccess.getOpenQuestionAccess().getOpenQuestionKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:267:1: ( (lv_question_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:268:1: (lv_question_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:268:1: (lv_question_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:269:3: lv_question_3_0= RULE_STRING
            {
            lv_question_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOpenQuestion529); 

            			newLeafNode(lv_question_3_0, grammarAccess.getOpenQuestionAccess().getQuestionSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOpenQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:285:2: (otherlv_4= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:285:4: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleOpenQuestion547); 

                        	newLeafNode(otherlv_4, grammarAccess.getOpenQuestionAccess().getCommaKeyword_4());
                        

                    }
                    break;

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
    // $ANTLR end "ruleOpenQuestion"


    // $ANTLR start "entryRuleClosedQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:297:1: entryRuleClosedQuestion returns [EObject current=null] : iv_ruleClosedQuestion= ruleClosedQuestion EOF ;
    public final EObject entryRuleClosedQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosedQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:298:2: (iv_ruleClosedQuestion= ruleClosedQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:299:2: iv_ruleClosedQuestion= ruleClosedQuestion EOF
            {
             newCompositeNode(grammarAccess.getClosedQuestionRule()); 
            pushFollow(FOLLOW_ruleClosedQuestion_in_entryRuleClosedQuestion585);
            iv_ruleClosedQuestion=ruleClosedQuestion();

            state._fsp--;

             current =iv_ruleClosedQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosedQuestion595); 

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
    // $ANTLR end "entryRuleClosedQuestion"


    // $ANTLR start "ruleClosedQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:306:1: ruleClosedQuestion returns [EObject current=null] : (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_STRING ) ) ( (lv_answers_4_0= ruleAnswers ) ) (otherlv_5= ',' )? ) ;
    public final EObject ruleClosedQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_question_3_0=null;
        Token otherlv_5=null;
        EObject lv_answers_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:309:28: ( (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_STRING ) ) ( (lv_answers_4_0= ruleAnswers ) ) (otherlv_5= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:310:1: (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_STRING ) ) ( (lv_answers_4_0= ruleAnswers ) ) (otherlv_5= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:310:1: (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_STRING ) ) ( (lv_answers_4_0= ruleAnswers ) ) (otherlv_5= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:310:3: otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_STRING ) ) ( (lv_answers_4_0= ruleAnswers ) ) (otherlv_5= ',' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleClosedQuestion632); 

                	newLeafNode(otherlv_0, grammarAccess.getClosedQuestionAccess().getClosedQuestionAllowingKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:314:1: (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:314:3: otherlv_1= 'single answer'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleClosedQuestion645); 

                        	newLeafNode(otherlv_1, grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:319:7: otherlv_2= 'multiple answers'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleClosedQuestion663); 

                        	newLeafNode(otherlv_2, grammarAccess.getClosedQuestionAccess().getMultipleAnswersKeyword_1_1());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:323:2: ( (lv_question_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:324:1: (lv_question_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:324:1: (lv_question_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:325:3: lv_question_3_0= RULE_STRING
            {
            lv_question_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClosedQuestion681); 

            			newLeafNode(lv_question_3_0, grammarAccess.getClosedQuestionAccess().getQuestionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClosedQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:341:2: ( (lv_answers_4_0= ruleAnswers ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:342:1: (lv_answers_4_0= ruleAnswers )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:342:1: (lv_answers_4_0= ruleAnswers )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:343:3: lv_answers_4_0= ruleAnswers
            {
             
            	        newCompositeNode(grammarAccess.getClosedQuestionAccess().getAnswersAnswersParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswers_in_ruleClosedQuestion707);
            lv_answers_4_0=ruleAnswers();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClosedQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"answers",
                    		lv_answers_4_0, 
                    		"Answers");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:359:2: (otherlv_5= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:359:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleClosedQuestion720); 

                        	newLeafNode(otherlv_5, grammarAccess.getClosedQuestionAccess().getCommaKeyword_4());
                        

                    }
                    break;

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
    // $ANTLR end "ruleClosedQuestion"


    // $ANTLR start "entryRuleLikertQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:371:1: entryRuleLikertQuestion returns [EObject current=null] : iv_ruleLikertQuestion= ruleLikertQuestion EOF ;
    public final EObject entryRuleLikertQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikertQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:372:2: (iv_ruleLikertQuestion= ruleLikertQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:373:2: iv_ruleLikertQuestion= ruleLikertQuestion EOF
            {
             newCompositeNode(grammarAccess.getLikertQuestionRule()); 
            pushFollow(FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion758);
            iv_ruleLikertQuestion=ruleLikertQuestion();

            state._fsp--;

             current =iv_ruleLikertQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikertQuestion768); 

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
    // $ANTLR end "entryRuleLikertQuestion"


    // $ANTLR start "ruleLikertQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:380:1: ruleLikertQuestion returns [EObject current=null] : (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '(' (otherlv_3= '-' )? ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= '..' ( (lv_higher_6_0= RULE_INT ) ) otherlv_7= ')' (otherlv_8= ',' )? ) ;
    public final EObject ruleLikertQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_question_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_lower_4_0=null;
        Token otherlv_5=null;
        Token lv_higher_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:383:28: ( (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '(' (otherlv_3= '-' )? ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= '..' ( (lv_higher_6_0= RULE_INT ) ) otherlv_7= ')' (otherlv_8= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:384:1: (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '(' (otherlv_3= '-' )? ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= '..' ( (lv_higher_6_0= RULE_INT ) ) otherlv_7= ')' (otherlv_8= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:384:1: (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '(' (otherlv_3= '-' )? ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= '..' ( (lv_higher_6_0= RULE_INT ) ) otherlv_7= ')' (otherlv_8= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:384:3: otherlv_0= 'likert question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '(' (otherlv_3= '-' )? ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= '..' ( (lv_higher_6_0= RULE_INT ) ) otherlv_7= ')' (otherlv_8= ',' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleLikertQuestion805); 

                	newLeafNode(otherlv_0, grammarAccess.getLikertQuestionAccess().getLikertQuestionKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:388:1: ( (lv_question_1_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:389:1: (lv_question_1_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:389:1: (lv_question_1_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:390:3: lv_question_1_0= RULE_STRING
            {
            lv_question_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLikertQuestion822); 

            			newLeafNode(lv_question_1_0, grammarAccess.getLikertQuestionAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLikertQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleLikertQuestion839); 

                	newLeafNode(otherlv_2, grammarAccess.getLikertQuestionAccess().getLeftParenthesisKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:410:1: (otherlv_3= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:410:3: otherlv_3= '-'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleLikertQuestion852); 

                        	newLeafNode(otherlv_3, grammarAccess.getLikertQuestionAccess().getHyphenMinusKeyword_3());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:414:3: ( (lv_lower_4_0= RULE_INT ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:415:1: (lv_lower_4_0= RULE_INT )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:415:1: (lv_lower_4_0= RULE_INT )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:416:3: lv_lower_4_0= RULE_INT
            {
            lv_lower_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLikertQuestion871); 

            			newLeafNode(lv_lower_4_0, grammarAccess.getLikertQuestionAccess().getLowerINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLikertQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lower",
                    		lv_lower_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleLikertQuestion888); 

                	newLeafNode(otherlv_5, grammarAccess.getLikertQuestionAccess().getFullStopFullStopKeyword_5());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:436:1: ( (lv_higher_6_0= RULE_INT ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:437:1: (lv_higher_6_0= RULE_INT )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:437:1: (lv_higher_6_0= RULE_INT )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:438:3: lv_higher_6_0= RULE_INT
            {
            lv_higher_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLikertQuestion905); 

            			newLeafNode(lv_higher_6_0, grammarAccess.getLikertQuestionAccess().getHigherINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLikertQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"higher",
                    		lv_higher_6_0, 
                    		"INT");
            	    

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleLikertQuestion922); 

                	newLeafNode(otherlv_7, grammarAccess.getLikertQuestionAccess().getRightParenthesisKeyword_7());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:458:1: (otherlv_8= ',' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:458:3: otherlv_8= ','
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleLikertQuestion935); 

                        	newLeafNode(otherlv_8, grammarAccess.getLikertQuestionAccess().getCommaKeyword_8());
                        

                    }
                    break;

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
    // $ANTLR end "ruleLikertQuestion"


    // $ANTLR start "entryRuleAnswers"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:470:1: entryRuleAnswers returns [EObject current=null] : iv_ruleAnswers= ruleAnswers EOF ;
    public final EObject entryRuleAnswers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswers = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:471:2: (iv_ruleAnswers= ruleAnswers EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:472:2: iv_ruleAnswers= ruleAnswers EOF
            {
             newCompositeNode(grammarAccess.getAnswersRule()); 
            pushFollow(FOLLOW_ruleAnswers_in_entryRuleAnswers973);
            iv_ruleAnswers=ruleAnswers();

            state._fsp--;

             current =iv_ruleAnswers; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswers983); 

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
    // $ANTLR end "entryRuleAnswers"


    // $ANTLR start "ruleAnswers"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:479:1: ruleAnswers returns [EObject current=null] : (otherlv_0= 'answers [' ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+ (otherlv_2= ',' )? otherlv_3= ']' (otherlv_4= 'default answer is' this_STRING_5= RULE_STRING )? (otherlv_6= ',' )? ) ;
    public final EObject ruleAnswers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_STRING_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_answers_1_1 = null;

        AntlrDatatypeRuleToken lv_answers_1_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:482:28: ( (otherlv_0= 'answers [' ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+ (otherlv_2= ',' )? otherlv_3= ']' (otherlv_4= 'default answer is' this_STRING_5= RULE_STRING )? (otherlv_6= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:483:1: (otherlv_0= 'answers [' ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+ (otherlv_2= ',' )? otherlv_3= ']' (otherlv_4= 'default answer is' this_STRING_5= RULE_STRING )? (otherlv_6= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:483:1: (otherlv_0= 'answers [' ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+ (otherlv_2= ',' )? otherlv_3= ']' (otherlv_4= 'default answer is' this_STRING_5= RULE_STRING )? (otherlv_6= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:483:3: otherlv_0= 'answers [' ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+ (otherlv_2= ',' )? otherlv_3= ']' (otherlv_4= 'default answer is' this_STRING_5= RULE_STRING )? (otherlv_6= ',' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleAnswers1020); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswersAccess().getAnswersKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:487:1: ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:488:1: ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:488:1: ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:489:1: (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:489:1: (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==RULE_STRING) ) {
            	        int LA12_1 = input.LA(2);

            	        if ( (LA12_1==RULE_STRING||LA12_1==13||LA12_1==15||LA12_1==30) ) {
            	            alt12=2;
            	        }
            	        else if ( (LA12_1==29) ) {
            	            alt12=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 12, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:490:3: lv_answers_1_1= ruleOpenAnswer
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAnswersAccess().getAnswersOpenAnswerParserRuleCall_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleOpenAnswer_in_ruleAnswers1043);
            	            lv_answers_1_1=ruleOpenAnswer();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getAnswersRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"answers",
            	                    		lv_answers_1_1, 
            	                    		"OpenAnswer");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:505:8: lv_answers_1_2= ruleClosedAnswer
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAnswersAccess().getAnswersClosedAnswerParserRuleCall_1_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleClosedAnswer_in_ruleAnswers1062);
            	            lv_answers_1_2=ruleClosedAnswer();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getAnswersRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"answers",
            	                    		lv_answers_1_2, 
            	                    		"ClosedAnswer");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


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

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:523:3: (otherlv_2= ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:523:5: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAnswers1079); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnswersAccess().getCommaKeyword_2());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleAnswers1093); 

                	newLeafNode(otherlv_3, grammarAccess.getAnswersAccess().getRightSquareBracketKeyword_3());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:531:1: (otherlv_4= 'default answer is' this_STRING_5= RULE_STRING )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:531:3: otherlv_4= 'default answer is' this_STRING_5= RULE_STRING
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleAnswers1106); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnswersAccess().getDefaultAnswerIsKeyword_4_0());
                        
                    this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnswers1117); 
                     
                        newLeafNode(this_STRING_5, grammarAccess.getAnswersAccess().getSTRINGTerminalRuleCall_4_1()); 
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:539:3: (otherlv_6= ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:539:5: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleAnswers1131); 

                        	newLeafNode(otherlv_6, grammarAccess.getAnswersAccess().getCommaKeyword_5());
                        

                    }
                    break;

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
    // $ANTLR end "ruleAnswers"


    // $ANTLR start "entryRuleOpenAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:551:1: entryRuleOpenAnswer returns [String current=null] : iv_ruleOpenAnswer= ruleOpenAnswer EOF ;
    public final String entryRuleOpenAnswer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpenAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:552:2: (iv_ruleOpenAnswer= ruleOpenAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:553:2: iv_ruleOpenAnswer= ruleOpenAnswer EOF
            {
             newCompositeNode(grammarAccess.getOpenAnswerRule()); 
            pushFollow(FOLLOW_ruleOpenAnswer_in_entryRuleOpenAnswer1170);
            iv_ruleOpenAnswer=ruleOpenAnswer();

            state._fsp--;

             current =iv_ruleOpenAnswer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenAnswer1181); 

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
    // $ANTLR end "entryRuleOpenAnswer"


    // $ANTLR start "ruleOpenAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:560:1: ruleOpenAnswer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING kw= '...' ) ;
    public final AntlrDatatypeRuleToken ruleOpenAnswer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:563:28: ( (this_STRING_0= RULE_STRING kw= '...' ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:564:1: (this_STRING_0= RULE_STRING kw= '...' )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:564:1: (this_STRING_0= RULE_STRING kw= '...' )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:564:6: this_STRING_0= RULE_STRING kw= '...'
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOpenAnswer1221); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getOpenAnswerAccess().getSTRINGTerminalRuleCall_0()); 
                
            kw=(Token)match(input,29,FOLLOW_29_in_ruleOpenAnswer1239); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOpenAnswerAccess().getFullStopFullStopFullStopKeyword_1()); 
                

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
    // $ANTLR end "ruleOpenAnswer"


    // $ANTLR start "entryRuleClosedAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:585:1: entryRuleClosedAnswer returns [String current=null] : iv_ruleClosedAnswer= ruleClosedAnswer EOF ;
    public final String entryRuleClosedAnswer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClosedAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:586:2: (iv_ruleClosedAnswer= ruleClosedAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:587:2: iv_ruleClosedAnswer= ruleClosedAnswer EOF
            {
             newCompositeNode(grammarAccess.getClosedAnswerRule()); 
            pushFollow(FOLLOW_ruleClosedAnswer_in_entryRuleClosedAnswer1280);
            iv_ruleClosedAnswer=ruleClosedAnswer();

            state._fsp--;

             current =iv_ruleClosedAnswer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosedAnswer1291); 

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
    // $ANTLR end "entryRuleClosedAnswer"


    // $ANTLR start "ruleClosedAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:594:1: ruleClosedAnswer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING (kw= 'enables question [' (this_STRING_2= RULE_STRING (kw= ',' )? )+ kw= ']' )? (kw= ',' )? )+ ;
    public final AntlrDatatypeRuleToken ruleClosedAnswer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        Token this_STRING_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:597:28: ( (this_STRING_0= RULE_STRING (kw= 'enables question [' (this_STRING_2= RULE_STRING (kw= ',' )? )+ kw= ']' )? (kw= ',' )? )+ )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:598:1: (this_STRING_0= RULE_STRING (kw= 'enables question [' (this_STRING_2= RULE_STRING (kw= ',' )? )+ kw= ']' )? (kw= ',' )? )+
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:598:1: (this_STRING_0= RULE_STRING (kw= 'enables question [' (this_STRING_2= RULE_STRING (kw= ',' )? )+ kw= ']' )? (kw= ',' )? )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:598:6: this_STRING_0= RULE_STRING (kw= 'enables question [' (this_STRING_2= RULE_STRING (kw= ',' )? )+ kw= ']' )? (kw= ',' )?
            	    {
            	    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClosedAnswer1331); 

            	    		current.merge(this_STRING_0);
            	        
            	     
            	        newLeafNode(this_STRING_0, grammarAccess.getClosedAnswerAccess().getSTRINGTerminalRuleCall_0()); 
            	        
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:605:1: (kw= 'enables question [' (this_STRING_2= RULE_STRING (kw= ',' )? )+ kw= ']' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==30) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:606:2: kw= 'enables question [' (this_STRING_2= RULE_STRING (kw= ',' )? )+ kw= ']'
            	            {
            	            kw=(Token)match(input,30,FOLLOW_30_in_ruleClosedAnswer1350); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getClosedAnswerAccess().getEnablesQuestionKeyword_1_0()); 
            	                
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:611:1: (this_STRING_2= RULE_STRING (kw= ',' )? )+
            	            int cnt18=0;
            	            loop18:
            	            do {
            	                int alt18=2;
            	                int LA18_0 = input.LA(1);

            	                if ( (LA18_0==RULE_STRING) ) {
            	                    alt18=1;
            	                }


            	                switch (alt18) {
            	            	case 1 :
            	            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:611:6: this_STRING_2= RULE_STRING (kw= ',' )?
            	            	    {
            	            	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClosedAnswer1366); 

            	            	    		current.merge(this_STRING_2);
            	            	        
            	            	     
            	            	        newLeafNode(this_STRING_2, grammarAccess.getClosedAnswerAccess().getSTRINGTerminalRuleCall_1_1_0()); 
            	            	        
            	            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:618:1: (kw= ',' )?
            	            	    int alt17=2;
            	            	    int LA17_0 = input.LA(1);

            	            	    if ( (LA17_0==15) ) {
            	            	        alt17=1;
            	            	    }
            	            	    switch (alt17) {
            	            	        case 1 :
            	            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:619:2: kw= ','
            	            	            {
            	            	            kw=(Token)match(input,15,FOLLOW_15_in_ruleClosedAnswer1385); 

            	            	                    current.merge(kw);
            	            	                    newLeafNode(kw, grammarAccess.getClosedAnswerAccess().getCommaKeyword_1_1_1()); 
            	            	                

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt18 >= 1 ) break loop18;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(18, input);
            	                        throw eee;
            	                }
            	                cnt18++;
            	            } while (true);

            	            kw=(Token)match(input,13,FOLLOW_13_in_ruleClosedAnswer1402); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getClosedAnswerAccess().getRightSquareBracketKeyword_1_2()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:630:3: (kw= ',' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==15) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:631:2: kw= ','
            	            {
            	            kw=(Token)match(input,15,FOLLOW_15_in_ruleClosedAnswer1418); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getClosedAnswerAccess().getCommaKeyword_2()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


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
    // $ANTLR end "ruleClosedAnswer"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleQuestionnaire122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestionnaire139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQuestionnaire156 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleQuestionnaire177 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleQuestionnaire190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGroup273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGroup290 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGroup307 = new BitSet(new long[]{0x00000000004F0000L});
    public static final BitSet FOLLOW_ruleOpenQuestion_in_ruleGroup330 = new BitSet(new long[]{0x00000000004F2000L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_ruleGroup349 = new BitSet(new long[]{0x00000000004F2000L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_ruleGroup368 = new BitSet(new long[]{0x00000000004F2000L});
    public static final BitSet FOLLOW_13_in_ruleGroup384 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleGroup397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenQuestion445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpenQuestion483 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleOpenQuestion498 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOpenQuestion512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOpenQuestion529 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOpenQuestion547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_entryRuleClosedQuestion585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedQuestion595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleClosedQuestion632 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleClosedQuestion645 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21_in_ruleClosedQuestion663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClosedQuestion681 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleAnswers_in_ruleClosedQuestion707 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleClosedQuestion720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikertQuestion768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleLikertQuestion805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLikertQuestion822 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLikertQuestion839 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleLikertQuestion852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLikertQuestion871 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLikertQuestion888 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLikertQuestion905 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLikertQuestion922 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleLikertQuestion935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswers_in_entryRuleAnswers973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswers983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAnswers1020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOpenAnswer_in_ruleAnswers1043 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_ruleClosedAnswer_in_ruleAnswers1062 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_15_in_ruleAnswers1079 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAnswers1093 = new BitSet(new long[]{0x0000000010008002L});
    public static final BitSet FOLLOW_28_in_ruleAnswers1106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnswers1117 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleAnswers1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenAnswer_in_entryRuleOpenAnswer1170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenAnswer1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOpenAnswer1221 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOpenAnswer1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedAnswer_in_entryRuleClosedAnswer1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedAnswer1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClosedAnswer1331 = new BitSet(new long[]{0x0000000040008012L});
    public static final BitSet FOLLOW_30_in_ruleClosedAnswer1350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClosedAnswer1366 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_15_in_ruleClosedAnswer1385 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleClosedAnswer1402 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_15_in_ruleClosedAnswer1418 = new BitSet(new long[]{0x0000000000000012L});

}