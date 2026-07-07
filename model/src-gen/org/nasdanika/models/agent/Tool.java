/**
 */
package org.nasdanika.models.agent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base for tools: a typed capability an agent may invoke. Subclasses bind the declaration to an implementation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.Tool#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Tool#getReturns <em>Returns</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.agent.AgentPackage#getTool()
 * @model abstract="true"
 * @generated
 */
public interface Tool extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getTool_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Returns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Markdown description of what the tool returns.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Returns</em>' attribute.
	 * @see #setReturns(String)
	 * @see org.nasdanika.models.agent.AgentPackage#getTool_Returns()
	 * @model unique="false"
	 * @generated
	 */
	String getReturns();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.Tool#getReturns <em>Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returns</em>' attribute.
	 * @see #getReturns()
	 * @generated
	 */
	void setReturns(String value);

} // Tool
