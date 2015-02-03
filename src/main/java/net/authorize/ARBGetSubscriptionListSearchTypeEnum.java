
package net.authorize;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ARBGetSubscriptionListSearchTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ARBGetSubscriptionListSearchTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cardExpiringThisMonth"/>
 *     &lt;enumeration value="subscriptionActive"/>
 *     &lt;enumeration value="subscriptionExpiringThisMonth"/>
 *     &lt;enumeration value="subscriptionInactive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ARBGetSubscriptionListSearchTypeEnum")
@XmlEnum
public enum ARBGetSubscriptionListSearchTypeEnum {

    @XmlEnumValue("cardExpiringThisMonth")
    CARD_EXPIRING_THIS_MONTH("cardExpiringThisMonth"),
    @XmlEnumValue("subscriptionActive")
    SUBSCRIPTION_ACTIVE("subscriptionActive"),
    @XmlEnumValue("subscriptionExpiringThisMonth")
    SUBSCRIPTION_EXPIRING_THIS_MONTH("subscriptionExpiringThisMonth"),
    @XmlEnumValue("subscriptionInactive")
    SUBSCRIPTION_INACTIVE("subscriptionInactive");
    private final String value;

    ARBGetSubscriptionListSearchTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ARBGetSubscriptionListSearchTypeEnum fromValue(String v) {
        for (ARBGetSubscriptionListSearchTypeEnum c: ARBGetSubscriptionListSearchTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
