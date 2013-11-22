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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'questionnaire'", "'['", "']'", "'group'", "','", "'mandatory'", "'multiline'", "'open question'", "'closed question allowing'", "'single answer'", "'multiple answers'", "'likert question'", "'('", "'-'", "'..'", "')'", "'answers ['", "'...'", "'enables question ['", "'default answer is'"
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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:145:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' this_STRING_1= RULE_STRING otherlv_2= '[' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= ']' (otherlv_5= ',' )? ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_STRING_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_questions_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:148:28: ( (otherlv_0= 'group' this_STRING_1= RULE_STRING otherlv_2= '[' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= ']' (otherlv_5= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:149:1: (otherlv_0= 'group' this_STRING_1= RULE_STRING otherlv_2= '[' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= ']' (otherlv_5= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:149:1: (otherlv_0= 'group' this_STRING_1= RULE_STRING otherlv_2= '[' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= ']' (otherlv_5= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:149:3: otherlv_0= 'group' this_STRING_1= RULE_STRING otherlv_2= '[' ( (lv_questions_3_0= ruleQuestion ) )+ otherlv_4= ']' (otherlv_5= ',' )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleGroup273); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGroup284); 
             
                newLeafNode(this_STRING_1, grammarAccess.getGroupAccess().getSTRINGTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGroup295); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:161:1: ( (lv_questions_3_0= ruleQuestion ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=19)||LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:162:1: (lv_questions_3_0= ruleQuestion )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:162:1: (lv_questions_3_0= ruleQuestion )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:163:3: lv_questions_3_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_ruleGroup316);
            	    lv_questions_3_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_3_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleGroup329); 

                	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_4());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:183:1: (otherlv_5= ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:183:3: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleGroup342); 

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


    // $ANTLR start "entryRuleQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:195:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:196:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:197:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion380);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion390); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:204:1: ruleQuestion returns [EObject current=null] : (this_OpenQuestion_0= ruleOpenQuestion | this_ClosedQuestion_1= ruleClosedQuestion | this_LikertQuestion_2= ruleLikertQuestion ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_OpenQuestion_0 = null;

        EObject this_ClosedQuestion_1 = null;

        EObject this_LikertQuestion_2 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:207:28: ( (this_OpenQuestion_0= ruleOpenQuestion | this_ClosedQuestion_1= ruleClosedQuestion | this_LikertQuestion_2= ruleLikertQuestion ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:208:1: (this_OpenQuestion_0= ruleOpenQuestion | this_ClosedQuestion_1= ruleClosedQuestion | this_LikertQuestion_2= ruleLikertQuestion )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:208:1: (this_OpenQuestion_0= ruleOpenQuestion | this_ClosedQuestion_1= ruleClosedQuestion | this_LikertQuestion_2= ruleLikertQuestion )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 16:
            case 17:
            case 18:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:209:5: this_OpenQuestion_0= ruleOpenQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getOpenQuestionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOpenQuestion_in_ruleQuestion437);
                    this_OpenQuestion_0=ruleOpenQuestion();

                    state._fsp--;

                     
                            current = this_OpenQuestion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:219:5: this_ClosedQuestion_1= ruleClosedQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getClosedQuestionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleClosedQuestion_in_ruleQuestion464);
                    this_ClosedQuestion_1=ruleClosedQuestion();

                    state._fsp--;

                     
                            current = this_ClosedQuestion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:229:5: this_LikertQuestion_2= ruleLikertQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getLikertQuestionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLikertQuestion_in_ruleQuestion491);
                    this_LikertQuestion_2=ruleLikertQuestion();

                    state._fsp--;

                     
                            current = this_LikertQuestion_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleOpenQuestion"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:245:1: entryRuleOpenQuestion returns [EObject current=null] : iv_ruleOpenQuestion= ruleOpenQuestion EOF ;
    public final EObject entryRuleOpenQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:246:2: (iv_ruleOpenQuestion= ruleOpenQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:247:2: iv_ruleOpenQuestion= ruleOpenQuestion EOF
            {
             newCompositeNode(grammarAccess.getOpenQuestionRule()); 
            pushFollow(FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion526);
            iv_ruleOpenQuestion=ruleOpenQuestion();

            state._fsp--;

             current =iv_ruleOpenQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenQuestion536); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:254:1: ruleOpenQuestion returns [EObject current=null] : ( (otherlv_0= 'mandatory' )? (otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_name_3_0= RULE_STRING ) ) (otherlv_4= ',' )? ) ;
    public final EObject ruleOpenQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:257:28: ( ( (otherlv_0= 'mandatory' )? (otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_name_3_0= RULE_STRING ) ) (otherlv_4= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:258:1: ( (otherlv_0= 'mandatory' )? (otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_name_3_0= RULE_STRING ) ) (otherlv_4= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:258:1: ( (otherlv_0= 'mandatory' )? (otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_name_3_0= RULE_STRING ) ) (otherlv_4= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:258:2: (otherlv_0= 'mandatory' )? (otherlv_1= 'multiline' )? otherlv_2= 'open question' ( (lv_name_3_0= RULE_STRING ) ) (otherlv_4= ',' )?
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:258:2: (otherlv_0= 'mandatory' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:258:4: otherlv_0= 'mandatory'
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleOpenQuestion574); 

                        	newLeafNode(otherlv_0, grammarAccess.getOpenQuestionAccess().getMandatoryKeyword_0());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:262:3: (otherlv_1= 'multiline' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:262:5: otherlv_1= 'multiline'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleOpenQuestion589); 

                        	newLeafNode(otherlv_1, grammarAccess.getOpenQuestionAccess().getMultilineKeyword_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleOpenQuestion603); 

                	newLeafNode(otherlv_2, grammarAccess.getOpenQuestionAccess().getOpenQuestionKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:270:1: ( (lv_name_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:271:1: (lv_name_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:271:1: (lv_name_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:272:3: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOpenQuestion620); 

            			newLeafNode(lv_name_3_0, grammarAccess.getOpenQuestionAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOpenQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:288:2: (otherlv_4= ',' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:288:4: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleOpenQuestion638); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:300:1: entryRuleClosedQuestion returns [EObject current=null] : iv_ruleClosedQuestion= ruleClosedQuestion EOF ;
    public final EObject entryRuleClosedQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosedQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:301:2: (iv_ruleClosedQuestion= ruleClosedQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:302:2: iv_ruleClosedQuestion= ruleClosedQuestion EOF
            {
             newCompositeNode(grammarAccess.getClosedQuestionRule()); 
            pushFollow(FOLLOW_ruleClosedQuestion_in_entryRuleClosedQuestion676);
            iv_ruleClosedQuestion=ruleClosedQuestion();

            state._fsp--;

             current =iv_ruleClosedQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosedQuestion686); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:309:1: ruleClosedQuestion returns [EObject current=null] : (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_answers_4_0= ruleAnswers ) ) (otherlv_5= ',' )? ) ;
    public final EObject ruleClosedQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        EObject lv_answers_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:312:28: ( (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_answers_4_0= ruleAnswers ) ) (otherlv_5= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:313:1: (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_answers_4_0= ruleAnswers ) ) (otherlv_5= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:313:1: (otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_answers_4_0= ruleAnswers ) ) (otherlv_5= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:313:3: otherlv_0= 'closed question allowing' (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' ) ( (lv_name_3_0= RULE_STRING ) ) ( (lv_answers_4_0= ruleAnswers ) ) (otherlv_5= ',' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleClosedQuestion723); 

                	newLeafNode(otherlv_0, grammarAccess.getClosedQuestionAccess().getClosedQuestionAllowingKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:317:1: (otherlv_1= 'single answer' | otherlv_2= 'multiple answers' )
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
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:317:3: otherlv_1= 'single answer'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleClosedQuestion736); 

                        	newLeafNode(otherlv_1, grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:322:7: otherlv_2= 'multiple answers'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleClosedQuestion754); 

                        	newLeafNode(otherlv_2, grammarAccess.getClosedQuestionAccess().getMultipleAnswersKeyword_1_1());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:326:2: ( (lv_name_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:327:1: (lv_name_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:327:1: (lv_name_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:328:3: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClosedQuestion772); 

            			newLeafNode(lv_name_3_0, grammarAccess.getClosedQuestionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClosedQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:344:2: ( (lv_answers_4_0= ruleAnswers ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:345:1: (lv_answers_4_0= ruleAnswers )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:345:1: (lv_answers_4_0= ruleAnswers )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:346:3: lv_answers_4_0= ruleAnswers
            {
             
            	        newCompositeNode(grammarAccess.getClosedQuestionAccess().getAnswersAnswersParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAnswers_in_ruleClosedQuestion798);
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

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:362:2: (otherlv_5= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:362:4: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleClosedQuestion811); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:374:1: entryRuleLikertQuestion returns [EObject current=null] : iv_ruleLikertQuestion= ruleLikertQuestion EOF ;
    public final EObject entryRuleLikertQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLikertQuestion = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:375:2: (iv_ruleLikertQuestion= ruleLikertQuestion EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:376:2: iv_ruleLikertQuestion= ruleLikertQuestion EOF
            {
             newCompositeNode(grammarAccess.getLikertQuestionRule()); 
            pushFollow(FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion849);
            iv_ruleLikertQuestion=ruleLikertQuestion();

            state._fsp--;

             current =iv_ruleLikertQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLikertQuestion859); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:383:1: ruleLikertQuestion returns [EObject current=null] : (otherlv_0= 'likert question' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' (otherlv_3= '-' )? ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= '..' ( (lv_higher_6_0= RULE_INT ) ) otherlv_7= ')' (otherlv_8= ',' )? ) ;
    public final EObject ruleLikertQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_lower_4_0=null;
        Token otherlv_5=null;
        Token lv_higher_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:386:28: ( (otherlv_0= 'likert question' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' (otherlv_3= '-' )? ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= '..' ( (lv_higher_6_0= RULE_INT ) ) otherlv_7= ')' (otherlv_8= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:387:1: (otherlv_0= 'likert question' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' (otherlv_3= '-' )? ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= '..' ( (lv_higher_6_0= RULE_INT ) ) otherlv_7= ')' (otherlv_8= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:387:1: (otherlv_0= 'likert question' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' (otherlv_3= '-' )? ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= '..' ( (lv_higher_6_0= RULE_INT ) ) otherlv_7= ')' (otherlv_8= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:387:3: otherlv_0= 'likert question' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '(' (otherlv_3= '-' )? ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= '..' ( (lv_higher_6_0= RULE_INT ) ) otherlv_7= ')' (otherlv_8= ',' )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleLikertQuestion896); 

                	newLeafNode(otherlv_0, grammarAccess.getLikertQuestionAccess().getLikertQuestionKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:391:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:392:1: (lv_name_1_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:392:1: (lv_name_1_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:393:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLikertQuestion913); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLikertQuestionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLikertQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleLikertQuestion930); 

                	newLeafNode(otherlv_2, grammarAccess.getLikertQuestionAccess().getLeftParenthesisKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:413:1: (otherlv_3= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:413:3: otherlv_3= '-'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleLikertQuestion943); 

                        	newLeafNode(otherlv_3, grammarAccess.getLikertQuestionAccess().getHyphenMinusKeyword_3());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:417:3: ( (lv_lower_4_0= RULE_INT ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:418:1: (lv_lower_4_0= RULE_INT )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:418:1: (lv_lower_4_0= RULE_INT )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:419:3: lv_lower_4_0= RULE_INT
            {
            lv_lower_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLikertQuestion962); 

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

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleLikertQuestion979); 

                	newLeafNode(otherlv_5, grammarAccess.getLikertQuestionAccess().getFullStopFullStopKeyword_5());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:439:1: ( (lv_higher_6_0= RULE_INT ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:440:1: (lv_higher_6_0= RULE_INT )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:440:1: (lv_higher_6_0= RULE_INT )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:441:3: lv_higher_6_0= RULE_INT
            {
            lv_higher_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLikertQuestion996); 

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

            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleLikertQuestion1013); 

                	newLeafNode(otherlv_7, grammarAccess.getLikertQuestionAccess().getRightParenthesisKeyword_7());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:461:1: (otherlv_8= ',' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:461:3: otherlv_8= ','
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleLikertQuestion1026); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:473:1: entryRuleAnswers returns [EObject current=null] : iv_ruleAnswers= ruleAnswers EOF ;
    public final EObject entryRuleAnswers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswers = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:474:2: (iv_ruleAnswers= ruleAnswers EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:475:2: iv_ruleAnswers= ruleAnswers EOF
            {
             newCompositeNode(grammarAccess.getAnswersRule()); 
            pushFollow(FOLLOW_ruleAnswers_in_entryRuleAnswers1064);
            iv_ruleAnswers=ruleAnswers();

            state._fsp--;

             current =iv_ruleAnswers; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswers1074); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:482:1: ruleAnswers returns [EObject current=null] : (otherlv_0= 'answers [' ( (lv_answers_1_0= ruleAnswer ) )+ otherlv_2= ']' ( (lv_defanswer_3_0= ruleDefAnswer ) )? ) ;
    public final EObject ruleAnswers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_answers_1_0 = null;

        EObject lv_defanswer_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:485:28: ( (otherlv_0= 'answers [' ( (lv_answers_1_0= ruleAnswer ) )+ otherlv_2= ']' ( (lv_defanswer_3_0= ruleDefAnswer ) )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:486:1: (otherlv_0= 'answers [' ( (lv_answers_1_0= ruleAnswer ) )+ otherlv_2= ']' ( (lv_defanswer_3_0= ruleDefAnswer ) )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:486:1: (otherlv_0= 'answers [' ( (lv_answers_1_0= ruleAnswer ) )+ otherlv_2= ']' ( (lv_defanswer_3_0= ruleDefAnswer ) )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:486:3: otherlv_0= 'answers [' ( (lv_answers_1_0= ruleAnswer ) )+ otherlv_2= ']' ( (lv_defanswer_3_0= ruleDefAnswer ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleAnswers1111); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswersAccess().getAnswersKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:490:1: ( (lv_answers_1_0= ruleAnswer ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:491:1: (lv_answers_1_0= ruleAnswer )
            	    {
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:491:1: (lv_answers_1_0= ruleAnswer )
            	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:492:3: lv_answers_1_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAnswersAccess().getAnswersAnswerParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnswer_in_ruleAnswers1132);
            	    lv_answers_1_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAnswersRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_1_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleAnswers1145); 

                	newLeafNode(otherlv_2, grammarAccess.getAnswersAccess().getRightSquareBracketKeyword_2());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:512:1: ( (lv_defanswer_3_0= ruleDefAnswer ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:513:1: (lv_defanswer_3_0= ruleDefAnswer )
                    {
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:513:1: (lv_defanswer_3_0= ruleDefAnswer )
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:514:3: lv_defanswer_3_0= ruleDefAnswer
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnswersAccess().getDefanswerDefAnswerParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDefAnswer_in_ruleAnswers1166);
                    lv_defanswer_3_0=ruleDefAnswer();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnswersRule());
                    	        }
                           		set(
                           			current, 
                           			"defanswer",
                            		lv_defanswer_3_0, 
                            		"DefAnswer");
                    	        afterParserOrEnumRuleCall();
                    	    

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


    // $ANTLR start "entryRuleAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:538:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:539:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:540:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_ruleAnswer_in_entryRuleAnswer1203);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswer1213); 

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
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:547:1: ruleAnswer returns [EObject current=null] : (this_OpenAnswer_0= ruleOpenAnswer | this_ClosedAnswer_1= ruleClosedAnswer ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        EObject this_OpenAnswer_0 = null;

        EObject this_ClosedAnswer_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:550:28: ( (this_OpenAnswer_0= ruleOpenAnswer | this_ClosedAnswer_1= ruleClosedAnswer ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:551:1: (this_OpenAnswer_0= ruleOpenAnswer | this_ClosedAnswer_1= ruleClosedAnswer )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:551:1: (this_OpenAnswer_0= ruleOpenAnswer | this_ClosedAnswer_1= ruleClosedAnswer )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EOF||LA14_1==RULE_STRING||LA14_1==13||LA14_1==15||LA14_1==29) ) {
                    alt14=2;
                }
                else if ( (LA14_1==28) ) {
                    alt14=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:552:5: this_OpenAnswer_0= ruleOpenAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getOpenAnswerParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleOpenAnswer_in_ruleAnswer1260);
                    this_OpenAnswer_0=ruleOpenAnswer();

                    state._fsp--;

                     
                            current = this_OpenAnswer_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:562:5: this_ClosedAnswer_1= ruleClosedAnswer
                    {
                     
                            newCompositeNode(grammarAccess.getAnswerAccess().getClosedAnswerParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleClosedAnswer_in_ruleAnswer1287);
                    this_ClosedAnswer_1=ruleClosedAnswer();

                    state._fsp--;

                     
                            current = this_ClosedAnswer_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleOpenAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:578:1: entryRuleOpenAnswer returns [EObject current=null] : iv_ruleOpenAnswer= ruleOpenAnswer EOF ;
    public final EObject entryRuleOpenAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpenAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:579:2: (iv_ruleOpenAnswer= ruleOpenAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:580:2: iv_ruleOpenAnswer= ruleOpenAnswer EOF
            {
             newCompositeNode(grammarAccess.getOpenAnswerRule()); 
            pushFollow(FOLLOW_ruleOpenAnswer_in_entryRuleOpenAnswer1322);
            iv_ruleOpenAnswer=ruleOpenAnswer();

            state._fsp--;

             current =iv_ruleOpenAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpenAnswer1332); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:587:1: ruleOpenAnswer returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '...' (otherlv_2= ',' )? ) ;
    public final EObject ruleOpenAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:590:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '...' (otherlv_2= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:591:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '...' (otherlv_2= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:591:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '...' (otherlv_2= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:591:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= '...' (otherlv_2= ',' )?
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:591:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:592:1: (lv_name_0_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:592:1: (lv_name_0_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:593:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOpenAnswer1374); 

            			newLeafNode(lv_name_0_0, grammarAccess.getOpenAnswerAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOpenAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleOpenAnswer1391); 

                	newLeafNode(otherlv_1, grammarAccess.getOpenAnswerAccess().getFullStopFullStopFullStopKeyword_1());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:613:1: (otherlv_2= ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:613:3: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleOpenAnswer1404); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:625:1: entryRuleClosedAnswer returns [EObject current=null] : iv_ruleClosedAnswer= ruleClosedAnswer EOF ;
    public final EObject entryRuleClosedAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosedAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:626:2: (iv_ruleClosedAnswer= ruleClosedAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:627:2: iv_ruleClosedAnswer= ruleClosedAnswer EOF
            {
             newCompositeNode(grammarAccess.getClosedAnswerRule()); 
            pushFollow(FOLLOW_ruleClosedAnswer_in_entryRuleClosedAnswer1442);
            iv_ruleClosedAnswer=ruleClosedAnswer();

            state._fsp--;

             current =iv_ruleClosedAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClosedAnswer1452); 

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
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:634:1: ruleClosedAnswer returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= 'enables question [' ( ( (otherlv_2= RULE_STRING ) ) (otherlv_3= ',' )? )+ otherlv_4= ']' )? (otherlv_5= ',' )? ) ;
    public final EObject ruleClosedAnswer() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:637:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= 'enables question [' ( ( (otherlv_2= RULE_STRING ) ) (otherlv_3= ',' )? )+ otherlv_4= ']' )? (otherlv_5= ',' )? ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:638:1: ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= 'enables question [' ( ( (otherlv_2= RULE_STRING ) ) (otherlv_3= ',' )? )+ otherlv_4= ']' )? (otherlv_5= ',' )? )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:638:1: ( ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= 'enables question [' ( ( (otherlv_2= RULE_STRING ) ) (otherlv_3= ',' )? )+ otherlv_4= ']' )? (otherlv_5= ',' )? )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:638:2: ( (lv_name_0_0= RULE_STRING ) ) (otherlv_1= 'enables question [' ( ( (otherlv_2= RULE_STRING ) ) (otherlv_3= ',' )? )+ otherlv_4= ']' )? (otherlv_5= ',' )?
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:638:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:639:1: (lv_name_0_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:639:1: (lv_name_0_0= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:640:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClosedAnswer1494); 

            			newLeafNode(lv_name_0_0, grammarAccess.getClosedAnswerAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getClosedAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:656:2: (otherlv_1= 'enables question [' ( ( (otherlv_2= RULE_STRING ) ) (otherlv_3= ',' )? )+ otherlv_4= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:656:4: otherlv_1= 'enables question [' ( ( (otherlv_2= RULE_STRING ) ) (otherlv_3= ',' )? )+ otherlv_4= ']'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleClosedAnswer1512); 

                        	newLeafNode(otherlv_1, grammarAccess.getClosedAnswerAccess().getEnablesQuestionKeyword_1_0());
                        
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:660:1: ( ( (otherlv_2= RULE_STRING ) ) (otherlv_3= ',' )? )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_STRING) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:660:2: ( (otherlv_2= RULE_STRING ) ) (otherlv_3= ',' )?
                    	    {
                    	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:660:2: ( (otherlv_2= RULE_STRING ) )
                    	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:661:1: (otherlv_2= RULE_STRING )
                    	    {
                    	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:661:1: (otherlv_2= RULE_STRING )
                    	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:662:3: otherlv_2= RULE_STRING
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getClosedAnswerRule());
                    	    	        }
                    	            
                    	    otherlv_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleClosedAnswer1533); 

                    	    		newLeafNode(otherlv_2, grammarAccess.getClosedAnswerAccess().getIdQuestionCrossReference_1_1_0_0()); 
                    	    	

                    	    }


                    	    }

                    	    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:673:2: (otherlv_3= ',' )?
                    	    int alt16=2;
                    	    int LA16_0 = input.LA(1);

                    	    if ( (LA16_0==15) ) {
                    	        alt16=1;
                    	    }
                    	    switch (alt16) {
                    	        case 1 :
                    	            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:673:4: otherlv_3= ','
                    	            {
                    	            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleClosedAnswer1546); 

                    	                	newLeafNode(otherlv_3, grammarAccess.getClosedAnswerAccess().getCommaKeyword_1_1_1());
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleClosedAnswer1562); 

                        	newLeafNode(otherlv_4, grammarAccess.getClosedAnswerAccess().getRightSquareBracketKeyword_1_2());
                        

                    }
                    break;

            }

            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:681:3: (otherlv_5= ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:681:5: otherlv_5= ','
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleClosedAnswer1577); 

                        	newLeafNode(otherlv_5, grammarAccess.getClosedAnswerAccess().getCommaKeyword_2());
                        

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


    // $ANTLR start "entryRuleDefAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:693:1: entryRuleDefAnswer returns [EObject current=null] : iv_ruleDefAnswer= ruleDefAnswer EOF ;
    public final EObject entryRuleDefAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefAnswer = null;


        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:694:2: (iv_ruleDefAnswer= ruleDefAnswer EOF )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:695:2: iv_ruleDefAnswer= ruleDefAnswer EOF
            {
             newCompositeNode(grammarAccess.getDefAnswerRule()); 
            pushFollow(FOLLOW_ruleDefAnswer_in_entryRuleDefAnswer1615);
            iv_ruleDefAnswer=ruleDefAnswer();

            state._fsp--;

             current =iv_ruleDefAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefAnswer1625); 

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
    // $ANTLR end "entryRuleDefAnswer"


    // $ANTLR start "ruleDefAnswer"
    // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:702:1: ruleDefAnswer returns [EObject current=null] : (otherlv_0= 'default answer is' ( (otherlv_1= RULE_STRING ) ) ) ;
    public final EObject ruleDefAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:705:28: ( (otherlv_0= 'default answer is' ( (otherlv_1= RULE_STRING ) ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:706:1: (otherlv_0= 'default answer is' ( (otherlv_1= RULE_STRING ) ) )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:706:1: (otherlv_0= 'default answer is' ( (otherlv_1= RULE_STRING ) ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:706:3: otherlv_0= 'default answer is' ( (otherlv_1= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleDefAnswer1662); 

                	newLeafNode(otherlv_0, grammarAccess.getDefAnswerAccess().getDefaultAnswerIsKeyword_0());
                
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:710:1: ( (otherlv_1= RULE_STRING ) )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:711:1: (otherlv_1= RULE_STRING )
            {
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:711:1: (otherlv_1= RULE_STRING )
            // ../at.ac.tuwien.big.questionnaire/src-gen/at/ac/tuwien/big/parser/antlr/internal/InternalQuestionnaire.g:712:3: otherlv_1= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDefAnswerRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDefAnswer1682); 

            		newLeafNode(otherlv_1, grammarAccess.getDefAnswerAccess().getIdAnswerCrossReference_1_0()); 
            	

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
    // $ANTLR end "ruleDefAnswer"

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
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGroup284 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGroup295 = new BitSet(new long[]{0x00000000004F0000L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleGroup316 = new BitSet(new long[]{0x00000000004F2000L});
    public static final BitSet FOLLOW_13_in_ruleGroup329 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleGroup342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenQuestion_in_ruleQuestion437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_ruleQuestion464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_ruleQuestion491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenQuestion_in_entryRuleOpenQuestion526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenQuestion536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpenQuestion574 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleOpenQuestion589 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOpenQuestion603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOpenQuestion620 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOpenQuestion638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedQuestion_in_entryRuleClosedQuestion676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedQuestion686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleClosedQuestion723 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleClosedQuestion736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21_in_ruleClosedQuestion754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClosedQuestion772 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleAnswers_in_ruleClosedQuestion798 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleClosedQuestion811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLikertQuestion_in_entryRuleLikertQuestion849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLikertQuestion859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleLikertQuestion896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLikertQuestion913 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLikertQuestion930 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleLikertQuestion943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLikertQuestion962 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLikertQuestion979 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLikertQuestion996 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLikertQuestion1013 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleLikertQuestion1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswers_in_entryRuleAnswers1064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswers1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAnswers1111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnswer_in_ruleAnswers1132 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleAnswers1145 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleDefAnswer_in_ruleAnswers1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswer1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenAnswer_in_ruleAnswer1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedAnswer_in_ruleAnswer1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpenAnswer_in_entryRuleOpenAnswer1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpenAnswer1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOpenAnswer1374 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOpenAnswer1391 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleOpenAnswer1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClosedAnswer_in_entryRuleClosedAnswer1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClosedAnswer1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClosedAnswer1494 = new BitSet(new long[]{0x0000000020008002L});
    public static final BitSet FOLLOW_29_in_ruleClosedAnswer1512 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleClosedAnswer1533 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_15_in_ruleClosedAnswer1546 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleClosedAnswer1562 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleClosedAnswer1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefAnswer_in_entryRuleDefAnswer1615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefAnswer1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDefAnswer1662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDefAnswer1682 = new BitSet(new long[]{0x0000000000000002L});

}