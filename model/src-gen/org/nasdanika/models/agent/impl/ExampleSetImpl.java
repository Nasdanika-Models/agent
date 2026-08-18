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

import org.nasdanika.models.governance.ControlApplication;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Governed;
import org.nasdanika.models.governance.Risk;
import org.nasdanika.models.governance.Waiver;

import org.nasdanika.models.nxcore.impl.NamedPeriodImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.impl.ExampleSetImpl#getControlApplications <em>Control Applications</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.ExampleSetImpl#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.ExampleSetImpl#getWaivers <em>Waivers</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.ExampleSetImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.ExampleSetImpl#getSelectionStrategy <em>Selection Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleSetImpl extends NamedPeriodImpl implements ExampleSet {
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
	public EList<ControlApplication> getControlApplications() {
		return (EList<ControlApplication>)eDynamicGet(AgentPackage.EXAMPLE_SET__CONTROL_APPLICATIONS, GovernancePackage.Literals.GOVERNED__CONTROL_APPLICATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Risk> getRisks() {
		return (EList<Risk>)eDynamicGet(AgentPackage.EXAMPLE_SET__RISKS, GovernancePackage.Literals.GOVERNED__RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Waiver> getWaivers() {
		return (EList<Waiver>)eDynamicGet(AgentPackage.EXAMPLE_SET__WAIVERS, GovernancePackage.Literals.GOVERNED__WAIVERS, true, true);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgentPackage.EXAMPLE_SET__CONTROL_APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlApplications()).basicAdd(otherEnd, msgs);
			case AgentPackage.EXAMPLE_SET__RISKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRisks()).basicAdd(otherEnd, msgs);
			case AgentPackage.EXAMPLE_SET__WAIVERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWaivers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgentPackage.EXAMPLE_SET__CONTROL_APPLICATIONS:
				return ((InternalEList<?>)getControlApplications()).basicRemove(otherEnd, msgs);
			case AgentPackage.EXAMPLE_SET__RISKS:
				return ((InternalEList<?>)getRisks()).basicRemove(otherEnd, msgs);
			case AgentPackage.EXAMPLE_SET__WAIVERS:
				return ((InternalEList<?>)getWaivers()).basicRemove(otherEnd, msgs);
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
			case AgentPackage.EXAMPLE_SET__CONTROL_APPLICATIONS:
				return getControlApplications();
			case AgentPackage.EXAMPLE_SET__RISKS:
				return getRisks();
			case AgentPackage.EXAMPLE_SET__WAIVERS:
				return getWaivers();
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
			case AgentPackage.EXAMPLE_SET__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				getControlApplications().addAll((Collection<? extends ControlApplication>)newValue);
				return;
			case AgentPackage.EXAMPLE_SET__RISKS:
				getRisks().clear();
				getRisks().addAll((Collection<? extends Risk>)newValue);
				return;
			case AgentPackage.EXAMPLE_SET__WAIVERS:
				getWaivers().clear();
				getWaivers().addAll((Collection<? extends Waiver>)newValue);
				return;
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
			case AgentPackage.EXAMPLE_SET__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				return;
			case AgentPackage.EXAMPLE_SET__RISKS:
				getRisks().clear();
				return;
			case AgentPackage.EXAMPLE_SET__WAIVERS:
				getWaivers().clear();
				return;
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
			case AgentPackage.EXAMPLE_SET__CONTROL_APPLICATIONS:
				return !getControlApplications().isEmpty();
			case AgentPackage.EXAMPLE_SET__RISKS:
				return !getRisks().isEmpty();
			case AgentPackage.EXAMPLE_SET__WAIVERS:
				return !getWaivers().isEmpty();
			case AgentPackage.EXAMPLE_SET__EXAMPLES:
				return !getExamples().isEmpty();
			case AgentPackage.EXAMPLE_SET__SELECTION_STRATEGY:
				return getSelectionStrategy() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Governed.class) {
			switch (derivedFeatureID) {
				case AgentPackage.EXAMPLE_SET__CONTROL_APPLICATIONS: return GovernancePackage.GOVERNED__CONTROL_APPLICATIONS;
				case AgentPackage.EXAMPLE_SET__RISKS: return GovernancePackage.GOVERNED__RISKS;
				case AgentPackage.EXAMPLE_SET__WAIVERS: return GovernancePackage.GOVERNED__WAIVERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Governed.class) {
			switch (baseFeatureID) {
				case GovernancePackage.GOVERNED__CONTROL_APPLICATIONS: return AgentPackage.EXAMPLE_SET__CONTROL_APPLICATIONS;
				case GovernancePackage.GOVERNED__RISKS: return AgentPackage.EXAMPLE_SET__RISKS;
				case GovernancePackage.GOVERNED__WAIVERS: return AgentPackage.EXAMPLE_SET__WAIVERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ExampleSetImpl
