
package net.authorize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SettingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="settingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="settingValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettingType", propOrder = {
    "settingName",
    "settingValue"
})
public class SettingType {

    protected String settingName;
    protected String settingValue;

    /**
     * Gets the value of the settingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingName() {
        return settingName;
    }

    /**
     * Sets the value of the settingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingName(String value) {
        this.settingName = value;
    }

    /**
     * Gets the value of the settingValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingValue() {
        return settingValue;
    }

    /**
     * Sets the value of the settingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingValue(String value) {
        this.settingValue = value;
    }

}
