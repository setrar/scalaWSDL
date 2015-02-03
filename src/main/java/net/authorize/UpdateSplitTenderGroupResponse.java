
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
 *         &lt;element name="UpdateSplitTenderGroupResult" type="{https://api.authorize.net/soap/v1/}UpdateSplitTenderGroupResponseType" minOccurs="0"/>
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
    "updateSplitTenderGroupResult"
})
@XmlRootElement(name = "UpdateSplitTenderGroupResponse")
public class UpdateSplitTenderGroupResponse {

    @XmlElement(name = "UpdateSplitTenderGroupResult")
    protected UpdateSplitTenderGroupResponseType updateSplitTenderGroupResult;

    /**
     * Gets the value of the updateSplitTenderGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSplitTenderGroupResponseType }
     *     
     */
    public UpdateSplitTenderGroupResponseType getUpdateSplitTenderGroupResult() {
        return updateSplitTenderGroupResult;
    }

    /**
     * Sets the value of the updateSplitTenderGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSplitTenderGroupResponseType }
     *     
     */
    public void setUpdateSplitTenderGroupResult(UpdateSplitTenderGroupResponseType value) {
        this.updateSplitTenderGroupResult = value;
    }

}
