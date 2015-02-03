
package net.authorize;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchStatisticType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchStatisticType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="chargeCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="refundAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="refundCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="voidCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="declineCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="returnedItemAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="returnedItemAmountSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="returnedItemCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="returnedItemCountSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="chargebackAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="chargebackAmountSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="chargebackCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="chargebackCountSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="correctionNoticeCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="correctionNoticeCountSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="chargeChargeBackAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="chargeChargeBackAmountSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="chargeChargeBackCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="chargeChargeBackCountSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="refundChargeBackAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="refundChargeBackAmountSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="refundChargeBackCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="refundChargeBackCountSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="chargeReturnedItemsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="chargeReturnedItemsAmountSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="chargeReturnedItemsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="chargeReturnedItemsCountSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="refundReturnedItemsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="refundReturnedItemsAmountSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="refundReturnedItemsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="refundReturnedItemsCountSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchStatisticType", propOrder = {
    "accountType",
    "currencyCode",
    "chargeAmount",
    "chargeCount",
    "refundAmount",
    "refundCount",
    "voidCount",
    "declineCount",
    "errorCount",
    "returnedItemAmount",
    "returnedItemAmountSpecified",
    "returnedItemCount",
    "returnedItemCountSpecified",
    "chargebackAmount",
    "chargebackAmountSpecified",
    "chargebackCount",
    "chargebackCountSpecified",
    "correctionNoticeCount",
    "correctionNoticeCountSpecified",
    "chargeChargeBackAmount",
    "chargeChargeBackAmountSpecified",
    "chargeChargeBackCount",
    "chargeChargeBackCountSpecified",
    "refundChargeBackAmount",
    "refundChargeBackAmountSpecified",
    "refundChargeBackCount",
    "refundChargeBackCountSpecified",
    "chargeReturnedItemsAmount",
    "chargeReturnedItemsAmountSpecified",
    "chargeReturnedItemsCount",
    "chargeReturnedItemsCountSpecified",
    "refundReturnedItemsAmount",
    "refundReturnedItemsAmountSpecified",
    "refundReturnedItemsCount",
    "refundReturnedItemsCountSpecified"
})
public class BatchStatisticType {

    protected String accountType;
    protected String currencyCode;
    @XmlElement(required = true)
    protected BigDecimal chargeAmount;
    protected int chargeCount;
    @XmlElement(required = true)
    protected BigDecimal refundAmount;
    protected int refundCount;
    protected int voidCount;
    protected int declineCount;
    protected int errorCount;
    protected BigDecimal returnedItemAmount;
    protected boolean returnedItemAmountSpecified;
    protected Integer returnedItemCount;
    protected boolean returnedItemCountSpecified;
    protected BigDecimal chargebackAmount;
    protected boolean chargebackAmountSpecified;
    protected Integer chargebackCount;
    protected boolean chargebackCountSpecified;
    protected Integer correctionNoticeCount;
    protected boolean correctionNoticeCountSpecified;
    protected BigDecimal chargeChargeBackAmount;
    protected boolean chargeChargeBackAmountSpecified;
    protected Integer chargeChargeBackCount;
    protected boolean chargeChargeBackCountSpecified;
    protected BigDecimal refundChargeBackAmount;
    protected boolean refundChargeBackAmountSpecified;
    protected Integer refundChargeBackCount;
    protected boolean refundChargeBackCountSpecified;
    protected BigDecimal chargeReturnedItemsAmount;
    protected boolean chargeReturnedItemsAmountSpecified;
    protected Integer chargeReturnedItemsCount;
    protected boolean chargeReturnedItemsCountSpecified;
    protected BigDecimal refundReturnedItemsAmount;
    protected boolean refundReturnedItemsAmountSpecified;
    protected Integer refundReturnedItemsCount;
    protected boolean refundReturnedItemsCountSpecified;

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the chargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Sets the value of the chargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeAmount(BigDecimal value) {
        this.chargeAmount = value;
    }

    /**
     * Gets the value of the chargeCount property.
     * 
     */
    public int getChargeCount() {
        return chargeCount;
    }

    /**
     * Sets the value of the chargeCount property.
     * 
     */
    public void setChargeCount(int value) {
        this.chargeCount = value;
    }

    /**
     * Gets the value of the refundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    /**
     * Sets the value of the refundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundAmount(BigDecimal value) {
        this.refundAmount = value;
    }

    /**
     * Gets the value of the refundCount property.
     * 
     */
    public int getRefundCount() {
        return refundCount;
    }

    /**
     * Sets the value of the refundCount property.
     * 
     */
    public void setRefundCount(int value) {
        this.refundCount = value;
    }

    /**
     * Gets the value of the voidCount property.
     * 
     */
    public int getVoidCount() {
        return voidCount;
    }

    /**
     * Sets the value of the voidCount property.
     * 
     */
    public void setVoidCount(int value) {
        this.voidCount = value;
    }

