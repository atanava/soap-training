
package com.atanava.soap.ws.client.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingBoardStateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PostingBoardStateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="queued"/&gt;
 *     &lt;enumeration value="scheduled"/&gt;
 *     &lt;enumeration value="posted"/&gt;
 *     &lt;enumeration value="deferred"/&gt;
 *     &lt;enumeration value="expired"/&gt;
 *     &lt;enumeration value="deleted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PostingBoardStateType", namespace = "http://jws.equest.com/v2/soap/")
@XmlEnum
public enum PostingBoardStateType {

    @XmlEnumValue("queued")
    QUEUED("queued"),
    @XmlEnumValue("scheduled")
    SCHEDULED("scheduled"),
    @XmlEnumValue("posted")
    POSTED("posted"),
    @XmlEnumValue("deferred")
    DEFERRED("deferred"),
    @XmlEnumValue("expired")
    EXPIRED("expired"),
    @XmlEnumValue("deleted")
    DELETED("deleted");
    private final String value;

    PostingBoardStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PostingBoardStateType fromValue(String v) {
        for (PostingBoardStateType c: PostingBoardStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
