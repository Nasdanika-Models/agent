/**
 */
package org.nasdanika.models.accounting;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commodity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Anything countable: currencies, securities, points, miles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.accounting.Commodity#getCode <em>Code</em>}</li>
 *   <li>{@link org.nasdanika.models.accounting.Commodity#getFractionDigits <em>Fraction Digits</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.accounting.AccountingPackage#getCommodity()
 * @model
 * @generated
 */
public interface Commodity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commodity code, e.g. ISO 4217 currency code or ticker symbol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.nasdanika.models.accounting.AccountingPackage#getCommodity_Code()
	 * @model unique="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.accounting.Commodity#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Fraction Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of decimal digits in the minor unit, e.g. 2 for USD.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fraction Digits</em>' attribute.
	 * @see #setFractionDigits(int)
	 * @see org.nasdanika.models.accounting.AccountingPackage#getCommodity_FractionDigits()
	 * @model unique="false"
	 * @generated
	 */
	int getFractionDigits();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.accounting.Commodity#getFractionDigits <em>Fraction Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fraction Digits</em>' attribute.
	 * @see #getFractionDigits()
	 * @generated
	 */
	void setFractionDigits(int value);

} // Commodity
