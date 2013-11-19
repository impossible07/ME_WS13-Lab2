/**
 */
package at.ac.tuwien.big.questionnaire.impl;

import at.ac.tuwien.big.questionnaire.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnaireFactoryImpl extends EFactoryImpl implements QuestionnaireFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static QuestionnaireFactory init()
  {
    try
    {
      QuestionnaireFactory theQuestionnaireFactory = (QuestionnaireFactory)EPackage.Registry.INSTANCE.getEFactory(QuestionnairePackage.eNS_URI);
      if (theQuestionnaireFactory != null)
      {
        return theQuestionnaireFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new QuestionnaireFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuestionnaireFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case QuestionnairePackage.QUESTIONNAIRE: return createQuestionnaire();
      case QuestionnairePackage.GROUP: return createGroup();
      case QuestionnairePackage.QUESTION: return createQuestion();
      case QuestionnairePackage.OPEN_QUESTION: return createOpenQuestion();
      case QuestionnairePackage.CLOSED_QUESTION: return createClosedQuestion();
      case QuestionnairePackage.LIKERT_QUESTION: return createLikertQuestion();
      case QuestionnairePackage.ANSWERS: return createAnswers();
      case QuestionnairePackage.OPEN_ANSWER: return createOpenAnswer();
      case QuestionnairePackage.CLOSED_ANSWER: return createClosedAnswer();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Questionnaire createQuestionnaire()
  {
    QuestionnaireImpl questionnaire = new QuestionnaireImpl();
    return questionnaire;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group createGroup()
  {
    GroupImpl group = new GroupImpl();
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question createQuestion()
  {
    QuestionImpl question = new QuestionImpl();
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenQuestion createOpenQuestion()
  {
    OpenQuestionImpl openQuestion = new OpenQuestionImpl();
    return openQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClosedQuestion createClosedQuestion()
  {
    ClosedQuestionImpl closedQuestion = new ClosedQuestionImpl();
    return closedQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LikertQuestion createLikertQuestion()
  {
    LikertQuestionImpl likertQuestion = new LikertQuestionImpl();
    return likertQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Answers createAnswers()
  {
    AnswersImpl answers = new AnswersImpl();
    return answers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpenAnswer createOpenAnswer()
  {
    OpenAnswerImpl openAnswer = new OpenAnswerImpl();
    return openAnswer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClosedAnswer createClosedAnswer()
  {
    ClosedAnswerImpl closedAnswer = new ClosedAnswerImpl();
    return closedAnswer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuestionnairePackage getQuestionnairePackage()
  {
    return (QuestionnairePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static QuestionnairePackage getPackage()
  {
    return QuestionnairePackage.eINSTANCE;
  }

} //QuestionnaireFactoryImpl
