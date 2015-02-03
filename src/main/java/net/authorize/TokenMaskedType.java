
package net.authorize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TokenMaskedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenMaskedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tokenSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tokenNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenMaskedType", propOrder = {
    "tokenSource",
    "tokenNumber",
    "expirationDate"
})
public class TokenMaskedType {

    protected String tokenSource;
    protected String tokenNumber;
    protected String expirationDate;

    /**
     * Gets the value of the tokenSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenSource() {
        return tokenSource;
    }

    /**
     * Sets the value of the tokenSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenSource(String value) {
        this.tokenSource = value;
    }

    /**
     * Gets the value of the tokenNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenNumber() {
        return tokenNumber;
    }

    /**
     * Sets the value of the tokenNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenNumber(String value) {
        this.tokenNumber = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

}
