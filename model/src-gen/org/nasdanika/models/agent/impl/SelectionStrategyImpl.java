/**
 */
package org.nasdanika.models.agent.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.agent.AgentPackage;
import org.nasdanika.models.agent.SelectionStrategy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SelectionStrategyImpl extends MinimalEObjectImpl.Container implements SelectionStrategy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.SELECTION_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

} //SelectionStrategyImpl
