/*
* generated by Xtext
*/
package at.ac.tuwien.big.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class QuestionnaireGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class QuestionnaireElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Questionnaire");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionnaireKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTitleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTitleSTRINGTerminalRuleCall_1_0 = (RuleCall)cTitleAssignment_1.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cGroupsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cGroupsGroupParserRuleCall_3_0 = (RuleCall)cGroupsAssignment_3.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Questionnaire:
		//	"questionnaire" title=STRING "[" groups+=Group+ "]";
		public ParserRule getRule() { return rule; }

		//"questionnaire" title=STRING "[" groups+=Group+ "]"
		public Group getGroup() { return cGroup; }

		//"questionnaire"
		public Keyword getQuestionnaireKeyword_0() { return cQuestionnaireKeyword_0; }

		//title=STRING
		public Assignment getTitleAssignment_1() { return cTitleAssignment_1; }

		//STRING
		public RuleCall getTitleSTRINGTerminalRuleCall_1_0() { return cTitleSTRINGTerminalRuleCall_1_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }

		//groups+=Group+
		public Assignment getGroupsAssignment_3() { return cGroupsAssignment_3; }

		//Group
		public RuleCall getGroupsGroupParserRuleCall_3_0() { return cGroupsGroupParserRuleCall_3_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }
	}

	public class GroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Group");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cGroupKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cQuestionsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cQuestionsQuestionParserRuleCall_3_0 = (RuleCall)cQuestionsAssignment_3.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Group:
		//	"group" STRING "[" questions+=Question+ "]" ","?;
		public ParserRule getRule() { return rule; }

		//"group" STRING "[" questions+=Question+ "]" ","?
		public Group getGroup() { return cGroup; }

		//"group"
		public Keyword getGroupKeyword_0() { return cGroupKeyword_0; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }

		//"["
		public Keyword getLeftSquareBracketKeyword_2() { return cLeftSquareBracketKeyword_2; }

		//questions+=Question+
		public Assignment getQuestionsAssignment_3() { return cQuestionsAssignment_3; }

		//Question
		public RuleCall getQuestionsQuestionParserRuleCall_3_0() { return cQuestionsQuestionParserRuleCall_3_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_4() { return cRightSquareBracketKeyword_4; }

		//","?
		public Keyword getCommaKeyword_5() { return cCommaKeyword_5; }
	}

	public class QuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Question");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cOpenQuestionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cClosedQuestionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cLikertQuestionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Question:
		//	OpenQuestion | ClosedQuestion | LikertQuestion;
		public ParserRule getRule() { return rule; }

		//OpenQuestion | ClosedQuestion | LikertQuestion
		public Alternatives getAlternatives() { return cAlternatives; }

		//OpenQuestion
		public RuleCall getOpenQuestionParserRuleCall_0() { return cOpenQuestionParserRuleCall_0; }

		//ClosedQuestion
		public RuleCall getClosedQuestionParserRuleCall_1() { return cClosedQuestionParserRuleCall_1; }

		//LikertQuestion
		public RuleCall getLikertQuestionParserRuleCall_2() { return cLikertQuestionParserRuleCall_2; }
	}

	public class OpenQuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OpenQuestion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMandatoryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cMultilineKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cOpenQuestionKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameSTRINGTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//OpenQuestion:
		//	"mandatory"? "multiline"? "open question" name=STRING ","?;
		public ParserRule getRule() { return rule; }

		//"mandatory"? "multiline"? "open question" name=STRING ","?
		public Group getGroup() { return cGroup; }

		//"mandatory"?
		public Keyword getMandatoryKeyword_0() { return cMandatoryKeyword_0; }

		//"multiline"?
		public Keyword getMultilineKeyword_1() { return cMultilineKeyword_1; }

		//"open question"
		public Keyword getOpenQuestionKeyword_2() { return cOpenQuestionKeyword_2; }

		//name=STRING
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_3_0() { return cNameSTRINGTerminalRuleCall_3_0; }

		//","?
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
	}

	public class ClosedQuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClosedQuestion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClosedQuestionAllowingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Keyword cSingleAnswerKeyword_1_0 = (Keyword)cAlternatives_1.eContents().get(0);
		private final Keyword cMultipleAnswersKeyword_1_1 = (Keyword)cAlternatives_1.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cAnswersAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAnswersAnswersParserRuleCall_3_0 = (RuleCall)cAnswersAssignment_3.eContents().get(0);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ClosedQuestion:
		//	"closed question allowing" ("single answer" | "multiple answers") name=STRING answers=Answers ","?;
		public ParserRule getRule() { return rule; }

		//"closed question allowing" ("single answer" | "multiple answers") name=STRING answers=Answers ","?
		public Group getGroup() { return cGroup; }

		//"closed question allowing"
		public Keyword getClosedQuestionAllowingKeyword_0() { return cClosedQuestionAllowingKeyword_0; }

		//"single answer" | "multiple answers"
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//"single answer"
		public Keyword getSingleAnswerKeyword_1_0() { return cSingleAnswerKeyword_1_0; }

		//"multiple answers"
		public Keyword getMultipleAnswersKeyword_1_1() { return cMultipleAnswersKeyword_1_1; }

		//name=STRING
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0() { return cNameSTRINGTerminalRuleCall_2_0; }

		//answers=Answers
		public Assignment getAnswersAssignment_3() { return cAnswersAssignment_3; }

		//Answers
		public RuleCall getAnswersAnswersParserRuleCall_3_0() { return cAnswersAnswersParserRuleCall_3_0; }

		//","?
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }
	}

	public class LikertQuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LikertQuestion");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLikertQuestionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cHyphenMinusKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLowerAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLowerINTTerminalRuleCall_4_0 = (RuleCall)cLowerAssignment_4.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cHigherAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cHigherINTTerminalRuleCall_6_0 = (RuleCall)cHigherAssignment_6.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cCommaKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//LikertQuestion:
		//	"likert question" name=STRING "(" "-"? lower=INT ".." higher=INT ")" ","?;
		public ParserRule getRule() { return rule; }

		//"likert question" name=STRING "(" "-"? lower=INT ".." higher=INT ")" ","?
		public Group getGroup() { return cGroup; }

		//"likert question"
		public Keyword getLikertQuestionKeyword_0() { return cLikertQuestionKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//"-"?
		public Keyword getHyphenMinusKeyword_3() { return cHyphenMinusKeyword_3; }

		//lower=INT
		public Assignment getLowerAssignment_4() { return cLowerAssignment_4; }

		//INT
		public RuleCall getLowerINTTerminalRuleCall_4_0() { return cLowerINTTerminalRuleCall_4_0; }

		//".."
		public Keyword getFullStopFullStopKeyword_5() { return cFullStopFullStopKeyword_5; }

		//higher=INT
		public Assignment getHigherAssignment_6() { return cHigherAssignment_6; }

		//INT
		public RuleCall getHigherINTTerminalRuleCall_6_0() { return cHigherINTTerminalRuleCall_6_0; }

		//")"
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }

		//","?
		public Keyword getCommaKeyword_8() { return cCommaKeyword_8; }
	}

	public class AnswersElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Answers");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAnswersKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAnswersAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAnswersAnswerParserRuleCall_1_0 = (RuleCall)cAnswersAssignment_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDefanswerAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDefanswerDefAnswerParserRuleCall_3_0 = (RuleCall)cDefanswerAssignment_3.eContents().get(0);
		
		//Answers:
		//	"answers [" answers+=Answer+ "]" defanswer=DefAnswer?;
		public ParserRule getRule() { return rule; }

		//"answers [" answers+=Answer+ "]" defanswer=DefAnswer?
		public Group getGroup() { return cGroup; }

		//"answers ["
		public Keyword getAnswersKeyword_0() { return cAnswersKeyword_0; }

		//answers+=Answer+
		public Assignment getAnswersAssignment_1() { return cAnswersAssignment_1; }

		//Answer
		public RuleCall getAnswersAnswerParserRuleCall_1_0() { return cAnswersAnswerParserRuleCall_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_2() { return cRightSquareBracketKeyword_2; }

		//defanswer=DefAnswer?
		public Assignment getDefanswerAssignment_3() { return cDefanswerAssignment_3; }

		//DefAnswer
		public RuleCall getDefanswerDefAnswerParserRuleCall_3_0() { return cDefanswerDefAnswerParserRuleCall_3_0; }
	}

	public class AnswerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Answer");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cOpenAnswerParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cClosedAnswerParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Answer:
		//	OpenAnswer | ClosedAnswer;
		public ParserRule getRule() { return rule; }

		//OpenAnswer | ClosedAnswer
		public Alternatives getAlternatives() { return cAlternatives; }

		//OpenAnswer
		public RuleCall getOpenAnswerParserRuleCall_0() { return cOpenAnswerParserRuleCall_0; }

		//ClosedAnswer
		public RuleCall getClosedAnswerParserRuleCall_1() { return cClosedAnswerParserRuleCall_1; }
	}

	public class OpenAnswerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OpenAnswer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameSTRINGTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cFullStopFullStopFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//OpenAnswer:
		//	name=STRING "..." ","?;
		public ParserRule getRule() { return rule; }

		//name=STRING "..." ","?
		public Group getGroup() { return cGroup; }

		//name=STRING
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_0_0() { return cNameSTRINGTerminalRuleCall_0_0; }

		//"..."
		public Keyword getFullStopFullStopFullStopKeyword_1() { return cFullStopFullStopFullStopKeyword_1; }

		//","?
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
	}

	public class ClosedAnswerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClosedAnswer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameSTRINGTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEnablesQuestionKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Assignment cIdAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final CrossReference cIdQuestionCrossReference_1_1_0_0 = (CrossReference)cIdAssignment_1_1_0.eContents().get(0);
		private final RuleCall cIdQuestionSTRINGTerminalRuleCall_1_1_0_0_1 = (RuleCall)cIdQuestionCrossReference_1_1_0_0.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//ClosedAnswer:
		//	name=STRING ("enables question [" (id+=[Question|STRING] ","?)+ "]")? ","?;
		public ParserRule getRule() { return rule; }

		//name=STRING ("enables question [" (id+=[Question|STRING] ","?)+ "]")? ","?
		public Group getGroup() { return cGroup; }

		//name=STRING
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_0_0() { return cNameSTRINGTerminalRuleCall_0_0; }

		//("enables question [" (id+=[Question|STRING] ","?)+ "]")?
		public Group getGroup_1() { return cGroup_1; }

		//"enables question ["
		public Keyword getEnablesQuestionKeyword_1_0() { return cEnablesQuestionKeyword_1_0; }

		//(id+=[Question|STRING] ","?)+
		public Group getGroup_1_1() { return cGroup_1_1; }

		//id+=[Question|STRING]
		public Assignment getIdAssignment_1_1_0() { return cIdAssignment_1_1_0; }

		//[Question|STRING]
		public CrossReference getIdQuestionCrossReference_1_1_0_0() { return cIdQuestionCrossReference_1_1_0_0; }

		//STRING
		public RuleCall getIdQuestionSTRINGTerminalRuleCall_1_1_0_0_1() { return cIdQuestionSTRINGTerminalRuleCall_1_1_0_0_1; }

		//","?
		public Keyword getCommaKeyword_1_1_1() { return cCommaKeyword_1_1_1; }

		//"]"
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }

		//","?
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
	}

	public class DefAnswerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DefAnswer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDefaultAnswerIsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cIdAnswerCrossReference_1_0 = (CrossReference)cIdAssignment_1.eContents().get(0);
		private final RuleCall cIdAnswerSTRINGTerminalRuleCall_1_0_1 = (RuleCall)cIdAnswerCrossReference_1_0.eContents().get(1);
		
		//DefAnswer:
		//	"default answer is" id+=[Answer|STRING];
		public ParserRule getRule() { return rule; }

		//"default answer is" id+=[Answer|STRING]
		public Group getGroup() { return cGroup; }

		//"default answer is"
		public Keyword getDefaultAnswerIsKeyword_0() { return cDefaultAnswerIsKeyword_0; }

		//id+=[Answer|STRING]
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }

		//[Answer|STRING]
		public CrossReference getIdAnswerCrossReference_1_0() { return cIdAnswerCrossReference_1_0; }

		//STRING
		public RuleCall getIdAnswerSTRINGTerminalRuleCall_1_0_1() { return cIdAnswerSTRINGTerminalRuleCall_1_0_1; }
	}
	
	
	private QuestionnaireElements pQuestionnaire;
	private GroupElements pGroup;
	private QuestionElements pQuestion;
	private OpenQuestionElements pOpenQuestion;
	private ClosedQuestionElements pClosedQuestion;
	private LikertQuestionElements pLikertQuestion;
	private AnswersElements pAnswers;
	private AnswerElements pAnswer;
	private OpenAnswerElements pOpenAnswer;
	private ClosedAnswerElements pClosedAnswer;
	private DefAnswerElements pDefAnswer;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public QuestionnaireGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("at.ac.tuwien.big.Questionnaire".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Questionnaire:
	//	"questionnaire" title=STRING "[" groups+=Group+ "]";
	public QuestionnaireElements getQuestionnaireAccess() {
		return (pQuestionnaire != null) ? pQuestionnaire : (pQuestionnaire = new QuestionnaireElements());
	}
	
	public ParserRule getQuestionnaireRule() {
		return getQuestionnaireAccess().getRule();
	}

	//Group:
	//	"group" STRING "[" questions+=Question+ "]" ","?;
	public GroupElements getGroupAccess() {
		return (pGroup != null) ? pGroup : (pGroup = new GroupElements());
	}
	
	public ParserRule getGroupRule() {
		return getGroupAccess().getRule();
	}

	//Question:
	//	OpenQuestion | ClosedQuestion | LikertQuestion;
	public QuestionElements getQuestionAccess() {
		return (pQuestion != null) ? pQuestion : (pQuestion = new QuestionElements());
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}

	//OpenQuestion:
	//	"mandatory"? "multiline"? "open question" name=STRING ","?;
	public OpenQuestionElements getOpenQuestionAccess() {
		return (pOpenQuestion != null) ? pOpenQuestion : (pOpenQuestion = new OpenQuestionElements());
	}
	
	public ParserRule getOpenQuestionRule() {
		return getOpenQuestionAccess().getRule();
	}

	//ClosedQuestion:
	//	"closed question allowing" ("single answer" | "multiple answers") name=STRING answers=Answers ","?;
	public ClosedQuestionElements getClosedQuestionAccess() {
		return (pClosedQuestion != null) ? pClosedQuestion : (pClosedQuestion = new ClosedQuestionElements());
	}
	
	public ParserRule getClosedQuestionRule() {
		return getClosedQuestionAccess().getRule();
	}

	//LikertQuestion:
	//	"likert question" name=STRING "(" "-"? lower=INT ".." higher=INT ")" ","?;
	public LikertQuestionElements getLikertQuestionAccess() {
		return (pLikertQuestion != null) ? pLikertQuestion : (pLikertQuestion = new LikertQuestionElements());
	}
	
	public ParserRule getLikertQuestionRule() {
		return getLikertQuestionAccess().getRule();
	}

	//Answers:
	//	"answers [" answers+=Answer+ "]" defanswer=DefAnswer?;
	public AnswersElements getAnswersAccess() {
		return (pAnswers != null) ? pAnswers : (pAnswers = new AnswersElements());
	}
	
	public ParserRule getAnswersRule() {
		return getAnswersAccess().getRule();
	}

	//Answer:
	//	OpenAnswer | ClosedAnswer;
	public AnswerElements getAnswerAccess() {
		return (pAnswer != null) ? pAnswer : (pAnswer = new AnswerElements());
	}
	
	public ParserRule getAnswerRule() {
		return getAnswerAccess().getRule();
	}

	//OpenAnswer:
	//	name=STRING "..." ","?;
	public OpenAnswerElements getOpenAnswerAccess() {
		return (pOpenAnswer != null) ? pOpenAnswer : (pOpenAnswer = new OpenAnswerElements());
	}
	
	public ParserRule getOpenAnswerRule() {
		return getOpenAnswerAccess().getRule();
	}

	//ClosedAnswer:
	//	name=STRING ("enables question [" (id+=[Question|STRING] ","?)+ "]")? ","?;
	public ClosedAnswerElements getClosedAnswerAccess() {
		return (pClosedAnswer != null) ? pClosedAnswer : (pClosedAnswer = new ClosedAnswerElements());
	}
	
	public ParserRule getClosedAnswerRule() {
		return getClosedAnswerAccess().getRule();
	}

	//DefAnswer:
	//	"default answer is" id+=[Answer|STRING];
	public DefAnswerElements getDefAnswerAccess() {
		return (pDefAnswer != null) ? pDefAnswer : (pDefAnswer = new DefAnswerElements());
	}
	
	public ParserRule getDefAnswerRule() {
		return getDefAnswerAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
