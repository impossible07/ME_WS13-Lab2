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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'questionnaire'", "'\"'", "'\" ['", "']'", "'group'", "'['", "','", "'mandatory'", "'multiline'", "'open question'", "'closed question allowing'", "'single answer'", "'multiple answers'", "'likert question'", "'(-'", "'..'", "')'", "'answers ['", "'default answer is'", "'...'", "'enables question ['"
    };
    public static final int RULE_ID=4;
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
    public static final int T__31=31;
    public static final int RULE_STRING=6;
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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:76:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'questionnaire' otherlv_1= '\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\" [' ( (lv_groups_4_0= ruleGroup ) )+ otherlv_5= ']' ) ;
    public final EObject ruleQuestionnaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_groups_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:79:28: ( (otherlv_0= 'questionnaire' otherlv_1= '\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\" [' ( (lv_groups_4_0= ruleGroup ) )+ otherlv_5= ']' ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:80:1: (otherlv_0= 'questionnaire' otherlv_1= '\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\" [' ( (lv_groups_4_0= ruleGroup ) )+ otherlv_5= ']' )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:80:1: (otherlv_0= 'questionnaire' otherlv_1= '\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\" [' ( (lv_groups_4_0= ruleGroup ) )+ otherlv_5= ']' )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:80:3: otherlv_0= 'questionnaire' otherlv_1= '\"' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\" [' ( (lv_groups_4_0= ruleGroup ) )+ otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleQuestionnaire122); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleQuestionnaire134); 

                	newLeafNode(otherlv_1, grammarAccess.getQuestionnaireAccess().getQuotationMarkKeyword_1());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:88:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:89:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:89:1: (lv_name_2_0= RULE_ID )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:90:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestionnaire151); 

            			newLeafNode(lv_name_2_0, grammarAccess.getQuestionnaireAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionnaireRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleQuestionnaire168); 

                	newLeafNode(otherlv_3, grammarAccess.getQuestionnaireAccess().getQuotationMarkSpaceLeftSquareBracketKeyword_3());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:110:1: ( (lv_groups_4_0= ruleGroup ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:111:1: (lv_groups_4_0= ruleGroup )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:111:1: (lv_groups_4_0= ruleGroup )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:112:3: lv_groups_4_0= ruleGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getGroupsGroupParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroup_in_ruleQuestionnaire189);
            	    lv_groups_4_0=ruleGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"groups",
            	            		lv_groups_4_0, 
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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleQuestionnaire202); 

                	newLeafNode(otherlv_5, grammarAccess.getQuestionnaireAccess().getRightSquareBracketKeyword_5());
                

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:140:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:141:2: (iv_ruleGroup= ruleGroup EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:142:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup238);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup248); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:149:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+ otherlv_4= ']' (otherlv_5= ',' )? ) ;
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
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:152:28: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+ otherlv_4= ']' (otherlv_5= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:153:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+ otherlv_4= ']' (otherlv_5= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:153:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+ otherlv_4= ']' (otherlv_5= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:153:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+ otherlv_4= ']' (otherlv_5= ',' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleGroup285); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:157:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:158:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:158:1: (lv_name_1_0= RULE_ID )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:159:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGroup302); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleGroup319); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:179:1: ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=18 && LA3_0<=21)||LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:180:1: ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:180:1: ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:181:1: (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:181:1: (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion )
            	    int alt2=3;
            	    switch ( input.LA(1) ) {
            	    case 18:
            	    case 19:
            	    case 20:
            	        {
            	        alt2=1;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt2=2;
            	        }
            	        break;
            	    case 24:
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
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:182:3: lv_questions_3_1= ruleOpenQuestion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsOpenQuestionParserRuleCall_3_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleOpenQuestion_in_ruleGroup342);
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
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:197:8: lv_questions_3_2= ruleClosedQuestion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsClosedQuestionParserRuleCall_3_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleClosedQuestion_in_ruleGroup361);
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
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:212:8: lv_questions_3_3= ruleLikertQuestion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsLikertQuestionParserRuleCall_3_0_2()); 
            	            	    
            	            pushFollow(FOLLOW_ruleLikertQuestion_in_ruleGroup380);
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

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleGroup396); 

                	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_4());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:234:1: (otherlv_5= ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:234:3: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleGroup409); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:246:1: entryRuleOpenQuestion returns [EObject current=null] : iv_ruleOpenQuestion= ruleOpenQuestion EOF ;
    public final EObject entryRuleOpenQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:247:2: (iv_ruleOpenQuestion= ruleOpenQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:248:2: iv_ruleOpenQuestion= ruleOpenQuestion EOF
            {
             newCompositeNode(grammarAccess.getOpenQuestionRule()); 
            pushFollow(FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion447);
            iv_ruleOpenQuestion=ruleOpenQuestion();

            state._fsp--;

             current =iv_ruleOpenQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenQuestion457); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:255:1: ruleOpenQuestion returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleOpenQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_1_0=null;
        Token lv_multiline_2_0=null;
        Token otherlv_3=null;
        Token lv_question_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:258:28: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:259:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) ) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:259:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:261:1: ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:261:1: ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:262:2: ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getOpenQuestionAccess().getUnorderedGroup());
            	
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:265:2: ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?)
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:266:3: ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:266:3: ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                switch ( input.LA(1) ) {
                case 18:
                    {
                    int LA7_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 0) ) {
                        alt7=1;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA7_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 1) ) {
                        alt7=2;
                    }


                    }
                    break;
                case 20:
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
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:268:4: ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:268:4: ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:269:5: {...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOpenQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:269:107: ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:270:6: ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:273:6: ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:273:7: {...}? => ( (lv_mandatory_1_0= 'mandatory' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOpenQuestion", "true");
            	    }
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:273:16: ( (lv_mandatory_1_0= 'mandatory' ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:274:1: (lv_mandatory_1_0= 'mandatory' )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:274:1: (lv_mandatory_1_0= 'mandatory' )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:275:3: lv_mandatory_1_0= 'mandatory'
            	    {
            	    lv_mandatory_1_0=(Token)match(input,18,FOLLOW_18_in_ruleOpenQuestion544); 

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
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:295:4: ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:295:4: ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:296:5: {...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOpenQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:296:107: ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:297:6: ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:300:6: ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:300:7: {...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOpenQuestion", "true");
            	    }
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:300:16: ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:300:17: ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )?
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:300:17: ( (lv_multiline_2_0= 'multiline' ) )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==19) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:301:1: (lv_multiline_2_0= 'multiline' )
            	            {
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:301:1: (lv_multiline_2_0= 'multiline' )
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:302:3: lv_multiline_2_0= 'multiline'
            	            {
            	            lv_multiline_2_0=(Token)match(input,19,FOLLOW_19_in_ruleOpenQuestion630); 

            	                    newLeafNode(lv_multiline_2_0, grammarAccess.getOpenQuestionAccess().getMultilineMultilineKeyword_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getOpenQuestionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "multiline", true, "multiline");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleOpenQuestion656); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOpenQuestionAccess().getOpenQuestionKeyword_1_1());
            	        
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:319:1: ( (lv_question_4_0= RULE_ID ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:320:1: (lv_question_4_0= RULE_ID )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:320:1: (lv_question_4_0= RULE_ID )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:321:3: lv_question_4_0= RULE_ID
            	    {
            	    lv_question_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOpenQuestion673); 

            	    			newLeafNode(lv_question_4_0, grammarAccess.getOpenQuestionAccess().getQuestionIDTerminalRuleCall_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOpenQuestionRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"question",
            	            		lv_question_4_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:337:2: (otherlv_5= ',' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==17) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:337:4: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleOpenQuestion691); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:364:1: entryRuleClosedQuestion returns [EObject current=null] : iv_ruleClosedQuestion= ruleClosedQuestion EOF ;
    public final EObject entryRuleClosedQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosedQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:365:2: (iv_ruleClosedQuestion= ruleClosedQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:366:2: iv_ruleClosedQuestion= ruleClosedQuestion EOF
            {
             newCompositeNode(grammarAccess.getClosedQuestionRule()); 
            pushFollow(FOLLOW_ruleClosedQuestion_in_entryRuleClosedQuestion775);
            iv_ruleClosedQuestion=ruleClosedQuestion();

            state._fsp--;

             current =iv_ruleClosedQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosedQuestion785); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:373:1: ruleClosedQuestion returns [EObject current=null] : (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_ID ) ) ( (lv_answers_4_0= ruleAnswers ) ) ) ;
    public final EObject ruleClosedQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_question_3_0=null;
        EObject lv_answers_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:376:28: ( (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_ID ) ) ( (lv_answers_4_0= ruleAnswers ) ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:377:1: (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_ID ) ) ( (lv_answers_4_0= ruleAnswers ) ) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:377:1: (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_ID ) ) ( (lv_answers_4_0= ruleAnswers ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:377:3: otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_ID ) ) ( (lv_answers_4_0= ruleAnswers ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleClosedQuestion822); 

                	newLeafNode(otherlv_0, grammarAccess.getClosedQuestionAccess().getClosedQuestionAllowingKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:381:1: (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:381:3: otherlv_1= 'single answer'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleClosedQuestion835); 

                        	newLeafNode(otherlv_1, grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:386:7: otherlv_2= 'multiple answers'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleClosedQuestion853); 

                        	newLeafNode(otherlv_2, grammarAccess.getClosedQuestionAccess().getMultipleAnswersKeyword_1_1());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:390:2: ( (lv_question_3_0= RULE_ID ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:391:1: (lv_question_3_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:391:1: (lv_question_3_0= RULE_ID )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:392:3: lv_question_3_0= RULE_ID
            {
            lv_question_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClosedQuestion871); 

            			newLeafNode(lv_question_3_0, grammarAccess.getClosedQuestionAccess().getQuestionIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClosedQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_3_0, 
                    		"ID");
            	    

            }


            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:408:2: ( (lv_answers_4_0= ruleAnswers ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:409:1: (lv_answers_4_0= ruleAnswers )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:409:1: (lv_answers_4_0= ruleAnswers )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:410:3: lv_answers_4_0= ruleAnswers
            {
             
            	        newCompositeNode(grammarAccess.getClosedQuestionAccess().getAnswersAnswersParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswers_in_ruleClosedQuestion897);
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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:434:1: entryRuleLikertQuestion returns [EObject current=null] : iv_ruleLikertQuestion= ruleLikertQuestion EOF ;
    public final EObject entryRuleLikertQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikertQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:435:2: (iv_ruleLikertQuestion= ruleLikertQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:436:2: iv_ruleLikertQuestion= ruleLikertQuestion EOF
            {
             newCompositeNode(grammarAccess.getLikertQuestionRule()); 
            pushFollow(FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion933);
            iv_ruleLikertQuestion=ruleLikertQuestion();

            state._fsp--;

             current =iv_ruleLikertQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikertQuestion943); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:443:1: ruleLikertQuestion returns [EObject current=null] : (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_ID ) ) otherlv_2= '(-' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_higher_5_0= RULE_INT ) ) otherlv_6= ')' ) ;
    public final EObject ruleLikertQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_question_1_0=null;
        Token otherlv_2=null;
        Token lv_lower_3_0=null;
        Token otherlv_4=null;
        Token lv_higher_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:446:28: ( (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_ID ) ) otherlv_2= '(-' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_higher_5_0= RULE_INT ) ) otherlv_6= ')' ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:447:1: (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_ID ) ) otherlv_2= '(-' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_higher_5_0= RULE_INT ) ) otherlv_6= ')' )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:447:1: (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_ID ) ) otherlv_2= '(-' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_higher_5_0= RULE_INT ) ) otherlv_6= ')' )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:447:3: otherlv_0= 'likert question' ( (lv_question_1_0= RULE_ID ) ) otherlv_2= '(-' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_higher_5_0= RULE_INT ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleLikertQuestion980); 

                	newLeafNode(otherlv_0, grammarAccess.getLikertQuestionAccess().getLikertQuestionKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:451:1: ( (lv_question_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:452:1: (lv_question_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:452:1: (lv_question_1_0= RULE_ID )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:453:3: lv_question_1_0= RULE_ID
            {
            lv_question_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLikertQuestion997); 

            			newLeafNode(lv_question_1_0, grammarAccess.getLikertQuestionAccess().getQuestionIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLikertQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleLikertQuestion1014); 

                	newLeafNode(otherlv_2, grammarAccess.getLikertQuestionAccess().getLeftParenthesisHyphenMinusKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:473:1: ( (lv_lower_3_0= RULE_INT ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:474:1: (lv_lower_3_0= RULE_INT )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:474:1: (lv_lower_3_0= RULE_INT )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:475:3: lv_lower_3_0= RULE_INT
            {
            lv_lower_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLikertQuestion1031); 

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

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleLikertQuestion1048); 

                	newLeafNode(otherlv_4, grammarAccess.getLikertQuestionAccess().getFullStopFullStopKeyword_4());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:495:1: ( (lv_higher_5_0= RULE_INT ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:496:1: (lv_higher_5_0= RULE_INT )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:496:1: (lv_higher_5_0= RULE_INT )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:497:3: lv_higher_5_0= RULE_INT
            {
            lv_higher_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLikertQuestion1065); 

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

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleLikertQuestion1082); 

                	newLeafNode(otherlv_6, grammarAccess.getLikertQuestionAccess().getRightParenthesisKeyword_6());
                

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
            pushFollow(FOLLOW_ruleAnswers_in_entryRuleAnswers1118);
            iv_ruleAnswers=ruleAnswers();

            state._fsp--;

             current =iv_ruleAnswers; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswers1128); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:534:1: ruleAnswers returns [EObject current=null] : (otherlv_0= 'answers [' ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+ otherlv_2= ']' (otherlv_3= 'default answer is' ( (otherlv_4= RULE_ID ) ) )? ) ;
    public final EObject ruleAnswers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_answers_1_1 = null;

        EObject lv_answers_1_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:537:28: ( (otherlv_0= 'answers [' ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+ otherlv_2= ']' (otherlv_3= 'default answer is' ( (otherlv_4= RULE_ID ) ) )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:538:1: (otherlv_0= 'answers [' ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+ otherlv_2= ']' (otherlv_3= 'default answer is' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:538:1: (otherlv_0= 'answers [' ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+ otherlv_2= ']' (otherlv_3= 'default answer is' ( (otherlv_4= RULE_ID ) ) )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:538:3: otherlv_0= 'answers [' ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+ otherlv_2= ']' (otherlv_3= 'default answer is' ( (otherlv_4= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleAnswers1165); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswersAccess().getAnswersKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:542:1: ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:543:1: ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:543:1: ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:544:1: (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:544:1: (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_ID) ) {
            	        int LA9_1 = input.LA(2);

            	        if ( (LA9_1==RULE_ID||LA9_1==14||LA9_1==17||LA9_1==31) ) {
            	            alt9=2;
            	        }
            	        else if ( (LA9_1==30) ) {
            	            alt9=1;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 9, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:545:3: lv_answers_1_1= ruleOpenAnswer
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAnswersAccess().getAnswersOpenAnswerParserRuleCall_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleOpenAnswer_in_ruleAnswers1188);
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
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:560:8: lv_answers_1_2= ruleClosedAnswer
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAnswersAccess().getAnswersClosedAnswerParserRuleCall_1_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleClosedAnswer_in_ruleAnswers1207);
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleAnswers1223); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswersAccess().getRightSquareBracketKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:582:1: (otherlv_3= 'default answer is' ( (otherlv_4= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:582:3: otherlv_3= 'default answer is' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleAnswers1236); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnswersAccess().getDefaultAnswerIsKeyword_3_0());
                        
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:586:1: ( (otherlv_4= RULE_ID ) )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:587:1: (otherlv_4= RULE_ID )
                    {
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:587:1: (otherlv_4= RULE_ID )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:588:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswersRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnswers1256); 

                    		newLeafNode(otherlv_4, grammarAccess.getAnswersAccess().getAnswerClosedAnswerCrossReference_3_1_0()); 
                    	

                    }


                    }


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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:607:1: entryRuleOpenAnswer returns [EObject current=null] : iv_ruleOpenAnswer= ruleOpenAnswer EOF ;
    public final EObject entryRuleOpenAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:608:2: (iv_ruleOpenAnswer= ruleOpenAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:609:2: iv_ruleOpenAnswer= ruleOpenAnswer EOF
            {
             newCompositeNode(grammarAccess.getOpenAnswerRule()); 
            pushFollow(FOLLOW_ruleOpenAnswer_in_entryRuleOpenAnswer1294);
            iv_ruleOpenAnswer=ruleOpenAnswer();

            state._fsp--;

             current =iv_ruleOpenAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenAnswer1304); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:616:1: ruleOpenAnswer returns [EObject current=null] : ( ( (lv_answer_0_0= RULE_ID ) ) otherlv_1= '...' (otherlv_2= ',' )? ) ;
    public final EObject ruleOpenAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_answer_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:619:28: ( ( ( (lv_answer_0_0= RULE_ID ) ) otherlv_1= '...' (otherlv_2= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:620:1: ( ( (lv_answer_0_0= RULE_ID ) ) otherlv_1= '...' (otherlv_2= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:620:1: ( ( (lv_answer_0_0= RULE_ID ) ) otherlv_1= '...' (otherlv_2= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:620:2: ( (lv_answer_0_0= RULE_ID ) ) otherlv_1= '...' (otherlv_2= ',' )?
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:620:2: ( (lv_answer_0_0= RULE_ID ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:621:1: (lv_answer_0_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:621:1: (lv_answer_0_0= RULE_ID )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:622:3: lv_answer_0_0= RULE_ID
            {
            lv_answer_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOpenAnswer1346); 

            			newLeafNode(lv_answer_0_0, grammarAccess.getOpenAnswerAccess().getAnswerIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOpenAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"answer",
                    		lv_answer_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleOpenAnswer1363); 

                	newLeafNode(otherlv_1, grammarAccess.getOpenAnswerAccess().getFullStopFullStopFullStopKeyword_1());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:642:1: (otherlv_2= ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:642:3: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleOpenAnswer1376); 

                        	newLeafNode(otherlv_2, grammarAccess.getOpenAnswerAccess().getCommaKeyword_2());
                        

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
    // $ANTLR end "ruleOpenAnswer"


    // $ANTLR start "entryRuleClosedAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:654:1: entryRuleClosedAnswer returns [EObject current=null] : iv_ruleClosedAnswer= ruleClosedAnswer EOF ;
    public final EObject entryRuleClosedAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosedAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:655:2: (iv_ruleClosedAnswer= ruleClosedAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:656:2: iv_ruleClosedAnswer= ruleClosedAnswer EOF
            {
             newCompositeNode(grammarAccess.getClosedAnswerRule()); 
            pushFollow(FOLLOW_ruleClosedAnswer_in_entryRuleClosedAnswer1414);
            iv_ruleClosedAnswer=ruleClosedAnswer();

            state._fsp--;

             current =iv_ruleClosedAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosedAnswer1424); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:663:1: ruleClosedAnswer returns [EObject current=null] : ( ( (lv_answer_0_0= RULE_ID ) ) (otherlv_1= ',' )? (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )? (otherlv_5= ',' )? ) ;
    public final EObject ruleClosedAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_answer_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:666:28: ( ( ( (lv_answer_0_0= RULE_ID ) ) (otherlv_1= ',' )? (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )? (otherlv_5= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:667:1: ( ( (lv_answer_0_0= RULE_ID ) ) (otherlv_1= ',' )? (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )? (otherlv_5= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:667:1: ( ( (lv_answer_0_0= RULE_ID ) ) (otherlv_1= ',' )? (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )? (otherlv_5= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:667:2: ( (lv_answer_0_0= RULE_ID ) ) (otherlv_1= ',' )? (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )? (otherlv_5= ',' )?
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:667:2: ( (lv_answer_0_0= RULE_ID ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:668:1: (lv_answer_0_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:668:1: (lv_answer_0_0= RULE_ID )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:669:3: lv_answer_0_0= RULE_ID
            {
            lv_answer_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClosedAnswer1466); 

            			newLeafNode(lv_answer_0_0, grammarAccess.getClosedAnswerAccess().getAnswerIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClosedAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"answer",
                    		lv_answer_0_0, 
                    		"ID");
            	    

            }


            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:685:2: (otherlv_1= ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:685:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleClosedAnswer1484); 

                        	newLeafNode(otherlv_1, grammarAccess.getClosedAnswerAccess().getCommaKeyword_1());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:689:3: (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:689:5: otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleClosedAnswer1499); 

                        	newLeafNode(otherlv_2, grammarAccess.getClosedAnswerAccess().getEnablesQuestionKeyword_2_0());
                        
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:693:1: ( (otherlv_3= RULE_ID ) )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:694:1: (otherlv_3= RULE_ID )
                    {
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:694:1: (otherlv_3= RULE_ID )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:695:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClosedAnswerRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClosedAnswer1519); 

                    		newLeafNode(otherlv_3, grammarAccess.getClosedAnswerAccess().getQuestionClosedQuestionCrossReference_2_1_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleClosedAnswer1531); 

                        	newLeafNode(otherlv_4, grammarAccess.getClosedAnswerAccess().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:710:3: (otherlv_5= ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:710:5: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleClosedAnswer1546); 

                        	newLeafNode(otherlv_5, grammarAccess.getClosedAnswerAccess().getCommaKeyword_3());
                        

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
    // $ANTLR end "ruleClosedAnswer"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleQuestionnaire_in_entryRuleQuestionnaire75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionnaire85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleQuestionnaire122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQuestionnaire134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestionnaire151 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQuestionnaire168 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleQuestionnaire189 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleQuestionnaire202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGroup285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGroup302 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleGroup319 = new BitSet(new long[]{0x00000000013C0000L});
    public static final BitSet FOLLOW_ruleOpenQuestion_in_ruleGroup342 = new BitSet(new long[]{0x00000000013C4000L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_ruleGroup361 = new BitSet(new long[]{0x00000000013C4000L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_ruleGroup380 = new BitSet(new long[]{0x00000000013C4000L});
    public static final BitSet FOLLOW_14_in_ruleGroup396 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleGroup409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenQuestion457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpenQuestion544 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_19_in_ruleOpenQuestion630 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleOpenQuestion656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOpenQuestion673 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_17_in_ruleOpenQuestion691 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_entryRuleClosedQuestion775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedQuestion785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleClosedQuestion822 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleClosedQuestion835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_23_in_ruleClosedQuestion853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClosedQuestion871 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleAnswers_in_ruleClosedQuestion897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikertQuestion943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleLikertQuestion980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLikertQuestion997 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLikertQuestion1014 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLikertQuestion1031 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLikertQuestion1048 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLikertQuestion1065 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLikertQuestion1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswers_in_entryRuleAnswers1118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswers1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAnswers1165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOpenAnswer_in_ruleAnswers1188 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleClosedAnswer_in_ruleAnswers1207 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleAnswers1223 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleAnswers1236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnswers1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenAnswer_in_entryRuleOpenAnswer1294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenAnswer1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOpenAnswer1346 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleOpenAnswer1363 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleOpenAnswer1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedAnswer_in_entryRuleClosedAnswer1414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedAnswer1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClosedAnswer1466 = new BitSet(new long[]{0x0000000080020002L});
    public static final BitSet FOLLOW_17_in_ruleClosedAnswer1484 = new BitSet(new long[]{0x0000000080020002L});
    public static final BitSet FOLLOW_31_in_ruleClosedAnswer1499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClosedAnswer1519 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClosedAnswer1531 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleClosedAnswer1546 = new BitSet(new long[]{0x0000000000000002L});

}
