/**
 */
package at.ac.tuwien.big.questionnaire.impl;

import at.ac.tuwien.big.questionnaire.Answers;
import at.ac.tuwien.big.questionnaire.ClosedAnswer;
import at.ac.tuwien.big.questionnaire.ClosedQuestion;
import at.ac.tuwien.big.questionnaire.Group;
import at.ac.tuwien.big.questionnaire.LikertQuestion;
import at.ac.tuwien.big.questionnaire.OpenAnswer;
import at.ac.tuwien.big.questionnaire.OpenQuestion;
import at.ac.tuwien.big.questionnaire.Question;
import at.ac.tuwien.big.questionnaire.Questionnaire;
import at.ac.tuwien.big.questionnaire.QuestionnaireFactory;
import at.ac.tuwien.big.questionnaire.QuestionnairePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionnairePackageImpl extends EPackageImpl implements QuestionnairePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass questionnaireEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass questionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass openQuestionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass closedQuestionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass likertQuestionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass answersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass openAnswerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass closedAnswerEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see at.ac.tuwien.big.questionnaire.QuestionnairePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private QuestionnairePackageImpl()
  {
    super(eNS_URI, QuestionnaireFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link QuestionnairePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static QuestionnairePackage init()
  {
    if (isInited) return (QuestionnairePackage)EPackage.Registry.INSTANCE.getEPackage(QuestionnairePackage.eNS_URI);

    // Obtain or create and register package
    QuestionnairePackageImpl theQuestionnairePackage = (QuestionnairePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QuestionnairePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QuestionnairePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theQuestionnairePackage.createPackageContents();

    // Initialize created meta-data
    theQuestionnairePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theQuestionnairePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(QuestionnairePackage.eNS_URI, theQuestionnairePackage);
    return theQuestionnairePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuestionnaire()
  {
    return questionnaireEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestionnaire_Title()
  {
    return (EAttribute)questionnaireEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuestionnaire_Groups()
  {
    return (EReference)questionnaireEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroup()
  {
    return groupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroup_Name()
  {
    return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroup_Questions()
  {
    return (EReference)groupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuestion()
  {
    return questionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestion_Question()
  {
    return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOpenQuestion()
  {
    return openQuestionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClosedQuestion()
  {
    return closedQuestionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClosedQuestion_Answers()
  {
    return (EReference)closedQuestionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLikertQuestion()
  {
    return likertQuestionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLikertQuestion_Lower()
  {
    return (EAttribute)likertQuestionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLikertQuestion_Higher()
  {
    return (EAttribute)likertQuestionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnswers()
  {
    return answersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnswers_Answers()
  {
    return (EReference)answersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnswers_Answer()
  {
    return (EReference)answersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOpenAnswer()
  {
    return openAnswerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOpenAnswer_Answer()
  {
    return (EAttribute)openAnswerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClosedAnswer()
  {
    return closedAnswerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClosedAnswer_Answer()
  {
    return (EAttribute)closedAnswerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClosedAnswer_Question()
  {
    return (EReference)closedAnswerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuestionnaireFactory getQuestionnaireFactory()
  {
    return (QuestionnaireFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    questionnaireEClass = createEClass(QUESTIONNAIRE);
    createEAttribute(questionnaireEClass, QUESTIONNAIRE__TITLE);
    createEReference(questionnaireEClass, QUESTIONNAIRE__GROUPS);

    groupEClass = createEClass(GROUP);
    createEAttribute(groupEClass, GROUP__NAME);
    createEReference(groupEClass, GROUP__QUESTIONS);

    questionEClass = createEClass(QUESTION);
    createEAttribute(questionEClass, QUESTION__QUESTION);

    openQuestionEClass = createEClass(OPEN_QUESTION);

    closedQuestionEClass = createEClass(CLOSED_QUESTION);
    createEReference(closedQuestionEClass, CLOSED_QUESTION__ANSWERS);

    likertQuestionEClass = createEClass(LIKERT_QUESTION);
    createEAttribute(likertQuestionEClass, LIKERT_QUESTION__LOWER);
    createEAttribute(likertQuestionEClass, LIKERT_QUESTION__HIGHER);

    answersEClass = createEClass(ANSWERS);
    createEReference(answersEClass, ANSWERS__ANSWERS);
    createEReference(answersEClass, ANSWERS__ANSWER);

    openAnswerEClass = createEClass(OPEN_ANSWER);
    createEAttribute(openAnswerEClass, OPEN_ANSWER__ANSWER);

    closedAnswerEClass = createEClass(CLOSED_ANSWER);
    createEAttribute(closedAnswerEClass, CLOSED_ANSWER__ANSWER);
    createEReference(closedAnswerEClass, CLOSED_ANSWER__QUESTION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    openQuestionEClass.getESuperTypes().add(this.getQuestion());
    closedQuestionEClass.getESuperTypes().add(this.getQuestion());
    likertQuestionEClass.getESuperTypes().add(this.getQuestion());

    // Initialize classes and features; add operations and parameters
    initEClass(questionnaireEClass, Questionnaire.class, "Questionnaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuestionnaire_Title(), ecorePackage.getEString(), "title", null, 0, 1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuestionnaire_Groups(), this.getGroup(), null, "groups", null, 0, -1, Questionnaire.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGroup_Questions(), this.getQuestion(), null, "questions", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuestion_Question(), ecorePackage.getEString(), "question", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(openQuestionEClass, OpenQuestion.class, "OpenQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(closedQuestionEClass, ClosedQuestion.class, "ClosedQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClosedQuestion_Answers(), this.getAnswers(), null, "answers", null, 0, 1, ClosedQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(likertQuestionEClass, LikertQuestion.class, "LikertQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLikertQuestion_Lower(), ecorePackage.getEInt(), "lower", null, 0, 1, LikertQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLikertQuestion_Higher(), ecorePackage.getEInt(), "higher", null, 0, 1, LikertQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(answersEClass, Answers.class, "Answers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnswers_Answers(), ecorePackage.getEObject(), null, "answers", null, 0, -1, Answers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnswers_Answer(), this.getClosedAnswer(), null, "answer", null, 0, 1, Answers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(openAnswerEClass, OpenAnswer.class, "OpenAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOpenAnswer_Answer(), ecorePackage.getEString(), "answer", null, 0, 1, OpenAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(closedAnswerEClass, ClosedAnswer.class, "ClosedAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClosedAnswer_Answer(), ecorePackage.getEString(), "answer", null, 0, 1, ClosedAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClosedAnswer_Question(), this.getQuestion(), null, "question", null, 0, -1, ClosedAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //QuestionnairePackageImpl
