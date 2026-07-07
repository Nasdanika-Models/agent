/**
 */
package org.nasdanika.models.agent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A unit of work: what needs to be done, what the result should look like, who performs it, and what it depends on.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.Task#getExpectedOutput <em>Expected Output</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Task#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Task#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Task#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Task#getExampleSets <em>Example Sets</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.agent.AgentPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Expected Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Markdown description of the expected output; the acceptance criteria of the task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Output</em>' attribute.
	 * @see #setExpectedOutput(String)
	 * @see org.nasdanika.models.agent.AgentPackage#getTask_ExpectedOutput()
	 * @model unique="false"
	 * @generated
	 */
	String getExpectedOutput();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.Task#getExpectedOutput <em>Expected Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Output</em>' attribute.
	 * @see #getExpectedOutput()
	 * @generated
	 */
	void setExpectedOutput(String value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The agent responsible for performing this task.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performer</em>' reference.
	 * @see #setPerformer(Agent)
	 * @see org.nasdanika.models.agent.AgentPackage#getTask_Performer()
	 * @model
	 * @generated
	 */
	Agent getPerformer();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.Task#getPerformer <em>Performer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Agent value);

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tasks whose outputs this task consumes; defines execution ordering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Depends On</em>' reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getTask_DependsOn()
	 * @model
	 * @generated
	 */
	EList<Task> getDependsOn();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getTask_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getInputs();

	/**
	 * Returns the value of the '<em><b>Example Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.ExampleSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Sets</em>' containment reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getTask_ExampleSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExampleSet> getExampleSets();

} // Task
