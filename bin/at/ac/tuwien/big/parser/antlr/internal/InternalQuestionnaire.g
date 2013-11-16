/*
* generated by Xtext
*/
grammar InternalQuestionnaire;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package at.ac.tuwien.big.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleQuestionnaire
entryRuleQuestionnaire returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionnaireRule()); }
	 iv_ruleQuestionnaire=ruleQuestionnaire 
	 { $current=$iv_ruleQuestionnaire.current; } 
	 EOF 
;

// Rule Questionnaire
ruleQuestionnaire returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='questionnaire' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getQuestionnaireAccess().getQuestionnaireKeyword_0());
    }
(
(
		lv_name_1_0=	'"' 
    {
        newLeafNode(lv_name_1_0, grammarAccess.getQuestionnaireAccess().getNameQuotationMarkKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuestionnaireRule());
	        }
       		setWithLastConsumed($current, "name", lv_name_1_0, "\"");
	    }

)
)this_ID_2=RULE_ID
    { 
    newLeafNode(this_ID_2, grammarAccess.getQuestionnaireAccess().getIDTerminalRuleCall_2()); 
    }
	otherlv_3='"' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getQuestionnaireAccess().getQuotationMarkKeyword_3());
    }
	otherlv_4='[' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getLeftSquareBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getGroupsGroupParserRuleCall_5_0()); 
	    }
		lv_groups_5_0=ruleGroup		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
	        }
       		add(
       			$current, 
       			"groups",
        		lv_groups_5_0, 
        		"Group");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_6=']' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getQuestionnaireAccess().getRightSquareBracketKeyword_6());
    }
)
;





// Entry rule entryRuleGroup
entryRuleGroup returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGroupRule()); }
	 iv_ruleGroup=ruleGroup 
	 { $current=$iv_ruleGroup.current; } 
	 EOF 
;

// Rule Group
ruleGroup returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='group' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGroupRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='[' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_2());
    }
(
(
(
		{ 
	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsOpenQuestionParserRuleCall_3_0_0()); 
	    }
		lv_questions_3_1=ruleOpenQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_3_1, 
        		"OpenQuestion");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsClosedQuestionParserRuleCall_3_0_1()); 
	    }
		lv_questions_3_2=ruleClosedQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_3_2, 
        		"ClosedQuestion");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsLikertQuestionParserRuleCall_3_0_2()); 
	    }
		lv_questions_3_3=ruleLikertQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_3_3, 
        		"LikertQuestion");
	        afterParserOrEnumRuleCall();
	    }

)

)
)+	otherlv_4=']' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getRightSquareBracketKeyword_4());
    }
(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getCommaKeyword_5());
    }
)?)
;





// Entry rule entryRuleOpenQuestion
entryRuleOpenQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOpenQuestionRule()); }
	 iv_ruleOpenQuestion=ruleOpenQuestion 
	 { $current=$iv_ruleOpenQuestion.current; } 
	 EOF 
;

// Rule OpenQuestion
ruleOpenQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getOpenQuestionAccess().getUnorderedGroup());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 0);
	 				}
					({true}?=>(
(
		lv_mandatory_1_0=	'mandatory' 
    {
        newLeafNode(lv_mandatory_1_0, grammarAccess.getOpenQuestionAccess().getMandatoryMandatoryKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOpenQuestionRule());
	        }
       		setWithLastConsumed($current, "mandatory", true, "mandatory");
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOpenQuestionAccess().getUnorderedGroup());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getOpenQuestionAccess().getUnorderedGroup(), 1);
	 				}
					({true}?=>((
(
		lv_multiline_2_0=	'multiline' 
    {
        newLeafNode(lv_multiline_2_0, grammarAccess.getOpenQuestionAccess().getMultilineMultilineKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOpenQuestionRule());
	        }
       		setWithLastConsumed($current, "multiline", true, "multiline");
	    }

)
)?	otherlv_3='open question' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getOpenQuestionAccess().getOpenQuestionKeyword_1_1());
    }
(
(
		lv_question_4_0=RULE_ID
		{
			newLeafNode(lv_question_4_0, grammarAccess.getOpenQuestionAccess().getQuestionIDTerminalRuleCall_1_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOpenQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"question",
        		lv_question_4_0, 
        		"ID");
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getOpenQuestionAccess().getCommaKeyword_1_3());
    }
)?))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOpenQuestionAccess().getUnorderedGroup());
	 				}
 				)
			)  

		)+
	  	{getUnorderedGroupHelper().canLeave(grammarAccess.getOpenQuestionAccess().getUnorderedGroup())}?	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getOpenQuestionAccess().getUnorderedGroup());
	}

)
;





// Entry rule entryRuleClosedQuestion
entryRuleClosedQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClosedQuestionRule()); }
	 iv_ruleClosedQuestion=ruleClosedQuestion 
	 { $current=$iv_ruleClosedQuestion.current; } 
	 EOF 
;

// Rule ClosedQuestion
ruleClosedQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='closed question allowing' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getClosedQuestionAccess().getClosedQuestionAllowingKeyword_0());
    }
