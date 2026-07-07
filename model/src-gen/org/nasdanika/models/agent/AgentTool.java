/**
 */
package org.nasdanika.models.agent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An agent exposed as a tool: the caller treats delegation as a tool invocation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.AgentTool#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.agent.AgentPackage#getAgentTool()
 * @model
 * @generated
 */
public interface AgentTool extends Tool {
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference.
	 * @see #setAgent(Agent)
	 * @see org.nasdanika.models.agent.AgentPackage#getAgentTool_Agent()
	 * @model
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.AgentTool#getAgent <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

} // AgentTool
