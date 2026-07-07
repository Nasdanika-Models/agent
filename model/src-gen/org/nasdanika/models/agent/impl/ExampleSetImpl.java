/**
 */
package org.nasdanika.models.agent.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.agent.AgentPackage;
import org.nasdanika.models.agent.Example;
import org.nasdanika.models.agent.ExampleSet;
import org.nasdanika.models.agent.SelectionStrategy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.impl.ExampleSetImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.ExampleSetImpl#getSelectionStrategy <em>Selection Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleSetImpl extends NamedElementImpl implements ExampleSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.EXAMPLE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Example> getExamples() {
		return (EList<Example>)eDynamicGet(AgentPackage.EXAMPLE_SET__EXAMPLES, AgentPackage.Literals.EXAMPLE_SET__EXAMPLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelectionStrategy getSelectionStrategy() {
		return (SelectionStrategy)eDynamicGet(AgentPackage.EXAMPLE_SET__SELECTION_STRATEGY, AgentPackage.Literals.EXAMPLE_SET__SELECTION_STRATEGY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectionStrategy(SelectionStrategy newSelectionStrategy, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSelectionStrategy, AgentPackage.EXAMPLE_SET__SELECTION_STRATEGY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectionStrategy(SelectionStrategy newSelectionStrategy) {
		eDynamicSet(AgentPackage.EXAMPLE_SET__SELECTION_STRATEGY, AgentPackage.Literals.EXAMPLE_SET__SELECTION_STRATEGY, newSelectionStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgentPackage.EXAMPLE_SET__EXAMPLES:
				return ((InternalEList<?>)getExamples()).basicRemove(otherEnd, msgs);
			case AgentPackage.EXAMPLE_SET__SELECTION_STRATEGY:
				return basicSetSelectionStrategy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgentPackage.EXAMPLE_SET__EXAMPLES:
				return getExamples();
			case AgentPackage.EXAMPLE_SET__SELECTION_STRATEGY:
				return getSelectionStrategy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgentPackage.EXAMPLE_SET__EXAMPLES:
				getExamples().clear();
				getExamples().addAll((Collection<? extends Example>)newValue);
				return;
			case AgentPackage.EXAMPLE_SET__SELECTION_STRATEGY:
				setSelectionStrategy((SelectionStrategy)newValue);
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
			case AgentPackage.EXAMPLE_SET__EXAMPLES:
				getExamples().clear();
				return;
			case AgentPackage.EXAMPLE_SET__SELECTION_STRATEGY:
				setSelectionStrategy((SelectionStrategy)null);
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
			case AgentPackage.EXAMPLE_SET__EXAMPLES:
				return !getExamples().isEmpty();
			case AgentPackage.EXAMPLE_SET__SELECTION_STRATEGY:
				return getSelectionStrategy() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExampleSetImpl
