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
import org.nasdanika.models.agent.AgentSystem;
import org.nasdanika.models.agent.Llm;
import org.nasdanika.models.agent.Skill;
import org.nasdanika.models.agent.Task;
import org.nasdanika.models.agent.Tool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.impl.AgentSystemImpl#getModels <em>Models</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.AgentSystemImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.AgentSystemImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.AgentSystemImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.AgentSystemImpl#getSkills <em>Skills</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentSystemImpl extends NamedElementImpl implements AgentSystem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.AGENT_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Llm> getModels() {
		return (EList<Llm>)eDynamicGet(AgentPackage.AGENT_SYSTEM__MODELS, AgentPackage.Literals.AGENT_SYSTEM__MODELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Agent> getAgents() {
		return (EList<Agent>)eDynamicGet(AgentPackage.AGENT_SYSTEM__AGENTS, AgentPackage.Literals.AGENT_SYSTEM__AGENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Task> getTasks() {
		return (EList<Task>)eDynamicGet(AgentPackage.AGENT_SYSTEM__TASKS, AgentPackage.Literals.AGENT_SYSTEM__TASKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Tool> getTools() {
		return (EList<Tool>)eDynamicGet(AgentPackage.AGENT_SYSTEM__TOOLS, AgentPackage.Literals.AGENT_SYSTEM__TOOLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Skill> getSkills() {
		return (EList<Skill>)eDynamicGet(AgentPackage.AGENT_SYSTEM__SKILLS, AgentPackage.Literals.AGENT_SYSTEM__SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AgentPackage.AGENT_SYSTEM__MODELS:
				return ((InternalEList<?>)getModels()).basicRemove(otherEnd, msgs);
			case AgentPackage.AGENT_SYSTEM__AGENTS:
				return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
			case AgentPackage.AGENT_SYSTEM__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case AgentPackage.AGENT_SYSTEM__TOOLS:
				return ((InternalEList<?>)getTools()).basicRemove(otherEnd, msgs);
			case AgentPackage.AGENT_SYSTEM__SKILLS:
				return ((InternalEList<?>)getSkills()).basicRemove(otherEnd, msgs);
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
			case AgentPackage.AGENT_SYSTEM__MODELS:
				return getModels();
			case AgentPackage.AGENT_SYSTEM__AGENTS:
				return getAgents();
			case AgentPackage.AGENT_SYSTEM__TASKS:
				return getTasks();
			case AgentPackage.AGENT_SYSTEM__TOOLS:
				return getTools();
			case AgentPackage.AGENT_SYSTEM__SKILLS:
				return getSkills();
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
			case AgentPackage.AGENT_SYSTEM__MODELS:
				getModels().clear();
				getModels().addAll((Collection<? extends Llm>)newValue);
				return;
			case AgentPackage.AGENT_SYSTEM__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends Agent>)newValue);
				return;
			case AgentPackage.AGENT_SYSTEM__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case AgentPackage.AGENT_SYSTEM__TOOLS:
				getTools().clear();
				getTools().addAll((Collection<? extends Tool>)newValue);
				return;
			case AgentPackage.AGENT_SYSTEM__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends Skill>)newValue);
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
			case AgentPackage.AGENT_SYSTEM__MODELS:
				getModels().clear();
				return;
			case AgentPackage.AGENT_SYSTEM__AGENTS:
				getAgents().clear();
				return;
			case AgentPackage.AGENT_SYSTEM__TASKS:
				getTasks().clear();
				return;
			case AgentPackage.AGENT_SYSTEM__TOOLS:
				getTools().clear();
				return;
			case AgentPackage.AGENT_SYSTEM__SKILLS:
				getSkills().clear();
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
			case AgentPackage.AGENT_SYSTEM__MODELS:
				return !getModels().isEmpty();
			case AgentPackage.AGENT_SYSTEM__AGENTS:
				return !getAgents().isEmpty();
			case AgentPackage.AGENT_SYSTEM__TASKS:
				return !getTasks().isEmpty();
			case AgentPackage.AGENT_SYSTEM__TOOLS:
				return !getTools().isEmpty();
			case AgentPackage.AGENT_SYSTEM__SKILLS:
				return !getSkills().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AgentSystemImpl
