/**
 */
package at.ac.tuwien.big.questionnaire.util;

import at.ac.tuwien.big.questionnaire.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage
 * @generated
 */
public class QuestionnaireSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static QuestionnairePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuestionnaireSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = QuestionnairePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case QuestionnairePackage.QUESTIONNAIRE:
      {
        Questionnaire questionnaire = (Questionnaire)theEObject;
        T result = caseQuestionnaire(questionnaire);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuestionnairePackage.GROUP:
      {
        Group group = (Group)theEObject;
        T result = caseGroup(group);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuestionnairePackage.QUESTION:
      {
        Question question = (Question)theEObject;
        T result = caseQuestion(question);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuestionnairePackage.OPEN_QUESTION:
      {
        OpenQuestion openQuestion = (OpenQuestion)theEObject;
        T result = caseOpenQuestion(openQuestion);
        if (result == null) result = caseQuestion(openQuestion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuestionnairePackage.CLOSED_QUESTION:
      {
        ClosedQuestion closedQuestion = (ClosedQuestion)theEObject;
        T result = caseClosedQuestion(closedQuestion);
        if (result == null) result = caseQuestion(closedQuestion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuestionnairePackage.LIKERT_QUESTION:
      {
        LikertQuestion likertQuestion = (LikertQuestion)theEObject;
        T result = caseLikertQuestion(likertQuestion);
        if (result == null) result = caseQuestion(likertQuestion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuestionnairePackage.ANSWERS:
      {
        Answers answers = (Answers)theEObject;
        T result = caseAnswers(answers);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuestionnairePackage.ANSWER:
      {
        Answer answer = (Answer)theEObject;
        T result = caseAnswer(answer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuestionnairePackage.OPEN_ANSWER:
      {
        OpenAnswer openAnswer = (OpenAnswer)theEObject;
        T result = caseOpenAnswer(openAnswer);
        if (result == null) result = caseAnswer(openAnswer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuestionnairePackage.CLOSED_ANSWER:
      {
        ClosedAnswer closedAnswer = (ClosedAnswer)theEObject;
        T result = caseClosedAnswer(closedAnswer);
        if (result == null) result = caseAnswer(closedAnswer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case QuestionnairePackage.DEF_ANSWER:
      {
        DefAnswer defAnswer = (DefAnswer)theEObject;
        T result = caseDefAnswer(defAnswer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuestionnaire(Questionnaire object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroup(Group object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Question</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuestion(Question object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Open Question</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Open Question</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpenQuestion(OpenQuestion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Closed Question</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Closed Question</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClosedQuestion(ClosedQuestion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Likert Question</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Likert Question</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLikertQuestion(LikertQuestion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Answers</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Answers</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnswers(Answers object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Answer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Answer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnswer(Answer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Open Answer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Open Answer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOpenAnswer(OpenAnswer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Closed Answer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Closed Answer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClosedAnswer(ClosedAnswer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Answer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Answer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefAnswer(DefAnswer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //QuestionnaireSwitch
