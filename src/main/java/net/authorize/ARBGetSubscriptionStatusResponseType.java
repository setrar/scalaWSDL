
package net.authorize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ARBGetSubscriptionStatusResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARBGetSubscriptionStatusResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://api.authorize.net/soap/v1/}ANetApiResponseType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{https://api.authorize.net/soap/v1/}ARBSubscriptionStatusEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARBGetSubscriptionStatusResponseType", propOrder = {
    "status"
})
public class ARBGetSubscriptionStatusResponseType
    extends ANetApiResponseType
{

    protected ARBSubscriptionStatusEnum status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ARBSubscriptionStatusEnum }
     *     
     */
    public ARBSubscriptionStatusEnum getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARBSubscriptionStatusEnum }
     *     
     */
    public void setStatus(ARBSubscriptionStatusEnum value) {
        this.status = value;
    }

}
