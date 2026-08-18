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
import org.nasdanika.models.agent.Llm;
import org.nasdanika.models.agent.Skill;
import org.nasdanika.models.agent.Tool;

import org.nasdanika.models.governance.ControlApplication;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Governed;
import org.nasdanika.models.governance.Risk;
import org.nasdanika.models.governance.Waiver;

import org.nasdanika.models.nxcore.impl.NamedPeriodImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.impl.AgentImpl#getControlApplications <em>Control Applications</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.AgentImpl#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.AgentImpl#getWaivers <em>Waivers</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.AgentImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.AgentImpl#getLlm <em>Llm</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.AgentImpl#getTools <em>Tools</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.AgentImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.AgentImpl#getHandoffs <em>Handoffs</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.AgentImpl#getExampleSets <em>Example Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentImpl extends NamedPeriodImpl implements Agent {
	/**
	 * The default value of the '{@link #getInstructions() <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTIONS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ControlApplication> getControlApplications() {
		return (EList<ControlApplication>)eDynamicGet(AgentPackage.AGENT__CONTROL_APPLICATIONS, GovernancePackage.Literals.GOVERNED__CONTROL_APPLICATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Risk> getRisks() {
		return (EList<Risk>)eDynamicGet(AgentPackage.AGENT__RISKS, GovernancePackage.Literals.GOVERNED__RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Waiver> getWaivers() {
		return (EList<Waiver>)eDynamicGet(AgentPackage.AGENT__WAIVERS, GovernancePackage.Literals.GOVERNED__WAIVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstructions() {
		return (String)eDynamicGet(AgentPackage.AGENT__INSTRUCTIONS, AgentPackage.Literals.AGENT__INSTRUCTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstructions(String newInstructions) {
		eDynamicSet(AgentPackage.AGENT__INSTRUCTIONS, AgentPackage.Literals.AGENT__INSTRUCTIONS, newInstructions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Llm getLlm() {
		return (Llm)eDynamicGet(AgentPackage.AGENT__LLM, AgentPackage.Literals.AGENT__LLM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Llm basicGetLlm() {
		return (Llm)eDynamicGet(AgentPackage.AGENT__LLM, AgentPackage.Literals.AGENT__LLM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLlm(Llm newLlm) {
		eDynamicSet(AgentPackage.AGENT__LLM, AgentPackage.Literals.AGENT__LLM, newLlm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Tool> getTools() {
		return (EList<Tool>)eDynamicGet(AgentPackage.AGENT__TOOLS, AgentPackage.Literals.AGENT__TOOLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Skill> getSkills() {
		return (EList<Skill>)eDynamicGet(AgentPackage.AGENT__SKILLS, AgentPackage.Literals.AGENT__SKILLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Agent> getHandoffs() {
		return (EList<Agent>)eDynamicGet(AgentPackage.AGENT__HANDOFFS, AgentPackage.Literals.AGENT__HANDOFFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ExampleSet> getExampleSets() {
		return (EList<ExampleSet>)eDynamicGet(AgentPackage.AGENT__EXAMPLE_SETS, AgentPackage.Literals.AGENT__EXAMPLE_SETS, true, true);
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
			case AgentPackage.AGENT__CONTROL_APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlApplications()).basicAdd(otherEnd, msgs);
			case AgentPackage.AGENT__RISKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRisks()).basicAdd(otherEnd, msgs);
			case AgentPackage.AGENT__WAIVERS:
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
			case AgentPackage.AGENT__CONTROL_APPLICATIONS:
				return ((InternalEList<?>)getControlApplications()).basicRemove(otherEnd, msgs);
			case AgentPackage.AGENT__RISKS:
				return ((InternalEList<?>)getRisks()).basicRemove(otherEnd, msgs);
			case AgentPackage.AGENT__WAIVERS:
				return ((InternalEList<?>)getWaivers()).basicRemove(otherEnd, msgs);
			case AgentPackage.AGENT__EXAMPLE_SETS:
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
			case AgentPackage.AGENT__CONTROL_APPLICATIONS:
				return getControlApplications();
			case AgentPackage.AGENT__RISKS:
				return getRisks();
			case AgentPackage.AGENT__WAIVERS:
				return getWaivers();
			case AgentPackage.AGENT__INSTRUCTIONS:
				return getInstructions();
			case AgentPackage.AGENT__LLM:
				if (resolve) return getLlm();
				return basicGetLlm();
			case AgentPackage.AGENT__TOOLS:
				return getTools();
			case AgentPackage.AGENT__SKILLS:
				return getSkills();
			case AgentPackage.AGENT__HANDOFFS:
				return getHandoffs();
			case AgentPackage.AGENT__EXAMPLE_SETS:
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
			case AgentPackage.AGENT__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				getControlApplications().addAll((Collection<? extends ControlApplication>)newValue);
				return;
			case AgentPackage.AGENT__RISKS:
				getRisks().clear();
				getRisks().addAll((Collection<? extends Risk>)newValue);
				return;
			case AgentPackage.AGENT__WAIVERS:
				getWaivers().clear();
				getWaivers().addAll((Collection<? extends Waiver>)newValue);
				return;
			case AgentPackage.AGENT__INSTRUCTIONS:
				setInstructions((String)newValue);
				return;
			case AgentPackage.AGENT__LLM:
				setLlm((Llm)newValue);
				return;
			case AgentPackage.AGENT__TOOLS:
				getTools().clear();
				getTools().addAll((Collection<? extends Tool>)newValue);
				return;
			case AgentPackage.AGENT__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends Skill>)newValue);
				return;
			case AgentPackage.AGENT__HANDOFFS:
				getHandoffs().clear();
				getHandoffs().addAll((Collection<? extends Agent>)newValue);
				return;
			case AgentPackage.AGENT__EXAMPLE_SETS:
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
			case AgentPackage.AGENT__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				return;
			case AgentPackage.AGENT__RISKS:
				getRisks().clear();
				return;
			case AgentPackage.AGENT__WAIVERS:
				getWaivers().clear();
				return;
			case AgentPackage.AGENT__INSTRUCTIONS:
				setInstructions(INSTRUCTIONS_EDEFAULT);
				return;
			case AgentPackage.AGENT__LLM:
				setLlm((Llm)null);
				return;
			case AgentPackage.AGENT__TOOLS:
				getTools().clear();
				return;
			case AgentPackage.AGENT__SKILLS:
				getSkills().clear();
				return;
			case AgentPackage.AGENT__HANDOFFS:
				getHandoffs().clear();
				return;
			case AgentPackage.AGENT__EXAMPLE_SETS:
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
			case AgentPackage.AGENT__CONTROL_APPLICATIONS:
				return !getControlApplications().isEmpty();
			case AgentPackage.AGENT__RISKS:
				return !getRisks().isEmpty();
			case AgentPackage.AGENT__WAIVERS:
				return !getWaivers().isEmpty();
			case AgentPackage.AGENT__INSTRUCTIONS:
				return INSTRUCTIONS_EDEFAULT == null ? getInstructions() != null : !INSTRUCTIONS_EDEFAULT.equals(getInstructions());
			case AgentPackage.AGENT__LLM:
				return basicGetLlm() != null;
			case AgentPackage.AGENT__TOOLS:
				return !getTools().isEmpty();
			case AgentPackage.AGENT__SKILLS:
				return !getSkills().isEmpty();
			case AgentPackage.AGENT__HANDOFFS:
				return !getHandoffs().isEmpty();
			case AgentPackage.AGENT__EXAMPLE_SETS:
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
				case AgentPackage.AGENT__CONTROL_APPLICATIONS: return GovernancePackage.GOVERNED__CONTROL_APPLICATIONS;
				case AgentPackage.AGENT__RISKS: return GovernancePackage.GOVERNED__RISKS;
				case AgentPackage.AGENT__WAIVERS: return GovernancePackage.GOVERNED__WAIVERS;
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
				case GovernancePackage.GOVERNED__CONTROL_APPLICATIONS: return AgentPackage.AGENT__CONTROL_APPLICATIONS;
				case GovernancePackage.GOVERNED__RISKS: return AgentPackage.AGENT__RISKS;
				case GovernancePackage.GOVERNED__WAIVERS: return AgentPackage.AGENT__WAIVERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AgentImpl
