/**
 */
package org.nasdanika.models.agent.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.agent.AgentPackage;
import org.nasdanika.models.agent.AllExamples;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>All Examples</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.impl.AllExamplesImpl#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllExamplesImpl extends SelectionStrategyImpl implements AllExamples {
	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LIMIT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllExamplesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.ALL_EXAMPLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLimit() {
		return (Integer)eDynamicGet(AgentPackage.ALL_EXAMPLES__LIMIT, AgentPackage.Literals.ALL_EXAMPLES__LIMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLimit(Integer newLimit) {
		eDynamicSet(AgentPackage.ALL_EXAMPLES__LIMIT, AgentPackage.Literals.ALL_EXAMPLES__LIMIT, newLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgentPackage.ALL_EXAMPLES__LIMIT:
				return getLimit();
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
			case AgentPackage.ALL_EXAMPLES__LIMIT:
				setLimit((Integer)newValue);
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
			case AgentPackage.ALL_EXAMPLES__LIMIT:
				setLimit(LIMIT_EDEFAULT);
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
			case AgentPackage.ALL_EXAMPLES__LIMIT:
				return LIMIT_EDEFAULT == null ? getLimit() != null : !LIMIT_EDEFAULT.equals(getLimit());
		}
		return super.eIsSet(featureID);
	}

} //AllExamplesImpl
