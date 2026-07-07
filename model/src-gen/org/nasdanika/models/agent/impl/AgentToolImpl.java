/**
 */
package org.nasdanika.models.agent.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.agent.Agent;
import org.nasdanika.models.agent.AgentPackage;
import org.nasdanika.models.agent.AgentTool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.impl.AgentToolImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentToolImpl extends ToolImpl implements AgentTool {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.AGENT_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent getAgent() {
		return (Agent)eDynamicGet(AgentPackage.AGENT_TOOL__AGENT, AgentPackage.Literals.AGENT_TOOL__AGENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetAgent() {
		return (Agent)eDynamicGet(AgentPackage.AGENT_TOOL__AGENT, AgentPackage.Literals.AGENT_TOOL__AGENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgent(Agent newAgent) {
		eDynamicSet(AgentPackage.AGENT_TOOL__AGENT, AgentPackage.Literals.AGENT_TOOL__AGENT, newAgent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgentPackage.AGENT_TOOL__AGENT:
				if (resolve) return getAgent();
				return basicGetAgent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgentPackage.AGENT_TOOL__AGENT:
				setAgent((Agent)newValue);
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
			case AgentPackage.AGENT_TOOL__AGENT:
				setAgent((Agent)null);
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
			case AgentPackage.AGENT_TOOL__AGENT:
				return basicGetAgent() != null;
		}
		return super.eIsSet(featureID);
	}

} //AgentToolImpl
