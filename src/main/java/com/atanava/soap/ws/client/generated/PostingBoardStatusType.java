
package com.atanava.soap.ws.client.generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingBoardStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingBoardStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queuedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="scheduledAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="postedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="expiresAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deletedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="deferredReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="state" type="{http://jws.equest.com/v2/soap/}PostingBoardStateType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingBoardStatusType", namespace = "http://jws.equest.com/v2/soap/", propOrder = {
    "queuedAt",
    "scheduledAt",
    "postedAt",
    "expiresAt",
    "deletedAt",
    "deferredReason"
})
public class PostingBoardStatusType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar queuedAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar postedAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiresAt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deletedAt;
    protected String deferredReason;
    @XmlAttribute(name = "state")
    protected PostingBoardStateType state;

    /**
     * Gets the value of the queuedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQueuedAt() {
        return queuedAt;
    }

    /**
     * Sets the value of the queuedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQueuedAt(XMLGregorianCalendar value) {
        this.queuedAt = value;
    }

    /**
     * Gets the value of the scheduledAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledAt() {
        return scheduledAt;
    }

    /**
     * Sets the value of the scheduledAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledAt(XMLGregorianCalendar value) {
        this.scheduledAt = value;
    }

    /**
     * Gets the value of the postedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPostedAt() {
        return postedAt;
    }

    /**
     * Sets the value of the postedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPostedAt(XMLGregorianCalendar value) {
        this.postedAt = value;
    }

    /**
     * Gets the value of the expiresAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiresAt() {
        return expiresAt;
    }

    /**
     * Sets the value of the expiresAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiresAt(XMLGregorianCalendar value) {
        this.expiresAt = value;
    }

    /**
     * Gets the value of the deletedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeletedAt() {
        return deletedAt;
    }

    /**
     * Sets the value of the deletedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeletedAt(XMLGregorianCalendar value) {
        this.deletedAt = value;
    }

    /**
     * Gets the value of the deferredReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeferredReason() {
        return deferredReason;
    }

    /**
     * Sets the value of the deferredReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeferredReason(String value) {
        this.deferredReason = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link PostingBoardStateType }
     *     
     */
    public PostingBoardStateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingBoardStateType }
     *     
     */
    public void setState(PostingBoardStateType value) {
        this.state = value;
    }

}
