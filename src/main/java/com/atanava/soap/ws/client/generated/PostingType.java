
package com.atanava.soap.ws.client.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="board" type="{http://www.equest.com/soap/}PostingBoardType"/&gt;
 *         &lt;element name="boardStatus" type="{http://jws.equest.com/v2/soap/}PostingBoardStatusType"/&gt;
 *         &lt;element name="candidateResponse" type="{http://www.equest.com/soap/}CandidateResponseType"/&gt;
 *         &lt;element name="liveUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="trackingId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostingType", namespace = "http://jws.equest.com/v2/soap/", propOrder = {
    "board",
    "boardStatus",
    "candidateResponse",
    "liveUrl"
})
public class PostingType {

    @XmlElement(required = true)
    protected PostingBoardType board;
    @XmlElement(required = true)
    protected PostingBoardStatusType boardStatus;
    @XmlElement(required = true)
    protected CandidateResponseType candidateResponse;
    @XmlElement(required = true)
    protected String liveUrl;
    @XmlAttribute(name = "trackingId")
    protected Integer trackingId;
    @XmlAttribute(name = "id")
    protected Integer id;

    /**
     * Gets the value of the board property.
     * 
     * @return
     *     possible object is
     *     {@link PostingBoardType }
     *     
     */
    public PostingBoardType getBoard() {
        return board;
    }

    /**
     * Sets the value of the board property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingBoardType }
     *     
     */
    public void setBoard(PostingBoardType value) {
        this.board = value;
    }

    /**
     * Gets the value of the boardStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PostingBoardStatusType }
     *     
     */
    public PostingBoardStatusType getBoardStatus() {
        return boardStatus;
    }

    /**
     * Sets the value of the boardStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostingBoardStatusType }
     *     
     */
    public void setBoardStatus(PostingBoardStatusType value) {
        this.boardStatus = value;
    }

    /**
     * Gets the value of the candidateResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CandidateResponseType }
     *     
     */
    public CandidateResponseType getCandidateResponse() {
        return candidateResponse;
    }

    /**
     * Sets the value of the candidateResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidateResponseType }
     *     
     */
    public void setCandidateResponse(CandidateResponseType value) {
        this.candidateResponse = value;
    }

    /**
     * Gets the value of the liveUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiveUrl() {
        return liveUrl;
    }

    /**
     * Sets the value of the liveUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiveUrl(String value) {
        this.liveUrl = value;
    }

    /**
     * Gets the value of the trackingId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrackingId() {
        return trackingId;
    }

    /**
     * Sets the value of the trackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrackingId(Integer value) {
        this.trackingId = value;
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

}
