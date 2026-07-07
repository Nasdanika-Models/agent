/**
 */
package org.nasdanika.models.agent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Similarity Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Select examples most similar to the current input, e.g. by embedding distance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.SimilaritySelection#getEmbeddingModel <em>Embedding Model</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.SimilaritySelection#getTopK <em>Top K</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.agent.AgentPackage#getSimilaritySelection()
 * @model
 * @generated
 */
public interface SimilaritySelection extends SelectionStrategy {
	/**
	 * Returns the value of the '<em><b>Embedding Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Embedding model identifier used to compute similarity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Embedding Model</em>' attribute.
	 * @see #setEmbeddingModel(String)
	 * @see org.nasdanika.models.agent.AgentPackage#getSimilaritySelection_EmbeddingModel()
	 * @model unique="false"
	 * @generated
	 */
	String getEmbeddingModel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.SimilaritySelection#getEmbeddingModel <em>Embedding Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedding Model</em>' attribute.
	 * @see #getEmbeddingModel()
	 * @generated
	 */
	void setEmbeddingModel(String value);

	/**
	 * Returns the value of the '<em><b>Top K</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of nearest examples to include.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top K</em>' attribute.
	 * @see #setTopK(int)
	 * @see org.nasdanika.models.agent.AgentPackage#getSimilaritySelection_TopK()
	 * @model unique="false"
	 * @generated
	 */
	int getTopK();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.SimilaritySelection#getTopK <em>Top K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top K</em>' attribute.
	 * @see #getTopK()
	 * @generated
	 */
	void setTopK(int value);

} // SimilaritySelection
