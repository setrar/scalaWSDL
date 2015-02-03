
package net.authorize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ARBGetSubscriptionListRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ARBGetSubscriptionListRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchType" type="{https://api.authorize.net/soap/v1/}ARBGetSubscriptionListSearchTypeEnum"/>
 *         &lt;element name="sorting" type="{https://api.authorize.net/soap/v1/}ARBGetSubscriptionListSorting" minOccurs="0"/>
 *         &lt;element name="paging" type="{https://api.authorize.net/soap/v1/}Paging" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ARBGetSubscriptionListRequestType", propOrder = {
    "searchType",
    "sorting",
    "paging"
})
public class ARBGetSubscriptionListRequestType {

    @XmlElement(required = true)
    protected ARBGetSubscriptionListSearchTypeEnum searchType;
    protected ARBGetSubscriptionListSorting sorting;
    protected Paging paging;

    /**
     * Gets the value of the searchType property.
     * 
     * @return
     *     possible object is
     *     {@link ARBGetSubscriptionListSearchTypeEnum }
     *     
     */
    public ARBGetSubscriptionListSearchTypeEnum getSearchType() {
        return searchType;
    }

    /**
     * Sets the value of the searchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARBGetSubscriptionListSearchTypeEnum }
     *     
     */
    public void setSearchType(ARBGetSubscriptionListSearchTypeEnum value) {
        this.searchType = value;
    }

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link ARBGetSubscriptionListSorting }
     *     
     */
    public ARBGetSubscriptionListSorting getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ARBGetSubscriptionListSorting }
     *     
     */
    public void setSorting(ARBGetSubscriptionListSorting value) {
        this.sorting = value;
    }

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

}
