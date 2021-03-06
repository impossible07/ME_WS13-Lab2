/*
 * generated by Xtext
 */
package at.ac.tuwien.big.scoping

import at.ac.tuwien.big.questionnaire.DefAnswer
import at.ac.tuwien.big.questionnaire.impl.AnswersImpl
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
//import at.ac.tuwien.big.questionnaire.ClosedAnswer
//import at.ac.tuwien.big.questionnaire.impl.QuestionImpl

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class QuestionnaireScopeProvider extends AbstractDeclarativeScopeProvider {
	
	override getScope(EObject context, EReference reference) {
		val List<EObject> scopeList = newArrayList;
		if (context instanceof DefAnswer) {
			for (EObject e : (context.eContainer() as AnswersImpl).getAnswers()) {
				scopeList.add(e);
			}
			return Scopes.scopeFor(scopeList);
		}
		//val List<EObject> scopeList2 = newArrayList;
		//if (context instanceof ClosedAnswer) {
		//	for (EObject e : (context.eContainer() as QuestionImpl).getQuestions()) {
		//		scopeList.add(e);
		//	}
		//	return Scopes.scopeFor(scopeList2);
		//}
    	return super.getScope(context, reference);
	}
}
