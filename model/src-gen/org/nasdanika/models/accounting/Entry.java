/**
 */
package org.nasdanika.models.accounting;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base for ledger entries. Entries are of two general types: assertions (statements of fact about an account at a date) and transactions (movements). A transaction can also be an assertion.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.accounting.Entry#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.Entry#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.Entry#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.Entry#getCommodity <em>Commodity</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.accounting.AccountingPackage#getEntry()
 * @model abstract="true"
 * @generated
 */
public interface Entry extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.nasdanika.models.accounting.AccountingPackage#getEntry_Date()
	 * @model unique="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.accounting.Entry#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.accounting.EntryState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.nasdanika.models.accounting.EntryState
	 * @see #setState(EntryState)
	 * @see org.nasdanika.models.accounting.AccountingPackage#getEntry_State()
	 * @model unique="false"
	 * @generated
	 */
	EntryState getState();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.accounting.Entry#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.nasdanika.models.accounting.EntryState
	 * @see #getState()
	 * @generated
	 */
	void setState(EntryState value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provenance: which import/statement/observation produced this entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Source)
	 * @see org.nasdanika.models.accounting.AccountingPackage#getEntry_Source()
	 * @model
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.accounting.Entry#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

	/**
	 * Returns the value of the '<em><b>Commodity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commodity</em>' reference.
	 * @see #setCommodity(Commodity)
	 * @see org.nasdanika.models.accounting.AccountingPackage#getEntry_Commodity()
	 * @model
	 * @generated
	 */
	Commodity getCommodity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.accounting.Entry#getCommodity <em>Commodity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commodity</em>' reference.
	 * @see #getCommodity()
	 * @generated
	 */
	void setCommodity(Commodity value);

} // Entry
