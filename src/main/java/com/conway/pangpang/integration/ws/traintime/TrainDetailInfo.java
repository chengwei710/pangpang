
package com.conway.pangpang.integration.ws.traintime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrainDetailInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainDetailInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrainNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Traintype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StationNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Station" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ArriveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "TrainDetailInfo", propOrder = {
    "trainNumber",
    "traintype",
    "stationNo",
    "station",
    "day",
    "arriveTime",
    "departureTime",
    "mileage"
})
public class TrainDetailInfo {

    @XmlElement(name = "TrainNumber")
    protected String trainNumber;
    @XmlElement(name = "Traintype")
    protected String traintype;
    @XmlElement(name = "StationNo")
    protected String stationNo;
    @XmlElement(name = "Station")
    protected String station;
    @XmlElement(name = "Day")
    protected int day;
    @XmlElement(name = "ArriveTime")
    protected String arriveTime;
    @XmlElement(name = "DepartureTime")
    protected String departureTime;
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
     * Gets the value of the stationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationNo() {
        return stationNo;
    }

    /**
     * Sets the value of the stationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationNo(String value) {
        this.stationNo = value;
    }

    /**
     * Gets the value of the station property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStation() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStation(String value) {
        this.station = value;
    }

    /**
     * Gets the value of the day property.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     */
    public void setDay(int value) {
        this.day = value;
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
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureTime(String value) {
        this.departureTime = value;
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
