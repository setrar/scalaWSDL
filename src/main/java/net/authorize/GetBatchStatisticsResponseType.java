
package net.authorize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBatchStatisticsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBatchStatisticsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://api.authorize.net/soap/v1/}ANetApiResponseType">
 *       &lt;sequence>
 *         &lt;element name="batch" type="{https://api.authorize.net/soap/v1/}BatchDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBatchStatisticsResponseType", propOrder = {
    "batch"
})
public class GetBatchStatisticsResponseType
    extends ANetApiResponseType
{

    protected BatchDetailsType batch;

    /**
     * Gets the value of the batch property.
     * 
     * @return
     *     possible object is
     *     {@link BatchDetailsType }
     *     
     */
    public BatchDetailsType getBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchDetailsType }
     *     
     */
    public void setBatch(BatchDetailsType value) {
        this.batch = value;
    }

}
