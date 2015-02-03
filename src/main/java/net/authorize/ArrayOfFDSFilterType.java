
package net.authorize;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFDSFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFDSFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FDSFilter" type="{https://api.authorize.net/soap/v1/}FDSFilterType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFDSFilterType", propOrder = {
    "fdsFilter"
})
public class ArrayOfFDSFilterType {

    @XmlElement(name = "FDSFilter")
    protected List<FDSFilterType> fdsFilter;

    /**
     * Gets the value of the fdsFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fdsFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFDSFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FDSFilterType }
     * 
     * 
     */
    public List<FDSFilterType> getFDSFilter() {
        if (fdsFilter == null) {
            fdsFilter = new ArrayList<FDSFilterType>();
        }
        return this.fdsFilter;
    }

}
