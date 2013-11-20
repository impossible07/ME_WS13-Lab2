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
		lv_title_1_0=RULE_STRING
		{
			newLeafNode(lv_title_1_0, grammarAccess.getQuestionnaireAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getQuestionnaireRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"title",
        		lv_title_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='[' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getQuestionnaireAccess().getLeftSquareBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionnaireAccess().getGroupsGroupParserRuleCall_3_0()); 
	    }
		lv_groups_3_0=ruleGroup		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionnaireRule());
	        }
       		add(
       			$current, 
       			"groups",
        		lv_groups_3_0, 
        		"Group");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_4=']' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getQuestionnaireAccess().getRightSquareBracketKeyword_4());
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
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGroupRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='[' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftSquareBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGroupAccess().getQuestionsQuestionParserRuleCall_3_0()); 
	    }
		lv_questions_3_0=ruleQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGroupRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_3_0, 
        		"Question");
	        afterParserOrEnumRuleCall();
	    }

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





// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	 iv_ruleQuestion=ruleQuestion 
	 { $current=$iv_ruleQuestion.current; } 
	 EOF 
;

// Rule Question
ruleQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getOpenQuestionParserRuleCall_0()); 
    }
    this_OpenQuestion_0=ruleOpenQuestion
    { 
        $current = $this_OpenQuestion_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getClosedQuestionParserRuleCall_1()); 
    }
    this_ClosedQuestion_1=ruleClosedQuestion
    { 
        $current = $this_ClosedQuestion_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getLikertQuestionParserRuleCall_2()); 
    }
    this_LikertQuestion_2=ruleLikertQuestion
    { 
        $current = $this_LikertQuestion_2.current; 
        afterParserOrEnumRuleCall();
    }
)
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
((	otherlv_0='mandatory' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getOpenQuestionAccess().getMandatoryKeyword_0());
    }
)?(	otherlv_1='multiline' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getOpenQuestionAccess().getMultilineKeyword_1());
    }
)?	otherlv_2='open question' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOpenQuestionAccess().getOpenQuestionKeyword_2());
    }
(
(
		lv_name_3_0=RULE_STRING
		{
			newLeafNode(lv_name_3_0, grammarAccess.getOpenQuestionAccess().getNameSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOpenQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"STRING");
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getOpenQuestionAccess().getCommaKeyword_4());
    }
)?)
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
		lv_name_3_0=RULE_STRING
		{
			newLeafNode(lv_name_3_0, grammarAccess.getClosedQuestionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getClosedQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"STRING");
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
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getClosedQuestionAccess().getCommaKeyword_4());
    }
)?)
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
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getLikertQuestionAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLikertQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getLikertQuestionAccess().getLeftParenthesisKeyword_2());
    }
(	otherlv_3='-' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getLikertQuestionAccess().getHyphenMinusKeyword_3());
    }
)?(
(
		lv_lower_4_0=RULE_INT
		{
			newLeafNode(lv_lower_4_0, grammarAccess.getLikertQuestionAccess().getLowerINTTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLikertQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"lower",
        		lv_lower_4_0, 
        		"INT");
	    }

)
)	otherlv_5='..' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getLikertQuestionAccess().getFullStopFullStopKeyword_5());
    }
(
(
		lv_higher_6_0=RULE_INT
		{
			newLeafNode(lv_higher_6_0, grammarAccess.getLikertQuestionAccess().getHigherINTTerminalRuleCall_6_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLikertQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"higher",
        		lv_higher_6_0, 
        		"INT");
	    }

)
)	otherlv_7=')' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getLikertQuestionAccess().getRightParenthesisKeyword_7());
    }
(	otherlv_8=',' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getLikertQuestionAccess().getCommaKeyword_8());
    }
)?)
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
	otherlv_4=RULE_STRING
	{
		newLeafNode(otherlv_4, grammarAccess.getAnswersAccess().getNameClosedAnswerCrossReference_3_1_0()); 
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
		lv_name_0_0=RULE_STRING
		{
			newLeafNode(lv_name_0_0, grammarAccess.getOpenAnswerAccess().getNameSTRINGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOpenAnswerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"STRING");
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
		lv_name_0_0=RULE_STRING
		{
			newLeafNode(lv_name_0_0, grammarAccess.getClosedAnswerAccess().getNameSTRINGTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getClosedAnswerRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"STRING");
	    }

)
)(	otherlv_1='enables question [' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getClosedAnswerAccess().getEnablesQuestionKeyword_1_0());
    }
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getClosedAnswerRule());
	        }
        }
	otherlv_2=RULE_STRING
	{
		newLeafNode(otherlv_2, grammarAccess.getClosedAnswerAccess().getIdQuestionCrossReference_1_1_0_0()); 
	}

)
)(	otherlv_3=',' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getClosedAnswerAccess().getCommaKeyword_1_1_1());
    }
)?)+	otherlv_4=']' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getClosedAnswerAccess().getRightSquareBracketKeyword_1_2());
    }
)?(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getClosedAnswerAccess().getCommaKeyword_2());
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


