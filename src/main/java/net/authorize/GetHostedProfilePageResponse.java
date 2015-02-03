
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
 *         &lt;element name="GetHostedProfilePageResult" type="{https://api.authorize.net/soap/v1/}GetHostedProfilePageResponseType" minOccurs="0"/>
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
    "getHostedProfilePageResult"
})
@XmlRootElement(name = "GetHostedProfilePageResponse")
public class GetHostedProfilePageResponse {

    @XmlElement(name = "GetHostedProfilePageResult")
    protected GetHostedProfilePageResponseType getHostedProfilePageResult;

    /**
     * Gets the value of the getHostedProfilePageResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetHostedProfilePageResponseType }
     *     
     */
    public GetHostedProfilePageResponseType getGetHostedProfilePageResult() {
        return getHostedProfilePageResult;
    }

    /**
     * Sets the value of the getHostedProfilePageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHostedProfilePageResponseType }
     *     
     */
    public void setGetHostedProfilePageResult(GetHostedProfilePageResponseType value) {
        this.getHostedProfilePageResult = value;
    }

}