    /**
     * Gets the value of the declineCount property.
     * 
     */
    public int getDeclineCount() {
        return declineCount;
    }

    /**
     * Sets the value of the declineCount property.
     * 
     */
    public void setDeclineCount(int value) {
        this.declineCount = value;
    }

    /**
     * Gets the value of the errorCount property.
     * 
     */
    public int getErrorCount() {
        return errorCount;
    }

    /**
     * Sets the value of the errorCount property.
     * 
     */
    public void setErrorCount(int value) {
        this.errorCount = value;
    }

    /**
     * Gets the value of the returnedItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReturnedItemAmount() {
        return returnedItemAmount;
    }

    /**
     * Sets the value of the returnedItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReturnedItemAmount(BigDecimal value) {
        this.returnedItemAmount = value;
    }

    /**
     * Gets the value of the returnedItemAmountSpecified property.
     * 
     */
    public boolean isReturnedItemAmountSpecified() {
        return returnedItemAmountSpecified;
    }

    /**
     * Sets the value of the returnedItemAmountSpecified property.
     * 
     */
    public void setReturnedItemAmountSpecified(boolean value) {
        this.returnedItemAmountSpecified = value;
    }

    /**
     * Gets the value of the returnedItemCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReturnedItemCount() {
        return returnedItemCount;
    }

    /**
     * Sets the value of the returnedItemCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReturnedItemCount(Integer value) {
        this.returnedItemCount = value;
    }

    /**
     * Gets the value of the returnedItemCountSpecified property.
     * 
     */
    public boolean isReturnedItemCountSpecified() {
        return returnedItemCountSpecified;
    }

    /**
     * Sets the value of the returnedItemCountSpecified property.
     * 
     */
    public void setReturnedItemCountSpecified(boolean value) {
        this.returnedItemCountSpecified = value;
    }

    /**
     * Gets the value of the chargebackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargebackAmount() {
        return chargebackAmount;
    }

    /**
     * Sets the value of the chargebackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargebackAmount(BigDecimal value) {
        this.chargebackAmount = value;
    }

    /**
     * Gets the value of the chargebackAmountSpecified property.
     * 
     */
    public boolean isChargebackAmountSpecified() {
        return chargebackAmountSpecified;
    }

    /**
     * Sets the value of the chargebackAmountSpecified property.
     * 
     */
    public void setChargebackAmountSpecified(boolean value) {
        this.chargebackAmountSpecified = value;
    }

    /**
     * Gets the value of the chargebackCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChargebackCount() {
        return chargebackCount;
    }

    /**
     * Sets the value of the chargebackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChargebackCount(Integer value) {
        this.chargebackCount = value;
    }

    /**
     * Gets the value of the chargebackCountSpecified property.
     * 
     */
    public boolean isChargebackCountSpecified() {
        return chargebackCountSpecified;
    }

    /**
     * Sets the value of the chargebackCountSpecified property.
     * 
     */
    public void setChargebackCountSpecified(boolean value) {
        this.chargebackCountSpecified = value;
    }

    /**
     * Gets the value of the correctionNoticeCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCorrectionNoticeCount() {
        return correctionNoticeCount;
    }

    /**
     * Sets the value of the correctionNoticeCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorrectionNoticeCount(Integer value) {
        this.correctionNoticeCount = value;
    }

    /**
     * Gets the value of the correctionNoticeCountSpecified property.
     * 
     */
    public boolean isCorrectionNoticeCountSpecified() {
        return correctionNoticeCountSpecified;
    }

    /**
     * Sets the value of the correctionNoticeCountSpecified property.
     * 
     */
    public void setCorrectionNoticeCountSpecified(boolean value) {
        this.correctionNoticeCountSpecified = value;
    }

    /**
     * Gets the value of the chargeChargeBackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeChargeBackAmount() {
        return chargeChargeBackAmount;
    }

    /**
     * Sets the value of the chargeChargeBackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeChargeBackAmount(BigDecimal value) {
        this.chargeChargeBackAmount = value;
    }

    /**
     * Gets the value of the chargeChargeBackAmountSpecified property.
     * 
     */
    public boolean isChargeChargeBackAmountSpecified() {
        return chargeChargeBackAmountSpecified;
    }

    /**
     * Sets the value of the chargeChargeBackAmountSpecified property.
     * 
     */
    public void setChargeChargeBackAmountSpecified(boolean value) {
        this.chargeChargeBackAmountSpecified = value;
    }

    /**
     * Gets the value of the chargeChargeBackCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChargeChargeBackCount() {
        return chargeChargeBackCount;
    }

    /**
     * Sets the value of the chargeChargeBackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChargeChargeBackCount(Integer value) {
        this.chargeChargeBackCount = value;
    }

    /**
     * Gets the value of the chargeChargeBackCountSpecified property.
     * 
     */
    public boolean isChargeChargeBackCountSpecified() {
        return chargeChargeBackCountSpecified;
    }

