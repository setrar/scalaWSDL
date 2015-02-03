
package net.authorize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSettledBatchListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSettledBatchListResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://api.authorize.net/soap/v1/}ANetApiResponseType">
 *       &lt;sequence>
 *         &lt;element name="batchList" type="{https://api.authorize.net/soap/v1/}ArrayOfBatchDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSettledBatchListResponseType", propOrder = {
    "batchList"
})
public class GetSettledBatchListResponseType
    extends ANetApiResponseType
{

    protected ArrayOfBatchDetailsType batchList;

    /**
     * Gets the value of the batchList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchDetailsType }
     *     
     */
    public ArrayOfBatchDetailsType getBatchList() {
        return batchList;
    }

    /**
     * Sets the value of the batchList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchDetailsType }
     *     
     */
    public void setBatchList(ArrayOfBatchDetailsType value) {
        this.batchList = value;
    }

}
