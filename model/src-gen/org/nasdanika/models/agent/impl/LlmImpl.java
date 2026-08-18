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
import org.nasdanika.models.agent.Llm;
import org.nasdanika.models.agent.Property;

import org.nasdanika.models.governance.ControlApplication;
import org.nasdanika.models.governance.GovernancePackage;
import org.nasdanika.models.governance.Governed;
import org.nasdanika.models.governance.Risk;
import org.nasdanika.models.governance.Waiver;

import org.nasdanika.models.nxcore.impl.NamedPeriodImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Llm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.impl.LlmImpl#getControlApplications <em>Control Applications</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.LlmImpl#getRisks <em>Risks</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.LlmImpl#getWaivers <em>Waivers</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.LlmImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.LlmImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.LlmImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.LlmImpl#getMaxTokens <em>Max Tokens</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.LlmImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LlmImpl extends NamedPeriodImpl implements Llm {
	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final Double TEMPERATURE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaxTokens() <em>Max Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTokens()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_TOKENS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LlmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.LLM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ControlApplication> getControlApplications() {
		return (EList<ControlApplication>)eDynamicGet(AgentPackage.LLM__CONTROL_APPLICATIONS, GovernancePackage.Literals.GOVERNED__CONTROL_APPLICATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Risk> getRisks() {
		return (EList<Risk>)eDynamicGet(AgentPackage.LLM__RISKS, GovernancePackage.Literals.GOVERNED__RISKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Waiver> getWaivers() {
		return (EList<Waiver>)eDynamicGet(AgentPackage.LLM__WAIVERS, GovernancePackage.Literals.GOVERNED__WAIVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProvider() {
		return (String)eDynamicGet(AgentPackage.LLM__PROVIDER, AgentPackage.Literals.LLM__PROVIDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvider(String newProvider) {
		eDynamicSet(AgentPackage.LLM__PROVIDER, AgentPackage.Literals.LLM__PROVIDER, newProvider);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModel() {
		return (String)eDynamicGet(AgentPackage.LLM__MODEL, AgentPackage.Literals.LLM__MODEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(String newModel) {
		eDynamicSet(AgentPackage.LLM__MODEL, AgentPackage.Literals.LLM__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getTemperature() {
		return (Double)eDynamicGet(AgentPackage.LLM__TEMPERATURE, AgentPackage.Literals.LLM__TEMPERATURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemperature(Double newTemperature) {
		eDynamicSet(AgentPackage.LLM__TEMPERATURE, AgentPackage.Literals.LLM__TEMPERATURE, newTemperature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxTokens() {
		return (Integer)eDynamicGet(AgentPackage.LLM__MAX_TOKENS, AgentPackage.Literals.LLM__MAX_TOKENS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxTokens(Integer newMaxTokens) {
		eDynamicSet(AgentPackage.LLM__MAX_TOKENS, AgentPackage.Literals.LLM__MAX_TOKENS, newMaxTokens);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Property> getProperties() {
		return (EList<Property>)eDynamicGet(AgentPackage.LLM__PROPERTIES, AgentPackage.Literals.LLM__PROPERTIES, true, true);
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
			case AgentPackage.LLM__CONTROL_APPLICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControlApplications()).basicAdd(otherEnd, msgs);
			case AgentPackage.LLM__RISKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRisks()).basicAdd(otherEnd, msgs);
			case AgentPackage.LLM__WAIVERS:
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
			case AgentPackage.LLM__CONTROL_APPLICATIONS:
				return ((InternalEList<?>)getControlApplications()).basicRemove(otherEnd, msgs);
			case AgentPackage.LLM__RISKS:
				return ((InternalEList<?>)getRisks()).basicRemove(otherEnd, msgs);
			case AgentPackage.LLM__WAIVERS:
				return ((InternalEList<?>)getWaivers()).basicRemove(otherEnd, msgs);
			case AgentPackage.LLM__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case AgentPackage.LLM__CONTROL_APPLICATIONS:
				return getControlApplications();
			case AgentPackage.LLM__RISKS:
				return getRisks();
			case AgentPackage.LLM__WAIVERS:
				return getWaivers();
			case AgentPackage.LLM__PROVIDER:
				return getProvider();
			case AgentPackage.LLM__MODEL:
				return getModel();
			case AgentPackage.LLM__TEMPERATURE:
				return getTemperature();
			case AgentPackage.LLM__MAX_TOKENS:
				return getMaxTokens();
			case AgentPackage.LLM__PROPERTIES:
				return getProperties();
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
			case AgentPackage.LLM__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				getControlApplications().addAll((Collection<? extends ControlApplication>)newValue);
				return;
			case AgentPackage.LLM__RISKS:
				getRisks().clear();
				getRisks().addAll((Collection<? extends Risk>)newValue);
				return;
			case AgentPackage.LLM__WAIVERS:
				getWaivers().clear();
				getWaivers().addAll((Collection<? extends Waiver>)newValue);
				return;
			case AgentPackage.LLM__PROVIDER:
				setProvider((String)newValue);
				return;
			case AgentPackage.LLM__MODEL:
				setModel((String)newValue);
				return;
			case AgentPackage.LLM__TEMPERATURE:
				setTemperature((Double)newValue);
				return;
			case AgentPackage.LLM__MAX_TOKENS:
				setMaxTokens((Integer)newValue);
				return;
			case AgentPackage.LLM__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
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
			case AgentPackage.LLM__CONTROL_APPLICATIONS:
				getControlApplications().clear();
				return;
			case AgentPackage.LLM__RISKS:
				getRisks().clear();
				return;
			case AgentPackage.LLM__WAIVERS:
				getWaivers().clear();
				return;
			case AgentPackage.LLM__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case AgentPackage.LLM__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case AgentPackage.LLM__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
				return;
			case AgentPackage.LLM__MAX_TOKENS:
				setMaxTokens(MAX_TOKENS_EDEFAULT);
				return;
			case AgentPackage.LLM__PROPERTIES:
				getProperties().clear();
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
			case AgentPackage.LLM__CONTROL_APPLICATIONS:
				return !getControlApplications().isEmpty();
			case AgentPackage.LLM__RISKS:
				return !getRisks().isEmpty();
			case AgentPackage.LLM__WAIVERS:
				return !getWaivers().isEmpty();
			case AgentPackage.LLM__PROVIDER:
				return PROVIDER_EDEFAULT == null ? getProvider() != null : !PROVIDER_EDEFAULT.equals(getProvider());
			case AgentPackage.LLM__MODEL:
				return MODEL_EDEFAULT == null ? getModel() != null : !MODEL_EDEFAULT.equals(getModel());
			case AgentPackage.LLM__TEMPERATURE:
				return TEMPERATURE_EDEFAULT == null ? getTemperature() != null : !TEMPERATURE_EDEFAULT.equals(getTemperature());
			case AgentPackage.LLM__MAX_TOKENS:
				return MAX_TOKENS_EDEFAULT == null ? getMaxTokens() != null : !MAX_TOKENS_EDEFAULT.equals(getMaxTokens());
			case AgentPackage.LLM__PROPERTIES:
				return !getProperties().isEmpty();
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
				case AgentPackage.LLM__CONTROL_APPLICATIONS: return GovernancePackage.GOVERNED__CONTROL_APPLICATIONS;
				case AgentPackage.LLM__RISKS: return GovernancePackage.GOVERNED__RISKS;
				case AgentPackage.LLM__WAIVERS: return GovernancePackage.GOVERNED__WAIVERS;
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
				case GovernancePackage.GOVERNED__CONTROL_APPLICATIONS: return AgentPackage.LLM__CONTROL_APPLICATIONS;
				case GovernancePackage.GOVERNED__RISKS: return AgentPackage.LLM__RISKS;
				case GovernancePackage.GOVERNED__WAIVERS: return AgentPackage.LLM__WAIVERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //LlmImpl