    /**
     * Sets the value of the chargeChargeBackCountSpecified property.
     * 
     */
    public void setChargeChargeBackCountSpecified(boolean value) {
        this.chargeChargeBackCountSpecified = value;
    }

    /**
     * Gets the value of the refundChargeBackAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundChargeBackAmount() {
        return refundChargeBackAmount;
    }

    /**
     * Sets the value of the refundChargeBackAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundChargeBackAmount(BigDecimal value) {
        this.refundChargeBackAmount = value;
    }

    /**
     * Gets the value of the refundChargeBackAmountSpecified property.
     * 
     */
    public boolean isRefundChargeBackAmountSpecified() {
        return refundChargeBackAmountSpecified;
    }

    /**
     * Sets the value of the refundChargeBackAmountSpecified property.
     * 
     */
    public void setRefundChargeBackAmountSpecified(boolean value) {
        this.refundChargeBackAmountSpecified = value;
    }

    /**
     * Gets the value of the refundChargeBackCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefundChargeBackCount() {
        return refundChargeBackCount;
    }

    /**
     * Sets the value of the refundChargeBackCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefundChargeBackCount(Integer value) {
        this.refundChargeBackCount = value;
    }

    /**
     * Gets the value of the refundChargeBackCountSpecified property.
     * 
     */
    public boolean isRefundChargeBackCountSpecified() {
        return refundChargeBackCountSpecified;
    }

    /**
     * Sets the value of the refundChargeBackCountSpecified property.
     * 
     */
    public void setRefundChargeBackCountSpecified(boolean value) {
        this.refundChargeBackCountSpecified = value;
    }

    /**
     * Gets the value of the chargeReturnedItemsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargeReturnedItemsAmount() {
        return chargeReturnedItemsAmount;
    }

    /**
     * Sets the value of the chargeReturnedItemsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargeReturnedItemsAmount(BigDecimal value) {
        this.chargeReturnedItemsAmount = value;
    }

    /**
     * Gets the value of the chargeReturnedItemsAmountSpecified property.
     * 
     */
    public boolean isChargeReturnedItemsAmountSpecified() {
        return chargeReturnedItemsAmountSpecified;
    }

    /**
     * Sets the value of the chargeReturnedItemsAmountSpecified property.
     * 
     */
    public void setChargeReturnedItemsAmountSpecified(boolean value) {
        this.chargeReturnedItemsAmountSpecified = value;
    }

    /**
     * Gets the value of the chargeReturnedItemsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChargeReturnedItemsCount() {
        return chargeReturnedItemsCount;
    }

    /**
     * Sets the value of the chargeReturnedItemsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChargeReturnedItemsCount(Integer value) {
        this.chargeReturnedItemsCount = value;
    }

    /**
     * Gets the value of the chargeReturnedItemsCountSpecified property.
     * 
     */
    public boolean isChargeReturnedItemsCountSpecified() {
        return chargeReturnedItemsCountSpecified;
    }

    /**
     * Sets the value of the chargeReturnedItemsCountSpecified property.
     * 
     */
    public void setChargeReturnedItemsCountSpecified(boolean value) {
        this.chargeReturnedItemsCountSpecified = value;
    }

    /**
     * Gets the value of the refundReturnedItemsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRefundReturnedItemsAmount() {
        return refundReturnedItemsAmount;
    }

    /**
     * Sets the value of the refundReturnedItemsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRefundReturnedItemsAmount(BigDecimal value) {
        this.refundReturnedItemsAmount = value;
    }

    /**
     * Gets the value of the refundReturnedItemsAmountSpecified property.
     * 
     */
    public boolean isRefundReturnedItemsAmountSpecified() {
        return refundReturnedItemsAmountSpecified;
    }

    /**
     * Sets the value of the refundReturnedItemsAmountSpecified property.
     * 
     */
    public void setRefundReturnedItemsAmountSpecified(boolean value) {
        this.refundReturnedItemsAmountSpecified = value;
    }

    /**
     * Gets the value of the refundReturnedItemsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefundReturnedItemsCount() {
        return refundReturnedItemsCount;
    }

    /**
     * Sets the value of the refundReturnedItemsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefundReturnedItemsCount(Integer value) {
        this.refundReturnedItemsCount = value;
    }

    /**
     * Gets the value of the refundReturnedItemsCountSpecified property.
     * 
     */
    public boolean isRefundReturnedItemsCountSpecified() {
        return refundReturnedItemsCountSpecified;
    }

    /**
     * Sets the value of the refundReturnedItemsCountSpecified property.
     * 
     */
    public void setRefundReturnedItemsCountSpecified(boolean value) {
        this.refundReturnedItemsCountSpecified = value;
    }

}
