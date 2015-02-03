
package net.authorize;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="creditCard"/>
 *     &lt;enumeration value="eCheck"/>
 *     &lt;enumeration value="payPal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paymentMethodEnum")
@XmlEnum
public enum PaymentMethodEnum {

    @XmlEnumValue("creditCard")
    CREDIT_CARD("creditCard"),
    @XmlEnumValue("eCheck")
    E_CHECK("eCheck"),
    @XmlEnumValue("payPal")
    PAY_PAL("payPal");
    private final String value;

    PaymentMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodEnum fromValue(String v) {
        for (PaymentMethodEnum c: PaymentMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
