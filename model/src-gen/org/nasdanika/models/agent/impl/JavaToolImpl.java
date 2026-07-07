/**
 */
package org.nasdanika.models.agent.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.agent.AgentPackage;
import org.nasdanika.models.agent.JavaTool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.impl.JavaToolImpl#getImplementationClass <em>Implementation Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaToolImpl extends ToolImpl implements JavaTool {
	/**
	 * The default value of the '{@link #getImplementationClass() <em>Implementation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationClass()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_CLASS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.JAVA_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplementationClass() {
		return (String)eDynamicGet(AgentPackage.JAVA_TOOL__IMPLEMENTATION_CLASS, AgentPackage.Literals.JAVA_TOOL__IMPLEMENTATION_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementationClass(String newImplementationClass) {
		eDynamicSet(AgentPackage.JAVA_TOOL__IMPLEMENTATION_CLASS, AgentPackage.Literals.JAVA_TOOL__IMPLEMENTATION_CLASS, newImplementationClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgentPackage.JAVA_TOOL__IMPLEMENTATION_CLASS:
				return getImplementationClass();
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
			case AgentPackage.JAVA_TOOL__IMPLEMENTATION_CLASS:
				setImplementationClass((String)newValue);
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
			case AgentPackage.JAVA_TOOL__IMPLEMENTATION_CLASS:
				setImplementationClass(IMPLEMENTATION_CLASS_EDEFAULT);
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
			case AgentPackage.JAVA_TOOL__IMPLEMENTATION_CLASS:
				return IMPLEMENTATION_CLASS_EDEFAULT == null ? getImplementationClass() != null : !IMPLEMENTATION_CLASS_EDEFAULT.equals(getImplementationClass());
		}
		return super.eIsSet(featureID);
	}

} //JavaToolImpl
