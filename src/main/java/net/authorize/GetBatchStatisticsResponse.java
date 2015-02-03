
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
 *         &lt;element name="GetBatchStatisticsResult" type="{https://api.authorize.net/soap/v1/}GetBatchStatisticsResponseType" minOccurs="0"/>
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
    "getBatchStatisticsResult"
})
@XmlRootElement(name = "GetBatchStatisticsResponse")
public class GetBatchStatisticsResponse {

    @XmlElement(name = "GetBatchStatisticsResult")
    protected GetBatchStatisticsResponseType getBatchStatisticsResult;

    /**
     * Gets the value of the getBatchStatisticsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetBatchStatisticsResponseType }
     *     
     */
    public GetBatchStatisticsResponseType getGetBatchStatisticsResult() {
        return getBatchStatisticsResult;
    }

    /**
     * Sets the value of the getBatchStatisticsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBatchStatisticsResponseType }
     *     
     */
    public void setGetBatchStatisticsResult(GetBatchStatisticsResponseType value) {
        this.getBatchStatisticsResult = value;
    }

}
