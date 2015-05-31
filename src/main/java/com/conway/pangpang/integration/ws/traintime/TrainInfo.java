
package com.conway.pangpang.integration.ws.traintime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrainInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrainNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Traintype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerminalStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArriveStation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArriveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mileage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainInfo", propOrder = {
    "trainNumber",
    "traintype",
    "firstStation",
    "terminalStation",
    "startStation",
    "startTime",
    "arriveStation",
    "arriveTime",
    "useTime",
    "mileage"
})
public class TrainInfo {

    @XmlElement(name = "TrainNumber")
    protected String trainNumber;
    @XmlElement(name = "Traintype")
    protected String traintype;
    @XmlElement(name = "FirstStation")
    protected String firstStation;
    @XmlElement(name = "TerminalStation")
    protected String terminalStation;
    @XmlElement(name = "StartStation")
    protected String startStation;
    @XmlElement(name = "StartTime")
    protected String startTime;
    @XmlElement(name = "ArriveStation")
    protected String arriveStation;
    @XmlElement(name = "ArriveTime")
    protected String arriveTime;
    @XmlElement(name = "UseTime")
    protected String useTime;
    @XmlElement(name = "Mileage")
    protected int mileage;

    /**
     * Gets the value of the trainNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * Sets the value of the trainNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

    /**
     * Gets the value of the traintype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraintype() {
        return traintype;
    }

    /**
     * Sets the value of the traintype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraintype(String value) {
        this.traintype = value;
    }

    /**
     * Gets the value of the firstStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstStation() {
        return firstStation;
    }

    /**
     * Sets the value of the firstStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstStation(String value) {
        this.firstStation = value;
    }

    /**
     * Gets the value of the terminalStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalStation() {
        return terminalStation;
    }

    /**
     * Sets the value of the terminalStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalStation(String value) {
        this.terminalStation = value;
    }

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
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
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
     * Gets the value of the arriveTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArriveTime() {
        return arriveTime;
    }

    /**
     * Sets the value of the arriveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveTime(String value) {
        this.arriveTime = value;
    }

    /**
     * Gets the value of the useTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTime() {
        return useTime;
    }

    /**
     * Sets the value of the useTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTime(String value) {
        this.useTime = value;
    }

    /**
     * Gets the value of the mileage property.
     * 
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * Sets the value of the mileage property.
     * 
     */
    public void setMileage(int value) {
        this.mileage = value;
    }

}
