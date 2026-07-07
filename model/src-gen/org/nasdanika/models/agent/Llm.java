/**
 */
package org.nasdanika.models.agent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Llm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A language model an agent runs on: provider, model identifier, and inference settings. Deployment specifics (endpoints, credentials) belong in a separate deployment model referencing this one.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.Llm#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Llm#getModel <em>Model</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Llm#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Llm#getMaxTokens <em>Max Tokens</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Llm#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.agent.AgentPackage#getLlm()
 * @model
 * @generated
 */
public interface Llm extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provider, e.g. anthropic, openai, azure, bedrock, ollama.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see org.nasdanika.models.agent.AgentPackage#getLlm_Provider()
	 * @model unique="false"
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.Llm#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Model identifier, e.g. claude-sonnet-4-5, gpt-4o.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.nasdanika.models.agent.AgentPackage#getLlm_Model()
	 * @model unique="false"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.Llm#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sampling temperature. Unset means provider default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(Double)
	 * @see org.nasdanika.models.agent.AgentPackage#getLlm_Temperature()
	 * @model unique="false"
	 * @generated
	 */
	Double getTemperature();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.Llm#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(Double value);

	/**
	 * Returns the value of the '<em><b>Max Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum output tokens. Unset means provider default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Tokens</em>' attribute.
	 * @see #setMaxTokens(Integer)
	 * @see org.nasdanika.models.agent.AgentPackage#getLlm_MaxTokens()
	 * @model unique="false"
	 * @generated
	 */
	Integer getMaxTokens();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.Llm#getMaxTokens <em>Max Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Tokens</em>' attribute.
	 * @see #getMaxTokens()
	 * @generated
	 */
	void setMaxTokens(Integer value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getLlm_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // Llm
