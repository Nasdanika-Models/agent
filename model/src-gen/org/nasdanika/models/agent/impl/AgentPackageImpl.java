/**
 */
package org.nasdanika.models.agent.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.agent.Agent;
import org.nasdanika.models.agent.AgentFactory;
import org.nasdanika.models.agent.AgentPackage;
import org.nasdanika.models.agent.AgentSystem;
import org.nasdanika.models.agent.AgentTool;
import org.nasdanika.models.agent.AllExamples;
import org.nasdanika.models.agent.Example;
import org.nasdanika.models.agent.ExampleSet;
import org.nasdanika.models.agent.JavaTool;
import org.nasdanika.models.agent.JsonType;
import org.nasdanika.models.agent.Llm;
import org.nasdanika.models.agent.McpTool;
import org.nasdanika.models.agent.NamedElement;
import org.nasdanika.models.agent.Parameter;
import org.nasdanika.models.agent.Property;
import org.nasdanika.models.agent.Resource;
import org.nasdanika.models.agent.SelectionStrategy;
import org.nasdanika.models.agent.SimilaritySelection;
import org.nasdanika.models.agent.Skill;
import org.nasdanika.models.agent.Task;
import org.nasdanika.models.agent.Tool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgentPackageImpl extends EPackageImpl implements AgentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass llmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mcpToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allExamplesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass similaritySelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jsonTypeEEnum = null;

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
	 * @see org.nasdanika.models.agent.AgentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AgentPackageImpl() {
		super(eNS_URI, AgentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AgentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AgentPackage init() {
		if (isInited) return (AgentPackage)EPackage.Registry.INSTANCE.getEPackage(AgentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAgentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AgentPackageImpl theAgentPackage = registeredAgentPackage instanceof AgentPackageImpl ? (AgentPackageImpl)registeredAgentPackage : new AgentPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAgentPackage.createPackageContents();

		// Initialize created meta-data
		theAgentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAgentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AgentPackage.eNS_URI, theAgentPackage);
		return theAgentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Description() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgentSystem() {
		return agentSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgentSystem_Models() {
		return (EReference)agentSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgentSystem_Agents() {
		return (EReference)agentSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgentSystem_Tasks() {
		return (EReference)agentSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgentSystem_Tools() {
		return (EReference)agentSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgentSystem_Skills() {
		return (EReference)agentSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLlm() {
		return llmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLlm_Provider() {
		return (EAttribute)llmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLlm_Model() {
		return (EAttribute)llmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLlm_Temperature() {
		return (EAttribute)llmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLlm_MaxTokens() {
		return (EAttribute)llmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLlm_Properties() {
		return (EReference)llmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAgent_Instructions() {
		return (EAttribute)agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgent_Llm() {
		return (EReference)agentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgent_Tools() {
		return (EReference)agentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgent_Skills() {
		return (EReference)agentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgent_Handoffs() {
		return (EReference)agentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgent_ExampleSets() {
		return (EReference)agentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_ExpectedOutput() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Performer() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_DependsOn() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_Inputs() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTask_ExampleSets() {
		return (EReference)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Required() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_DefaultValue() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTool() {
		return toolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTool_Parameters() {
		return (EReference)toolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTool_Returns() {
		return (EAttribute)toolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMcpTool() {
		return mcpToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMcpTool_Server() {
		return (EAttribute)mcpToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMcpTool_ToolName() {
		return (EAttribute)mcpToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaTool() {
		return javaToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaTool_ImplementationClass() {
		return (EAttribute)javaToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgentTool() {
		return agentToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAgentTool_Agent() {
		return (EReference)agentToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkill() {
		return skillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkill_Instructions() {
		return (EAttribute)skillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkill_Resources() {
		return (EReference)skillEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResource_Location() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExample() {
		return exampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExample_Input() {
		return (EAttribute)exampleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExample_Output() {
		return (EAttribute)exampleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExampleSet() {
		return exampleSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExampleSet_Examples() {
		return (EReference)exampleSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExampleSet_SelectionStrategy() {
		return (EReference)exampleSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelectionStrategy() {
		return selectionStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllExamples() {
		return allExamplesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllExamples_Limit() {
		return (EAttribute)allExamplesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimilaritySelection() {
		return similaritySelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimilaritySelection_EmbeddingModel() {
		return (EAttribute)similaritySelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimilaritySelection_TopK() {
		return (EAttribute)similaritySelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJsonType() {
		return jsonTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AgentFactory getAgentFactory() {
		return (AgentFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__DESCRIPTION);

		agentSystemEClass = createEClass(AGENT_SYSTEM);
		createEReference(agentSystemEClass, AGENT_SYSTEM__MODELS);
		createEReference(agentSystemEClass, AGENT_SYSTEM__AGENTS);
		createEReference(agentSystemEClass, AGENT_SYSTEM__TASKS);
		createEReference(agentSystemEClass, AGENT_SYSTEM__TOOLS);
		createEReference(agentSystemEClass, AGENT_SYSTEM__SKILLS);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		llmEClass = createEClass(LLM);
		createEAttribute(llmEClass, LLM__PROVIDER);
		createEAttribute(llmEClass, LLM__MODEL);
		createEAttribute(llmEClass, LLM__TEMPERATURE);
		createEAttribute(llmEClass, LLM__MAX_TOKENS);
		createEReference(llmEClass, LLM__PROPERTIES);

		agentEClass = createEClass(AGENT);
		createEAttribute(agentEClass, AGENT__INSTRUCTIONS);
		createEReference(agentEClass, AGENT__LLM);
		createEReference(agentEClass, AGENT__TOOLS);
		createEReference(agentEClass, AGENT__SKILLS);
		createEReference(agentEClass, AGENT__HANDOFFS);
		createEReference(agentEClass, AGENT__EXAMPLE_SETS);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__EXPECTED_OUTPUT);
		createEReference(taskEClass, TASK__PERFORMER);
		createEReference(taskEClass, TASK__DEPENDS_ON);
		createEReference(taskEClass, TASK__INPUTS);
		createEReference(taskEClass, TASK__EXAMPLE_SETS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__REQUIRED);
		createEAttribute(parameterEClass, PARAMETER__DEFAULT_VALUE);

		toolEClass = createEClass(TOOL);
		createEReference(toolEClass, TOOL__PARAMETERS);
		createEAttribute(toolEClass, TOOL__RETURNS);

		mcpToolEClass = createEClass(MCP_TOOL);
		createEAttribute(mcpToolEClass, MCP_TOOL__SERVER);
		createEAttribute(mcpToolEClass, MCP_TOOL__TOOL_NAME);

		javaToolEClass = createEClass(JAVA_TOOL);
		createEAttribute(javaToolEClass, JAVA_TOOL__IMPLEMENTATION_CLASS);

		agentToolEClass = createEClass(AGENT_TOOL);
		createEReference(agentToolEClass, AGENT_TOOL__AGENT);

		skillEClass = createEClass(SKILL);
		createEAttribute(skillEClass, SKILL__INSTRUCTIONS);
		createEReference(skillEClass, SKILL__RESOURCES);

		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__LOCATION);

		exampleEClass = createEClass(EXAMPLE);
		createEAttribute(exampleEClass, EXAMPLE__INPUT);
		createEAttribute(exampleEClass, EXAMPLE__OUTPUT);

		exampleSetEClass = createEClass(EXAMPLE_SET);
		createEReference(exampleSetEClass, EXAMPLE_SET__EXAMPLES);
		createEReference(exampleSetEClass, EXAMPLE_SET__SELECTION_STRATEGY);

		selectionStrategyEClass = createEClass(SELECTION_STRATEGY);

		allExamplesEClass = createEClass(ALL_EXAMPLES);
		createEAttribute(allExamplesEClass, ALL_EXAMPLES__LIMIT);

		similaritySelectionEClass = createEClass(SIMILARITY_SELECTION);
		createEAttribute(similaritySelectionEClass, SIMILARITY_SELECTION__EMBEDDING_MODEL);
		createEAttribute(similaritySelectionEClass, SIMILARITY_SELECTION__TOP_K);

		// Create enums
		jsonTypeEEnum = createEEnum(JSON_TYPE);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		agentSystemEClass.getESuperTypes().add(this.getNamedElement());
		llmEClass.getESuperTypes().add(this.getNamedElement());
		agentEClass.getESuperTypes().add(this.getNamedElement());
		taskEClass.getESuperTypes().add(this.getNamedElement());
		parameterEClass.getESuperTypes().add(this.getNamedElement());
		toolEClass.getESuperTypes().add(this.getNamedElement());
		mcpToolEClass.getESuperTypes().add(this.getTool());
		javaToolEClass.getESuperTypes().add(this.getTool());
		agentToolEClass.getESuperTypes().add(this.getTool());
		skillEClass.getESuperTypes().add(this.getNamedElement());
		resourceEClass.getESuperTypes().add(this.getNamedElement());
		exampleEClass.getESuperTypes().add(this.getNamedElement());
		exampleSetEClass.getESuperTypes().add(this.getNamedElement());
		allExamplesEClass.getESuperTypes().add(this.getSelectionStrategy());
		similaritySelectionEClass.getESuperTypes().add(this.getSelectionStrategy());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Description(), theEcorePackage.getEString(), "description", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentSystemEClass, AgentSystem.class, "AgentSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgentSystem_Models(), this.getLlm(), null, "models", null, 0, -1, AgentSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgentSystem_Agents(), this.getAgent(), null, "agents", null, 0, -1, AgentSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgentSystem_Tasks(), this.getTask(), null, "tasks", null, 0, -1, AgentSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgentSystem_Tools(), this.getTool(), null, "tools", null, 0, -1, AgentSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgentSystem_Skills(), this.getSkill(), null, "skills", null, 0, -1, AgentSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), theEcorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(llmEClass, Llm.class, "Llm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLlm_Provider(), theEcorePackage.getEString(), "provider", null, 0, 1, Llm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLlm_Model(), theEcorePackage.getEString(), "model", null, 0, 1, Llm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLlm_Temperature(), theEcorePackage.getEDoubleObject(), "temperature", null, 0, 1, Llm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLlm_MaxTokens(), theEcorePackage.getEIntegerObject(), "maxTokens", null, 0, 1, Llm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLlm_Properties(), this.getProperty(), null, "properties", null, 0, -1, Llm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgent_Instructions(), theEcorePackage.getEString(), "instructions", null, 0, 1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Llm(), this.getLlm(), null, "llm", null, 0, 1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Tools(), this.getTool(), null, "tools", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Skills(), this.getSkill(), null, "skills", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_Handoffs(), this.getAgent(), null, "handoffs", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAgent_ExampleSets(), this.getExampleSet(), null, "exampleSets", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_ExpectedOutput(), theEcorePackage.getEString(), "expectedOutput", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Performer(), this.getAgent(), null, "performer", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_DependsOn(), this.getTask(), null, "dependsOn", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Inputs(), this.getParameter(), null, "inputs", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ExampleSets(), this.getExampleSet(), null, "exampleSets", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Type(), this.getJsonType(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Required(), theEcorePackage.getEBoolean(), "required", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_DefaultValue(), theEcorePackage.getEString(), "defaultValue", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolEClass, Tool.class, "Tool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTool_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTool_Returns(), theEcorePackage.getEString(), "returns", null, 0, 1, Tool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mcpToolEClass, McpTool.class, "McpTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMcpTool_Server(), theEcorePackage.getEString(), "server", null, 0, 1, McpTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMcpTool_ToolName(), theEcorePackage.getEString(), "toolName", null, 0, 1, McpTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaToolEClass, JavaTool.class, "JavaTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaTool_ImplementationClass(), theEcorePackage.getEString(), "implementationClass", null, 0, 1, JavaTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(agentToolEClass, AgentTool.class, "AgentTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAgentTool_Agent(), this.getAgent(), null, "agent", null, 0, 1, AgentTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillEClass, Skill.class, "Skill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkill_Instructions(), theEcorePackage.getEString(), "instructions", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkill_Resources(), this.getResource(), null, "resources", null, 0, -1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_Location(), theEcorePackage.getEString(), "location", null, 0, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exampleEClass, Example.class, "Example", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExample_Input(), theEcorePackage.getEString(), "input", null, 0, 1, Example.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExample_Output(), theEcorePackage.getEString(), "output", null, 0, 1, Example.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exampleSetEClass, ExampleSet.class, "ExampleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExampleSet_Examples(), this.getExample(), null, "examples", null, 0, -1, ExampleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExampleSet_SelectionStrategy(), this.getSelectionStrategy(), null, "selectionStrategy", null, 0, 1, ExampleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectionStrategyEClass, SelectionStrategy.class, "SelectionStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allExamplesEClass, AllExamples.class, "AllExamples", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllExamples_Limit(), theEcorePackage.getEIntegerObject(), "limit", null, 0, 1, AllExamples.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(similaritySelectionEClass, SimilaritySelection.class, "SimilaritySelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimilaritySelection_EmbeddingModel(), theEcorePackage.getEString(), "embeddingModel", null, 0, 1, SimilaritySelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimilaritySelection_TopK(), theEcorePackage.getEInt(), "topK", null, 0, 1, SimilaritySelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(jsonTypeEEnum, JsonType.class, "JsonType");
		addEEnumLiteral(jsonTypeEEnum, JsonType.STRING);
		addEEnumLiteral(jsonTypeEEnum, JsonType.NUMBER);
		addEEnumLiteral(jsonTypeEEnum, JsonType.INTEGER);
		addEEnumLiteral(jsonTypeEEnum, JsonType.BOOLEAN);
		addEEnumLiteral(jsonTypeEEnum, JsonType.OBJECT);
		addEEnumLiteral(jsonTypeEEnum, JsonType.ARRAY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "bundleManifest", "false",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (namedElementEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for named model elements."
		   });
		addAnnotation
		  (getNamedElement_Description(),
		   source,
		   new String[] {
			   "documentation", "Markdown documentation of this element."
		   });
		addAnnotation
		  (agentSystemEClass,
		   source,
		   new String[] {
			   "documentation", "The root container: a system of agents, the models they run on, the tasks they perform, and the tools and skills they use."
		   });
		addAnnotation
		  (propertyEClass,
		   source,
		   new String[] {
			   "documentation", "A generic name/value pair for provider-specific settings not worth first-class features."
		   });
		addAnnotation
		  (llmEClass,
		   source,
		   new String[] {
			   "documentation", "A language model an agent runs on: provider, model identifier, and inference settings. Deployment specifics (endpoints, credentials) belong in a separate deployment model referencing this one."
		   });
		addAnnotation
		  (getLlm_Provider(),
		   source,
		   new String[] {
			   "documentation", "Provider, e.g. anthropic, openai, azure, bedrock, ollama."
		   });
		addAnnotation
		  (getLlm_Model(),
		   source,
		   new String[] {
			   "documentation", "Model identifier, e.g. claude-sonnet-4-5, gpt-4o."
		   });
		addAnnotation
		  (getLlm_Temperature(),
		   source,
		   new String[] {
			   "documentation", "Sampling temperature. Unset means provider default."
		   });
		addAnnotation
		  (getLlm_MaxTokens(),
		   source,
		   new String[] {
			   "documentation", "Maximum output tokens. Unset means provider default."
		   });
		addAnnotation
		  (agentEClass,
		   source,
		   new String[] {
			   "documentation", "An agent: a persona bound to a model, equipped with tools, skills, and examples. The persona is the instructions (system prompt); everything else is capability wiring."
		   });
		addAnnotation
		  (getAgent_Instructions(),
		   source,
		   new String[] {
			   "documentation", "Persona / system prompt in Markdown: role, goals, constraints, tone."
		   });
		addAnnotation
		  (getAgent_Handoffs(),
		   source,
		   new String[] {
			   "documentation", "Agents this agent may hand work off to (delegation / A2A-style handoff)."
		   });
		addAnnotation
		  (taskEClass,
		   source,
		   new String[] {
			   "documentation", "A unit of work: what needs to be done, what the result should look like, who performs it, and what it depends on."
		   });
		addAnnotation
		  (getTask_ExpectedOutput(),
		   source,
		   new String[] {
			   "documentation", "Markdown description of the expected output; the acceptance criteria of the task."
		   });
		addAnnotation
		  (getTask_Performer(),
		   source,
		   new String[] {
			   "documentation", "The agent responsible for performing this task."
		   });
		addAnnotation
		  (getTask_DependsOn(),
		   source,
		   new String[] {
			   "documentation", "Tasks whose outputs this task consumes; defines execution ordering."
		   });
		addAnnotation
		  (jsonTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "JSON Schema primitive types for tool and task parameters."
		   });
		addAnnotation
		  (parameterEClass,
		   source,
		   new String[] {
			   "documentation", "A typed parameter of a tool or task, aligned with JSON Schema so tool definitions can be exported to any function-calling API."
		   });
		addAnnotation
		  (getParameter_DefaultValue(),
		   source,
		   new String[] {
			   "documentation", "Default value as a string literal, if any."
		   });
		addAnnotation
		  (toolEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract base for tools: a typed capability an agent may invoke. Subclasses bind the declaration to an implementation."
		   });
		addAnnotation
		  (getTool_Returns(),
		   source,
		   new String[] {
			   "documentation", "Markdown description of what the tool returns."
		   });
		addAnnotation
		  (mcpToolEClass,
		   source,
		   new String[] {
			   "documentation", "A tool provided by an MCP (Model Context Protocol) server."
		   });
		addAnnotation
		  (getMcpTool_Server(),
		   source,
		   new String[] {
			   "documentation", "MCP server identifier or URI."
		   });
		addAnnotation
		  (getMcpTool_ToolName(),
		   source,
		   new String[] {
			   "documentation", "Tool name as published by the server, if different from the element name."
		   });
		addAnnotation
		  (javaToolEClass,
		   source,
		   new String[] {
			   "documentation", "A tool implemented in Java, for direct interpretation of the model on the JVM."
		   });
		addAnnotation
		  (getJavaTool_ImplementationClass(),
		   source,
		   new String[] {
			   "documentation", "Fully qualified name of the implementation class."
		   });
		addAnnotation
		  (agentToolEClass,
		   source,
		   new String[] {
			   "documentation", "An agent exposed as a tool: the caller treats delegation as a tool invocation."
		   });
		addAnnotation
		  (skillEClass,
		   source,
		   new String[] {
			   "documentation", "A skill: procedural knowledge an agent loads on demand, in the sense of Anthropic Agent Skills (SKILL.md), i.e. instructions plus supporting resources."
		   });
		addAnnotation
		  (getSkill_Instructions(),
		   source,
		   new String[] {
			   "documentation", "Skill body in Markdown: the how-to the agent follows when the skill is triggered."
		   });
		addAnnotation
		  (resourceEClass,
		   source,
		   new String[] {
			   "documentation", "A supporting artifact of a skill: a reference document, template, or script."
		   });
		addAnnotation
		  (getResource_Location(),
		   source,
		   new String[] {
			   "documentation", "Location of the resource, e.g. a relative path or URI."
		   });
		addAnnotation
		  (exampleEClass,
		   source,
		   new String[] {
			   "documentation", "A single input/output demonstration used for few-shot prompting."
		   });
		addAnnotation
		  (exampleSetEClass,
		   source,
		   new String[] {
			   "documentation", "A set of examples with a selection strategy: which examples are included in a prompt is a runtime retrieval decision, not a static list."
		   });
		addAnnotation
		  (selectionStrategyEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract policy for choosing examples from an example set at prompt-construction time."
		   });
		addAnnotation
		  (allExamplesEClass,
		   source,
		   new String[] {
			   "documentation", "Include all examples, optionally capped."
		   });
		addAnnotation
		  (getAllExamples_Limit(),
		   source,
		   new String[] {
			   "documentation", "Maximum number of examples to include; unset means no cap."
		   });
		addAnnotation
		  (similaritySelectionEClass,
		   source,
		   new String[] {
			   "documentation", "Select examples most similar to the current input, e.g. by embedding distance."
		   });
		addAnnotation
		  (getSimilaritySelection_EmbeddingModel(),
		   source,
		   new String[] {
			   "documentation", "Embedding model identifier used to compute similarity."
		   });
		addAnnotation
		  (getSimilaritySelection_TopK(),
		   source,
		   new String[] {
			   "documentation", "Number of nearest examples to include."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //AgentPackageImpl
