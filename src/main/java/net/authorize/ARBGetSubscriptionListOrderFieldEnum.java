
package net.authorize;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ARBGetSubscriptionListOrderFieldEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ARBGetSubscriptionListOrderFieldEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="id"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="createTimeStampUTC"/>
 *     &lt;enumeration value="lastName"/>
 *     &lt;enumeration value="firstName"/>
 *     &lt;enumeration value="accountNumber"/>
 *     &lt;enumeration value="amount"/>
 *     &lt;enumeration value="pastOccurrences"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ARBGetSubscriptionListOrderFieldEnum")
@XmlEnum
public enum ARBGetSubscriptionListOrderFieldEnum {

    @XmlEnumValue("id")
    ID("id"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("createTimeStampUTC")
    CREATE_TIME_STAMP_UTC("createTimeStampUTC"),
    @XmlEnumValue("lastName")
    LAST_NAME("lastName"),
    @XmlEnumValue("firstName")
    FIRST_NAME("firstName"),
    @XmlEnumValue("accountNumber")
    ACCOUNT_NUMBER("accountNumber"),
    @XmlEnumValue("amount")
    AMOUNT("amount"),
    @XmlEnumValue("pastOccurrences")
    PAST_OCCURRENCES("pastOccurrences");
    private final String value;

    ARBGetSubscriptionListOrderFieldEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ARBGetSubscriptionListOrderFieldEnum fromValue(String v) {
        for (ARBGetSubscriptionListOrderFieldEnum c: ARBGetSubscriptionListOrderFieldEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
