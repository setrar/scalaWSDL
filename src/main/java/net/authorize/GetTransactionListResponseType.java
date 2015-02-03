
package net.authorize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetTransactionListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransactionListResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://api.authorize.net/soap/v1/}ANetApiResponseType">
 *       &lt;sequence>
 *         &lt;element name="transactions" type="{https://api.authorize.net/soap/v1/}ArrayOfTransactionSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransactionListResponseType", propOrder = {
    "transactions"
})
public class GetTransactionListResponseType
    extends ANetApiResponseType
{

    protected ArrayOfTransactionSummaryType transactions;

    /**
     * Gets the value of the transactions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransactionSummaryType }
     *     
     */
    public ArrayOfTransactionSummaryType getTransactions() {
        return transactions;
    }

    /**
     * Sets the value of the transactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransactionSummaryType }
     *     
     */
    public void setTransactions(ArrayOfTransactionSummaryType value) {
        this.transactions = value;
    }

}
