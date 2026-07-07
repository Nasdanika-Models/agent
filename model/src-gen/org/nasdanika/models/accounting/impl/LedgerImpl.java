/**
 */
package org.nasdanika.models.accounting.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.accounting.Account;
import org.nasdanika.models.accounting.AccountingPackage;
import org.nasdanika.models.accounting.Commodity;
import org.nasdanika.models.accounting.Ledger;
import org.nasdanika.models.accounting.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ledger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.accounting.impl.LedgerImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.impl.LedgerImpl#getCommodities <em>Commodities</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.impl.LedgerImpl#getSources <em>Sources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LedgerImpl extends NamedElementImpl implements Ledger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LedgerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.LEDGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Account> getAccounts() {
		return (EList<Account>)eDynamicGet(AccountingPackage.LEDGER__ACCOUNTS, AccountingPackage.Literals.LEDGER__ACCOUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Commodity> getCommodities() {
		return (EList<Commodity>)eDynamicGet(AccountingPackage.LEDGER__COMMODITIES, AccountingPackage.Literals.LEDGER__COMMODITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Source> getSources() {
		return (EList<Source>)eDynamicGet(AccountingPackage.LEDGER__SOURCES, AccountingPackage.Literals.LEDGER__SOURCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.LEDGER__ACCOUNTS:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
			case AccountingPackage.LEDGER__COMMODITIES:
				return ((InternalEList<?>)getCommodities()).basicRemove(otherEnd, msgs);
			case AccountingPackage.LEDGER__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
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
			case AccountingPackage.LEDGER__ACCOUNTS:
				return getAccounts();
			case AccountingPackage.LEDGER__COMMODITIES:
				return getCommodities();
			case AccountingPackage.LEDGER__SOURCES:
				return getSources();
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
			case AccountingPackage.LEDGER__ACCOUNTS:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends Account>)newValue);
				return;
			case AccountingPackage.LEDGER__COMMODITIES:
				getCommodities().clear();
				getCommodities().addAll((Collection<? extends Commodity>)newValue);
				return;
			case AccountingPackage.LEDGER__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Source>)newValue);
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
			case AccountingPackage.LEDGER__ACCOUNTS:
				getAccounts().clear();
				return;
			case AccountingPackage.LEDGER__COMMODITIES:
				getCommodities().clear();
				return;
			case AccountingPackage.LEDGER__SOURCES:
				getSources().clear();
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
			case AccountingPackage.LEDGER__ACCOUNTS:
				return !getAccounts().isEmpty();
			case AccountingPackage.LEDGER__COMMODITIES:
				return !getCommodities().isEmpty();
			case AccountingPackage.LEDGER__SOURCES:
				return !getSources().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LedgerImpl
