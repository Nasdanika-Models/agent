/**
 */
package org.nasdanika.models.accounting.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.accounting.AccountingPackage;
import org.nasdanika.models.accounting.Commodity;
import org.nasdanika.models.accounting.Entry;
import org.nasdanika.models.accounting.EntryState;
import org.nasdanika.models.accounting.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.accounting.impl.EntryImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.impl.EntryImpl#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.impl.EntryImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.impl.EntryImpl#getCommodity <em>Commodity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntryImpl extends NamedElementImpl implements Entry {
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final EntryState STATE_EDEFAULT = EntryState.IMPORTED;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return (Date)eDynamicGet(AccountingPackage.ENTRY__DATE, AccountingPackage.Literals.ENTRY__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		eDynamicSet(AccountingPackage.ENTRY__DATE, AccountingPackage.Literals.ENTRY__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntryState getState() {
		return (EntryState)eDynamicGet(AccountingPackage.ENTRY__STATE, AccountingPackage.Literals.ENTRY__STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(EntryState newState) {
		eDynamicSet(AccountingPackage.ENTRY__STATE, AccountingPackage.Literals.ENTRY__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Source getSource() {
		return (Source)eDynamicGet(AccountingPackage.ENTRY__SOURCE, AccountingPackage.Literals.ENTRY__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source basicGetSource() {
		return (Source)eDynamicGet(AccountingPackage.ENTRY__SOURCE, AccountingPackage.Literals.ENTRY__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Source newSource) {
		eDynamicSet(AccountingPackage.ENTRY__SOURCE, AccountingPackage.Literals.ENTRY__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Commodity getCommodity() {
		return (Commodity)eDynamicGet(AccountingPackage.ENTRY__COMMODITY, AccountingPackage.Literals.ENTRY__COMMODITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commodity basicGetCommodity() {
		return (Commodity)eDynamicGet(AccountingPackage.ENTRY__COMMODITY, AccountingPackage.Literals.ENTRY__COMMODITY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommodity(Commodity newCommodity) {
		eDynamicSet(AccountingPackage.ENTRY__COMMODITY, AccountingPackage.Literals.ENTRY__COMMODITY, newCommodity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.ENTRY__DATE:
				return getDate();
			case AccountingPackage.ENTRY__STATE:
				return getState();
			case AccountingPackage.ENTRY__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case AccountingPackage.ENTRY__COMMODITY:
				if (resolve) return getCommodity();
				return basicGetCommodity();
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
			case AccountingPackage.ENTRY__DATE:
				setDate((Date)newValue);
				return;
			case AccountingPackage.ENTRY__STATE:
				setState((EntryState)newValue);
				return;
			case AccountingPackage.ENTRY__SOURCE:
				setSource((Source)newValue);
				return;
			case AccountingPackage.ENTRY__COMMODITY:
				setCommodity((Commodity)newValue);
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
			case AccountingPackage.ENTRY__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case AccountingPackage.ENTRY__STATE:
				setState(STATE_EDEFAULT);
				return;
			case AccountingPackage.ENTRY__SOURCE:
				setSource((Source)null);
				return;
			case AccountingPackage.ENTRY__COMMODITY:
				setCommodity((Commodity)null);
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
			case AccountingPackage.ENTRY__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case AccountingPackage.ENTRY__STATE:
				return getState() != STATE_EDEFAULT;
			case AccountingPackage.ENTRY__SOURCE:
				return basicGetSource() != null;
			case AccountingPackage.ENTRY__COMMODITY:
				return basicGetCommodity() != null;
		}
		return super.eIsSet(featureID);
	}

} //EntryImpl
