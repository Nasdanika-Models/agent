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
import org.nasdanika.models.accounting.Entry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.accounting.impl.AccountImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.impl.AccountImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.impl.AccountImpl#getCommodities <em>Commodities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountImpl extends NamedElementImpl implements Account {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Account> getChildren() {
		return (EList<Account>)eDynamicGet(AccountingPackage.ACCOUNT__CHILDREN, AccountingPackage.Literals.ACCOUNT__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Entry> getEntries() {
		return (EList<Entry>)eDynamicGet(AccountingPackage.ACCOUNT__ENTRIES, AccountingPackage.Literals.ACCOUNT__ENTRIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Commodity> getCommodities() {
		return (EList<Commodity>)eDynamicGet(AccountingPackage.ACCOUNT__COMMODITIES, AccountingPackage.Literals.ACCOUNT__COMMODITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccountingPackage.ACCOUNT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case AccountingPackage.ACCOUNT__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case AccountingPackage.ACCOUNT__CHILDREN:
				return getChildren();
			case AccountingPackage.ACCOUNT__ENTRIES:
				return getEntries();
			case AccountingPackage.ACCOUNT__COMMODITIES:
				return getCommodities();
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
			case AccountingPackage.ACCOUNT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Account>)newValue);
				return;
			case AccountingPackage.ACCOUNT__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends Entry>)newValue);
				return;
			case AccountingPackage.ACCOUNT__COMMODITIES:
				getCommodities().clear();
				getCommodities().addAll((Collection<? extends Commodity>)newValue);
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
			case AccountingPackage.ACCOUNT__CHILDREN:
				getChildren().clear();
				return;
			case AccountingPackage.ACCOUNT__ENTRIES:
				getEntries().clear();
				return;
			case AccountingPackage.ACCOUNT__COMMODITIES:
				getCommodities().clear();
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
			case AccountingPackage.ACCOUNT__CHILDREN:
				return !getChildren().isEmpty();
			case AccountingPackage.ACCOUNT__ENTRIES:
				return !getEntries().isEmpty();
			case AccountingPackage.ACCOUNT__COMMODITIES:
				return !getCommodities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccountImpl
