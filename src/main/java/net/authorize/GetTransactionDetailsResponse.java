
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
 *         &lt;element name="GetTransactionDetailsResult" type="{https://api.authorize.net/soap/v1/}GetTransactionDetailsResponseType" minOccurs="0"/>
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
    "getTransactionDetailsResult"
})
@XmlRootElement(name = "GetTransactionDetailsResponse")
public class GetTransactionDetailsResponse {

    @XmlElement(name = "GetTransactionDetailsResult")
    protected GetTransactionDetailsResponseType getTransactionDetailsResult;

    /**
     * Gets the value of the getTransactionDetailsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetTransactionDetailsResponseType }
     *     
     */
    public GetTransactionDetailsResponseType getGetTransactionDetailsResult() {
        return getTransactionDetailsResult;
    }

    /**
     * Sets the value of the getTransactionDetailsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetTransactionDetailsResponseType }
     *     
     */
    public void setGetTransactionDetailsResult(GetTransactionDetailsResponseType value) {
        this.getTransactionDetailsResult = value;
    }

}
