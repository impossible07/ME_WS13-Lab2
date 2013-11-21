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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class QuestionnaireSyntacticSequencer extends AbstractSyntacticSequencer {

	protected QuestionnaireGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ClosedAnswer_CommaKeyword_1_1_1_q;
	protected AbstractElementAlias match_ClosedAnswer_CommaKeyword_2_q;
	protected AbstractElementAlias match_ClosedQuestion_CommaKeyword_4_q;
	protected AbstractElementAlias match_ClosedQuestion_MultipleAnswersKeyword_1_1_or_SingleAnswerKeyword_1_0;
	protected AbstractElementAlias match_Group_CommaKeyword_5_q;
	protected AbstractElementAlias match_LikertQuestion_CommaKeyword_8_q;
	protected AbstractElementAlias match_LikertQuestion_HyphenMinusKeyword_3_q;
	protected AbstractElementAlias match_OpenAnswer_CommaKeyword_2_q;
	protected AbstractElementAlias match_OpenQuestion_CommaKeyword_4_q;
	protected AbstractElementAlias match_OpenQuestion_MandatoryKeyword_0_q;
	protected AbstractElementAlias match_OpenQuestion_MultilineKeyword_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (QuestionnaireGrammarAccess) access;
		match_ClosedAnswer_CommaKeyword_1_1_1_q = new TokenAlias(false, true, grammarAccess.getClosedAnswerAccess().getCommaKeyword_1_1_1());
		match_ClosedAnswer_CommaKeyword_2_q = new TokenAlias(false, true, grammarAccess.getClosedAnswerAccess().getCommaKeyword_2());
		match_ClosedQuestion_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getClosedQuestionAccess().getCommaKeyword_4());
		match_ClosedQuestion_MultipleAnswersKeyword_1_1_or_SingleAnswerKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getClosedQuestionAccess().getMultipleAnswersKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getClosedQuestionAccess().getSingleAnswerKeyword_1_0()));
		match_Group_CommaKeyword_5_q = new TokenAlias(false, true, grammarAccess.getGroupAccess().getCommaKeyword_5());
		match_LikertQuestion_CommaKeyword_8_q = new TokenAlias(false, true, grammarAccess.getLikertQuestionAccess().getCommaKeyword_8());
		match_LikertQuestion_HyphenMinusKeyword_3_q = new TokenAlias(false, true, grammarAccess.getLikertQuestionAccess().getHyphenMinusKeyword_3());
		match_OpenAnswer_CommaKeyword_2_q = new TokenAlias(false, true, grammarAccess.getOpenAnswerAccess().getCommaKeyword_2());
		match_OpenQuestion_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getOpenQuestionAccess().getCommaKeyword_4());
		match_OpenQuestion_MandatoryKeyword_0_q = new TokenAlias(false, true, grammarAccess.getOpenQuestionAccess().getMandatoryKeyword_0());
		match_OpenQuestion_MultilineKeyword_1_q = new TokenAlias(false, true, grammarAccess.getOpenQuestionAccess().getMultilineKeyword_1());
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
			if(match_ClosedAnswer_CommaKeyword_1_1_1_q.equals(syntax))
				emit_ClosedAnswer_CommaKeyword_1_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClosedAnswer_CommaKeyword_2_q.equals(syntax))
				emit_ClosedAnswer_CommaKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClosedQuestion_CommaKeyword_4_q.equals(syntax))
				emit_ClosedQuestion_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ClosedQuestion_MultipleAnswersKeyword_1_1_or_SingleAnswerKeyword_1_0.equals(syntax))
				emit_ClosedQuestion_MultipleAnswersKeyword_1_1_or_SingleAnswerKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Group_CommaKeyword_5_q.equals(syntax))
				emit_Group_CommaKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LikertQuestion_CommaKeyword_8_q.equals(syntax))
				emit_LikertQuestion_CommaKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LikertQuestion_HyphenMinusKeyword_3_q.equals(syntax))
				emit_LikertQuestion_HyphenMinusKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OpenAnswer_CommaKeyword_2_q.equals(syntax))
				emit_OpenAnswer_CommaKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OpenQuestion_CommaKeyword_4_q.equals(syntax))
				emit_OpenQuestion_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OpenQuestion_MandatoryKeyword_0_q.equals(syntax))
				emit_OpenQuestion_MandatoryKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_OpenQuestion_MultilineKeyword_1_q.equals(syntax))
				emit_OpenQuestion_MultilineKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ClosedAnswer_CommaKeyword_1_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ClosedAnswer_CommaKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_ClosedQuestion_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_LikertQuestion_CommaKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '-'?
	 */
	protected void emit_LikertQuestion_HyphenMinusKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_OpenAnswer_CommaKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_OpenQuestion_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'mandatory'?
	 */
	protected void emit_OpenQuestion_MandatoryKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'multiline'?
	 */
	protected void emit_OpenQuestion_MultilineKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
