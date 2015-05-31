
package com.conway.pangpang.integration.ws.traintime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arriveStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "startStation",
    "arriveStation",
    "userId"
})
@XmlRootElement(name = "GetTrainStationToStation")
public class GetTrainStationToStation {

    protected String startStation;
    protected String arriveStation;
    @XmlElement(name = "UserId")
    protected String userId;

    /**
     * Gets the value of the startStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartStation() {
        return startStation;
    }

    /**
     * Sets the value of the startStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartStation(String value) {
        this.startStation = value;
    }

    /**
     * Gets the value of the arriveStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArriveStation() {
        return arriveStation;
    }

    /**
     * Sets the value of the arriveStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveStation(String value) {
        this.arriveStation = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
