/**
 */
package org.nasdanika.models.agent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>All Examples</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Include all examples, optionally capped.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.AllExamples#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.agent.AgentPackage#getAllExamples()
 * @model
 * @generated
 */
public interface AllExamples extends SelectionStrategy {
	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of examples to include; unset means no cap.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(Integer)
	 * @see org.nasdanika.models.agent.AgentPackage#getAllExamples_Limit()
	 * @model unique="false"
	 * @generated
	 */
	Integer getLimit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.AllExamples#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(Integer value);

} // AllExamples
