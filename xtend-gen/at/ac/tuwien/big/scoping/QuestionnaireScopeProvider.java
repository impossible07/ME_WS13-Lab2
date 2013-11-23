/**
 * generated by Xtext
 */
package at.ac.tuwien.big.scoping;

import at.ac.tuwien.big.questionnaire.Answer;
import at.ac.tuwien.big.questionnaire.ClosedAnswer;
import at.ac.tuwien.big.questionnaire.DefAnswer;
import at.ac.tuwien.big.questionnaire.Group;
import at.ac.tuwien.big.questionnaire.Question;
import at.ac.tuwien.big.questionnaire.impl.AnswersImpl;
import at.ac.tuwien.big.questionnaire.impl.GroupImpl;
import at.ac.tuwien.big.questionnaire.impl.QuestionnaireImpl;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it
 */
@SuppressWarnings("all")
public class QuestionnaireScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope getScope(final EObject context, final EReference reference) {
    final List<EObject> scopeList = CollectionLiterals.<EObject>newArrayList();
    if ((context instanceof DefAnswer)) {
      EObject _eContainer = context.eContainer();
      EList<Answer> _answers = ((AnswersImpl) _eContainer).getAnswers();
      for (final EObject e : _answers) {
        scopeList.add(e);
      }
      boolean _isEmpty = scopeList.isEmpty();
      if (_isEmpty) {
        return IScope.NULLSCOPE;
      } else {
        return Scopes.scopeFor(scopeList);
      }
    } else {
      if ((context instanceof ClosedAnswer)) {
        EObject _eContainer_1 = context.eContainer();
        EObject _eContainer_2 = _eContainer_1.eContainer();
        EObject _eContainer_3 = _eContainer_2.eContainer();
        EObject _eContainer_4 = _eContainer_3.eContainer();
        EList<Group> _groups = ((QuestionnaireImpl) _eContainer_4).getGroups();
        for (final EObject e_1 : _groups) {
          EList<Question> _questions = ((GroupImpl) e_1).getQuestions();
          for (final EObject q : _questions) {
            scopeList.add(q);
          }
        }
        boolean _isEmpty_1 = scopeList.isEmpty();
        if (_isEmpty_1) {
          return IScope.NULLSCOPE;
        } else {
          return Scopes.scopeFor(scopeList);
        }
      }
    }
    return super.getScope(context, reference);
  }
}
