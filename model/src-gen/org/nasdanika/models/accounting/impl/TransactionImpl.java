/**
 */
package org.nasdanika.models.accounting.impl;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.accounting.AccountingPackage;
import org.nasdanika.models.accounting.Transaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.accounting.impl.TransactionImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.impl.TransactionImpl#getCorrespondent <em>Correspondent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends EntryImpl implements Transaction {
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return (BigDecimal)eDynamicGet(AccountingPackage.TRANSACTION__AMOUNT, AccountingPackage.Literals.TRANSACTION__AMOUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		eDynamicSet(AccountingPackage.TRANSACTION__AMOUNT, AccountingPackage.Literals.TRANSACTION__AMOUNT, newAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transaction getCorrespondent() {
		return (Transaction)eDynamicGet(AccountingPackage.TRANSACTION__CORRESPONDENT, AccountingPackage.Literals.TRANSACTION__CORRESPONDENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction basicGetCorrespondent() {
		return (Transaction)eDynamicGet(AccountingPackage.TRANSACTION__CORRESPONDENT, AccountingPackage.Literals.TRANSACTION__CORRESPONDENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrespondent(Transaction newCorrespondent) {
		eDynamicSet(AccountingPackage.TRANSACTION__CORRESPONDENT, AccountingPackage.Literals.TRANSACTION__CORRESPONDENT, newCorrespondent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.TRANSACTION__AMOUNT:
				return getAmount();
			case AccountingPackage.TRANSACTION__CORRESPONDENT:
				if (resolve) return getCorrespondent();
				return basicGetCorrespondent();
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
			case AccountingPackage.TRANSACTION__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case AccountingPackage.TRANSACTION__CORRESPONDENT:
				setCorrespondent((Transaction)newValue);
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
			case AccountingPackage.TRANSACTION__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case AccountingPackage.TRANSACTION__CORRESPONDENT:
				setCorrespondent((Transaction)null);
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
			case AccountingPackage.TRANSACTION__AMOUNT:
				return AMOUNT_EDEFAULT == null ? getAmount() != null : !AMOUNT_EDEFAULT.equals(getAmount());
			case AccountingPackage.TRANSACTION__CORRESPONDENT:
				return basicGetCorrespondent() != null;
		}
		return super.eIsSet(featureID);
	}

} //TransactionImpl
