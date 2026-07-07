/**
 */
package org.nasdanika.models.agent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mcp Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A tool provided by an MCP (Model Context Protocol) server.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.McpTool#getServer <em>Server</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.McpTool#getToolName <em>Tool Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.agent.AgentPackage#getMcpTool()
 * @model
 * @generated
 */
public interface McpTool extends Tool {
	/**
	 * Returns the value of the '<em><b>Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MCP server identifier or URI.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Server</em>' attribute.
	 * @see #setServer(String)
	 * @see org.nasdanika.models.agent.AgentPackage#getMcpTool_Server()
	 * @model unique="false"
	 * @generated
	 */
	String getServer();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.McpTool#getServer <em>Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' attribute.
	 * @see #getServer()
	 * @generated
	 */
	void setServer(String value);

	/**
	 * Returns the value of the '<em><b>Tool Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tool name as published by the server, if different from the element name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tool Name</em>' attribute.
	 * @see #setToolName(String)
	 * @see org.nasdanika.models.agent.AgentPackage#getMcpTool_ToolName()
	 * @model unique="false"
	 * @generated
	 */
	String getToolName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.McpTool#getToolName <em>Tool Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Name</em>' attribute.
	 * @see #getToolName()
	 * @generated
	 */
	void setToolName(String value);

} // McpTool
