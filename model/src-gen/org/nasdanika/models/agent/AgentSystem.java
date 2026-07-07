/**
 */
package org.nasdanika.models.agent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root container: a system of agents, the models they run on, the tasks they perform, and the tools and skills they use.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.AgentSystem#getModels <em>Models</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.AgentSystem#getAgents <em>Agents</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.AgentSystem#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.AgentSystem#getTools <em>Tools</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.AgentSystem#getSkills <em>Skills</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.agent.AgentPackage#getAgentSystem()
 * @model
 * @generated
 */
public interface AgentSystem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.Llm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getAgentSystem_Models()
	 * @model containment="true"
	 * @generated
	 */
	EList<Llm> getModels();

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.Agent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' containment reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getAgentSystem_Agents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Agent> getAgents();

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getAgentSystem_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.Tool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getAgentSystem_Tools()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tool> getTools();

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.Skill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' containment reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getAgentSystem_Skills()
	 * @model containment="true"
	 * @generated
	 */
	EList<Skill> getSkills();

} // AgentSystem
