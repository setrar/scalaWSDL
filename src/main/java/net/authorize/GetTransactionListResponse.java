
package net.authorize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetTransactionListResult" type="{https://api.authorize.net/soap/v1/}GetTransactionListResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTransactionListResult"
})
@XmlRootElement(name = "GetTransactionListResponse")
public class GetTransactionListResponse {

    @XmlElement(name = "GetTransactionListResult")
    protected GetTransactionListResponseType getTransactionListResult;

    /**
     * Gets the value of the getTransactionListResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransactionListResponseType }
     *     
     */
    public GetTransactionListResponseType getGetTransactionListResult() {
        return getTransactionListResult;
    }

    /**
     * Sets the value of the getTransactionListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransactionListResponseType }
     *     
     */
    public void setGetTransactionListResult(GetTransactionListResponseType value) {
        this.getTransactionListResult = value;
    }

}
