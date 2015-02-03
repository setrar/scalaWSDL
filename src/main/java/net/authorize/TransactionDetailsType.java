
package net.authorize;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransactionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="splitTenderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="submitTimeUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="submitTimeLocal" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="responseReasonCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="responseReasonDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AVSResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCodeResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CAVVResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FDSFilterAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FDSFilters" type="{https://api.authorize.net/soap/v1/}ArrayOfFDSFilterType" minOccurs="0"/>
 *         &lt;element name="batch" type="{https://api.authorize.net/soap/v1/}BatchDetailsType" minOccurs="0"/>
 *         &lt;element name="order" type="{https://api.authorize.net/soap/v1/}OrderExType" minOccurs="0"/>
 *         &lt;element name="requestedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="authAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="settleAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="tax" type="{https://api.authorize.net/soap/v1/}ExtendedAmountType" minOccurs="0"/>
 *         &lt;element name="shipping" type="{https://api.authorize.net/soap/v1/}ExtendedAmountType" minOccurs="0"/>
 *         &lt;element name="duty" type="{https://api.authorize.net/soap/v1/}ExtendedAmountType" minOccurs="0"/>
 *         &lt;element name="lineItems" type="{https://api.authorize.net/soap/v1/}LineItemType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prepaidBalanceRemaining" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="payment" type="{https://api.authorize.net/soap/v1/}PaymentMaskedType" minOccurs="0"/>
 *         &lt;element name="customer" type="{https://api.authorize.net/soap/v1/}CustomerDataType" minOccurs="0"/>
 *         &lt;element name="billTo" type="{https://api.authorize.net/soap/v1/}CustomerAddressType" minOccurs="0"/>
 *         &lt;element name="shipTo" type="{https://api.authorize.net/soap/v1/}NameAndAddressType" minOccurs="0"/>
 *         &lt;element name="recurringBilling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customerIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marketType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobileDeviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subscription" type="{https://api.authorize.net/soap/v1/}subscriptionPaymentType" minOccurs="0"/>
 *         &lt;element name="returnedItems" type="{https://api.authorize.net/soap/v1/}ArrayOfReturnedItem" minOccurs="0"/>
 *         &lt;element name="solution" type="{https://api.authorize.net/soap/v1/}solutionInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionDetailsType", propOrder = {
    "transId",
    "refTransId",
    "splitTenderId",
    "submitTimeUTC",
    "submitTimeLocal",
    "transactionType",
    "transactionStatus",
    "responseCode",
    "responseReasonCode",
    "responseReasonDescription",
    "authCode",
    "avsResponse",
    "cardCodeResponse",
    "cavvResponse",
    "fdsFilterAction",
    "fdsFilters",
    "batch",
    "order",
    "requestedAmount",
    "authAmount",
    "settleAmount",
    "tax",
    "shipping",
    "duty",
    "lineItems",
    "prepaidBalanceRemaining",
    "currencyCode",
    "taxExempt",
    "payment",
    "customer",
    "billTo",
    "shipTo",
    "recurringBilling",
    "customerIP",
    "marketType",
    "product",
    "mobileDeviceId",
    "subscription",
    "returnedItems",
    "solution"
})
public class TransactionDetailsType {

    protected String transId;
    protected String refTransId;
    protected Long splitTenderId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submitTimeUTC;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submitTimeLocal;
    protected String transactionType;
    protected String transactionStatus;
    protected int responseCode;
    protected int responseReasonCode;
    protected String responseReasonDescription;
    protected String authCode;
    @XmlElement(name = "AVSResponse")
    protected String avsResponse;
    protected String cardCodeResponse;
    @XmlElement(name = "CAVVResponse")
    protected String cavvResponse;
    @XmlElement(name = "FDSFilterAction")
    protected String fdsFilterAction;
    @XmlElement(name = "FDSFilters")
    protected ArrayOfFDSFilterType fdsFilters;
    protected BatchDetailsType batch;
    protected OrderExType order;
    protected BigDecimal requestedAmount;
    @XmlElement(required = true)
    protected BigDecimal authAmount;
    @XmlElement(required = true)
    protected BigDecimal settleAmount;
    protected ExtendedAmountType tax;
    protected ExtendedAmountType shipping;
    protected ExtendedAmountType duty;
    protected List<LineItemType> lineItems;
    protected BigDecimal prepaidBalanceRemaining;
    protected String currencyCode;
    protected Boolean taxExempt;
    protected PaymentMaskedType payment;
    protected CustomerDataType customer;
    protected CustomerAddressType billTo;
    protected NameAndAddressType shipTo;
    protected Boolean recurringBilling;
    protected String customerIP;
    protected String marketType;
    protected String product;
    protected String mobileDeviceId;
    protected SubscriptionPaymentType subscription;
    protected ArrayOfReturnedItem returnedItems;
    protected SolutionInfo solution;

    /**
     * Gets the value of the transId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransId() {
        return transId;
    }

    /**
     * Sets the value of the transId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransId(String value) {
        this.transId = value;
    }

    /**
     * Gets the value of the refTransId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefTransId() {
        return refTransId;
    }

    /**
     * Sets the value of the refTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefTransId(String value) {
        this.refTransId = value;
    }

    /**
     * Gets the value of the splitTenderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSplitTenderId() {
        return splitTenderId;
    }

    /**
     * Sets the value of the splitTenderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSplitTenderId(Long value) {
        this.splitTenderId = value;
    }

    /**
     * Gets the value of the submitTimeUTC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitTimeUTC() {
        return submitTimeUTC;
    }

    /**
     * Sets the value of the submitTimeUTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitTimeUTC(XMLGregorianCalendar value) {
        this.submitTimeUTC = value;
    }

    /**
     * Gets the value of the submitTimeLocal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmitTimeLocal() {
        return submitTimeLocal;
    }

    /**
     * Sets the value of the submitTimeLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmitTimeLocal(XMLGregorianCalendar value) {
        this.submitTimeLocal = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionStatus(String value) {
        this.transactionStatus = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     */
    public void setResponseCode(int value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the responseReasonCode property.
     * 
     */
    public int getResponseReasonCode() {
        return responseReasonCode;
    }

    /**
     * Sets the value of the responseReasonCode property.
     * 
     */
    public void setResponseReasonCode(int value) {
        this.responseReasonCode = value;
    }

    /**
     * Gets the value of the responseReasonDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseReasonDescription() {
        return responseReasonDescription;
    }

    /**
     * Sets the value of the responseReasonDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseReasonDescription(String value) {
        this.responseReasonDescription = value;
    }

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the avsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSResponse() {
        return avsResponse;
    }

    /**
     * Sets the value of the avsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSResponse(String value) {
        this.avsResponse = value;
    }

    /**
     * Gets the value of the cardCodeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCodeResponse() {
        return cardCodeResponse;
    }

    /**
     * Sets the value of the cardCodeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCodeResponse(String value) {
        this.cardCodeResponse = value;
    }

    /**
     * Gets the value of the cavvResponse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAVVResponse() {
        return cavvResponse;
    }

    /**
     * Sets the value of the cavvResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAVVResponse(String value) {
        this.cavvResponse = value;
    }

    /**
     * Gets the value of the fdsFilterAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFDSFilterAction() {
        return fdsFilterAction;
    }

    /**
     * Sets the value of the fdsFilterAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFDSFilterAction(String value) {
        this.fdsFilterAction = value;
    }

    /**
     * Gets the value of the fdsFilters property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFDSFilterType }
     *     
     */
    public ArrayOfFDSFilterType getFDSFilters() {
        return fdsFilters;
    }

    /**
     * Sets the value of the fdsFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFDSFilterType }
     *     
     */
    public void setFDSFilters(ArrayOfFDSFilterType value) {
        this.fdsFilters = value;
    }

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

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderExType }
     *     
     */
    public OrderExType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderExType }
     *     
     */
    public void setOrder(OrderExType value) {
        this.order = value;
    }

    /**
     * Gets the value of the requestedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestedAmount() {
        return requestedAmount;
    }

    /**
     * Sets the value of the requestedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestedAmount(BigDecimal value) {
        this.requestedAmount = value;
    }

    /**
     * Gets the value of the authAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthAmount() {
        return authAmount;
    }

    /**
     * Sets the value of the authAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthAmount(BigDecimal value) {
        this.authAmount = value;
    }

    /**
     * Gets the value of the settleAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSettleAmount() {
        return settleAmount;
    }

    /**
     * Sets the value of the settleAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSettleAmount(BigDecimal value) {
        this.settleAmount = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAmountType }
     *     
     */
    public ExtendedAmountType getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAmountType }
     *     
     */
    public void setTax(ExtendedAmountType value) {
        this.tax = value;
    }

    /**
     * Gets the value of the shipping property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAmountType }
     *     
     */
    public ExtendedAmountType getShipping() {
        return shipping;
    }

    /**
     * Sets the value of the shipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAmountType }
     *     
     */
    public void setShipping(ExtendedAmountType value) {
        this.shipping = value;
    }

    /**
     * Gets the value of the duty property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAmountType }
     *     
     */
    public ExtendedAmountType getDuty() {
        return duty;
    }

    /**
     * Sets the value of the duty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAmountType }
     *     
     */
    public void setDuty(ExtendedAmountType value) {
        this.duty = value;
    }

    /**
     * Gets the value of the lineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemType }
     * 
     * 
     */
    public List<LineItemType> getLineItems() {
        if (lineItems == null) {
            lineItems = new ArrayList<LineItemType>();
        }
        return this.lineItems;
    }

    /**
     * Gets the value of the prepaidBalanceRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrepaidBalanceRemaining() {
        return prepaidBalanceRemaining;
    }

    /**
     * Sets the value of the prepaidBalanceRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrepaidBalanceRemaining(BigDecimal value) {
        this.prepaidBalanceRemaining = value;
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
     * Gets the value of the taxExempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxExempt() {
        return taxExempt;
    }

    /**
     * Sets the value of the taxExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxExempt(Boolean value) {
        this.taxExempt = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMaskedType }
     *     
     */
    public PaymentMaskedType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMaskedType }
     *     
     */
    public void setPayment(PaymentMaskedType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDataType }
     *     
     */
    public CustomerDataType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDataType }
     *     
     */
    public void setCustomer(CustomerDataType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the billTo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAddressType }
     *     
     */
    public CustomerAddressType getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAddressType }
     *     
     */
    public void setBillTo(CustomerAddressType value) {
        this.billTo = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddressType }
     *     
     */
    public NameAndAddressType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddressType }
     *     
     */
    public void setShipTo(NameAndAddressType value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the recurringBilling property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecurringBilling() {
        return recurringBilling;
    }

    /**
     * Sets the value of the recurringBilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecurringBilling(Boolean value) {
        this.recurringBilling = value;
    }

    /**
     * Gets the value of the customerIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIP() {
        return customerIP;
    }

    /**
     * Sets the value of the customerIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIP(String value) {
        this.customerIP = value;
    }

    /**
     * Gets the value of the marketType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketType() {
        return marketType;
    }

    /**
     * Sets the value of the marketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketType(String value) {
        this.marketType = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the mobileDeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileDeviceId() {
        return mobileDeviceId;
    }

    /**
     * Sets the value of the mobileDeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileDeviceId(String value) {
        this.mobileDeviceId = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionPaymentType }
     *     
     */
    public SubscriptionPaymentType getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionPaymentType }
     *     
     */
    public void setSubscription(SubscriptionPaymentType value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the returnedItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfReturnedItem }
     *     
     */
    public ArrayOfReturnedItem getReturnedItems() {
        return returnedItems;
    }

    /**
     * Sets the value of the returnedItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfReturnedItem }
     *     
     */
    public void setReturnedItems(ArrayOfReturnedItem value) {
        this.returnedItems = value;
    }

    /**
     * Gets the value of the solution property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionInfo }
     *     
     */
    public SolutionInfo getSolution() {
        return solution;
    }

    /**
     * Sets the value of the solution property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionInfo }
     *     
     */
    public void setSolution(SolutionInfo value) {
        this.solution = value;
    }

}
