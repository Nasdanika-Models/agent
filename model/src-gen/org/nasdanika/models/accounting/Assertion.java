/**
 */
package org.nasdanika.models.accounting;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A statement of fact about the containing account at a date, e.g. a balance per statement. Verification folds transactions between consecutive assertions and reports which interval on which account fails to reconcile.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.accounting.Assertion#getBalance <em>Balance</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.accounting.AccountingPackage#getAssertion()
 * @model
 * @generated
 */
public interface Assertion extends Entry {
	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #setBalance(BigDecimal)
	 * @see org.nasdanika.models.accounting.AccountingPackage#getAssertion_Balance()
	 * @model unique="false"
	 * @generated
	 */
	BigDecimal getBalance();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.accounting.Assertion#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(BigDecimal value);

} // Assertion
