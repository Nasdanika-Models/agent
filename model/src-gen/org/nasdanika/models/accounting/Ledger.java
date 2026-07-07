/**
 */
package org.nasdanika.models.accounting;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ledger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root container, one per household or per concern. Contains accounts, commodities, and import sources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.accounting.Ledger#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.Ledger#getCommodities <em>Commodities</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.Ledger#getSources <em>Sources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.accounting.AccountingPackage#getLedger()
 * @model
 * @generated
 */
public interface Ledger extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.accounting.Account}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference list.
	 * @see org.nasdanika.models.accounting.AccountingPackage#getLedger_Accounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Account> getAccounts();

	/**
	 * Returns the value of the '<em><b>Commodities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.accounting.Commodity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commodities</em>' containment reference list.
	 * @see org.nasdanika.models.accounting.AccountingPackage#getLedger_Commodities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Commodity> getCommodities();

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.accounting.Source}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference list.
	 * @see org.nasdanika.models.accounting.AccountingPackage#getLedger_Sources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getSources();

} // Ledger
