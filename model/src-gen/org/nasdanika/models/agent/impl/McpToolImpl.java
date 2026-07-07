/**
 */
package org.nasdanika.models.agent.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.agent.AgentPackage;
import org.nasdanika.models.agent.McpTool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mcp Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.impl.McpToolImpl#getServer <em>Server</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.impl.McpToolImpl#getToolName <em>Tool Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class McpToolImpl extends ToolImpl implements McpTool {
	/**
	 * The default value of the '{@link #getServer() <em>Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getToolName() <em>Tool Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolName()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOL_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected McpToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.MCP_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getServer() {
		return (String)eDynamicGet(AgentPackage.MCP_TOOL__SERVER, AgentPackage.Literals.MCP_TOOL__SERVER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServer(String newServer) {
		eDynamicSet(AgentPackage.MCP_TOOL__SERVER, AgentPackage.Literals.MCP_TOOL__SERVER, newServer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToolName() {
		return (String)eDynamicGet(AgentPackage.MCP_TOOL__TOOL_NAME, AgentPackage.Literals.MCP_TOOL__TOOL_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToolName(String newToolName) {
		eDynamicSet(AgentPackage.MCP_TOOL__TOOL_NAME, AgentPackage.Literals.MCP_TOOL__TOOL_NAME, newToolName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgentPackage.MCP_TOOL__SERVER:
				return getServer();
			case AgentPackage.MCP_TOOL__TOOL_NAME:
				return getToolName();
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
			case AgentPackage.MCP_TOOL__SERVER:
				setServer((String)newValue);
				return;
			case AgentPackage.MCP_TOOL__TOOL_NAME:
				setToolName((String)newValue);
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
			case AgentPackage.MCP_TOOL__SERVER:
				setServer(SERVER_EDEFAULT);
				return;
			case AgentPackage.MCP_TOOL__TOOL_NAME:
				setToolName(TOOL_NAME_EDEFAULT);
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
			case AgentPackage.MCP_TOOL__SERVER:
				return SERVER_EDEFAULT == null ? getServer() != null : !SERVER_EDEFAULT.equals(getServer());
			case AgentPackage.MCP_TOOL__TOOL_NAME:
				return TOOL_NAME_EDEFAULT == null ? getToolName() != null : !TOOL_NAME_EDEFAULT.equals(getToolName());
		}
		return super.eIsSet(featureID);
	}

} //McpToolImpl
