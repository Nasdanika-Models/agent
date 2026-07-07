/**
 */
package org.nasdanika.models.agent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single input/output demonstration used for few-shot prompting.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.Example#getInput <em>Input</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Example#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.agent.AgentPackage#getExample()
 * @model
 * @generated
 */
public interface Example extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see org.nasdanika.models.agent.AgentPackage#getExample_Input()
	 * @model unique="false"
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.Example#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(String)
	 * @see org.nasdanika.models.agent.AgentPackage#getExample_Output()
	 * @model unique="false"
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.Example#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(String value);

} // Example
