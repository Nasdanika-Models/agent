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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.impl.TaskImpl#getExpectedOutput <em>Expected Output</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.TaskImpl#getPerformer <em>Performer</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.TaskImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.TaskImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.TaskImpl#getExampleSets <em>Example Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends NamedElementImpl implements Task {
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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

} //TaskImpl
