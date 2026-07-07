/**
 */
package org.nasdanika.models.accounting;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A movement on the containing account, with or without a corresponding transaction on another account. Single-leg transactions are permitted to support the staged workflow; the correspondent leg may be assigned later.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.accounting.Transaction#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.Transaction#getCorrespondent <em>Correspondent</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.accounting.AccountingPackage#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends Entry {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(BigDecimal)
	 * @see org.nasdanika.models.accounting.AccountingPackage#getTransaction_Amount()
	 * @model unique="false"
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.accounting.Transaction#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Correspondent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The corresponding transaction on another account, if known. Symmetric.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Correspondent</em>' reference.
	 * @see #setCorrespondent(Transaction)
	 * @see org.nasdanika.models.accounting.AccountingPackage#getTransaction_Correspondent()
	 * @model
	 * @generated
	 */
	Transaction getCorrespondent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.accounting.Transaction#getCorrespondent <em>Correspondent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correspondent</em>' reference.
	 * @see #getCorrespondent()
	 * @generated
	 */
	void setCorrespondent(Transaction value);

} // Transaction
