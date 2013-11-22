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
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTIONNAIRE__TITLE = 0;

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
   * The feature id for the '<em><b>Questions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__QUESTIONS = 0;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getQuestion()
   * @generated
   */
  int QUESTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__NAME = 0;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.OpenQuestionImpl <em>Open Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.OpenQuestionImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getOpenQuestion()
   * @generated
   */
  int OPEN_QUESTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_QUESTION__NAME = QUESTION__NAME;

  /**
   * The number of structural features of the '<em>Open Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.ClosedQuestionImpl <em>Closed Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.ClosedQuestionImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getClosedQuestion()
   * @generated
   */
  int CLOSED_QUESTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_QUESTION__NAME = QUESTION__NAME;

  /**
   * The feature id for the '<em><b>Answers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_QUESTION__ANSWERS = QUESTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Closed Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.LikertQuestionImpl <em>Likert Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.LikertQuestionImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getLikertQuestion()
   * @generated
   */
  int LIKERT_QUESTION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKERT_QUESTION__NAME = QUESTION__NAME;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKERT_QUESTION__LOWER = QUESTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Higher</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKERT_QUESTION__HIGHER = QUESTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Likert Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIKERT_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.AnswersImpl <em>Answers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.AnswersImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getAnswers()
   * @generated
   */
  int ANSWERS = 6;

  /**
   * The feature id for the '<em><b>Answers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWERS__ANSWERS = 0;

  /**
   * The feature id for the '<em><b>Defanswer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWERS__DEFANSWER = 1;

  /**
   * The number of structural features of the '<em>Answers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWERS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.AnswerImpl <em>Answer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.AnswerImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getAnswer()
   * @generated
   */
  int ANSWER = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWER__NAME = 0;

  /**
   * The number of structural features of the '<em>Answer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.OpenAnswerImpl <em>Open Answer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.OpenAnswerImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getOpenAnswer()
   * @generated
   */
  int OPEN_ANSWER = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_ANSWER__NAME = ANSWER__NAME;

  /**
   * The number of structural features of the '<em>Open Answer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPEN_ANSWER_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.ClosedAnswerImpl <em>Closed Answer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.ClosedAnswerImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getClosedAnswer()
   * @generated
   */
  int CLOSED_ANSWER = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_ANSWER__NAME = ANSWER__NAME;

  /**
   * The feature id for the '<em><b>Id</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_ANSWER__ID = ANSWER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Closed Answer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOSED_ANSWER_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link at.ac.tuwien.big.questionnaire.impl.DefAnswerImpl <em>Def Answer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see at.ac.tuwien.big.questionnaire.impl.DefAnswerImpl
   * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getDefAnswer()
   * @generated
   */
  int DEF_ANSWER = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_ANSWER__ID = 0;

  /**
   * The number of structural features of the '<em>Def Answer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEF_ANSWER_FEATURE_COUNT = 1;


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
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.Questionnaire#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see at.ac.tuwien.big.questionnaire.Questionnaire#getTitle()
   * @see #getQuestionnaire()
   * @generated
   */
  EAttribute getQuestionnaire_Title();

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
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see at.ac.tuwien.big.questionnaire.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.Question#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.tuwien.big.questionnaire.Question#getName()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Name();

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
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.ClosedQuestion <em>Closed Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Closed Question</em>'.
   * @see at.ac.tuwien.big.questionnaire.ClosedQuestion
   * @generated
   */
  EClass getClosedQuestion();

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
   * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.questionnaire.Answers#getDefanswer <em>Defanswer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Defanswer</em>'.
   * @see at.ac.tuwien.big.questionnaire.Answers#getDefanswer()
   * @see #getAnswers()
   * @generated
   */
  EReference getAnswers_Defanswer();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.Answer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Answer</em>'.
   * @see at.ac.tuwien.big.questionnaire.Answer
   * @generated
   */
  EClass getAnswer();

  /**
   * Returns the meta object for the attribute '{@link at.ac.tuwien.big.questionnaire.Answer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see at.ac.tuwien.big.questionnaire.Answer#getName()
   * @see #getAnswer()
   * @generated
   */
  EAttribute getAnswer_Name();

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
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.ClosedAnswer <em>Closed Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Closed Answer</em>'.
   * @see at.ac.tuwien.big.questionnaire.ClosedAnswer
   * @generated
   */
  EClass getClosedAnswer();

  /**
   * Returns the meta object for the reference list '{@link at.ac.tuwien.big.questionnaire.ClosedAnswer#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Id</em>'.
   * @see at.ac.tuwien.big.questionnaire.ClosedAnswer#getId()
   * @see #getClosedAnswer()
   * @generated
   */
  EReference getClosedAnswer_Id();

  /**
   * Returns the meta object for class '{@link at.ac.tuwien.big.questionnaire.DefAnswer <em>Def Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Def Answer</em>'.
   * @see at.ac.tuwien.big.questionnaire.DefAnswer
   * @generated
   */
  EClass getDefAnswer();

  /**
   * Returns the meta object for the reference '{@link at.ac.tuwien.big.questionnaire.DefAnswer#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Id</em>'.
   * @see at.ac.tuwien.big.questionnaire.DefAnswer#getId()
   * @see #getDefAnswer()
   * @generated
   */
  EReference getDefAnswer_Id();

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
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTIONNAIRE__TITLE = eINSTANCE.getQuestionnaire_Title();

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
     * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__QUESTIONS = eINSTANCE.getGroup_Questions();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getQuestion()
     * @generated
     */
    EClass QUESTION = eINSTANCE.getQuestion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

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
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.ClosedQuestionImpl <em>Closed Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.ClosedQuestionImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getClosedQuestion()
     * @generated
     */
    EClass CLOSED_QUESTION = eINSTANCE.getClosedQuestion();

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
     * The meta object literal for the '<em><b>Defanswer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANSWERS__DEFANSWER = eINSTANCE.getAnswers_Defanswer();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.AnswerImpl <em>Answer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.AnswerImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getAnswer()
     * @generated
     */
    EClass ANSWER = eINSTANCE.getAnswer();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANSWER__NAME = eINSTANCE.getAnswer_Name();

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
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.ClosedAnswerImpl <em>Closed Answer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.ClosedAnswerImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getClosedAnswer()
     * @generated
     */
    EClass CLOSED_ANSWER = eINSTANCE.getClosedAnswer();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLOSED_ANSWER__ID = eINSTANCE.getClosedAnswer_Id();

    /**
     * The meta object literal for the '{@link at.ac.tuwien.big.questionnaire.impl.DefAnswerImpl <em>Def Answer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see at.ac.tuwien.big.questionnaire.impl.DefAnswerImpl
     * @see at.ac.tuwien.big.questionnaire.impl.QuestionnairePackageImpl#getDefAnswer()
     * @generated
     */
    EClass DEF_ANSWER = eINSTANCE.getDefAnswer();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEF_ANSWER__ID = eINSTANCE.getDefAnswer_Id();

  }

} //QuestionnairePackage
