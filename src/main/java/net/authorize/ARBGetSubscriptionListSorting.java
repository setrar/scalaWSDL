
package net.authorize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ARBGetSubscriptionListSorting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARBGetSubscriptionListSorting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderBy" type="{https://api.authorize.net/soap/v1/}ARBGetSubscriptionListOrderFieldEnum"/>
 *         &lt;element name="orderDescending" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARBGetSubscriptionListSorting", propOrder = {
    "orderBy",
    "orderDescending"
})
public class ARBGetSubscriptionListSorting {

    @XmlElement(required = true)
    protected ARBGetSubscriptionListOrderFieldEnum orderBy;
    protected boolean orderDescending;

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link ARBGetSubscriptionListOrderFieldEnum }
     *     
     */
    public ARBGetSubscriptionListOrderFieldEnum getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARBGetSubscriptionListOrderFieldEnum }
     *     
     */
    public void setOrderBy(ARBGetSubscriptionListOrderFieldEnum value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the orderDescending property.
     * 
     */
    public boolean isOrderDescending() {
        return orderDescending;
    }

    /**
     * Sets the value of the orderDescending property.
     * 
     */
    public void setOrderDescending(boolean value) {
        this.orderDescending = value;
    }

}
