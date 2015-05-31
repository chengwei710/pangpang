
package com.conway.pangpang.integration.ws.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealTimeWeather complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealTimeWeather">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cityid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReleaseTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Temp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Temp1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Temp2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Weather" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WindDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WindForce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Humidity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Img1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Img2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealTimeWeather", propOrder = {
    "dateTime",
    "city",
    "cityid",
    "releaseTime",
    "temp",
    "temp1",
    "temp2",
    "weather",
    "windDirection",
    "windForce",
    "humidity",
    "img1",
    "img2"
})
public class RealTimeWeather {

    @XmlElement(name = "DateTime")
    protected String dateTime;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "Cityid")
    protected String cityid;
    @XmlElement(name = "ReleaseTime")
    protected String releaseTime;
    @XmlElement(name = "Temp")
    protected String temp;
    @XmlElement(name = "Temp1")
    protected String temp1;
    @XmlElement(name = "Temp2")
    protected String temp2;
    @XmlElement(name = "Weather")
    protected String weather;
    @XmlElement(name = "WindDirection")
    protected String windDirection;
    @XmlElement(name = "WindForce")
    protected String windForce;
    @XmlElement(name = "Humidity")
    protected String humidity;
    @XmlElement(name = "Img1")
    protected String img1;
    @XmlElement(name = "Img2")
    protected String img2;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the cityid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityid() {
        return cityid;
    }

    /**
     * Sets the value of the cityid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityid(String value) {
        this.cityid = value;
    }

    /**
     * Gets the value of the releaseTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseTime() {
        return releaseTime;
    }

    /**
     * Sets the value of the releaseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseTime(String value) {
        this.releaseTime = value;
    }

    /**
     * Gets the value of the temp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemp() {
        return temp;
    }

    /**
     * Sets the value of the temp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemp(String value) {
        this.temp = value;
    }

    /**
     * Gets the value of the temp1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemp1() {
        return temp1;
    }

    /**
     * Sets the value of the temp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemp1(String value) {
        this.temp1 = value;
    }

    /**
     * Gets the value of the temp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemp2() {
        return temp2;
    }

    /**
     * Sets the value of the temp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemp2(String value) {
        this.temp2 = value;
    }

    /**
     * Gets the value of the weather property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeather() {
        return weather;
    }

    /**
     * Sets the value of the weather property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeather(String value) {
        this.weather = value;
    }

    /**
     * Gets the value of the windDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindDirection() {
        return windDirection;
    }

    /**
     * Sets the value of the windDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindDirection(String value) {
        this.windDirection = value;
    }

    /**
     * Gets the value of the windForce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindForce() {
        return windForce;
    }

    /**
     * Sets the value of the windForce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindForce(String value) {
        this.windForce = value;
    }

    /**
     * Gets the value of the humidity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHumidity() {
        return humidity;
    }

    /**
     * Sets the value of the humidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHumidity(String value) {
        this.humidity = value;
    }

    /**
     * Gets the value of the img1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg1() {
        return img1;
    }

    /**
     * Sets the value of the img1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg1(String value) {
        this.img1 = value;
    }

    /**
     * Gets the value of the img2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg2() {
        return img2;
    }

    /**
     * Sets the value of the img2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg2(String value) {
        this.img2 = value;
    }

}
