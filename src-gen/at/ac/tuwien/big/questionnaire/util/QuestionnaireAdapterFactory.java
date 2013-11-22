/**
 */
package at.ac.tuwien.big.questionnaire.util;

import at.ac.tuwien.big.questionnaire.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage
 * @generated
 */
public class QuestionnaireAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static QuestionnairePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuestionnaireAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = QuestionnairePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuestionnaireSwitch<Adapter> modelSwitch =
    new QuestionnaireSwitch<Adapter>()
    {
      @Override
      public Adapter caseQuestionnaire(Questionnaire object)
      {
        return createQuestionnaireAdapter();
      }
      @Override
      public Adapter caseGroup(Group object)
      {
        return createGroupAdapter();
      }
      @Override
      public Adapter caseQuestion(Question object)
      {
        return createQuestionAdapter();
      }
      @Override
      public Adapter caseOpenQuestion(OpenQuestion object)
      {
        return createOpenQuestionAdapter();
      }
      @Override
      public Adapter caseClosedQuestion(ClosedQuestion object)
      {
        return createClosedQuestionAdapter();
      }
      @Override
      public Adapter caseLikertQuestion(LikertQuestion object)
      {
        return createLikertQuestionAdapter();
      }
      @Override
      public Adapter caseAnswers(Answers object)
      {
        return createAnswersAdapter();
      }
      @Override
      public Adapter caseAnswer(Answer object)
      {
        return createAnswerAdapter();
      }
      @Override
      public Adapter caseOpenAnswer(OpenAnswer object)
      {
        return createOpenAnswerAdapter();
      }
      @Override
      public Adapter caseClosedAnswer(ClosedAnswer object)
      {
        return createClosedAnswerAdapter();
      }
      @Override
      public Adapter caseDefAnswer(DefAnswer object)
      {
        return createDefAnswerAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.questionnaire.Questionnaire <em>Questionnaire</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.tuwien.big.questionnaire.Questionnaire
   * @generated
   */
  public Adapter createQuestionnaireAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.questionnaire.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.tuwien.big.questionnaire.Group
   * @generated
   */
  public Adapter createGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.questionnaire.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.tuwien.big.questionnaire.Question
   * @generated
   */
  public Adapter createQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.questionnaire.OpenQuestion <em>Open Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.tuwien.big.questionnaire.OpenQuestion
   * @generated
   */
  public Adapter createOpenQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.questionnaire.ClosedQuestion <em>Closed Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.tuwien.big.questionnaire.ClosedQuestion
   * @generated
   */
  public Adapter createClosedQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.questionnaire.LikertQuestion <em>Likert Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.tuwien.big.questionnaire.LikertQuestion
   * @generated
   */
  public Adapter createLikertQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.questionnaire.Answers <em>Answers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.tuwien.big.questionnaire.Answers
   * @generated
   */
  public Adapter createAnswersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.questionnaire.Answer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.tuwien.big.questionnaire.Answer
   * @generated
   */
  public Adapter createAnswerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.questionnaire.OpenAnswer <em>Open Answer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.tuwien.big.questionnaire.OpenAnswer
   * @generated
   */
  public Adapter createOpenAnswerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.questionnaire.ClosedAnswer <em>Closed Answer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.tuwien.big.questionnaire.ClosedAnswer
   * @generated
   */
  public Adapter createClosedAnswerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.questionnaire.DefAnswer <em>Def Answer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see at.ac.tuwien.big.questionnaire.DefAnswer
   * @generated
   */
  public Adapter createDefAnswerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //QuestionnaireAdapterFactory
