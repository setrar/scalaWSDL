
package net.authorize;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GetSettledBatchListRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSettledBatchListRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="includeStatistics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="firstSettlementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastSettlementDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSettledBatchListRequestType", propOrder = {
    "includeStatistics",
    "firstSettlementDate",
    "lastSettlementDate"
})
public class GetSettledBatchListRequestType {

    protected Boolean includeStatistics;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstSettlementDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSettlementDate;

    /**
     * Gets the value of the includeStatistics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeStatistics() {
        return includeStatistics;
    }

    /**
     * Sets the value of the includeStatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeStatistics(Boolean value) {
        this.includeStatistics = value;
    }

    /**
     * Gets the value of the firstSettlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstSettlementDate() {
        return firstSettlementDate;
    }

    /**
     * Sets the value of the firstSettlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstSettlementDate(XMLGregorianCalendar value) {
        this.firstSettlementDate = value;
    }

    /**
     * Gets the value of the lastSettlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSettlementDate() {
        return lastSettlementDate;
    }

    /**
     * Sets the value of the lastSettlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSettlementDate(XMLGregorianCalendar value) {
        this.lastSettlementDate = value;
    }

}
