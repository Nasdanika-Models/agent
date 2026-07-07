/**
 */
package org.nasdanika.models.accounting;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A node in the account hierarchy. Unlike single-commodity designs, an account may hold balances in multiple commodities. Entries are contained by the account they describe.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.accounting.Account#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.Account#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.Account#getCommodities <em>Commodities</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.accounting.AccountingPackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.accounting.Account}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.models.accounting.AccountingPackage#getAccount_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Account> getChildren();

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.accounting.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.nasdanika.models.accounting.AccountingPackage#getAccount_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entry> getEntries();

	/**
	 * Returns the value of the '<em><b>Commodities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.accounting.Commodity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commodities this account may hold. Empty means unrestricted.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commodities</em>' reference list.
	 * @see org.nasdanika.models.accounting.AccountingPackage#getAccount_Commodities()
	 * @model
	 * @generated
	 */
	EList<Commodity> getCommodities();

} // Account
