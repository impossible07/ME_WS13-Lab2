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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'questionnaire'", "'['", "']'", "'group'", "','", "'mandatory'", "'multiline'", "'open question'", "'closed question allowing'", "'single answer'", "'multiple answers'", "'likert question'", "'(-'", "'..'", "')'", "'answers ['", "'enables question ['", "'default answer is'"
    };
    public static final int RULE_ID=6;
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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:251:1: ruleOpenQuestion returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleOpenQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_1_0=null;
        Token lv_multiline_2_0=null;
        Token otherlv_3=null;
        Token lv_question_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:254:28: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:255:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) ) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:255:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:257:1: ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:257:1: ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:258:2: ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getOpenQuestionAccess().getUnorderedGroup());
            	
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:261:2: ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?)
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:262:3: ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:262:3: ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    int LA7_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 0) ) {
                        alt7=1;
                    }


                    }
                    break;
                case 17:
                    {
                    int LA7_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 1) ) {
                        alt7=2;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA7_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 1) ) {
                        alt7=2;
                    }


                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:264:4: ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:264:4: ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:265:5: {...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOpenQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:265:107: ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:266:6: ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:269:6: ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:269:7: {...}? => ( (lv_mandatory_1_0= 'mandatory' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOpenQuestion", "true");
            	    }
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:269:16: ( (lv_mandatory_1_0= 'mandatory' ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:270:1: (lv_mandatory_1_0= 'mandatory' )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:270:1: (lv_mandatory_1_0= 'mandatory' )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:271:3: lv_mandatory_1_0= 'mandatory'
            	    {
            	    lv_mandatory_1_0=(Token)match(input,16,FOLLOW_16_in_ruleOpenQuestion532); 

            	            newLeafNode(lv_mandatory_1_0, grammarAccess.getOpenQuestionAccess().getMandatoryMandatoryKeyword_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOpenQuestionRule());
            	    	        }
            	           		setWithLastConsumed(current, "mandatory", true, "mandatory");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOpenQuestionAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:291:4: ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:291:4: ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:292:5: {...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOpenQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:292:107: ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:293:6: ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:296:6: ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:296:7: {...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOpenQuestion", "true");
            	    }
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:296:16: ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )? )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:296:17: ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_STRING ) ) (otherlv_5= ',' )?
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:296:17: ( (lv_multiline_2_0= 'multiline' ) )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==17) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:297:1: (lv_multiline_2_0= 'multiline' )
            	            {
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:297:1: (lv_multiline_2_0= 'multiline' )
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:298:3: lv_multiline_2_0= 'multiline'
            	            {
            	            lv_multiline_2_0=(Token)match(input,17,FOLLOW_17_in_ruleOpenQuestion618); 

            	                    newLeafNode(lv_multiline_2_0, grammarAccess.getOpenQuestionAccess().getMultilineMultilineKeyword_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getOpenQuestionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "multiline", true, "multiline");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleOpenQuestion644); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOpenQuestionAccess().getOpenQuestionKeyword_1_1());
            	        
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:315:1: ( (lv_question_4_0= RULE_STRING ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:316:1: (lv_question_4_0= RULE_STRING )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:316:1: (lv_question_4_0= RULE_STRING )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:317:3: lv_question_4_0= RULE_STRING
            	    {
            	    lv_question_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOpenQuestion661); 

            	    			newLeafNode(lv_question_4_0, grammarAccess.getOpenQuestionAccess().getQuestionSTRINGTerminalRuleCall_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOpenQuestionRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"question",
            	            		lv_question_4_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:333:2: (otherlv_5= ',' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==15) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:333:4: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleOpenQuestion679); 

            	                	newLeafNode(otherlv_5, grammarAccess.getOpenQuestionAccess().getCommaKeyword_1_3());
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOpenQuestionAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getOpenQuestionAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleOpenQuestion", "getUnorderedGroupHelper().canLeave(grammarAccess.getOpenQuestionAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getOpenQuestionAccess().getUnorderedGroup());
            	

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:360:1: entryRuleClosedQuestion returns [EObject current=null] : iv_ruleClosedQuestion= ruleClosedQuestion EOF ;
    public final EObject entryRuleClosedQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosedQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:361:2: (iv_ruleClosedQuestion= ruleClosedQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:362:2: iv_ruleClosedQuestion= ruleClosedQuestion EOF
            {
             newCompositeNode(grammarAccess.getClosedQuestionRule()); 
            pushFollow(FOLLOW_ruleClosedQuestion_in_entryRuleClosedQuestion763);
            iv_ruleClosedQuestion=ruleClosedQuestion();

            state._fsp--;

             current =iv_ruleClosedQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosedQuestion773); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:369:1: ruleClosedQuestion returns [EObject current=null] : (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_STRING ) ) ( (lv_answers_4_0= ruleAnswers ) ) ) ;
    public final EObject ruleClosedQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_question_3_0=null;
        EObject lv_answers_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:372:28: ( (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_STRING ) ) ( (lv_answers_4_0= ruleAnswers ) ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:373:1: (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_STRING ) ) ( (lv_answers_4_0= ruleAnswers ) ) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:373:1: (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_STRING ) ) ( (lv_answers_4_0= ruleAnswers ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:373:3: otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_STRING ) ) ( (lv_answers_4_0= ruleAnswers ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleClosedQuestion810); 

                	newLeafNode(otherlv_0, grammarAccess.getClosedQuestionAccess().getClosedQuestionAllowingKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:377:1: (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' )
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
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:377:3: otherlv_1= 'single answer'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleClosedQuestion823); 

                        	newLeafNode(otherlv_1, grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:382:7: otherlv_2= 'multiple answers'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleClosedQuestion841); 

                        	newLeafNode(otherlv_2, grammarAccess.getClosedQuestionAccess().getMultipleAnswersKeyword_1_1());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:386:2: ( (lv_question_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:387:1: (lv_question_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:387:1: (lv_question_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:388:3: lv_question_3_0= RULE_STRING
            {
            lv_question_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClosedQuestion859); 

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

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:404:2: ( (lv_answers_4_0= ruleAnswers ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:405:1: (lv_answers_4_0= ruleAnswers )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:405:1: (lv_answers_4_0= ruleAnswers )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:406:3: lv_answers_4_0= ruleAnswers
            {
             
            	        newCompositeNode(grammarAccess.getClosedQuestionAccess().getAnswersAnswersParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswers_in_ruleClosedQuestion885);
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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:430:1: entryRuleLikertQuestion returns [EObject current=null] : iv_ruleLikertQuestion= ruleLikertQuestion EOF ;
    public final EObject entryRuleLikertQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikertQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:431:2: (iv_ruleLikertQuestion= ruleLikertQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:432:2: iv_ruleLikertQuestion= ruleLikertQuestion EOF
            {
             newCompositeNode(grammarAccess.getLikertQuestionRule()); 
            pushFollow(FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion921);
            iv_ruleLikertQuestion=ruleLikertQuestion();

            state._fsp--;

             current =iv_ruleLikertQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikertQuestion931); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:439:1: ruleLikertQuestion returns [EObject current=null] : (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '(-' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_higher_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= ',' )? ) ;
    public final EObject ruleLikertQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_question_1_0=null;
        Token otherlv_2=null;
        Token lv_lower_3_0=null;
        Token otherlv_4=null;
        Token lv_higher_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:442:28: ( (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '(-' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_higher_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:443:1: (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '(-' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_higher_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:443:1: (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '(-' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_higher_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:443:3: otherlv_0= 'likert question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '(-' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_higher_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= ',' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleLikertQuestion968); 

                	newLeafNode(otherlv_0, grammarAccess.getLikertQuestionAccess().getLikertQuestionKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:447:1: ( (lv_question_1_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:448:1: (lv_question_1_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:448:1: (lv_question_1_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:449:3: lv_question_1_0= RULE_STRING
            {
            lv_question_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLikertQuestion985); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleLikertQuestion1002); 

                	newLeafNode(otherlv_2, grammarAccess.getLikertQuestionAccess().getLeftParenthesisHyphenMinusKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:469:1: ( (lv_lower_3_0= RULE_INT ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:470:1: (lv_lower_3_0= RULE_INT )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:470:1: (lv_lower_3_0= RULE_INT )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:471:3: lv_lower_3_0= RULE_INT
            {
            lv_lower_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLikertQuestion1019); 

            			newLeafNode(lv_lower_3_0, grammarAccess.getLikertQuestionAccess().getLowerINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLikertQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lower",
                    		lv_lower_3_0, 
                    		"INT");
            	    

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleLikertQuestion1036); 

                	newLeafNode(otherlv_4, grammarAccess.getLikertQuestionAccess().getFullStopFullStopKeyword_4());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:491:1: ( (lv_higher_5_0= RULE_INT ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:492:1: (lv_higher_5_0= RULE_INT )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:492:1: (lv_higher_5_0= RULE_INT )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:493:3: lv_higher_5_0= RULE_INT
            {
            lv_higher_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLikertQuestion1053); 

            			newLeafNode(lv_higher_5_0, grammarAccess.getLikertQuestionAccess().getHigherINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLikertQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"higher",
                    		lv_higher_5_0, 
                    		"INT");
            	    

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleLikertQuestion1070); 

                	newLeafNode(otherlv_6, grammarAccess.getLikertQuestionAccess().getRightParenthesisKeyword_6());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:513:1: (otherlv_7= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:513:3: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleLikertQuestion1083); 

                        	newLeafNode(otherlv_7, grammarAccess.getLikertQuestionAccess().getCommaKeyword_7());
                        

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:525:1: entryRuleAnswers returns [EObject current=null] : iv_ruleAnswers= ruleAnswers EOF ;
    public final EObject entryRuleAnswers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswers = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:526:2: (iv_ruleAnswers= ruleAnswers EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:527:2: iv_ruleAnswers= ruleAnswers EOF
            {
             newCompositeNode(grammarAccess.getAnswersRule()); 
            pushFollow(FOLLOW_ruleAnswers_in_entryRuleAnswers1121);
            iv_ruleAnswers=ruleAnswers();

            state._fsp--;

             current =iv_ruleAnswers; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswers1131); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:534:1: ruleAnswers returns [EObject current=null] : (otherlv_0= 'answers [' (this_STRING_1= RULE_STRING )+ (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )? (otherlv_5= ',' )? otherlv_6= ']' (otherlv_7= 'default answer is' this_STRING_8= RULE_STRING )? ) ;
    public final EObject ruleAnswers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_STRING_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_STRING_8=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:537:28: ( (otherlv_0= 'answers [' (this_STRING_1= RULE_STRING )+ (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )? (otherlv_5= ',' )? otherlv_6= ']' (otherlv_7= 'default answer is' this_STRING_8= RULE_STRING )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:538:1: (otherlv_0= 'answers [' (this_STRING_1= RULE_STRING )+ (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )? (otherlv_5= ',' )? otherlv_6= ']' (otherlv_7= 'default answer is' this_STRING_8= RULE_STRING )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:538:1: (otherlv_0= 'answers [' (this_STRING_1= RULE_STRING )+ (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )? (otherlv_5= ',' )? otherlv_6= ']' (otherlv_7= 'default answer is' this_STRING_8= RULE_STRING )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:538:3: otherlv_0= 'answers [' (this_STRING_1= RULE_STRING )+ (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )? (otherlv_5= ',' )? otherlv_6= ']' (otherlv_7= 'default answer is' this_STRING_8= RULE_STRING )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleAnswers1168); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswersAccess().getAnswersKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:542:1: (this_STRING_1= RULE_STRING )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:542:2: this_STRING_1= RULE_STRING
            	    {
            	    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnswers1180); 
            	     
            	        newLeafNode(this_STRING_1, grammarAccess.getAnswersAccess().getSTRINGTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:546:3: (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:546:5: otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleAnswers1194); 

                        	newLeafNode(otherlv_2, grammarAccess.getAnswersAccess().getEnablesQuestionKeyword_2_0());
                        
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:550:1: ( (otherlv_3= RULE_ID ) )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:551:1: (otherlv_3= RULE_ID )
                    {
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:551:1: (otherlv_3= RULE_ID )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:552:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswersRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnswers1214); 

                    		newLeafNode(otherlv_3, grammarAccess.getAnswersAccess().getQuestionClosedQuestionCrossReference_2_1_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAnswers1226); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnswersAccess().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:567:3: (otherlv_5= ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:567:5: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleAnswers1241); 

                        	newLeafNode(otherlv_5, grammarAccess.getAnswersAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleAnswers1255); 

                	newLeafNode(otherlv_6, grammarAccess.getAnswersAccess().getRightSquareBracketKeyword_4());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:575:1: (otherlv_7= 'default answer is' this_STRING_8= RULE_STRING )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:575:3: otherlv_7= 'default answer is' this_STRING_8= RULE_STRING
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleAnswers1268); 

                        	newLeafNode(otherlv_7, grammarAccess.getAnswersAccess().getDefaultAnswerIsKeyword_5_0());
                        
                    this_STRING_8=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnswers1279); 
                     
                        newLeafNode(this_STRING_8, grammarAccess.getAnswersAccess().getSTRINGTerminalRuleCall_5_1()); 
                        

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
    public static final BitSet FOLLOW_16_in_ruleOpenQuestion532 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_17_in_ruleOpenQuestion618 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOpenQuestion644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOpenQuestion661 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_15_in_ruleOpenQuestion679 = new BitSet(new long[]{0x0000000000070002L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_entryRuleClosedQuestion763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedQuestion773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleClosedQuestion810 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleClosedQuestion823 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21_in_ruleClosedQuestion841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClosedQuestion859 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleAnswers_in_ruleClosedQuestion885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikertQuestion931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleLikertQuestion968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLikertQuestion985 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLikertQuestion1002 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLikertQuestion1019 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLikertQuestion1036 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLikertQuestion1053 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLikertQuestion1070 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleLikertQuestion1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswers_in_entryRuleAnswers1121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswers1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAnswers1168 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnswers1180 = new BitSet(new long[]{0x000000000800A010L});
    public static final BitSet FOLLOW_27_in_ruleAnswers1194 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnswers1214 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAnswers1226 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_15_in_ruleAnswers1241 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAnswers1255 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleAnswers1268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnswers1279 = new BitSet(new long[]{0x0000000000000002L});

}
