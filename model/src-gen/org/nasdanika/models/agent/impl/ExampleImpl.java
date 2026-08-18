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

import org.nasdanika.models.governance.ControlApplication;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Governed;
import org.nasdanika.models.governance.Risk;
import org.nasdanika.models.governance.Waiver;

import org.nasdanika.models.nxcore.impl.NamedPeriodImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.impl.ExampleImpl#getControlApplications <em>Control Applications</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.ExampleImpl#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.ExampleImpl#getWaivers <em>Waivers</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.ExampleImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.ExampleImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleImpl extends NamedPeriodImpl implements Example {
	/**
	 * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.EXAMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ControlApplication> getControlApplications() {
		return (EList<ControlApplication>)eDynamicGet(AgentPackage.EXAMPLE__CONTROL_APPLICATIONS, GovernancePackage.Literals.GOVERNED__CONTROL_APPLICATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Risk> getRisks() {
		return (EList<Risk>)eDynamicGet(AgentPackage.EXAMPLE__RISKS, GovernancePackage.Literals.GOVERNED__RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Waiver> getWaivers() {
		return (EList<Waiver>)eDynamicGet(AgentPackage.EXAMPLE__WAIVERS, GovernancePackage.Literals.GOVERNED__WAIVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInput() {
		return (String)eDynamicGet(AgentPackage.EXAMPLE__INPUT, AgentPackage.Literals.EXAMPLE__INPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInput(String newInput) {
		eDynamicSet(AgentPackage.EXAMPLE__INPUT, AgentPackage.Literals.EXAMPLE__INPUT, newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutput() {
		return (String)eDynamicGet(AgentPackage.EXAMPLE__OUTPUT, AgentPackage.Literals.EXAMPLE__OUTPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutput(String newOutput) {
		eDynamicSet(AgentPackage.EXAMPLE__OUTPUT, AgentPackage.Literals.EXAMPLE__OUTPUT, newOutput);
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
			case AgentPackage.EXAMPLE__CONTROL_APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlApplications()).basicAdd(otherEnd, msgs);
			case AgentPackage.EXAMPLE__RISKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRisks()).basicAdd(otherEnd, msgs);
			case AgentPackage.EXAMPLE__WAIVERS:
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
			case AgentPackage.EXAMPLE__CONTROL_APPLICATIONS:
				return ((InternalEList<?>)getControlApplications()).basicRemove(otherEnd, msgs);
			case AgentPackage.EXAMPLE__RISKS:
				return ((InternalEList<?>)getRisks()).basicRemove(otherEnd, msgs);
			case AgentPackage.EXAMPLE__WAIVERS:
				return ((InternalEList<?>)getWaivers()).basicRemove(otherEnd, msgs);
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
			case AgentPackage.EXAMPLE__CONTROL_APPLICATIONS:
				return getControlApplications();
			case AgentPackage.EXAMPLE__RISKS:
				return getRisks();
			case AgentPackage.EXAMPLE__WAIVERS:
				return getWaivers();
			case AgentPackage.EXAMPLE__INPUT:
				return getInput();
			case AgentPackage.EXAMPLE__OUTPUT:
				return getOutput();
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
			case AgentPackage.EXAMPLE__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				getControlApplications().addAll((Collection<? extends ControlApplication>)newValue);
				return;
			case AgentPackage.EXAMPLE__RISKS:
				getRisks().clear();
				getRisks().addAll((Collection<? extends Risk>)newValue);
				return;
			case AgentPackage.EXAMPLE__WAIVERS:
				getWaivers().clear();
				getWaivers().addAll((Collection<? extends Waiver>)newValue);
				return;
			case AgentPackage.EXAMPLE__INPUT:
				setInput((String)newValue);
				return;
			case AgentPackage.EXAMPLE__OUTPUT:
				setOutput((String)newValue);
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
			case AgentPackage.EXAMPLE__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				return;
			case AgentPackage.EXAMPLE__RISKS:
				getRisks().clear();
				return;
			case AgentPackage.EXAMPLE__WAIVERS:
				getWaivers().clear();
				return;
			case AgentPackage.EXAMPLE__INPUT:
				setInput(INPUT_EDEFAULT);
				return;
			case AgentPackage.EXAMPLE__OUTPUT:
				setOutput(OUTPUT_EDEFAULT);
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
			case AgentPackage.EXAMPLE__CONTROL_APPLICATIONS:
				return !getControlApplications().isEmpty();
			case AgentPackage.EXAMPLE__RISKS:
				return !getRisks().isEmpty();
			case AgentPackage.EXAMPLE__WAIVERS:
				return !getWaivers().isEmpty();
			case AgentPackage.EXAMPLE__INPUT:
				return INPUT_EDEFAULT == null ? getInput() != null : !INPUT_EDEFAULT.equals(getInput());
			case AgentPackage.EXAMPLE__OUTPUT:
				return OUTPUT_EDEFAULT == null ? getOutput() != null : !OUTPUT_EDEFAULT.equals(getOutput());
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
				case AgentPackage.EXAMPLE__CONTROL_APPLICATIONS: return GovernancePackage.GOVERNED__CONTROL_APPLICATIONS;
				case AgentPackage.EXAMPLE__RISKS: return GovernancePackage.GOVERNED__RISKS;
				case AgentPackage.EXAMPLE__WAIVERS: return GovernancePackage.GOVERNED__WAIVERS;
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
				case GovernancePackage.GOVERNED__CONTROL_APPLICATIONS: return AgentPackage.EXAMPLE__CONTROL_APPLICATIONS;
				case GovernancePackage.GOVERNED__RISKS: return AgentPackage.EXAMPLE__RISKS;
				case GovernancePackage.GOVERNED__WAIVERS: return AgentPackage.EXAMPLE__WAIVERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ExampleImpl
