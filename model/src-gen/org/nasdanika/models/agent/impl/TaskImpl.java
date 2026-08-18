/**
 */
package org.nasdanika.models.agent.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.agent.Agent;
import org.nasdanika.models.agent.AgentPackage;
import org.nasdanika.models.agent.ExampleSet;
import org.nasdanika.models.agent.Parameter;
import org.nasdanika.models.agent.Task;

import org.nasdanika.models.governance.ControlApplication;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Governed;
import org.nasdanika.models.governance.Risk;
import org.nasdanika.models.governance.Waiver;

import org.nasdanika.models.nxcore.impl.NamedPeriodImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.impl.TaskImpl#getControlApplications <em>Control Applications</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.TaskImpl#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.TaskImpl#getWaivers <em>Waivers</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.TaskImpl#getExpectedOutput <em>Expected Output</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.TaskImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.TaskImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.TaskImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.TaskImpl#getExampleSets <em>Example Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends NamedPeriodImpl implements Task {
	/**
	 * The default value of the '{@link #getExpectedOutput() <em>Expected Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTED_OUTPUT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ControlApplication> getControlApplications() {
		return (EList<ControlApplication>)eDynamicGet(AgentPackage.TASK__CONTROL_APPLICATIONS, GovernancePackage.Literals.GOVERNED__CONTROL_APPLICATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Risk> getRisks() {
		return (EList<Risk>)eDynamicGet(AgentPackage.TASK__RISKS, GovernancePackage.Literals.GOVERNED__RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Waiver> getWaivers() {
		return (EList<Waiver>)eDynamicGet(AgentPackage.TASK__WAIVERS, GovernancePackage.Literals.GOVERNED__WAIVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpectedOutput() {
		return (String)eDynamicGet(AgentPackage.TASK__EXPECTED_OUTPUT, AgentPackage.Literals.TASK__EXPECTED_OUTPUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedOutput(String newExpectedOutput) {
		eDynamicSet(AgentPackage.TASK__EXPECTED_OUTPUT, AgentPackage.Literals.TASK__EXPECTED_OUTPUT, newExpectedOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent getPerformer() {
		return (Agent)eDynamicGet(AgentPackage.TASK__PERFORMER, AgentPackage.Literals.TASK__PERFORMER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetPerformer() {
		return (Agent)eDynamicGet(AgentPackage.TASK__PERFORMER, AgentPackage.Literals.TASK__PERFORMER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformer(Agent newPerformer) {
		eDynamicSet(AgentPackage.TASK__PERFORMER, AgentPackage.Literals.TASK__PERFORMER, newPerformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Task> getDependsOn() {
		return (EList<Task>)eDynamicGet(AgentPackage.TASK__DEPENDS_ON, AgentPackage.Literals.TASK__DEPENDS_ON, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Parameter> getInputs() {
		return (EList<Parameter>)eDynamicGet(AgentPackage.TASK__INPUTS, AgentPackage.Literals.TASK__INPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ExampleSet> getExampleSets() {
		return (EList<ExampleSet>)eDynamicGet(AgentPackage.TASK__EXAMPLE_SETS, AgentPackage.Literals.TASK__EXAMPLE_SETS, true, true);
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
			case AgentPackage.TASK__CONTROL_APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlApplications()).basicAdd(otherEnd, msgs);
			case AgentPackage.TASK__RISKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRisks()).basicAdd(otherEnd, msgs);
			case AgentPackage.TASK__WAIVERS:
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
			case AgentPackage.TASK__CONTROL_APPLICATIONS:
				return ((InternalEList<?>)getControlApplications()).basicRemove(otherEnd, msgs);
			case AgentPackage.TASK__RISKS:
				return ((InternalEList<?>)getRisks()).basicRemove(otherEnd, msgs);
			case AgentPackage.TASK__WAIVERS:
				return ((InternalEList<?>)getWaivers()).basicRemove(otherEnd, msgs);
			case AgentPackage.TASK__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case AgentPackage.TASK__EXAMPLE_SETS:
				return ((InternalEList<?>)getExampleSets()).basicRemove(otherEnd, msgs);
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
			case AgentPackage.TASK__CONTROL_APPLICATIONS:
				return getControlApplications();
			case AgentPackage.TASK__RISKS:
				return getRisks();
			case AgentPackage.TASK__WAIVERS:
				return getWaivers();
			case AgentPackage.TASK__EXPECTED_OUTPUT:
				return getExpectedOutput();
			case AgentPackage.TASK__PERFORMER:
				if (resolve) return getPerformer();
				return basicGetPerformer();
			case AgentPackage.TASK__DEPENDS_ON:
				return getDependsOn();
			case AgentPackage.TASK__INPUTS:
				return getInputs();
			case AgentPackage.TASK__EXAMPLE_SETS:
				return getExampleSets();
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
			case AgentPackage.TASK__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				getControlApplications().addAll((Collection<? extends ControlApplication>)newValue);
				return;
			case AgentPackage.TASK__RISKS:
				getRisks().clear();
				getRisks().addAll((Collection<? extends Risk>)newValue);
				return;
			case AgentPackage.TASK__WAIVERS:
				getWaivers().clear();
				getWaivers().addAll((Collection<? extends Waiver>)newValue);
				return;
			case AgentPackage.TASK__EXPECTED_OUTPUT:
				setExpectedOutput((String)newValue);
				return;
			case AgentPackage.TASK__PERFORMER:
				setPerformer((Agent)newValue);
				return;
			case AgentPackage.TASK__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends Task>)newValue);
				return;
			case AgentPackage.TASK__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Parameter>)newValue);
				return;
			case AgentPackage.TASK__EXAMPLE_SETS:
				getExampleSets().clear();
				getExampleSets().addAll((Collection<? extends ExampleSet>)newValue);
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
			case AgentPackage.TASK__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				return;
			case AgentPackage.TASK__RISKS:
				getRisks().clear();
				return;
			case AgentPackage.TASK__WAIVERS:
				getWaivers().clear();
				return;
			case AgentPackage.TASK__EXPECTED_OUTPUT:
				setExpectedOutput(EXPECTED_OUTPUT_EDEFAULT);
				return;
			case AgentPackage.TASK__PERFORMER:
				setPerformer((Agent)null);
				return;
			case AgentPackage.TASK__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case AgentPackage.TASK__INPUTS:
				getInputs().clear();
				return;
			case AgentPackage.TASK__EXAMPLE_SETS:
				getExampleSets().clear();
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
			case AgentPackage.TASK__CONTROL_APPLICATIONS:
				return !getControlApplications().isEmpty();
			case AgentPackage.TASK__RISKS:
				return !getRisks().isEmpty();
			case AgentPackage.TASK__WAIVERS:
				return !getWaivers().isEmpty();
			case AgentPackage.TASK__EXPECTED_OUTPUT:
				return EXPECTED_OUTPUT_EDEFAULT == null ? getExpectedOutput() != null : !EXPECTED_OUTPUT_EDEFAULT.equals(getExpectedOutput());
			case AgentPackage.TASK__PERFORMER:
				return basicGetPerformer() != null;
			case AgentPackage.TASK__DEPENDS_ON:
				return !getDependsOn().isEmpty();
			case AgentPackage.TASK__INPUTS:
				return !getInputs().isEmpty();
			case AgentPackage.TASK__EXAMPLE_SETS:
				return !getExampleSets().isEmpty();
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
				case AgentPackage.TASK__CONTROL_APPLICATIONS: return GovernancePackage.GOVERNED__CONTROL_APPLICATIONS;
				case AgentPackage.TASK__RISKS: return GovernancePackage.GOVERNED__RISKS;
				case AgentPackage.TASK__WAIVERS: return GovernancePackage.GOVERNED__WAIVERS;
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
				case GovernancePackage.GOVERNED__CONTROL_APPLICATIONS: return AgentPackage.TASK__CONTROL_APPLICATIONS;
				case GovernancePackage.GOVERNED__RISKS: return AgentPackage.TASK__RISKS;
				case GovernancePackage.GOVERNED__WAIVERS: return AgentPackage.TASK__WAIVERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TaskImpl
