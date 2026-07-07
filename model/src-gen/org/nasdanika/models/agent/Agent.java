/**
 */
package org.nasdanika.models.agent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An agent: a persona bound to a model, equipped with tools, skills, and examples. The persona is the instructions (system prompt); everything else is capability wiring.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.Agent#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Agent#getLlm <em>Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Agent#getTools <em>Tools</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Agent#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Agent#getHandoffs <em>Handoffs</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Agent#getExampleSets <em>Example Sets</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.agent.AgentPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Persona / system prompt in Markdown: role, goals, constraints, tone.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instructions</em>' attribute.
	 * @see #setInstructions(String)
	 * @see org.nasdanika.models.agent.AgentPackage#getAgent_Instructions()
	 * @model unique="false"
	 * @generated
	 */
	String getInstructions();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.Agent#getInstructions <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructions</em>' attribute.
	 * @see #getInstructions()
	 * @generated
	 */
	void setInstructions(String value);

	/**
	 * Returns the value of the '<em><b>Llm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Llm</em>' reference.
	 * @see #setLlm(Llm)
	 * @see org.nasdanika.models.agent.AgentPackage#getAgent_Llm()
	 * @model
	 * @generated
	 */
	Llm getLlm();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.Agent#getLlm <em>Llm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Llm</em>' reference.
	 * @see #getLlm()
	 * @generated
	 */
	void setLlm(Llm value);

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.Tool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getAgent_Tools()
	 * @model
	 * @generated
	 */
	EList<Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.Skill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getAgent_Skills()
	 * @model
	 * @generated
	 */
	EList<Skill> getSkills();

	/**
	 * Returns the value of the '<em><b>Handoffs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Agents this agent may hand work off to (delegation / A2A-style handoff).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handoffs</em>' reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getAgent_Handoffs()
	 * @model
	 * @generated
	 */
	EList<Agent> getHandoffs();

	/**
	 * Returns the value of the '<em><b>Example Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.ExampleSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Sets</em>' containment reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getAgent_ExampleSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExampleSet> getExampleSets();

} // Agent
