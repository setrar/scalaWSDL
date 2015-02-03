
package net.authorize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTransactionDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransactionDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://api.authorize.net/soap/v1/}ANetApiResponseType">
 *       &lt;sequence>
 *         &lt;element name="transaction" type="{https://api.authorize.net/soap/v1/}TransactionDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransactionDetailsResponseType", propOrder = {
    "transaction"
})
public class GetTransactionDetailsResponseType
    extends ANetApiResponseType
{

    protected TransactionDetailsType transaction;

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetailsType }
     *     
     */
    public TransactionDetailsType getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetailsType }
     *     
     */
    public void setTransaction(TransactionDetailsType value) {
        this.transaction = value;
    }

}
