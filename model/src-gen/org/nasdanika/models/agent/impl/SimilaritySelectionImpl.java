/**
 */
package org.nasdanika.models.agent.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.agent.AgentPackage;
import org.nasdanika.models.agent.SimilaritySelection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Similarity Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.impl.SimilaritySelectionImpl#getEmbeddingModel <em>Embedding Model</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.SimilaritySelectionImpl#getTopK <em>Top K</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimilaritySelectionImpl extends SelectionStrategyImpl implements SimilaritySelection {
	/**
	 * The default value of the '{@link #getEmbeddingModel() <em>Embedding Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddingModel()
	 * @generated
	 * @ordered
	 */
	protected static final String EMBEDDING_MODEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTopK() <em>Top K</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopK()
	 * @generated
	 * @ordered
	 */
	protected static final int TOP_K_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimilaritySelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.SIMILARITY_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmbeddingModel() {
		return (String)eDynamicGet(AgentPackage.SIMILARITY_SELECTION__EMBEDDING_MODEL, AgentPackage.Literals.SIMILARITY_SELECTION__EMBEDDING_MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmbeddingModel(String newEmbeddingModel) {
		eDynamicSet(AgentPackage.SIMILARITY_SELECTION__EMBEDDING_MODEL, AgentPackage.Literals.SIMILARITY_SELECTION__EMBEDDING_MODEL, newEmbeddingModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTopK() {
		return (Integer)eDynamicGet(AgentPackage.SIMILARITY_SELECTION__TOP_K, AgentPackage.Literals.SIMILARITY_SELECTION__TOP_K, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopK(int newTopK) {
		eDynamicSet(AgentPackage.SIMILARITY_SELECTION__TOP_K, AgentPackage.Literals.SIMILARITY_SELECTION__TOP_K, newTopK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgentPackage.SIMILARITY_SELECTION__EMBEDDING_MODEL:
				return getEmbeddingModel();
			case AgentPackage.SIMILARITY_SELECTION__TOP_K:
				return getTopK();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgentPackage.SIMILARITY_SELECTION__EMBEDDING_MODEL:
				setEmbeddingModel((String)newValue);
				return;
			case AgentPackage.SIMILARITY_SELECTION__TOP_K:
				setTopK((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AgentPackage.SIMILARITY_SELECTION__EMBEDDING_MODEL:
				setEmbeddingModel(EMBEDDING_MODEL_EDEFAULT);
				return;
			case AgentPackage.SIMILARITY_SELECTION__TOP_K:
				setTopK(TOP_K_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AgentPackage.SIMILARITY_SELECTION__EMBEDDING_MODEL:
				return EMBEDDING_MODEL_EDEFAULT == null ? getEmbeddingModel() != null : !EMBEDDING_MODEL_EDEFAULT.equals(getEmbeddingModel());
			case AgentPackage.SIMILARITY_SELECTION__TOP_K:
				return getTopK() != TOP_K_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SimilaritySelectionImpl
