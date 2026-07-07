/**
 */
package org.nasdanika.models.accounting;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Where entries came from: a statement file, an institution download, manual entry. Enables staged reconciliation and audit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.accounting.Source#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.Source#getFormat <em>Format</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.Source#getImportedAt <em>Imported At</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.accounting.AccountingPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location of the source artifact, e.g. a QFX/OFX/CSV file URI or an institution endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.nasdanika.models.accounting.AccountingPackage#getSource_Location()
	 * @model unique="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.accounting.Source#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Format of the source artifact, e.g. QFX, OFX, CSV, manual.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see org.nasdanika.models.accounting.AccountingPackage#getSource_Format()
	 * @model unique="false"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.accounting.Source#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Imported At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported At</em>' attribute.
	 * @see #setImportedAt(Date)
	 * @see org.nasdanika.models.accounting.AccountingPackage#getSource_ImportedAt()
	 * @model unique="false"
	 * @generated
	 */
	Date getImportedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.accounting.Source#getImportedAt <em>Imported At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported At</em>' attribute.
	 * @see #getImportedAt()
	 * @generated
	 */
	void setImportedAt(Date value);

} // Source
