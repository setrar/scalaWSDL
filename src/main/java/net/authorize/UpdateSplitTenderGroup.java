
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
 *         &lt;element name="merchantAuthentication" type="{https://api.authorize.net/soap/v1/}MerchantAuthenticationType" minOccurs="0"/>
 *         &lt;element name="splitTenderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="splitTenderStatus" type="{https://api.authorize.net/soap/v1/}SplitTenderStatusEnum"/>
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
    "merchantAuthentication",
    "splitTenderId",
    "splitTenderStatus"
})
@XmlRootElement(name = "UpdateSplitTenderGroup")
public class UpdateSplitTenderGroup {

    protected MerchantAuthenticationType merchantAuthentication;
    protected long splitTenderId;
    @XmlElement(required = true)
    protected SplitTenderStatusEnum splitTenderStatus;

    /**
     * Gets the value of the merchantAuthentication property.
     * 
     * @return
     *     possible object is
     *     {@link MerchantAuthenticationType }
     *     
     */
    public MerchantAuthenticationType getMerchantAuthentication() {
        return merchantAuthentication;
    }

    /**
     * Sets the value of the merchantAuthentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantAuthenticationType }
     *     
     */
    public void setMerchantAuthentication(MerchantAuthenticationType value) {
        this.merchantAuthentication = value;
    }

    /**
     * Gets the value of the splitTenderId property.
     * 
     */
    public long getSplitTenderId() {
        return splitTenderId;
    }

    /**
     * Sets the value of the splitTenderId property.
     * 
     */
    public void setSplitTenderId(long value) {
        this.splitTenderId = value;
    }

    /**
     * Gets the value of the splitTenderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SplitTenderStatusEnum }
     *     
     */
    public SplitTenderStatusEnum getSplitTenderStatus() {
        return splitTenderStatus;
    }

    /**
     * Sets the value of the splitTenderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitTenderStatusEnum }
     *     
     */
    public void setSplitTenderStatus(SplitTenderStatusEnum value) {
        this.splitTenderStatus = value;
    }

}
