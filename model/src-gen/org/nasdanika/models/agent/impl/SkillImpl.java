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
import org.nasdanika.models.agent.Resource;
import org.nasdanika.models.agent.Skill;

import org.nasdanika.models.governance.ControlApplication;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Governed;
import org.nasdanika.models.governance.Risk;
import org.nasdanika.models.governance.Waiver;

import org.nasdanika.models.nxcore.impl.NamedPeriodImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.impl.SkillImpl#getControlApplications <em>Control Applications</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.SkillImpl#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.SkillImpl#getWaivers <em>Waivers</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.SkillImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.SkillImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillImpl extends NamedPeriodImpl implements Skill {
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
	protected SkillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.SKILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ControlApplication> getControlApplications() {
		return (EList<ControlApplication>)eDynamicGet(AgentPackage.SKILL__CONTROL_APPLICATIONS, GovernancePackage.Literals.GOVERNED__CONTROL_APPLICATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Risk> getRisks() {
		return (EList<Risk>)eDynamicGet(AgentPackage.SKILL__RISKS, GovernancePackage.Literals.GOVERNED__RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Waiver> getWaivers() {
		return (EList<Waiver>)eDynamicGet(AgentPackage.SKILL__WAIVERS, GovernancePackage.Literals.GOVERNED__WAIVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstructions() {
		return (String)eDynamicGet(AgentPackage.SKILL__INSTRUCTIONS, AgentPackage.Literals.SKILL__INSTRUCTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstructions(String newInstructions) {
		eDynamicSet(AgentPackage.SKILL__INSTRUCTIONS, AgentPackage.Literals.SKILL__INSTRUCTIONS, newInstructions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Resource> getResources() {
		return (EList<Resource>)eDynamicGet(AgentPackage.SKILL__RESOURCES, AgentPackage.Literals.SKILL__RESOURCES, true, true);
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
			case AgentPackage.SKILL__CONTROL_APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlApplications()).basicAdd(otherEnd, msgs);
			case AgentPackage.SKILL__RISKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRisks()).basicAdd(otherEnd, msgs);
			case AgentPackage.SKILL__WAIVERS:
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
			case AgentPackage.SKILL__CONTROL_APPLICATIONS:
				return ((InternalEList<?>)getControlApplications()).basicRemove(otherEnd, msgs);
			case AgentPackage.SKILL__RISKS:
				return ((InternalEList<?>)getRisks()).basicRemove(otherEnd, msgs);
			case AgentPackage.SKILL__WAIVERS:
				return ((InternalEList<?>)getWaivers()).basicRemove(otherEnd, msgs);
			case AgentPackage.SKILL__RESOURCES:
				return ((InternalEList<?>)getResources()).basicRemove(otherEnd, msgs);
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
			case AgentPackage.SKILL__CONTROL_APPLICATIONS:
				return getControlApplications();
			case AgentPackage.SKILL__RISKS:
				return getRisks();
			case AgentPackage.SKILL__WAIVERS:
				return getWaivers();
			case AgentPackage.SKILL__INSTRUCTIONS:
				return getInstructions();
			case AgentPackage.SKILL__RESOURCES:
				return getResources();
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
			case AgentPackage.SKILL__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				getControlApplications().addAll((Collection<? extends ControlApplication>)newValue);
				return;
			case AgentPackage.SKILL__RISKS:
				getRisks().clear();
				getRisks().addAll((Collection<? extends Risk>)newValue);
				return;
			case AgentPackage.SKILL__WAIVERS:
				getWaivers().clear();
				getWaivers().addAll((Collection<? extends Waiver>)newValue);
				return;
			case AgentPackage.SKILL__INSTRUCTIONS:
				setInstructions((String)newValue);
				return;
			case AgentPackage.SKILL__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends Resource>)newValue);
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
			case AgentPackage.SKILL__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				return;
			case AgentPackage.SKILL__RISKS:
				getRisks().clear();
				return;
			case AgentPackage.SKILL__WAIVERS:
				getWaivers().clear();
				return;
			case AgentPackage.SKILL__INSTRUCTIONS:
				setInstructions(INSTRUCTIONS_EDEFAULT);
				return;
			case AgentPackage.SKILL__RESOURCES:
				getResources().clear();
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
			case AgentPackage.SKILL__CONTROL_APPLICATIONS:
				return !getControlApplications().isEmpty();
			case AgentPackage.SKILL__RISKS:
				return !getRisks().isEmpty();
			case AgentPackage.SKILL__WAIVERS:
				return !getWaivers().isEmpty();
			case AgentPackage.SKILL__INSTRUCTIONS:
				return INSTRUCTIONS_EDEFAULT == null ? getInstructions() != null : !INSTRUCTIONS_EDEFAULT.equals(getInstructions());
			case AgentPackage.SKILL__RESOURCES:
				return !getResources().isEmpty();
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
				case AgentPackage.SKILL__CONTROL_APPLICATIONS: return GovernancePackage.GOVERNED__CONTROL_APPLICATIONS;
				case AgentPackage.SKILL__RISKS: return GovernancePackage.GOVERNED__RISKS;
				case AgentPackage.SKILL__WAIVERS: return GovernancePackage.GOVERNED__WAIVERS;
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
				case GovernancePackage.GOVERNED__CONTROL_APPLICATIONS: return AgentPackage.SKILL__CONTROL_APPLICATIONS;
				case GovernancePackage.GOVERNED__RISKS: return AgentPackage.SKILL__RISKS;
				case GovernancePackage.GOVERNED__WAIVERS: return AgentPackage.SKILL__WAIVERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SkillImpl
