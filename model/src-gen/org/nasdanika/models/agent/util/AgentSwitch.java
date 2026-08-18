/**
 */
package org.nasdanika.models.agent.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.agent.*;

import org.nasdanika.models.governance.Governed;

import org.nasdanika.models.nxcore.Documented;
import org.nasdanika.models.nxcore.Marked;
import org.nasdanika.models.nxcore.ModelElement;
import org.nasdanika.models.nxcore.NamedElement;
import org.nasdanika.models.nxcore.NamedPeriod;
import org.nasdanika.models.nxcore.Period;
import org.nasdanika.models.nxcore.Referrable;
import org.nasdanika.models.nxcore.StringIdentity;

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
 * @see org.nasdanika.models.agent.AgentPackage
 * @generated
 */
public class AgentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AgentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentSwitch() {
		if (modelPackage == null) {
			modelPackage = AgentPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AgentPackage.AGENT_SYSTEM: {
				AgentSystem agentSystem = (AgentSystem)theEObject;
				T result = caseAgentSystem(agentSystem);
				if (result == null) result = caseNamedPeriod(agentSystem);
				if (result == null) result = caseGoverned(agentSystem);
				if (result == null) result = caseNamedElement(agentSystem);
				if (result == null) result = casePeriod(agentSystem);
				if (result == null) result = caseModelElement(agentSystem);
				if (result == null) result = caseStringIdentity(agentSystem);
				if (result == null) result = caseDocumented(agentSystem);
				if (result == null) result = caseMarked(agentSystem);
				if (result == null) result = caseReferrable(agentSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.LLM: {
				Llm llm = (Llm)theEObject;
				T result = caseLlm(llm);
				if (result == null) result = caseNamedPeriod(llm);
				if (result == null) result = caseGoverned(llm);
				if (result == null) result = caseNamedElement(llm);
				if (result == null) result = casePeriod(llm);
				if (result == null) result = caseModelElement(llm);
				if (result == null) result = caseStringIdentity(llm);
				if (result == null) result = caseDocumented(llm);
				if (result == null) result = caseMarked(llm);
				if (result == null) result = caseReferrable(llm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.AGENT: {
				Agent agent = (Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = caseNamedPeriod(agent);
				if (result == null) result = caseGoverned(agent);
				if (result == null) result = caseNamedElement(agent);
				if (result == null) result = casePeriod(agent);
				if (result == null) result = caseModelElement(agent);
				if (result == null) result = caseStringIdentity(agent);
				if (result == null) result = caseDocumented(agent);
				if (result == null) result = caseMarked(agent);
				if (result == null) result = caseReferrable(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseNamedPeriod(task);
				if (result == null) result = caseGoverned(task);
				if (result == null) result = caseNamedElement(task);
				if (result == null) result = casePeriod(task);
				if (result == null) result = caseModelElement(task);
				if (result == null) result = caseStringIdentity(task);
				if (result == null) result = caseDocumented(task);
				if (result == null) result = caseMarked(task);
				if (result == null) result = caseReferrable(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseNamedPeriod(parameter);
				if (result == null) result = caseGoverned(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = casePeriod(parameter);
				if (result == null) result = caseModelElement(parameter);
				if (result == null) result = caseStringIdentity(parameter);
				if (result == null) result = caseDocumented(parameter);
				if (result == null) result = caseMarked(parameter);
				if (result == null) result = caseReferrable(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = caseNamedPeriod(tool);
				if (result == null) result = caseGoverned(tool);
				if (result == null) result = caseNamedElement(tool);
				if (result == null) result = casePeriod(tool);
				if (result == null) result = caseModelElement(tool);
				if (result == null) result = caseStringIdentity(tool);
				if (result == null) result = caseDocumented(tool);
				if (result == null) result = caseMarked(tool);
				if (result == null) result = caseReferrable(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.MCP_TOOL: {
				McpTool mcpTool = (McpTool)theEObject;
				T result = caseMcpTool(mcpTool);
				if (result == null) result = caseTool(mcpTool);
				if (result == null) result = caseNamedPeriod(mcpTool);
				if (result == null) result = caseGoverned(mcpTool);
				if (result == null) result = caseNamedElement(mcpTool);
				if (result == null) result = casePeriod(mcpTool);
				if (result == null) result = caseModelElement(mcpTool);
				if (result == null) result = caseStringIdentity(mcpTool);
				if (result == null) result = caseDocumented(mcpTool);
				if (result == null) result = caseMarked(mcpTool);
				if (result == null) result = caseReferrable(mcpTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.JAVA_TOOL: {
				JavaTool javaTool = (JavaTool)theEObject;
				T result = caseJavaTool(javaTool);
				if (result == null) result = caseTool(javaTool);
				if (result == null) result = caseNamedPeriod(javaTool);
				if (result == null) result = caseGoverned(javaTool);
				if (result == null) result = caseNamedElement(javaTool);
				if (result == null) result = casePeriod(javaTool);
				if (result == null) result = caseModelElement(javaTool);
				if (result == null) result = caseStringIdentity(javaTool);
				if (result == null) result = caseDocumented(javaTool);
				if (result == null) result = caseMarked(javaTool);
				if (result == null) result = caseReferrable(javaTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.AGENT_TOOL: {
				AgentTool agentTool = (AgentTool)theEObject;
				T result = caseAgentTool(agentTool);
				if (result == null) result = caseTool(agentTool);
				if (result == null) result = caseNamedPeriod(agentTool);
				if (result == null) result = caseGoverned(agentTool);
				if (result == null) result = caseNamedElement(agentTool);
				if (result == null) result = casePeriod(agentTool);
				if (result == null) result = caseModelElement(agentTool);
				if (result == null) result = caseStringIdentity(agentTool);
				if (result == null) result = caseDocumented(agentTool);
				if (result == null) result = caseMarked(agentTool);
				if (result == null) result = caseReferrable(agentTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.SKILL: {
				Skill skill = (Skill)theEObject;
				T result = caseSkill(skill);
				if (result == null) result = caseNamedPeriod(skill);
				if (result == null) result = caseGoverned(skill);
				if (result == null) result = caseNamedElement(skill);
				if (result == null) result = casePeriod(skill);
				if (result == null) result = caseModelElement(skill);
				if (result == null) result = caseStringIdentity(skill);
				if (result == null) result = caseDocumented(skill);
				if (result == null) result = caseMarked(skill);
				if (result == null) result = caseReferrable(skill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseNamedPeriod(resource);
				if (result == null) result = caseGoverned(resource);
				if (result == null) result = caseNamedElement(resource);
				if (result == null) result = casePeriod(resource);
				if (result == null) result = caseModelElement(resource);
				if (result == null) result = caseStringIdentity(resource);
				if (result == null) result = caseDocumented(resource);
				if (result == null) result = caseMarked(resource);
				if (result == null) result = caseReferrable(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.EXAMPLE: {
				Example example = (Example)theEObject;
				T result = caseExample(example);
				if (result == null) result = caseNamedPeriod(example);
				if (result == null) result = caseGoverned(example);
				if (result == null) result = caseNamedElement(example);
				if (result == null) result = casePeriod(example);
				if (result == null) result = caseModelElement(example);
				if (result == null) result = caseStringIdentity(example);
				if (result == null) result = caseDocumented(example);
				if (result == null) result = caseMarked(example);
				if (result == null) result = caseReferrable(example);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.EXAMPLE_SET: {
				ExampleSet exampleSet = (ExampleSet)theEObject;
				T result = caseExampleSet(exampleSet);
				if (result == null) result = caseNamedPeriod(exampleSet);
				if (result == null) result = caseGoverned(exampleSet);
				if (result == null) result = caseNamedElement(exampleSet);
				if (result == null) result = casePeriod(exampleSet);
				if (result == null) result = caseModelElement(exampleSet);
				if (result == null) result = caseStringIdentity(exampleSet);
				if (result == null) result = caseDocumented(exampleSet);
				if (result == null) result = caseMarked(exampleSet);
				if (result == null) result = caseReferrable(exampleSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.SELECTION_STRATEGY: {
				SelectionStrategy selectionStrategy = (SelectionStrategy)theEObject;
				T result = caseSelectionStrategy(selectionStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.ALL_EXAMPLES: {
				AllExamples allExamples = (AllExamples)theEObject;
				T result = caseAllExamples(allExamples);
				if (result == null) result = caseSelectionStrategy(allExamples);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AgentPackage.SIMILARITY_SELECTION: {
				SimilaritySelection similaritySelection = (SimilaritySelection)theEObject;
				T result = caseSimilaritySelection(similaritySelection);
				if (result == null) result = caseSelectionStrategy(similaritySelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentSystem(AgentSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Llm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Llm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLlm(Llm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mcp Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mcp Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMcpTool(McpTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaTool(JavaTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgentTool(AgentTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkill(Skill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExample(Example object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleSet(ExampleSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionStrategy(SelectionStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Examples</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Examples</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllExamples(AllExamples object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Similarity Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Similarity Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimilaritySelection(SimilaritySelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referrable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferrable(Referrable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Identity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIdentity(StringIdentity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumented(Documented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marked</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarked(Marked object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriod(Period object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedPeriod(NamedPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Governed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Governed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoverned(Governed object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //AgentSwitch
