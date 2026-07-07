/**
 */
package org.nasdanika.models.accounting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A transaction that is also an assertion: both the movement and the resulting balance are known facts,
 * e.g. a confirmed transfer with a stated closing balance.")
 * <!-- end-model-doc -->
 *
 *
 * @see org.nasdanika.models.accounting.AccountingPackage#getTransactionAssertion()
 * @model
 * @generated
 */
public interface TransactionAssertion extends Transaction, Assertion {
} // TransactionAssertion
