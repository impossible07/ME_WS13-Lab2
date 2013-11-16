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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'questionnaire'", "'\"'", "'['", "']'", "'group'", "','", "'mandatory'", "'multiline'", "'open question'", "'closed question allowing'", "'single answer'", "'multiple answers'", "'likert question'", "'(-'", "'..'", "')'", "'answers ['", "'default answer is'", "'...'", "'enables question ['"
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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:76:1: ruleQuestionnaire returns [EObject current=null] : (otherlv_0= 'questionnaire' ( (lv_name_1_0= '\"' ) ) this_ID_2= RULE_ID otherlv_3= '\"' otherlv_4= '[' ( (lv_groups_5_0= ruleGroup ) )+ otherlv_6= ']' ) ;
    public final EObject ruleQuestionnaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_ID_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_groups_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:79:28: ( (otherlv_0= 'questionnaire' ( (lv_name_1_0= '\"' ) ) this_ID_2= RULE_ID otherlv_3= '\"' otherlv_4= '[' ( (lv_groups_5_0= ruleGroup ) )+ otherlv_6= ']' ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:80:1: (otherlv_0= 'questionnaire' ( (lv_name_1_0= '\"' ) ) this_ID_2= RULE_ID otherlv_3= '\"' otherlv_4= '[' ( (lv_groups_5_0= ruleGroup ) )+ otherlv_6= ']' )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:80:1: (otherlv_0= 'questionnaire' ( (lv_name_1_0= '\"' ) ) this_ID_2= RULE_ID otherlv_3= '\"' otherlv_4= '[' ( (lv_groups_5_0= ruleGroup ) )+ otherlv_6= ']' )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:80:3: otherlv_0= 'questionnaire' ( (lv_name_1_0= '\"' ) ) this_ID_2= RULE_ID otherlv_3= '\"' otherlv_4= '[' ( (lv_groups_5_0= ruleGroup ) )+ otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleQuestionnaire122); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:84:1: ( (lv_name_1_0= '\"' ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:85:1: (lv_name_1_0= '\"' )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:85:1: (lv_name_1_0= '\"' )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:86:3: lv_name_1_0= '\"'
            {
            lv_name_1_0=(Token)match(input,12,FOLLOW_12_in_ruleQuestionnaire140); 

                    newLeafNode(lv_name_1_0, grammarAccess.getQuestionnaireAccess().getNameQuotationMarkKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionnaireRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "\"");
            	    

            }


            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestionnaire164); 
             
                newLeafNode(this_ID_2, grammarAccess.getQuestionnaireAccess().getIDTerminalRuleCall_2()); 
                
            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleQuestionnaire175); 

                	newLeafNode(otherlv_3, grammarAccess.getQuestionnaireAccess().getQuotationMarkKeyword_3());
                
            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleQuestionnaire187); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getLeftSquareBracketKeyword_4());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:111:1: ( (lv_groups_5_0= ruleGroup ) )+
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
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:112:1: (lv_groups_5_0= ruleGroup )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:112:1: (lv_groups_5_0= ruleGroup )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:113:3: lv_groups_5_0= ruleGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getGroupsGroupParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroup_in_ruleQuestionnaire208);
            	    lv_groups_5_0=ruleGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"groups",
            	            		lv_groups_5_0, 
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

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleQuestionnaire221); 

                	newLeafNode(otherlv_6, grammarAccess.getQuestionnaireAccess().getRightSquareBracketKeyword_6());
                

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:141:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:142:2: (iv_ruleGroup= ruleGroup EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:143:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup257);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup267); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:150:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+ otherlv_4= ']' (otherlv_5= ',' )? ) ;
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
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:153:28: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+ otherlv_4= ']' (otherlv_5= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:154:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+ otherlv_4= ']' (otherlv_5= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:154:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+ otherlv_4= ']' (otherlv_5= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:154:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+ otherlv_4= ']' (otherlv_5= ',' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleGroup304); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:158:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:159:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:159:1: (lv_name_1_0= RULE_ID )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:160:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGroup321); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleGroup338); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:180:1: ( ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=20)||LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:181:1: ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:181:1: ( (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:182:1: (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:182:1: (lv_questions_3_1= ruleOpenQuestion | lv_questions_3_2= ruleClosedQuestion | lv_questions_3_3= ruleLikertQuestion )
            	    int alt2=3;
            	    switch ( input.LA(1) ) {
            	    case 17:
            	    case 18:
            	    case 19:
            	        {
            	        alt2=1;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt2=2;
            	        }
            	        break;
            	    case 23:
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
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:183:3: lv_questions_3_1= ruleOpenQuestion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsOpenQuestionParserRuleCall_3_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleOpenQuestion_in_ruleGroup361);
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
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:198:8: lv_questions_3_2= ruleClosedQuestion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsClosedQuestionParserRuleCall_3_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleClosedQuestion_in_ruleGroup380);
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
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:213:8: lv_questions_3_3= ruleLikertQuestion
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsLikertQuestionParserRuleCall_3_0_2()); 
            	            	    
            	            pushFollow(FOLLOW_ruleLikertQuestion_in_ruleGroup399);
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

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleGroup415); 

                	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_4());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:235:1: (otherlv_5= ',' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:235:3: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleGroup428); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:247:1: entryRuleOpenQuestion returns [EObject current=null] : iv_ruleOpenQuestion= ruleOpenQuestion EOF ;
    public final EObject entryRuleOpenQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:248:2: (iv_ruleOpenQuestion= ruleOpenQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:249:2: iv_ruleOpenQuestion= ruleOpenQuestion EOF
            {
             newCompositeNode(grammarAccess.getOpenQuestionRule()); 
            pushFollow(FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion466);
            iv_ruleOpenQuestion=ruleOpenQuestion();

            state._fsp--;

             current =iv_ruleOpenQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenQuestion476); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:256:1: ruleOpenQuestion returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleOpenQuestion() throws RecognitionException {
        EObject current = null;

        Token lv_mandatory_1_0=null;
        Token lv_multiline_2_0=null;
        Token otherlv_3=null;
        Token lv_question_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:259:28: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:260:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) ) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:260:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:262:1: ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:262:1: ( ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:263:2: ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getOpenQuestionAccess().getUnorderedGroup());
            	
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:266:2: ( ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?)
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:267:3: ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+ {...}?
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:267:3: ( ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA7_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 0) ) {
                        alt7=1;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA7_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 1) ) {
                        alt7=2;
                    }


                    }
                    break;
                case 19:
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
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:269:4: ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:269:4: ({...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:270:5: {...}? => ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOpenQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:270:107: ( ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:271:6: ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:274:6: ({...}? => ( (lv_mandatory_1_0= 'mandatory' ) ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:274:7: {...}? => ( (lv_mandatory_1_0= 'mandatory' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOpenQuestion", "true");
            	    }
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:274:16: ( (lv_mandatory_1_0= 'mandatory' ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:275:1: (lv_mandatory_1_0= 'mandatory' )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:275:1: (lv_mandatory_1_0= 'mandatory' )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:276:3: lv_mandatory_1_0= 'mandatory'
            	    {
            	    lv_mandatory_1_0=(Token)match(input,17,FOLLOW_17_in_ruleOpenQuestion563); 

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
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:296:4: ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:296:4: ({...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:297:5: {...}? => ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOpenQuestion", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:297:107: ( ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:298:6: ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:301:6: ({...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:301:7: {...}? => ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOpenQuestion", "true");
            	    }
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:301:16: ( ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )? )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:301:17: ( (lv_multiline_2_0= 'multiline' ) )? otherlv_3= 'open question' ( (lv_question_4_0= RULE_ID ) ) (otherlv_5= ',' )?
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:301:17: ( (lv_multiline_2_0= 'multiline' ) )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==18) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:302:1: (lv_multiline_2_0= 'multiline' )
            	            {
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:302:1: (lv_multiline_2_0= 'multiline' )
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:303:3: lv_multiline_2_0= 'multiline'
            	            {
            	            lv_multiline_2_0=(Token)match(input,18,FOLLOW_18_in_ruleOpenQuestion649); 

            	                    newLeafNode(lv_multiline_2_0, grammarAccess.getOpenQuestionAccess().getMultilineMultilineKeyword_1_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getOpenQuestionRule());
            	            	        }
            	                   		setWithLastConsumed(current, "multiline", true, "multiline");
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleOpenQuestion675); 

            	        	newLeafNode(otherlv_3, grammarAccess.getOpenQuestionAccess().getOpenQuestionKeyword_1_1());
            	        
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:320:1: ( (lv_question_4_0= RULE_ID ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:321:1: (lv_question_4_0= RULE_ID )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:321:1: (lv_question_4_0= RULE_ID )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:322:3: lv_question_4_0= RULE_ID
            	    {
            	    lv_question_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOpenQuestion692); 

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

            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:338:2: (otherlv_5= ',' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==16) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:338:4: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleOpenQuestion710); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:365:1: entryRuleClosedQuestion returns [EObject current=null] : iv_ruleClosedQuestion= ruleClosedQuestion EOF ;
    public final EObject entryRuleClosedQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosedQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:366:2: (iv_ruleClosedQuestion= ruleClosedQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:367:2: iv_ruleClosedQuestion= ruleClosedQuestion EOF
            {
             newCompositeNode(grammarAccess.getClosedQuestionRule()); 
            pushFollow(FOLLOW_ruleClosedQuestion_in_entryRuleClosedQuestion794);
            iv_ruleClosedQuestion=ruleClosedQuestion();

            state._fsp--;

             current =iv_ruleClosedQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosedQuestion804); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:374:1: ruleClosedQuestion returns [EObject current=null] : (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_ID ) ) ( (lv_answers_4_0= ruleAnswers ) ) ) ;
    public final EObject ruleClosedQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_question_3_0=null;
        EObject lv_answers_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:377:28: ( (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_ID ) ) ( (lv_answers_4_0= ruleAnswers ) ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:378:1: (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_ID ) ) ( (lv_answers_4_0= ruleAnswers ) ) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:378:1: (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_ID ) ) ( (lv_answers_4_0= ruleAnswers ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:378:3: otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_question_3_0= RULE_ID ) ) ( (lv_answers_4_0= ruleAnswers ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleClosedQuestion841); 

                	newLeafNode(otherlv_0, grammarAccess.getClosedQuestionAccess().getClosedQuestionAllowingKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:382:1: (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:382:3: otherlv_1= 'single answer'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleClosedQuestion854); 

                        	newLeafNode(otherlv_1, grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:387:7: otherlv_2= 'multiple answers'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleClosedQuestion872); 

                        	newLeafNode(otherlv_2, grammarAccess.getClosedQuestionAccess().getMultipleAnswersKeyword_1_1());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:391:2: ( (lv_question_3_0= RULE_ID ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:392:1: (lv_question_3_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:392:1: (lv_question_3_0= RULE_ID )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:393:3: lv_question_3_0= RULE_ID
            {
            lv_question_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClosedQuestion890); 

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

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:409:2: ( (lv_answers_4_0= ruleAnswers ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:410:1: (lv_answers_4_0= ruleAnswers )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:410:1: (lv_answers_4_0= ruleAnswers )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:411:3: lv_answers_4_0= ruleAnswers
            {
             
            	        newCompositeNode(grammarAccess.getClosedQuestionAccess().getAnswersAnswersParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswers_in_ruleClosedQuestion916);
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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:435:1: entryRuleLikertQuestion returns [EObject current=null] : iv_ruleLikertQuestion= ruleLikertQuestion EOF ;
    public final EObject entryRuleLikertQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikertQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:436:2: (iv_ruleLikertQuestion= ruleLikertQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:437:2: iv_ruleLikertQuestion= ruleLikertQuestion EOF
            {
             newCompositeNode(grammarAccess.getLikertQuestionRule()); 
            pushFollow(FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion952);
            iv_ruleLikertQuestion=ruleLikertQuestion();

            state._fsp--;

             current =iv_ruleLikertQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikertQuestion962); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:444:1: ruleLikertQuestion returns [EObject current=null] : (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_ID ) ) otherlv_2= '(-' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_higher_5_0= RULE_INT ) ) otherlv_6= ')' ) ;
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
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:447:28: ( (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_ID ) ) otherlv_2= '(-' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_higher_5_0= RULE_INT ) ) otherlv_6= ')' ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:448:1: (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_ID ) ) otherlv_2= '(-' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_higher_5_0= RULE_INT ) ) otherlv_6= ')' )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:448:1: (otherlv_0= 'likert question' ( (lv_question_1_0= RULE_ID ) ) otherlv_2= '(-' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_higher_5_0= RULE_INT ) ) otherlv_6= ')' )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:448:3: otherlv_0= 'likert question' ( (lv_question_1_0= RULE_ID ) ) otherlv_2= '(-' ( (lv_lower_3_0= RULE_INT ) ) otherlv_4= '..' ( (lv_higher_5_0= RULE_INT ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleLikertQuestion999); 

                	newLeafNode(otherlv_0, grammarAccess.getLikertQuestionAccess().getLikertQuestionKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:452:1: ( (lv_question_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:453:1: (lv_question_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:453:1: (lv_question_1_0= RULE_ID )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:454:3: lv_question_1_0= RULE_ID
            {
            lv_question_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLikertQuestion1016); 

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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleLikertQuestion1033); 

                	newLeafNode(otherlv_2, grammarAccess.getLikertQuestionAccess().getLeftParenthesisHyphenMinusKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:474:1: ( (lv_lower_3_0= RULE_INT ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:475:1: (lv_lower_3_0= RULE_INT )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:475:1: (lv_lower_3_0= RULE_INT )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:476:3: lv_lower_3_0= RULE_INT
            {
            lv_lower_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLikertQuestion1050); 

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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleLikertQuestion1067); 

                	newLeafNode(otherlv_4, grammarAccess.getLikertQuestionAccess().getFullStopFullStopKeyword_4());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:496:1: ( (lv_higher_5_0= RULE_INT ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:497:1: (lv_higher_5_0= RULE_INT )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:497:1: (lv_higher_5_0= RULE_INT )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:498:3: lv_higher_5_0= RULE_INT
            {
            lv_higher_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLikertQuestion1084); 

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

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleLikertQuestion1101); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:526:1: entryRuleAnswers returns [EObject current=null] : iv_ruleAnswers= ruleAnswers EOF ;
    public final EObject entryRuleAnswers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswers = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:527:2: (iv_ruleAnswers= ruleAnswers EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:528:2: iv_ruleAnswers= ruleAnswers EOF
            {
             newCompositeNode(grammarAccess.getAnswersRule()); 
            pushFollow(FOLLOW_ruleAnswers_in_entryRuleAnswers1137);
            iv_ruleAnswers=ruleAnswers();

            state._fsp--;

             current =iv_ruleAnswers; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswers1147); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:535:1: ruleAnswers returns [EObject current=null] : (otherlv_0= 'answers [' ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+ otherlv_2= ']' (otherlv_3= 'default answer is' ( (otherlv_4= RULE_ID ) ) )? ) ;
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
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:538:28: ( (otherlv_0= 'answers [' ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+ otherlv_2= ']' (otherlv_3= 'default answer is' ( (otherlv_4= RULE_ID ) ) )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:539:1: (otherlv_0= 'answers [' ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+ otherlv_2= ']' (otherlv_3= 'default answer is' ( (otherlv_4= RULE_ID ) ) )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:539:1: (otherlv_0= 'answers [' ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+ otherlv_2= ']' (otherlv_3= 'default answer is' ( (otherlv_4= RULE_ID ) ) )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:539:3: otherlv_0= 'answers [' ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+ otherlv_2= ']' (otherlv_3= 'default answer is' ( (otherlv_4= RULE_ID ) ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleAnswers1184); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswersAccess().getAnswersKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:543:1: ( ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) ) )+
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
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:544:1: ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:544:1: ( (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer ) )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:545:1: (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:545:1: (lv_answers_1_1= ruleOpenAnswer | lv_answers_1_2= ruleClosedAnswer )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_ID) ) {
            	        int LA9_1 = input.LA(2);

            	        if ( (LA9_1==RULE_ID||LA9_1==14||LA9_1==16||LA9_1==30) ) {
            	            alt9=2;
            	        }
            	        else if ( (LA9_1==29) ) {
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
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:546:3: lv_answers_1_1= ruleOpenAnswer
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAnswersAccess().getAnswersOpenAnswerParserRuleCall_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleOpenAnswer_in_ruleAnswers1207);
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
            	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:561:8: lv_answers_1_2= ruleClosedAnswer
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAnswersAccess().getAnswersClosedAnswerParserRuleCall_1_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleClosedAnswer_in_ruleAnswers1226);
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleAnswers1242); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswersAccess().getRightSquareBracketKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:583:1: (otherlv_3= 'default answer is' ( (otherlv_4= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:583:3: otherlv_3= 'default answer is' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleAnswers1255); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnswersAccess().getDefaultAnswerIsKeyword_3_0());
                        
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:587:1: ( (otherlv_4= RULE_ID ) )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:588:1: (otherlv_4= RULE_ID )
                    {
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:588:1: (otherlv_4= RULE_ID )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:589:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnswersRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnswers1275); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:608:1: entryRuleOpenAnswer returns [EObject current=null] : iv_ruleOpenAnswer= ruleOpenAnswer EOF ;
    public final EObject entryRuleOpenAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:609:2: (iv_ruleOpenAnswer= ruleOpenAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:610:2: iv_ruleOpenAnswer= ruleOpenAnswer EOF
            {
             newCompositeNode(grammarAccess.getOpenAnswerRule()); 
            pushFollow(FOLLOW_ruleOpenAnswer_in_entryRuleOpenAnswer1313);
            iv_ruleOpenAnswer=ruleOpenAnswer();

            state._fsp--;

             current =iv_ruleOpenAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenAnswer1323); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:617:1: ruleOpenAnswer returns [EObject current=null] : ( ( (lv_answer_0_0= RULE_ID ) ) otherlv_1= '...' (otherlv_2= ',' )? ) ;
    public final EObject ruleOpenAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_answer_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:620:28: ( ( ( (lv_answer_0_0= RULE_ID ) ) otherlv_1= '...' (otherlv_2= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:621:1: ( ( (lv_answer_0_0= RULE_ID ) ) otherlv_1= '...' (otherlv_2= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:621:1: ( ( (lv_answer_0_0= RULE_ID ) ) otherlv_1= '...' (otherlv_2= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:621:2: ( (lv_answer_0_0= RULE_ID ) ) otherlv_1= '...' (otherlv_2= ',' )?
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:621:2: ( (lv_answer_0_0= RULE_ID ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:622:1: (lv_answer_0_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:622:1: (lv_answer_0_0= RULE_ID )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:623:3: lv_answer_0_0= RULE_ID
            {
            lv_answer_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOpenAnswer1365); 

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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleOpenAnswer1382); 

                	newLeafNode(otherlv_1, grammarAccess.getOpenAnswerAccess().getFullStopFullStopFullStopKeyword_1());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:643:1: (otherlv_2= ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:643:3: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleOpenAnswer1395); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:655:1: entryRuleClosedAnswer returns [EObject current=null] : iv_ruleClosedAnswer= ruleClosedAnswer EOF ;
    public final EObject entryRuleClosedAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosedAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:656:2: (iv_ruleClosedAnswer= ruleClosedAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:657:2: iv_ruleClosedAnswer= ruleClosedAnswer EOF
            {
             newCompositeNode(grammarAccess.getClosedAnswerRule()); 
            pushFollow(FOLLOW_ruleClosedAnswer_in_entryRuleClosedAnswer1433);
            iv_ruleClosedAnswer=ruleClosedAnswer();

            state._fsp--;

             current =iv_ruleClosedAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosedAnswer1443); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:664:1: ruleClosedAnswer returns [EObject current=null] : ( ( (lv_answer_0_0= RULE_ID ) ) (otherlv_1= ',' )? (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )? (otherlv_5= ',' )? ) ;
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
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:667:28: ( ( ( (lv_answer_0_0= RULE_ID ) ) (otherlv_1= ',' )? (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )? (otherlv_5= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:668:1: ( ( (lv_answer_0_0= RULE_ID ) ) (otherlv_1= ',' )? (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )? (otherlv_5= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:668:1: ( ( (lv_answer_0_0= RULE_ID ) ) (otherlv_1= ',' )? (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )? (otherlv_5= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:668:2: ( (lv_answer_0_0= RULE_ID ) ) (otherlv_1= ',' )? (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )? (otherlv_5= ',' )?
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:668:2: ( (lv_answer_0_0= RULE_ID ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:669:1: (lv_answer_0_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:669:1: (lv_answer_0_0= RULE_ID )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:670:3: lv_answer_0_0= RULE_ID
            {
            lv_answer_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClosedAnswer1485); 

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

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:686:2: (otherlv_1= ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:686:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleClosedAnswer1503); 

                        	newLeafNode(otherlv_1, grammarAccess.getClosedAnswerAccess().getCommaKeyword_1());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:690:3: (otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:690:5: otherlv_2= 'enables question [' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleClosedAnswer1518); 

                        	newLeafNode(otherlv_2, grammarAccess.getClosedAnswerAccess().getEnablesQuestionKeyword_2_0());
                        
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:694:1: ( (otherlv_3= RULE_ID ) )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:695:1: (otherlv_3= RULE_ID )
                    {
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:695:1: (otherlv_3= RULE_ID )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:696:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClosedAnswerRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClosedAnswer1538); 

                    		newLeafNode(otherlv_3, grammarAccess.getClosedAnswerAccess().getQuestionClosedQuestionCrossReference_2_1_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleClosedAnswer1550); 

                        	newLeafNode(otherlv_4, grammarAccess.getClosedAnswerAccess().getRightSquareBracketKeyword_2_2());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:711:3: (otherlv_5= ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:711:5: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleClosedAnswer1565); 

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
    public static final BitSet FOLLOW_12_in_ruleQuestionnaire140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestionnaire164 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQuestionnaire175 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQuestionnaire187 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleQuestionnaire208 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleQuestionnaire221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGroup304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGroup321 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGroup338 = new BitSet(new long[]{0x00000000009E0000L});
    public static final BitSet FOLLOW_ruleOpenQuestion_in_ruleGroup361 = new BitSet(new long[]{0x00000000009E4000L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_ruleGroup380 = new BitSet(new long[]{0x00000000009E4000L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_ruleGroup399 = new BitSet(new long[]{0x00000000009E4000L});
    public static final BitSet FOLLOW_14_in_ruleGroup415 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleGroup428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenQuestion476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpenQuestion563 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_18_in_ruleOpenQuestion649 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleOpenQuestion675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOpenQuestion692 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_16_in_ruleOpenQuestion710 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_entryRuleClosedQuestion794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedQuestion804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleClosedQuestion841 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleClosedQuestion854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22_in_ruleClosedQuestion872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClosedQuestion890 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleAnswers_in_ruleClosedQuestion916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikertQuestion962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleLikertQuestion999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLikertQuestion1016 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLikertQuestion1033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLikertQuestion1050 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLikertQuestion1067 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLikertQuestion1084 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLikertQuestion1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswers_in_entryRuleAnswers1137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswers1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAnswers1184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOpenAnswer_in_ruleAnswers1207 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleClosedAnswer_in_ruleAnswers1226 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleAnswers1242 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleAnswers1255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnswers1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenAnswer_in_entryRuleOpenAnswer1313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenAnswer1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOpenAnswer1365 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOpenAnswer1382 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleOpenAnswer1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedAnswer_in_entryRuleClosedAnswer1433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedAnswer1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClosedAnswer1485 = new BitSet(new long[]{0x0000000040010002L});
    public static final BitSet FOLLOW_16_in_ruleClosedAnswer1503 = new BitSet(new long[]{0x0000000040010002L});
    public static final BitSet FOLLOW_30_in_ruleClosedAnswer1518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClosedAnswer1538 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleClosedAnswer1550 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleClosedAnswer1565 = new BitSet(new long[]{0x0000000000000002L});

}
