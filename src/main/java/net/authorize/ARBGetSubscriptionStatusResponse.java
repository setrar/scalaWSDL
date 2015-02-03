
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
 *         &lt;element name="ARBGetSubscriptionStatusResult" type="{https://api.authorize.net/soap/v1/}ARBGetSubscriptionStatusResponseType" minOccurs="0"/>
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
    "arbGetSubscriptionStatusResult"
})
@XmlRootElement(name = "ARBGetSubscriptionStatusResponse")
public class ARBGetSubscriptionStatusResponse {

    @XmlElement(name = "ARBGetSubscriptionStatusResult")
    protected ARBGetSubscriptionStatusResponseType arbGetSubscriptionStatusResult;

    /**
     * Gets the value of the arbGetSubscriptionStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link ARBGetSubscriptionStatusResponseType }
     *     
     */
    public ARBGetSubscriptionStatusResponseType getARBGetSubscriptionStatusResult() {
        return arbGetSubscriptionStatusResult;
    }

    /**
     * Sets the value of the arbGetSubscriptionStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARBGetSubscriptionStatusResponseType }
     *     
     */
    public void setARBGetSubscriptionStatusResult(ARBGetSubscriptionStatusResponseType value) {
        this.arbGetSubscriptionStatusResult = value;
    }

}
