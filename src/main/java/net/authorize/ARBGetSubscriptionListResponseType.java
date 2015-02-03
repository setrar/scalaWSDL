
package net.authorize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ARBGetSubscriptionListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARBGetSubscriptionListResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://api.authorize.net/soap/v1/}ANetApiResponseType">
 *       &lt;sequence>
 *         &lt;element name="totalNumInResultSet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subscriptionDetails" type="{https://api.authorize.net/soap/v1/}ArrayOfSubscriptionDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARBGetSubscriptionListResponseType", propOrder = {
    "totalNumInResultSet",
    "subscriptionDetails"
})
public class ARBGetSubscriptionListResponseType
    extends ANetApiResponseType
{

    protected int totalNumInResultSet;
    protected ArrayOfSubscriptionDetail subscriptionDetails;

    /**
     * Gets the value of the totalNumInResultSet property.
     * 
     */
    public int getTotalNumInResultSet() {
        return totalNumInResultSet;
    }

    /**
     * Sets the value of the totalNumInResultSet property.
     * 
     */
    public void setTotalNumInResultSet(int value) {
        this.totalNumInResultSet = value;
    }

    /**
     * Gets the value of the subscriptionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSubscriptionDetail }
     *     
     */
    public ArrayOfSubscriptionDetail getSubscriptionDetails() {
        return subscriptionDetails;
    }

    /**
     * Sets the value of the subscriptionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSubscriptionDetail }
     *     
     */
    public void setSubscriptionDetails(ArrayOfSubscriptionDetail value) {
        this.subscriptionDetails = value;
    }

}
