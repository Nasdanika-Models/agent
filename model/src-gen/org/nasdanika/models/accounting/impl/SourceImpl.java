/**
 */
package org.nasdanika.models.accounting.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.accounting.AccountingPackage;
import org.nasdanika.models.accounting.Source;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.accounting.impl.SourceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.impl.SourceImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.impl.SourceImpl#getImportedAt <em>Imported At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceImpl extends NamedElementImpl implements Source {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getImportedAt() <em>Imported At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date IMPORTED_AT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountingPackage.Literals.SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return (String)eDynamicGet(AccountingPackage.SOURCE__LOCATION, AccountingPackage.Literals.SOURCE__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		eDynamicSet(AccountingPackage.SOURCE__LOCATION, AccountingPackage.Literals.SOURCE__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return (String)eDynamicGet(AccountingPackage.SOURCE__FORMAT, AccountingPackage.Literals.SOURCE__FORMAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		eDynamicSet(AccountingPackage.SOURCE__FORMAT, AccountingPackage.Literals.SOURCE__FORMAT, newFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getImportedAt() {
		return (Date)eDynamicGet(AccountingPackage.SOURCE__IMPORTED_AT, AccountingPackage.Literals.SOURCE__IMPORTED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportedAt(Date newImportedAt) {
		eDynamicSet(AccountingPackage.SOURCE__IMPORTED_AT, AccountingPackage.Literals.SOURCE__IMPORTED_AT, newImportedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccountingPackage.SOURCE__LOCATION:
				return getLocation();
			case AccountingPackage.SOURCE__FORMAT:
				return getFormat();
			case AccountingPackage.SOURCE__IMPORTED_AT:
				return getImportedAt();
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
			case AccountingPackage.SOURCE__LOCATION:
				setLocation((String)newValue);
				return;
			case AccountingPackage.SOURCE__FORMAT:
				setFormat((String)newValue);
				return;
			case AccountingPackage.SOURCE__IMPORTED_AT:
				setImportedAt((Date)newValue);
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
			case AccountingPackage.SOURCE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case AccountingPackage.SOURCE__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case AccountingPackage.SOURCE__IMPORTED_AT:
				setImportedAt(IMPORTED_AT_EDEFAULT);
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
			case AccountingPackage.SOURCE__LOCATION:
				return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
			case AccountingPackage.SOURCE__FORMAT:
				return FORMAT_EDEFAULT == null ? getFormat() != null : !FORMAT_EDEFAULT.equals(getFormat());
			case AccountingPackage.SOURCE__IMPORTED_AT:
				return IMPORTED_AT_EDEFAULT == null ? getImportedAt() != null : !IMPORTED_AT_EDEFAULT.equals(getImportedAt());
		}
		return super.eIsSet(featureID);
	}

} //SourceImpl
