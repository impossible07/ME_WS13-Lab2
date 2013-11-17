package at.ac.tuwien.big.serializer;

import at.ac.tuwien.big.services.QuestionnaireGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class QuestionnaireSyntacticSequencer extends AbstractSyntacticSequencer {

	protected QuestionnaireGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Answers_CommaKeyword_3_q;
	protected AbstractElementAlias match_Answers_STRINGTerminalRuleCall_1_p;
	protected AbstractElementAlias match_Answers___DefaultAnswerIsKeyword_5_0_STRINGTerminalRuleCall_5_1__q;
	protected AbstractElementAlias match_ClosedQuestion_MultipleAnswersKeyword_1_1_or_SingleAnswerKeyword_1_0;
	protected AbstractElementAlias match_Group_CommaKeyword_5_q;
	protected AbstractElementAlias match_LikertQuestion_CommaKeyword_7_q;
	protected AbstractElementAlias match_OpenQuestion_CommaKeyword_2_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (QuestionnaireGrammarAccess) access;
		match_Answers_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getAnswersAccess().getCommaKeyword_3());
		match_Answers_STRINGTerminalRuleCall_1_p = new TokenAlias(true, false, grammarAccess.getAnswersAccess().getSTRINGTerminalRuleCall_1());
		match_Answers___DefaultAnswerIsKeyword_5_0_STRINGTerminalRuleCall_5_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAnswersAccess().getDefaultAnswerIsKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getAnswersAccess().getSTRINGTerminalRuleCall_5_1()));
		match_ClosedQuestion_MultipleAnswersKeyword_1_1_or_SingleAnswerKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getClosedQuestionAccess().getMultipleAnswersKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0()));
		match_Group_CommaKeyword_5_q = new TokenAlias(false, true, grammarAccess.getGroupAccess().getCommaKeyword_5());
		match_LikertQuestion_CommaKeyword_7_q = new TokenAlias(false, true, grammarAccess.getLikertQuestionAccess().getCommaKeyword_7());
		match_OpenQuestion_CommaKeyword_2_2_q = new TokenAlias(false, true, grammarAccess.getOpenQuestionAccess().getCommaKeyword_2_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal STRING	: 
	 * 			'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Answers_CommaKeyword_3_q.equals(syntax))
				emit_Answers_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Answers_STRINGTerminalRuleCall_1_p.equals(syntax))
				emit_Answers_STRINGTerminalRuleCall_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Answers___DefaultAnswerIsKeyword_5_0_STRINGTerminalRuleCall_5_1__q.equals(syntax))
				emit_Answers___DefaultAnswerIsKeyword_5_0_STRINGTerminalRuleCall_5_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClosedQuestion_MultipleAnswersKeyword_1_1_or_SingleAnswerKeyword_1_0.equals(syntax))
				emit_ClosedQuestion_MultipleAnswersKeyword_1_1_or_SingleAnswerKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Group_CommaKeyword_5_q.equals(syntax))
				emit_Group_CommaKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LikertQuestion_CommaKeyword_7_q.equals(syntax))
				emit_LikertQuestion_CommaKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OpenQuestion_CommaKeyword_2_2_q.equals(syntax))
				emit_OpenQuestion_CommaKeyword_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Answers_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     STRING+
	 */
	protected void emit_Answers_STRINGTerminalRuleCall_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('default answer is' STRING)?
	 */
	protected void emit_Answers___DefaultAnswerIsKeyword_5_0_STRINGTerminalRuleCall_5_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'multiple answers' | 'single answer'
	 */
	protected void emit_ClosedQuestion_MultipleAnswersKeyword_1_1_or_SingleAnswerKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Group_CommaKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_LikertQuestion_CommaKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_OpenQuestion_CommaKeyword_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
