/**
 */
package org.nasdanika.models.agent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.nxcore.NxcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.agent.AgentFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' bundleManifest='false' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface AgentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "agent";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://agent.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.agent";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AgentPackage eINSTANCE = org.nasdanika.models.agent.impl.AgentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.AgentSystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.AgentSystemImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getAgentSystem()
	 * @generated
	 */
	int AGENT_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__ID = NxcorePackage.NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__DOCUMENTATION = NxcorePackage.NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__DOC_REF = NxcorePackage.NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__DOC_FORMAT = NxcorePackage.NAMED_PERIOD__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__DOC_CONTENTS = NxcorePackage.NAMED_PERIOD__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__DOC_SECTIONS = NxcorePackage.NAMED_PERIOD__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__MARKERS = NxcorePackage.NAMED_PERIOD__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__ICON = NxcorePackage.NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__URIS = NxcorePackage.NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__NAME = NxcorePackage.NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__DURATION = NxcorePackage.NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__START = NxcorePackage.NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__END = NxcorePackage.NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__CONTROL_APPLICATIONS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__RISKS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__WAIVERS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__MODELS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__AGENTS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__TASKS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__TOOLS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM__SKILLS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM_FEATURE_COUNT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_SYSTEM_OPERATION_COUNT = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.PropertyImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.LlmImpl <em>Llm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.LlmImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getLlm()
	 * @generated
	 */
	int LLM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__ID = NxcorePackage.NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__DOCUMENTATION = NxcorePackage.NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__DOC_REF = NxcorePackage.NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__DOC_FORMAT = NxcorePackage.NAMED_PERIOD__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__DOC_CONTENTS = NxcorePackage.NAMED_PERIOD__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__DOC_SECTIONS = NxcorePackage.NAMED_PERIOD__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__MARKERS = NxcorePackage.NAMED_PERIOD__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__ICON = NxcorePackage.NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__URIS = NxcorePackage.NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__NAME = NxcorePackage.NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__DURATION = NxcorePackage.NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__START = NxcorePackage.NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__END = NxcorePackage.NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__CONTROL_APPLICATIONS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__RISKS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__WAIVERS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__PROVIDER = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__MODEL = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__TEMPERATURE = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__MAX_TOKENS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM__PROPERTIES = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Llm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM_FEATURE_COUNT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Llm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLM_OPERATION_COUNT = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.AgentImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ID = NxcorePackage.NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DOCUMENTATION = NxcorePackage.NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DOC_REF = NxcorePackage.NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DOC_FORMAT = NxcorePackage.NAMED_PERIOD__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DOC_CONTENTS = NxcorePackage.NAMED_PERIOD__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DOC_SECTIONS = NxcorePackage.NAMED_PERIOD__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__MARKERS = NxcorePackage.NAMED_PERIOD__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ICON = NxcorePackage.NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__URIS = NxcorePackage.NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = NxcorePackage.NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__DURATION = NxcorePackage.NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__START = NxcorePackage.NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__END = NxcorePackage.NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__CONTROL_APPLICATIONS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__RISKS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__WAIVERS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__INSTRUCTIONS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Llm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__LLM = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tools</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__TOOLS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__SKILLS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Handoffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__HANDOFFS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Example Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__EXAMPLE_SETS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.TaskImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = NxcorePackage.NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DOCUMENTATION = NxcorePackage.NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DOC_REF = NxcorePackage.NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DOC_FORMAT = NxcorePackage.NAMED_PERIOD__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DOC_CONTENTS = NxcorePackage.NAMED_PERIOD__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DOC_SECTIONS = NxcorePackage.NAMED_PERIOD__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MARKERS = NxcorePackage.NAMED_PERIOD__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ICON = NxcorePackage.NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__URIS = NxcorePackage.NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = NxcorePackage.NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DURATION = NxcorePackage.NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START = NxcorePackage.NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__END = NxcorePackage.NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CONTROL_APPLICATIONS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RISKS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__WAIVERS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expected Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXPECTED_OUTPUT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PERFORMER = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEPENDS_ON = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUTS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Example Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXAMPLE_SETS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.ParameterImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ID = NxcorePackage.NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOCUMENTATION = NxcorePackage.NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOC_REF = NxcorePackage.NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOC_FORMAT = NxcorePackage.NAMED_PERIOD__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOC_CONTENTS = NxcorePackage.NAMED_PERIOD__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOC_SECTIONS = NxcorePackage.NAMED_PERIOD__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MARKERS = NxcorePackage.NAMED_PERIOD__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ICON = NxcorePackage.NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__URIS = NxcorePackage.NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NxcorePackage.NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DURATION = NxcorePackage.NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__START = NxcorePackage.NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__END = NxcorePackage.NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CONTROL_APPLICATIONS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__RISKS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__WAIVERS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REQUIRED = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DEFAULT_VALUE = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.ToolImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ID = NxcorePackage.NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DOCUMENTATION = NxcorePackage.NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DOC_REF = NxcorePackage.NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DOC_FORMAT = NxcorePackage.NAMED_PERIOD__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DOC_CONTENTS = NxcorePackage.NAMED_PERIOD__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DOC_SECTIONS = NxcorePackage.NAMED_PERIOD__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__MARKERS = NxcorePackage.NAMED_PERIOD__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ICON = NxcorePackage.NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__URIS = NxcorePackage.NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NAME = NxcorePackage.NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DURATION = NxcorePackage.NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__START = NxcorePackage.NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__END = NxcorePackage.NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CONTROL_APPLICATIONS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__RISKS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__WAIVERS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__PARAMETERS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Returns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__RETURNS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_OPERATION_COUNT = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.McpToolImpl <em>Mcp Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.McpToolImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getMcpTool()
	 * @generated
	 */
	int MCP_TOOL = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__ID = TOOL__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__DOCUMENTATION = TOOL__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__DOC_REF = TOOL__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__DOC_FORMAT = TOOL__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__DOC_CONTENTS = TOOL__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__DOC_SECTIONS = TOOL__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__MARKERS = TOOL__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__ICON = TOOL__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__URIS = TOOL__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__NAME = TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__DURATION = TOOL__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__START = TOOL__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__END = TOOL__END;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__CONTROL_APPLICATIONS = TOOL__CONTROL_APPLICATIONS;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__RISKS = TOOL__RISKS;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__WAIVERS = TOOL__WAIVERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__PARAMETERS = TOOL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Returns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__RETURNS = TOOL__RETURNS;

	/**
	 * The feature id for the '<em><b>Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__SERVER = TOOL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tool Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL__TOOL_NAME = TOOL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mcp Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL_FEATURE_COUNT = TOOL_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL___COLLECT__OBJECT_EREFERENCE_ELIST = TOOL___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL___GET_REFERRERS__EREFERENCE = TOOL___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Mcp Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCP_TOOL_OPERATION_COUNT = TOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.JavaToolImpl <em>Java Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.JavaToolImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getJavaTool()
	 * @generated
	 */
	int JAVA_TOOL = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__ID = TOOL__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__DOCUMENTATION = TOOL__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__DOC_REF = TOOL__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__DOC_FORMAT = TOOL__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__DOC_CONTENTS = TOOL__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__DOC_SECTIONS = TOOL__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__MARKERS = TOOL__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__ICON = TOOL__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__URIS = TOOL__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__NAME = TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__DURATION = TOOL__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__START = TOOL__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__END = TOOL__END;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__CONTROL_APPLICATIONS = TOOL__CONTROL_APPLICATIONS;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__RISKS = TOOL__RISKS;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__WAIVERS = TOOL__WAIVERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__PARAMETERS = TOOL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Returns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__RETURNS = TOOL__RETURNS;

	/**
	 * The feature id for the '<em><b>Implementation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL__IMPLEMENTATION_CLASS = TOOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL_FEATURE_COUNT = TOOL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL___COLLECT__OBJECT_EREFERENCE_ELIST = TOOL___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL___GET_REFERRERS__EREFERENCE = TOOL___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Java Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_TOOL_OPERATION_COUNT = TOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.AgentToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.AgentToolImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getAgentTool()
	 * @generated
	 */
	int AGENT_TOOL = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__ID = TOOL__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__DOCUMENTATION = TOOL__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__DOC_REF = TOOL__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__DOC_FORMAT = TOOL__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__DOC_CONTENTS = TOOL__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__DOC_SECTIONS = TOOL__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__MARKERS = TOOL__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__ICON = TOOL__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__URIS = TOOL__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__NAME = TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__DURATION = TOOL__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__START = TOOL__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__END = TOOL__END;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__CONTROL_APPLICATIONS = TOOL__CONTROL_APPLICATIONS;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__RISKS = TOOL__RISKS;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__WAIVERS = TOOL__WAIVERS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__PARAMETERS = TOOL__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Returns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__RETURNS = TOOL__RETURNS;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL__AGENT = TOOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL_FEATURE_COUNT = TOOL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL___COLLECT__OBJECT_EREFERENCE_ELIST = TOOL___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL___GET_REFERRERS__EREFERENCE = TOOL___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_TOOL_OPERATION_COUNT = TOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.SkillImpl <em>Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.SkillImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getSkill()
	 * @generated
	 */
	int SKILL = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__ID = NxcorePackage.NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__DOCUMENTATION = NxcorePackage.NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__DOC_REF = NxcorePackage.NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__DOC_FORMAT = NxcorePackage.NAMED_PERIOD__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__DOC_CONTENTS = NxcorePackage.NAMED_PERIOD__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__DOC_SECTIONS = NxcorePackage.NAMED_PERIOD__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__MARKERS = NxcorePackage.NAMED_PERIOD__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__ICON = NxcorePackage.NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__URIS = NxcorePackage.NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__NAME = NxcorePackage.NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__DURATION = NxcorePackage.NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__START = NxcorePackage.NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__END = NxcorePackage.NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__CONTROL_APPLICATIONS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__RISKS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__WAIVERS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__INSTRUCTIONS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__RESOURCES = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_FEATURE_COUNT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_OPERATION_COUNT = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.ResourceImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ID = NxcorePackage.NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DOCUMENTATION = NxcorePackage.NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DOC_REF = NxcorePackage.NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DOC_FORMAT = NxcorePackage.NAMED_PERIOD__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DOC_CONTENTS = NxcorePackage.NAMED_PERIOD__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DOC_SECTIONS = NxcorePackage.NAMED_PERIOD__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__MARKERS = NxcorePackage.NAMED_PERIOD__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__ICON = NxcorePackage.NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__URIS = NxcorePackage.NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = NxcorePackage.NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DURATION = NxcorePackage.NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__START = NxcorePackage.NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__END = NxcorePackage.NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTROL_APPLICATIONS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RISKS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__WAIVERS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LOCATION = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.ExampleImpl <em>Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.ExampleImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getExample()
	 * @generated
	 */
	int EXAMPLE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__ID = NxcorePackage.NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__DOCUMENTATION = NxcorePackage.NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__DOC_REF = NxcorePackage.NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__DOC_FORMAT = NxcorePackage.NAMED_PERIOD__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__DOC_CONTENTS = NxcorePackage.NAMED_PERIOD__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__DOC_SECTIONS = NxcorePackage.NAMED_PERIOD__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__MARKERS = NxcorePackage.NAMED_PERIOD__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__ICON = NxcorePackage.NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__URIS = NxcorePackage.NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__NAME = NxcorePackage.NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__DURATION = NxcorePackage.NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__START = NxcorePackage.NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__END = NxcorePackage.NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__CONTROL_APPLICATIONS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__RISKS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__WAIVERS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__INPUT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__OUTPUT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_FEATURE_COUNT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_OPERATION_COUNT = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.ExampleSetImpl <em>Example Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.ExampleSetImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getExampleSet()
	 * @generated
	 */
	int EXAMPLE_SET = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__ID = NxcorePackage.NAMED_PERIOD__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__DOCUMENTATION = NxcorePackage.NAMED_PERIOD__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__DOC_REF = NxcorePackage.NAMED_PERIOD__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__DOC_FORMAT = NxcorePackage.NAMED_PERIOD__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__DOC_CONTENTS = NxcorePackage.NAMED_PERIOD__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__DOC_SECTIONS = NxcorePackage.NAMED_PERIOD__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__MARKERS = NxcorePackage.NAMED_PERIOD__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__ICON = NxcorePackage.NAMED_PERIOD__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__URIS = NxcorePackage.NAMED_PERIOD__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__NAME = NxcorePackage.NAMED_PERIOD__NAME;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__DURATION = NxcorePackage.NAMED_PERIOD__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__START = NxcorePackage.NAMED_PERIOD__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__END = NxcorePackage.NAMED_PERIOD__END;

	/**
	 * The feature id for the '<em><b>Control Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__CONTROL_APPLICATIONS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Risks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__RISKS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waivers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__WAIVERS = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__EXAMPLES = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Selection Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET__SELECTION_STRATEGY = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Example Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET_FEATURE_COUNT = NxcorePackage.NAMED_PERIOD_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET___COLLECT__OBJECT_EREFERENCE_ELIST = NxcorePackage.NAMED_PERIOD___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET___GET_REFERRERS__EREFERENCE = NxcorePackage.NAMED_PERIOD___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Example Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_SET_OPERATION_COUNT = NxcorePackage.NAMED_PERIOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.SelectionStrategyImpl <em>Selection Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.SelectionStrategyImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getSelectionStrategy()
	 * @generated
	 */
	int SELECTION_STRATEGY = 14;

	/**
	 * The number of structural features of the '<em>Selection Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Selection Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_STRATEGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.AllExamplesImpl <em>All Examples</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.AllExamplesImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getAllExamples()
	 * @generated
	 */
	int ALL_EXAMPLES = 15;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_EXAMPLES__LIMIT = SELECTION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>All Examples</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_EXAMPLES_FEATURE_COUNT = SELECTION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>All Examples</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_EXAMPLES_OPERATION_COUNT = SELECTION_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.impl.SimilaritySelectionImpl <em>Similarity Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.impl.SimilaritySelectionImpl
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getSimilaritySelection()
	 * @generated
	 */
	int SIMILARITY_SELECTION = 16;

	/**
	 * The feature id for the '<em><b>Embedding Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMILARITY_SELECTION__EMBEDDING_MODEL = SELECTION_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Top K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMILARITY_SELECTION__TOP_K = SELECTION_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Similarity Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMILARITY_SELECTION_FEATURE_COUNT = SELECTION_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Similarity Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMILARITY_SELECTION_OPERATION_COUNT = SELECTION_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.agent.JsonType <em>Json Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.agent.JsonType
	 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getJsonType()
	 * @generated
	 */
	int JSON_TYPE = 17;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.AgentSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see org.nasdanika.models.agent.AgentSystem
	 * @generated
	 */
	EClass getAgentSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.agent.AgentSystem#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see org.nasdanika.models.agent.AgentSystem#getModels()
	 * @see #getAgentSystem()
	 * @generated
	 */
	EReference getAgentSystem_Models();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.agent.AgentSystem#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see org.nasdanika.models.agent.AgentSystem#getAgents()
	 * @see #getAgentSystem()
	 * @generated
	 */
	EReference getAgentSystem_Agents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.agent.AgentSystem#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.nasdanika.models.agent.AgentSystem#getTasks()
	 * @see #getAgentSystem()
	 * @generated
	 */
	EReference getAgentSystem_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.agent.AgentSystem#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tools</em>'.
	 * @see org.nasdanika.models.agent.AgentSystem#getTools()
	 * @see #getAgentSystem()
	 * @generated
	 */
	EReference getAgentSystem_Tools();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.agent.AgentSystem#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see org.nasdanika.models.agent.AgentSystem#getSkills()
	 * @see #getAgentSystem()
	 * @generated
	 */
	EReference getAgentSystem_Skills();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.nasdanika.models.agent.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.agent.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.nasdanika.models.agent.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.Llm <em>Llm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Llm</em>'.
	 * @see org.nasdanika.models.agent.Llm
	 * @generated
	 */
	EClass getLlm();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Llm#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.nasdanika.models.agent.Llm#getProvider()
	 * @see #getLlm()
	 * @generated
	 */
	EAttribute getLlm_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Llm#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see org.nasdanika.models.agent.Llm#getModel()
	 * @see #getLlm()
	 * @generated
	 */
	EAttribute getLlm_Model();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Llm#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see org.nasdanika.models.agent.Llm#getTemperature()
	 * @see #getLlm()
	 * @generated
	 */
	EAttribute getLlm_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Llm#getMaxTokens <em>Max Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Tokens</em>'.
	 * @see org.nasdanika.models.agent.Llm#getMaxTokens()
	 * @see #getLlm()
	 * @generated
	 */
	EAttribute getLlm_MaxTokens();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.agent.Llm#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.nasdanika.models.agent.Llm#getProperties()
	 * @see #getLlm()
	 * @generated
	 */
	EReference getLlm_Properties();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see org.nasdanika.models.agent.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Agent#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructions</em>'.
	 * @see org.nasdanika.models.agent.Agent#getInstructions()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Instructions();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.agent.Agent#getLlm <em>Llm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Llm</em>'.
	 * @see org.nasdanika.models.agent.Agent#getLlm()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Llm();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.agent.Agent#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tools</em>'.
	 * @see org.nasdanika.models.agent.Agent#getTools()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Tools();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.agent.Agent#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Skills</em>'.
	 * @see org.nasdanika.models.agent.Agent#getSkills()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Skills();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.agent.Agent#getHandoffs <em>Handoffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Handoffs</em>'.
	 * @see org.nasdanika.models.agent.Agent#getHandoffs()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Handoffs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.agent.Agent#getExampleSets <em>Example Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Example Sets</em>'.
	 * @see org.nasdanika.models.agent.Agent#getExampleSets()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_ExampleSets();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.nasdanika.models.agent.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Task#getExpectedOutput <em>Expected Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Output</em>'.
	 * @see org.nasdanika.models.agent.Task#getExpectedOutput()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_ExpectedOutput();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.agent.Task#getPerformer <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Performer</em>'.
	 * @see org.nasdanika.models.agent.Task#getPerformer()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Performer();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.agent.Task#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Depends On</em>'.
	 * @see org.nasdanika.models.agent.Task#getDependsOn()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_DependsOn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.agent.Task#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see org.nasdanika.models.agent.Task#getInputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.agent.Task#getExampleSets <em>Example Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Example Sets</em>'.
	 * @see org.nasdanika.models.agent.Task#getExampleSets()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ExampleSets();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.nasdanika.models.agent.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.agent.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Parameter#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.nasdanika.models.agent.Parameter#isRequired()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Parameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.nasdanika.models.agent.Parameter#getDefaultValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see org.nasdanika.models.agent.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.agent.Tool#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.nasdanika.models.agent.Tool#getParameters()
	 * @see #getTool()
	 * @generated
	 */
	EReference getTool_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Tool#getReturns <em>Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Returns</em>'.
	 * @see org.nasdanika.models.agent.Tool#getReturns()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Returns();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.McpTool <em>Mcp Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mcp Tool</em>'.
	 * @see org.nasdanika.models.agent.McpTool
	 * @generated
	 */
	EClass getMcpTool();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.McpTool#getServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server</em>'.
	 * @see org.nasdanika.models.agent.McpTool#getServer()
	 * @see #getMcpTool()
	 * @generated
	 */
	EAttribute getMcpTool_Server();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.McpTool#getToolName <em>Tool Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool Name</em>'.
	 * @see org.nasdanika.models.agent.McpTool#getToolName()
	 * @see #getMcpTool()
	 * @generated
	 */
	EAttribute getMcpTool_ToolName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.JavaTool <em>Java Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Tool</em>'.
	 * @see org.nasdanika.models.agent.JavaTool
	 * @generated
	 */
	EClass getJavaTool();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.JavaTool#getImplementationClass <em>Implementation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Class</em>'.
	 * @see org.nasdanika.models.agent.JavaTool#getImplementationClass()
	 * @see #getJavaTool()
	 * @generated
	 */
	EAttribute getJavaTool_ImplementationClass();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.AgentTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see org.nasdanika.models.agent.AgentTool
	 * @generated
	 */
	EClass getAgentTool();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.agent.AgentTool#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see org.nasdanika.models.agent.AgentTool#getAgent()
	 * @see #getAgentTool()
	 * @generated
	 */
	EReference getAgentTool_Agent();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.Skill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill</em>'.
	 * @see org.nasdanika.models.agent.Skill
	 * @generated
	 */
	EClass getSkill();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Skill#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructions</em>'.
	 * @see org.nasdanika.models.agent.Skill#getInstructions()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Instructions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.agent.Skill#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see org.nasdanika.models.agent.Skill#getResources()
	 * @see #getSkill()
	 * @generated
	 */
	EReference getSkill_Resources();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.nasdanika.models.agent.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Resource#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.models.agent.Resource#getLocation()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Location();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example</em>'.
	 * @see org.nasdanika.models.agent.Example
	 * @generated
	 */
	EClass getExample();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Example#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see org.nasdanika.models.agent.Example#getInput()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_Input();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.Example#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see org.nasdanika.models.agent.Example#getOutput()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_Output();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.ExampleSet <em>Example Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Set</em>'.
	 * @see org.nasdanika.models.agent.ExampleSet
	 * @generated
	 */
	EClass getExampleSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.agent.ExampleSet#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Examples</em>'.
	 * @see org.nasdanika.models.agent.ExampleSet#getExamples()
	 * @see #getExampleSet()
	 * @generated
	 */
	EReference getExampleSet_Examples();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.agent.ExampleSet#getSelectionStrategy <em>Selection Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selection Strategy</em>'.
	 * @see org.nasdanika.models.agent.ExampleSet#getSelectionStrategy()
	 * @see #getExampleSet()
	 * @generated
	 */
	EReference getExampleSet_SelectionStrategy();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.SelectionStrategy <em>Selection Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Strategy</em>'.
	 * @see org.nasdanika.models.agent.SelectionStrategy
	 * @generated
	 */
	EClass getSelectionStrategy();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.AllExamples <em>All Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Examples</em>'.
	 * @see org.nasdanika.models.agent.AllExamples
	 * @generated
	 */
	EClass getAllExamples();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.AllExamples#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see org.nasdanika.models.agent.AllExamples#getLimit()
	 * @see #getAllExamples()
	 * @generated
	 */
	EAttribute getAllExamples_Limit();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.agent.SimilaritySelection <em>Similarity Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Similarity Selection</em>'.
	 * @see org.nasdanika.models.agent.SimilaritySelection
	 * @generated
	 */
	EClass getSimilaritySelection();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.SimilaritySelection#getEmbeddingModel <em>Embedding Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embedding Model</em>'.
	 * @see org.nasdanika.models.agent.SimilaritySelection#getEmbeddingModel()
	 * @see #getSimilaritySelection()
	 * @generated
	 */
	EAttribute getSimilaritySelection_EmbeddingModel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.agent.SimilaritySelection#getTopK <em>Top K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top K</em>'.
	 * @see org.nasdanika.models.agent.SimilaritySelection#getTopK()
	 * @see #getSimilaritySelection()
	 * @generated
	 */
	EAttribute getSimilaritySelection_TopK();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.agent.JsonType <em>Json Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Json Type</em>'.
	 * @see org.nasdanika.models.agent.JsonType
	 * @generated
	 */
	EEnum getJsonType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AgentFactory getAgentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.AgentSystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.AgentSystemImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getAgentSystem()
		 * @generated
		 */
		EClass AGENT_SYSTEM = eINSTANCE.getAgentSystem();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_SYSTEM__MODELS = eINSTANCE.getAgentSystem_Models();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_SYSTEM__AGENTS = eINSTANCE.getAgentSystem_Agents();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_SYSTEM__TASKS = eINSTANCE.getAgentSystem_Tasks();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_SYSTEM__TOOLS = eINSTANCE.getAgentSystem_Tools();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_SYSTEM__SKILLS = eINSTANCE.getAgentSystem_Skills();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.PropertyImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.LlmImpl <em>Llm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.LlmImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getLlm()
		 * @generated
		 */
		EClass LLM = eINSTANCE.getLlm();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LLM__PROVIDER = eINSTANCE.getLlm_Provider();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LLM__MODEL = eINSTANCE.getLlm_Model();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LLM__TEMPERATURE = eINSTANCE.getLlm_Temperature();

		/**
		 * The meta object literal for the '<em><b>Max Tokens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LLM__MAX_TOKENS = eINSTANCE.getLlm_MaxTokens();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LLM__PROPERTIES = eINSTANCE.getLlm_Properties();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.AgentImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__INSTRUCTIONS = eINSTANCE.getAgent_Instructions();

		/**
		 * The meta object literal for the '<em><b>Llm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__LLM = eINSTANCE.getAgent_Llm();

		/**
		 * The meta object literal for the '<em><b>Tools</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__TOOLS = eINSTANCE.getAgent_Tools();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__SKILLS = eINSTANCE.getAgent_Skills();

		/**
		 * The meta object literal for the '<em><b>Handoffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__HANDOFFS = eINSTANCE.getAgent_Handoffs();

		/**
		 * The meta object literal for the '<em><b>Example Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__EXAMPLE_SETS = eINSTANCE.getAgent_ExampleSets();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.TaskImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Expected Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__EXPECTED_OUTPUT = eINSTANCE.getTask_ExpectedOutput();

		/**
		 * The meta object literal for the '<em><b>Performer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PERFORMER = eINSTANCE.getTask_Performer();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__DEPENDS_ON = eINSTANCE.getTask_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUTS = eINSTANCE.getTask_Inputs();

		/**
		 * The meta object literal for the '<em><b>Example Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__EXAMPLE_SETS = eINSTANCE.getTask_ExampleSets();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.ParameterImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__REQUIRED = eINSTANCE.getParameter_Required();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__DEFAULT_VALUE = eINSTANCE.getParameter_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.ToolImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL__PARAMETERS = eINSTANCE.getTool_Parameters();

		/**
		 * The meta object literal for the '<em><b>Returns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__RETURNS = eINSTANCE.getTool_Returns();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.McpToolImpl <em>Mcp Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.McpToolImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getMcpTool()
		 * @generated
		 */
		EClass MCP_TOOL = eINSTANCE.getMcpTool();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCP_TOOL__SERVER = eINSTANCE.getMcpTool_Server();

		/**
		 * The meta object literal for the '<em><b>Tool Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MCP_TOOL__TOOL_NAME = eINSTANCE.getMcpTool_ToolName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.JavaToolImpl <em>Java Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.JavaToolImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getJavaTool()
		 * @generated
		 */
		EClass JAVA_TOOL = eINSTANCE.getJavaTool();

		/**
		 * The meta object literal for the '<em><b>Implementation Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_TOOL__IMPLEMENTATION_CLASS = eINSTANCE.getJavaTool_ImplementationClass();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.AgentToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.AgentToolImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getAgentTool()
		 * @generated
		 */
		EClass AGENT_TOOL = eINSTANCE.getAgentTool();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT_TOOL__AGENT = eINSTANCE.getAgentTool_Agent();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.SkillImpl <em>Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.SkillImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getSkill()
		 * @generated
		 */
		EClass SKILL = eINSTANCE.getSkill();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__INSTRUCTIONS = eINSTANCE.getSkill_Instructions();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL__RESOURCES = eINSTANCE.getSkill_Resources();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.ResourceImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__LOCATION = eINSTANCE.getResource_Location();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.ExampleImpl <em>Example</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.ExampleImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getExample()
		 * @generated
		 */
		EClass EXAMPLE = eINSTANCE.getExample();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__INPUT = eINSTANCE.getExample_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__OUTPUT = eINSTANCE.getExample_Output();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.ExampleSetImpl <em>Example Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.ExampleSetImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getExampleSet()
		 * @generated
		 */
		EClass EXAMPLE_SET = eINSTANCE.getExampleSet();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_SET__EXAMPLES = eINSTANCE.getExampleSet_Examples();

		/**
		 * The meta object literal for the '<em><b>Selection Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_SET__SELECTION_STRATEGY = eINSTANCE.getExampleSet_SelectionStrategy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.SelectionStrategyImpl <em>Selection Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.SelectionStrategyImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getSelectionStrategy()
		 * @generated
		 */
		EClass SELECTION_STRATEGY = eINSTANCE.getSelectionStrategy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.AllExamplesImpl <em>All Examples</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.AllExamplesImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getAllExamples()
		 * @generated
		 */
		EClass ALL_EXAMPLES = eINSTANCE.getAllExamples();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALL_EXAMPLES__LIMIT = eINSTANCE.getAllExamples_Limit();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.impl.SimilaritySelectionImpl <em>Similarity Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.impl.SimilaritySelectionImpl
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getSimilaritySelection()
		 * @generated
		 */
		EClass SIMILARITY_SELECTION = eINSTANCE.getSimilaritySelection();

		/**
		 * The meta object literal for the '<em><b>Embedding Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMILARITY_SELECTION__EMBEDDING_MODEL = eINSTANCE.getSimilaritySelection_EmbeddingModel();

		/**
		 * The meta object literal for the '<em><b>Top K</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMILARITY_SELECTION__TOP_K = eINSTANCE.getSimilaritySelection_TopK();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.agent.JsonType <em>Json Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.agent.JsonType
		 * @see org.nasdanika.models.agent.impl.AgentPackageImpl#getJsonType()
		 * @generated
		 */
		EEnum JSON_TYPE = eINSTANCE.getJsonType();

	}

} //AgentPackage
