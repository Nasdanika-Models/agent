/**
 */
package org.nasdanika.models.accounting.impl;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.accounting.AccountingPackage;
import org.nasdanika.models.accounting.Assertion;
import org.nasdanika.models.accounting.TransactionAssertion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.accounting.impl.TransactionAssertionImpl#getBalance <em>Balance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionAssertionImpl extends TransactionImpl implements TransactionAssertion {
	/**
	 * The default value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BALANCE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionAssertionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.TRANSACTION_ASSERTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBalance() {
		return (BigDecimal)eDynamicGet(AccountingPackage.TRANSACTION_ASSERTION__BALANCE, AccountingPackage.Literals.ASSERTION__BALANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBalance(BigDecimal newBalance) {
		eDynamicSet(AccountingPackage.TRANSACTION_ASSERTION__BALANCE, AccountingPackage.Literals.ASSERTION__BALANCE, newBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.TRANSACTION_ASSERTION__BALANCE:
				return getBalance();
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
			case AccountingPackage.TRANSACTION_ASSERTION__BALANCE:
				setBalance((BigDecimal)newValue);
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
			case AccountingPackage.TRANSACTION_ASSERTION__BALANCE:
				setBalance(BALANCE_EDEFAULT);
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
			case AccountingPackage.TRANSACTION_ASSERTION__BALANCE:
				return BALANCE_EDEFAULT == null ? getBalance() != null : !BALANCE_EDEFAULT.equals(getBalance());
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
		if (baseClass == Assertion.class) {
			switch (derivedFeatureID) {
				case AccountingPackage.TRANSACTION_ASSERTION__BALANCE: return AccountingPackage.ASSERTION__BALANCE;
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
		if (baseClass == Assertion.class) {
			switch (baseFeatureID) {
				case AccountingPackage.ASSERTION__BALANCE: return AccountingPackage.TRANSACTION_ASSERTION__BALANCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TransactionAssertionImpl
