/**
 */
package at.ac.tuwien.big.questionnaire;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.questionnaire.QuestionnaireFactory
 * @model kind="package"
 * @generated
 */
public interface QuestionnairePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "questionnaire";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.at/tuwien/big/Questionnaire";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "questionnaire";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QuestionnairePackage eINSTANCE = at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl.init();

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnaireImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getQuestionnaire()
   * @generated
   */
  int QUESTIONNAIRE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__NAME = 0;

  /**
   * The feature id for the '<em><b>Groups</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__GROUPS = 1;

  /**
   * The number of structural features of the '<em>Questionnaire</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.GroupImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getGroup()
   * @generated
   */
  int GROUP = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = 0;

  /**
   * The feature id for the '<em><b>Questions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__QUESTIONS = 1;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.OpenQuestionImpl <em>Open Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.OpenQuestionImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getOpenQuestion()
   * @generated
   */
  int OPEN_QUESTION = 2;

  /**
   * The feature id for the '<em><b>Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_QUESTION__MANDATORY = 0;

  /**
   * The feature id for the '<em><b>Multiline</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_QUESTION__MULTILINE = 1;

  /**
   * The feature id for the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_QUESTION__QUESTION = 2;

  /**
   * The number of structural features of the '<em>Open Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_QUESTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.ClosedQuestionImpl <em>Closed Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.ClosedQuestionImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getClosedQuestion()
   * @generated
   */
  int CLOSED_QUESTION = 3;

  /**
   * The feature id for the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_QUESTION__QUESTION = 0;

  /**
   * The feature id for the '<em><b>Answers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_QUESTION__ANSWERS = 1;

  /**
   * The number of structural features of the '<em>Closed Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_QUESTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.LikertQuestionImpl <em>Likert Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.LikertQuestionImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getLikertQuestion()
   * @generated
   */
  int LIKERT_QUESTION = 4;

  /**
   * The feature id for the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKERT_QUESTION__QUESTION = 0;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKERT_QUESTION__LOWER = 1;

  /**
   * The feature id for the '<em><b>Higher</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKERT_QUESTION__HIGHER = 2;

  /**
   * The number of structural features of the '<em>Likert Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKERT_QUESTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.AnswersImpl <em>Answers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.AnswersImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getAnswers()
   * @generated
   */
  int ANSWERS = 5;

  /**
   * The feature id for the '<em><b>Answers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWERS__ANSWERS = 0;

  /**
   * The feature id for the '<em><b>Answer</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWERS__ANSWER = 1;

  /**
   * The number of structural features of the '<em>Answers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWERS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.OpenAnswerImpl <em>Open Answer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.OpenAnswerImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getOpenAnswer()
   * @generated
   */
  int OPEN_ANSWER = 6;

  /**
   * The feature id for the '<em><b>Answer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_ANSWER__ANSWER = 0;

  /**
   * The number of structural features of the '<em>Open Answer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_ANSWER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.ClosedAnswerImpl <em>Closed Answer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.ClosedAnswerImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getClosedAnswer()
   * @generated
   */
  int CLOSED_ANSWER = 7;

  /**
   * The feature id for the '<em><b>Answer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_ANSWER__ANSWER = 0;

  /**
   * The feature id for the '<em><b>Question</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_ANSWER__QUESTION = 1;

  /**
   * The number of structural features of the '<em>Closed Answer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_ANSWER_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.Questionnaire <em>Questionnaire</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Questionnaire</em>'.
   * @see at.ac.tuwien.big.questionnaire.Questionnaire
   * @generated
   */
  EClass getQuestionnaire();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.Questionnaire#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.tuwien.big.questionnaire.Questionnaire#getName()
   * @see #getQuestionnaire()
   * @generated
   */
  EAttribute getQuestionnaire_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.questionnaire.Questionnaire#getGroups <em>Groups</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groups</em>'.
   * @see at.ac.tuwien.big.questionnaire.Questionnaire#getGroups()
   * @see #getQuestionnaire()
   * @generated
   */
  EReference getQuestionnaire_Groups();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see at.ac.tuwien.big.questionnaire.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.Group#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.tuwien.big.questionnaire.Group#getName()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Name();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.questionnaire.Group#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see at.ac.tuwien.big.questionnaire.Group#getQuestions()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_Questions();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.OpenQuestion <em>Open Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Open Question</em>'.
   * @see at.ac.tuwien.big.questionnaire.OpenQuestion
   * @generated
   */
  EClass getOpenQuestion();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.OpenQuestion#isMandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mandatory</em>'.
   * @see at.ac.tuwien.big.questionnaire.OpenQuestion#isMandatory()
   * @see #getOpenQuestion()
   * @generated
   */
  EAttribute getOpenQuestion_Mandatory();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.OpenQuestion#isMultiline <em>Multiline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiline</em>'.
   * @see at.ac.tuwien.big.questionnaire.OpenQuestion#isMultiline()
   * @see #getOpenQuestion()
   * @generated
   */
  EAttribute getOpenQuestion_Multiline();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.OpenQuestion#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Question</em>'.
   * @see at.ac.tuwien.big.questionnaire.OpenQuestion#getQuestion()
   * @see #getOpenQuestion()
   * @generated
   */
  EAttribute getOpenQuestion_Question();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.ClosedQuestion <em>Closed Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Closed Question</em>'.
   * @see at.ac.tuwien.big.questionnaire.ClosedQuestion
   * @generated
   */
  EClass getClosedQuestion();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.ClosedQuestion#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Question</em>'.
   * @see at.ac.tuwien.big.questionnaire.ClosedQuestion#getQuestion()
   * @see #getClosedQuestion()
   * @generated
   */
  EAttribute getClosedQuestion_Question();

  /**
   * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.questionnaire.ClosedQuestion#getAnswers <em>Answers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Answers</em>'.
   * @see at.ac.tuwien.big.questionnaire.ClosedQuestion#getAnswers()
   * @see #getClosedQuestion()
   * @generated
   */
  EReference getClosedQuestion_Answers();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.LikertQuestion <em>Likert Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Likert Question</em>'.
   * @see at.ac.tuwien.big.questionnaire.LikertQuestion
   * @generated
   */
  EClass getLikertQuestion();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.LikertQuestion#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Question</em>'.
   * @see at.ac.tuwien.big.questionnaire.LikertQuestion#getQuestion()
   * @see #getLikertQuestion()
   * @generated
   */
  EAttribute getLikertQuestion_Question();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.LikertQuestion#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower</em>'.
   * @see at.ac.tuwien.big.questionnaire.LikertQuestion#getLower()
   * @see #getLikertQuestion()
   * @generated
   */
  EAttribute getLikertQuestion_Lower();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.LikertQuestion#getHigher <em>Higher</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Higher</em>'.
   * @see at.ac.tuwien.big.questionnaire.LikertQuestion#getHigher()
   * @see #getLikertQuestion()
   * @generated
   */
  EAttribute getLikertQuestion_Higher();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.Answers <em>Answers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Answers</em>'.
   * @see at.ac.tuwien.big.questionnaire.Answers
   * @generated
   */
  EClass getAnswers();

  /**
   * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.questionnaire.Answers#getAnswers <em>Answers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Answers</em>'.
   * @see at.ac.tuwien.big.questionnaire.Answers#getAnswers()
   * @see #getAnswers()
   * @generated
   */
  EReference getAnswers_Answers();

  /**
   * Returns the meta object for the reference '{@link at.ac.tuwien.big.questionnaire.Answers#getAnswer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Answer</em>'.
   * @see at.ac.tuwien.big.questionnaire.Answers#getAnswer()
   * @see #getAnswers()
   * @generated
   */
  EReference getAnswers_Answer();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.OpenAnswer <em>Open Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Open Answer</em>'.
   * @see at.ac.tuwien.big.questionnaire.OpenAnswer
   * @generated
   */
  EClass getOpenAnswer();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.OpenAnswer#getAnswer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Answer</em>'.
   * @see at.ac.tuwien.big.questionnaire.OpenAnswer#getAnswer()
   * @see #getOpenAnswer()
   * @generated
   */
  EAttribute getOpenAnswer_Answer();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.ClosedAnswer <em>Closed Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Closed Answer</em>'.
   * @see at.ac.tuwien.big.questionnaire.ClosedAnswer
   * @generated
   */
  EClass getClosedAnswer();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.ClosedAnswer#getAnswer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Answer</em>'.
   * @see at.ac.tuwien.big.questionnaire.ClosedAnswer#getAnswer()
   * @see #getClosedAnswer()
   * @generated
   */
  EAttribute getClosedAnswer_Answer();

  /**
   * Returns the meta object for the reference '{@link at.ac.tuwien.big.questionnaire.ClosedAnswer#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Question</em>'.
   * @see at.ac.tuwien.big.questionnaire.ClosedAnswer#getQuestion()
   * @see #getClosedAnswer()
   * @generated
   */
  EReference getClosedAnswer_Question();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  QuestionnaireFactory getQuestionnaireFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.QuestionnaireImpl <em>Questionnaire</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnaireImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getQuestionnaire()
     * @generated
     */
    EClass QUESTIONNAIRE = eINSTANCE.getQuestionnaire();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTIONNAIRE__NAME = eINSTANCE.getQuestionnaire_Name();

    /**
     * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTIONNAIRE__GROUPS = eINSTANCE.getQuestionnaire_Groups();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.GroupImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

    /**
     * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__QUESTIONS = eINSTANCE.getGroup_Questions();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.OpenQuestionImpl <em>Open Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.OpenQuestionImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getOpenQuestion()
     * @generated
     */
    EClass OPEN_QUESTION = eINSTANCE.getOpenQuestion();

    /**
     * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPEN_QUESTION__MANDATORY = eINSTANCE.getOpenQuestion_Mandatory();

    /**
     * The meta object literal for the '<em><b>Multiline</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPEN_QUESTION__MULTILINE = eINSTANCE.getOpenQuestion_Multiline();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPEN_QUESTION__QUESTION = eINSTANCE.getOpenQuestion_Question();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.ClosedQuestionImpl <em>Closed Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.ClosedQuestionImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getClosedQuestion()
     * @generated
     */
    EClass CLOSED_QUESTION = eINSTANCE.getClosedQuestion();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOSED_QUESTION__QUESTION = eINSTANCE.getClosedQuestion_Question();

    /**
     * The meta object literal for the '<em><b>Answers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLOSED_QUESTION__ANSWERS = eINSTANCE.getClosedQuestion_Answers();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.LikertQuestionImpl <em>Likert Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.LikertQuestionImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getLikertQuestion()
     * @generated
     */
    EClass LIKERT_QUESTION = eINSTANCE.getLikertQuestion();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIKERT_QUESTION__QUESTION = eINSTANCE.getLikertQuestion_Question();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIKERT_QUESTION__LOWER = eINSTANCE.getLikertQuestion_Lower();

    /**
     * The meta object literal for the '<em><b>Higher</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIKERT_QUESTION__HIGHER = eINSTANCE.getLikertQuestion_Higher();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.AnswersImpl <em>Answers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.AnswersImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getAnswers()
     * @generated
     */
    EClass ANSWERS = eINSTANCE.getAnswers();

    /**
     * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANSWERS__ANSWERS = eINSTANCE.getAnswers_Answers();

    /**
     * The meta object literal for the '<em><b>Answer</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANSWERS__ANSWER = eINSTANCE.getAnswers_Answer();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.OpenAnswerImpl <em>Open Answer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.OpenAnswerImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getOpenAnswer()
     * @generated
     */
    EClass OPEN_ANSWER = eINSTANCE.getOpenAnswer();

    /**
     * The meta object literal for the '<em><b>Answer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPEN_ANSWER__ANSWER = eINSTANCE.getOpenAnswer_Answer();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.ClosedAnswerImpl <em>Closed Answer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.ClosedAnswerImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getClosedAnswer()
     * @generated
     */
    EClass CLOSED_ANSWER = eINSTANCE.getClosedAnswer();

    /**
     * The meta object literal for the '<em><b>Answer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOSED_ANSWER__ANSWER = eINSTANCE.getClosedAnswer_Answer();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLOSED_ANSWER__QUESTION = eINSTANCE.getClosedAnswer_Question();

  }

} //QuestionnairePackage
