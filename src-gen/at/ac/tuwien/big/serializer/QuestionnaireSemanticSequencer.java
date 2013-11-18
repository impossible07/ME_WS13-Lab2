package at.ac.tuwien.big.serializer;

import at.ac.tuwien.big.questionnaire.Answers;
import at.ac.tuwien.big.questionnaire.ClosedAnswer;
import at.ac.tuwien.big.questionnaire.ClosedQuestion;
import at.ac.tuwien.big.questionnaire.Group;
import at.ac.tuwien.big.questionnaire.LikertQuestion;
import at.ac.tuwien.big.questionnaire.OpenAnswer;
import at.ac.tuwien.big.questionnaire.OpenQuestion;
import at.ac.tuwien.big.questionnaire.Questionnaire;
import at.ac.tuwien.big.questionnaire.QuestionnairePackage;
import at.ac.tuwien.big.services.QuestionnaireGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class QuestionnaireSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private QuestionnaireGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == QuestionnairePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case QuestionnairePackage.ANSWERS:
				if(context == grammarAccess.getAnswersRule()) {
					sequence_Answers(context, (Answers) semanticObject); 
					return; 
				}
				else break;
			case QuestionnairePackage.CLOSED_ANSWER:
				if(context == grammarAccess.getClosedAnswerRule()) {
					sequence_ClosedAnswer(context, (ClosedAnswer) semanticObject); 
					return; 
				}
				else break;
			case QuestionnairePackage.CLOSED_QUESTION:
				if(context == grammarAccess.getClosedQuestionRule()) {
					sequence_ClosedQuestion(context, (ClosedQuestion) semanticObject); 
					return; 
				}
				else break;
			case QuestionnairePackage.GROUP:
				if(context == grammarAccess.getGroupRule()) {
					sequence_Group(context, (Group) semanticObject); 
					return; 
				}
				else break;
			case QuestionnairePackage.LIKERT_QUESTION:
				if(context == grammarAccess.getLikertQuestionRule()) {
					sequence_LikertQuestion(context, (LikertQuestion) semanticObject); 
					return; 
				}
				else break;
			case QuestionnairePackage.OPEN_ANSWER:
				if(context == grammarAccess.getOpenAnswerRule()) {
					sequence_OpenAnswer(context, (OpenAnswer) semanticObject); 
					return; 
				}
				else break;
			case QuestionnairePackage.OPEN_QUESTION:
				if(context == grammarAccess.getOpenQuestionRule()) {
					sequence_OpenQuestion(context, (OpenQuestion) semanticObject); 
					return; 
				}
				else break;
			case QuestionnairePackage.QUESTIONNAIRE:
				if(context == grammarAccess.getQuestionnaireRule()) {
					sequence_Questionnaire(context, (Questionnaire) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((answers+=OpenAnswer | answers+=ClosedAnswer)+ answer=[ClosedAnswer|ID]?)
	 */
	protected void sequence_Answers(EObject context, Answers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (answer=STRING question=STRING?)
	 */
	protected void sequence_ClosedAnswer(EObject context, ClosedAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (question=STRING answers=Answers)
	 */
	protected void sequence_ClosedQuestion(EObject context, ClosedQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuestionnairePackage.Literals.CLOSED_QUESTION__QUESTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionnairePackage.Literals.CLOSED_QUESTION__QUESTION));
			if(transientValues.isValueTransient(semanticObject, QuestionnairePackage.Literals.CLOSED_QUESTION__ANSWERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionnairePackage.Literals.CLOSED_QUESTION__ANSWERS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClosedQuestionAccess().getQuestionSTRINGTerminalRuleCall_2_0(), semanticObject.getQuestion());
		feeder.accept(grammarAccess.getClosedQuestionAccess().getAnswersAnswersParserRuleCall_3_0(), semanticObject.getAnswers());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING (questions+=OpenQuestion | questions+=ClosedQuestion | questions+=LikertQuestion)+)
	 */
	protected void sequence_Group(EObject context, Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (question=STRING lower=INT higher=INT)
	 */
	protected void sequence_LikertQuestion(EObject context, LikertQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuestionnairePackage.Literals.LIKERT_QUESTION__QUESTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionnairePackage.Literals.LIKERT_QUESTION__QUESTION));
			if(transientValues.isValueTransient(semanticObject, QuestionnairePackage.Literals.LIKERT_QUESTION__LOWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionnairePackage.Literals.LIKERT_QUESTION__LOWER));
			if(transientValues.isValueTransient(semanticObject, QuestionnairePackage.Literals.LIKERT_QUESTION__HIGHER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionnairePackage.Literals.LIKERT_QUESTION__HIGHER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLikertQuestionAccess().getQuestionSTRINGTerminalRuleCall_1_0(), semanticObject.getQuestion());
		feeder.accept(grammarAccess.getLikertQuestionAccess().getLowerINTTerminalRuleCall_4_0(), semanticObject.getLower());
		feeder.accept(grammarAccess.getLikertQuestionAccess().getHigherINTTerminalRuleCall_6_0(), semanticObject.getHigher());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     answer=STRING
	 */
	protected void sequence_OpenAnswer(EObject context, OpenAnswer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuestionnairePackage.Literals.OPEN_ANSWER__ANSWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionnairePackage.Literals.OPEN_ANSWER__ANSWER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOpenAnswerAccess().getAnswerSTRINGTerminalRuleCall_0_0(), semanticObject.getAnswer());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     question=STRING
	 */
	protected void sequence_OpenQuestion(EObject context, OpenQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuestionnairePackage.Literals.OPEN_QUESTION__QUESTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuestionnairePackage.Literals.OPEN_QUESTION__QUESTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOpenQuestionAccess().getQuestionSTRINGTerminalRuleCall_3_0(), semanticObject.getQuestion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (title=STRING groups+=Group+)
	 */
	protected void sequence_Questionnaire(EObject context, Questionnaire semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
