/**
 */
package org.nasdanika.models.accounting.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.accounting.AccountingPackage;
import org.nasdanika.models.accounting.Commodity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commodity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.accounting.impl.CommodityImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.impl.CommodityImpl#getFractionDigits <em>Fraction Digits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommodityImpl extends NamedElementImpl implements Commodity {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFractionDigits()
	 * @generated
	 * @ordered
	 */
	protected static final int FRACTION_DIGITS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommodityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.COMMODITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return (String)eDynamicGet(AccountingPackage.COMMODITY__CODE, AccountingPackage.Literals.COMMODITY__CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		eDynamicSet(AccountingPackage.COMMODITY__CODE, AccountingPackage.Literals.COMMODITY__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFractionDigits() {
		return (Integer)eDynamicGet(AccountingPackage.COMMODITY__FRACTION_DIGITS, AccountingPackage.Literals.COMMODITY__FRACTION_DIGITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFractionDigits(int newFractionDigits) {
		eDynamicSet(AccountingPackage.COMMODITY__FRACTION_DIGITS, AccountingPackage.Literals.COMMODITY__FRACTION_DIGITS, newFractionDigits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.COMMODITY__CODE:
				return getCode();
			case AccountingPackage.COMMODITY__FRACTION_DIGITS:
				return getFractionDigits();
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
			case AccountingPackage.COMMODITY__CODE:
				setCode((String)newValue);
				return;
			case AccountingPackage.COMMODITY__FRACTION_DIGITS:
				setFractionDigits((Integer)newValue);
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
			case AccountingPackage.COMMODITY__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case AccountingPackage.COMMODITY__FRACTION_DIGITS:
				setFractionDigits(FRACTION_DIGITS_EDEFAULT);
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
			case AccountingPackage.COMMODITY__CODE:
				return CODE_EDEFAULT == null ? getCode() != null : !CODE_EDEFAULT.equals(getCode());
			case AccountingPackage.COMMODITY__FRACTION_DIGITS:
				return getFractionDigits() != FRACTION_DIGITS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //CommodityImpl
