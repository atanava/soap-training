
package com.atanava.soap.ws.client.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingBoardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingBoardType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{http://www.equest.com/soap/}BoardAccountType"/&gt;
 *         &lt;element name="specificValues" type="{http://www.equest.com/soap/}BoardSpecificValuesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="pipelineId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingBoardType", propOrder = {
    "account",
    "specificValues"
})
public class PostingBoardType {

    @XmlElement(required = true)
    protected BoardAccountType account;
    @XmlElement(nillable = true)
    protected List<BoardSpecificValuesType> specificValues;
    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "pipelineId")
    protected String pipelineId;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link BoardAccountType }
     *     
     */
    public BoardAccountType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardAccountType }
     *     
     */
    public void setAccount(BoardAccountType value) {
        this.account = value;
    }

    /**
     * Gets the value of the specificValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specificValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoardSpecificValuesType }
     * 
     * 
     */
    public List<BoardSpecificValuesType> getSpecificValues() {
        if (specificValues == null) {
            specificValues = new ArrayList<BoardSpecificValuesType>();
        }
        return this.specificValues;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the pipelineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipelineId() {
        return pipelineId;
    }

    /**
     * Sets the value of the pipelineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipelineId(String value) {
        this.pipelineId = value;
    }

}
