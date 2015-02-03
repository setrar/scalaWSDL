
package net.authorize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMaskedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMaskedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="tokenInformation" type="{https://api.authorize.net/soap/v1/}TokenMaskedType" minOccurs="0"/>
 *           &lt;element name="creditCard" type="{https://api.authorize.net/soap/v1/}CreditCardMaskedType" minOccurs="0"/>
 *           &lt;element name="bankAccount" type="{https://api.authorize.net/soap/v1/}BankAccountMaskedType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMaskedType", propOrder = {
    "tokenInformation",
    "creditCard",
    "bankAccount"
})
public class PaymentMaskedType {

    protected TokenMaskedType tokenInformation;
    protected CreditCardMaskedType creditCard;
    protected BankAccountMaskedType bankAccount;

    /**
     * Gets the value of the tokenInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TokenMaskedType }
     *     
     */
    public TokenMaskedType getTokenInformation() {
        return tokenInformation;
    }

    /**
     * Sets the value of the tokenInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenMaskedType }
     *     
     */
    public void setTokenInformation(TokenMaskedType value) {
        this.tokenInformation = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardMaskedType }
     *     
     */
    public CreditCardMaskedType getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardMaskedType }
     *     
     */
    public void setCreditCard(CreditCardMaskedType value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountMaskedType }
     *     
     */
    public BankAccountMaskedType getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountMaskedType }
     *     
     */
    public void setBankAccount(BankAccountMaskedType value) {
        this.bankAccount = value;
    }

}
