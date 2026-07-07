/**
 */
package org.nasdanika.models.agent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of examples with a selection strategy: which examples are included in a prompt is a runtime retrieval decision, not a static list.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.ExampleSet#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.ExampleSet#getSelectionStrategy <em>Selection Strategy</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.agent.AgentPackage#getExampleSet()
 * @model
 * @generated
 */
public interface ExampleSet extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Examples</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.Example}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' containment reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getExampleSet_Examples()
	 * @model containment="true"
	 * @generated
	 */
	EList<Example> getExamples();

	/**
	 * Returns the value of the '<em><b>Selection Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Strategy</em>' containment reference.
	 * @see #setSelectionStrategy(SelectionStrategy)
	 * @see org.nasdanika.models.agent.AgentPackage#getExampleSet_SelectionStrategy()
	 * @model containment="true"
	 * @generated
	 */
	SelectionStrategy getSelectionStrategy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.ExampleSet#getSelectionStrategy <em>Selection Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Strategy</em>' containment reference.
	 * @see #getSelectionStrategy()
	 * @generated
	 */
	void setSelectionStrategy(SelectionStrategy value);

} // ExampleSet