(	otherlv_1='single answer' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0());
    }

    |	otherlv_2='multiple answers' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getClosedQuestionAccess().getMultipleAnswersKeyword_1_1());
    }
)(
(
		lv_question_3_0=RULE_ID
		{
			newLeafNode(lv_question_3_0, grammarAccess.getClosedQuestionAccess().getQuestionIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getClosedQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"question",
        		lv_question_3_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getClosedQuestionAccess().getAnswersAnswersParserRuleCall_3_0()); 
	    }
		lv_answers_4_0=ruleAnswers		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClosedQuestionRule());
	        }
       		set(
       			$current, 
       			"answers",
        		lv_answers_4_0, 
        		"Answers");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleLikertQuestion
entryRuleLikertQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLikertQuestionRule()); }
	 iv_ruleLikertQuestion=ruleLikertQuestion 
	 { $current=$iv_ruleLikertQuestion.current; } 
	 EOF 
;

// Rule LikertQuestion
ruleLikertQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='likert question' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getLikertQuestionAccess().getLikertQuestionKeyword_0());
    }
(
(
		lv_question_1_0=RULE_ID
		{
			newLeafNode(lv_question_1_0, grammarAccess.getLikertQuestionAccess().getQuestionIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLikertQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"question",
        		lv_question_1_0, 
        		"ID");
	    }

)
)	otherlv_2='(-' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getLikertQuestionAccess().getLeftParenthesisHyphenMinusKeyword_2());
    }
(
(
		lv_lower_3_0=RULE_INT
		{
			newLeafNode(lv_lower_3_0, grammarAccess.getLikertQuestionAccess().getLowerINTTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLikertQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"lower",
        		lv_lower_3_0, 
        		"INT");
	    }

)
)	otherlv_4='..' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getLikertQuestionAccess().getFullStopFullStopKeyword_4());
    }
(
(
		lv_higher_5_0=RULE_INT
		{
			newLeafNode(lv_higher_5_0, grammarAccess.getLikertQuestionAccess().getHigherINTTerminalRuleCall_5_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLikertQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"higher",
        		lv_higher_5_0, 
        		"INT");
	    }

)
)	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getLikertQuestionAccess().getRightParenthesisKeyword_6());
    }
)
;





// Entry rule entryRuleAnswers
entryRuleAnswers returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAnswersRule()); }
	 iv_ruleAnswers=ruleAnswers 
	 { $current=$iv_ruleAnswers.current; } 
	 EOF 
;

// Rule Answers
ruleAnswers returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='answers [' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAnswersAccess().getAnswersKeyword_0());
    }
(
(
(
		{ 
	        newCompositeNode(grammarAccess.getAnswersAccess().getAnswersOpenAnswerParserRuleCall_1_0_0()); 
	    }
		lv_answers_1_1=ruleOpenAnswer		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnswersRule());
	        }
       		add(
       			$current, 
       			"answers",
        		lv_answers_1_1, 
        		"OpenAnswer");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getAnswersAccess().getAnswersClosedAnswerParserRuleCall_1_0_1()); 
	    }
		lv_answers_1_2=ruleClosedAnswer		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnswersRule());
	        }
       		add(
       			$current, 
       			"answers",
        		lv_answers_1_2, 
        		"ClosedAnswer");
	        afterParserOrEnumRuleCall();
	    }

)

)
)+	otherlv_2=']' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAnswersAccess().getRightSquareBracketKeyword_2());
    }
(	otherlv_3='default answer is' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAnswersAccess().getDefaultAnswerIsKeyword_3_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAnswersRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getAnswersAccess().getAnswerClosedAnswerCrossReference_3_1_0()); 
	}

)
))?)
;





// Entry rule entryRuleOpenAnswer
entryRuleOpenAnswer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOpenAnswerRule()); }
	 iv_ruleOpenAnswer=ruleOpenAnswer 
	 { $current=$iv_ruleOpenAnswer.current; } 
	 EOF 
;

// Rule OpenAnswer
ruleOpenAnswer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_answer_0_0=RULE_ID
		{
			newLeafNode(lv_answer_0_0, grammarAccess.getOpenAnswerAccess().getAnswerIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOpenAnswerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"answer",
        		lv_answer_0_0, 
        		"ID");
	    }

)
)	otherlv_1='...' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOpenAnswerAccess().getFullStopFullStopFullStopKeyword_1());
    }
(	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOpenAnswerAccess().getCommaKeyword_2());
    }
)?)
;





// Entry rule entryRuleClosedAnswer
entryRuleClosedAnswer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClosedAnswerRule()); }
	 iv_ruleClosedAnswer=ruleClosedAnswer 
	 { $current=$iv_ruleClosedAnswer.current; } 
	 EOF 
;

// Rule ClosedAnswer
ruleClosedAnswer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_answer_0_0=RULE_ID
		{
			newLeafNode(lv_answer_0_0, grammarAccess.getClosedAnswerAccess().getAnswerIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getClosedAnswerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"answer",
        		lv_answer_0_0, 
        		"ID");
	    }

)
)(	otherlv_1=',' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getClosedAnswerAccess().getCommaKeyword_1());
    }
)?(	otherlv_2='enables question [' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getClosedAnswerAccess().getEnablesQuestionKeyword_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getClosedAnswerRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getClosedAnswerAccess().getQuestionClosedQuestionCrossReference_2_1_0()); 
	}

)
)	otherlv_4=']' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getClosedAnswerAccess().getRightSquareBracketKeyword_2_2());
    }
)?(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getClosedAnswerAccess().getCommaKeyword_3());
    }
)?)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


