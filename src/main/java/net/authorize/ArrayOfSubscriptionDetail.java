
package net.authorize;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSubscriptionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSubscriptionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subscriptionDetail" type="{https://api.authorize.net/soap/v1/}SubscriptionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSubscriptionDetail", propOrder = {
    "subscriptionDetail"
})
public class ArrayOfSubscriptionDetail {

    @XmlElement(nillable = true)
    protected List<SubscriptionDetail> subscriptionDetail;

    /**
     * Gets the value of the subscriptionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionDetail }
     * 
     * 
     */
    public List<SubscriptionDetail> getSubscriptionDetail() {
        if (subscriptionDetail == null) {
            subscriptionDetail = new ArrayList<SubscriptionDetail>();
        }
        return this.subscriptionDetail;
    }

}
