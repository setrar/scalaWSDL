
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
 *         &lt;element name="CreateCustomerProfileFromTransactionResult" type="{https://api.authorize.net/soap/v1/}CreateCustomerProfileResponseType" minOccurs="0"/>
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
    "createCustomerProfileFromTransactionResult"
})
@XmlRootElement(name = "CreateCustomerProfileFromTransactionResponse")
public class CreateCustomerProfileFromTransactionResponse {

    @XmlElement(name = "CreateCustomerProfileFromTransactionResult")
    protected CreateCustomerProfileResponseType createCustomerProfileFromTransactionResult;

    /**
     * Gets the value of the createCustomerProfileFromTransactionResult property.
     * 
     * @return
     *     possible object is
     *     {@link CreateCustomerProfileResponseType }
     *     
     */
    public CreateCustomerProfileResponseType getCreateCustomerProfileFromTransactionResult() {
        return createCustomerProfileFromTransactionResult;
    }

    /**
     * Sets the value of the createCustomerProfileFromTransactionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCustomerProfileResponseType }
     *     
     */
    public void setCreateCustomerProfileFromTransactionResult(CreateCustomerProfileResponseType value) {
        this.createCustomerProfileFromTransactionResult = value;
    }

}
