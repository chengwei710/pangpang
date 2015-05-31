
package com.conway.pangpang.integration.ws.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="getTodayWeatherByCityLocationResult" type="{Yangzhili}TodayWeather" minOccurs="0"/>
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
    "getTodayWeatherByCityLocationResult"
})
@XmlRootElement(name = "getTodayWeatherByCityLocationResponse")
public class GetTodayWeatherByCityLocationResponse {

    protected TodayWeather getTodayWeatherByCityLocationResult;

    /**
     * Gets the value of the getTodayWeatherByCityLocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link TodayWeather }
     *     
     */
    public TodayWeather getGetTodayWeatherByCityLocationResult() {
        return getTodayWeatherByCityLocationResult;
    }

    /**
     * Sets the value of the getTodayWeatherByCityLocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TodayWeather }
     *     
     */
    public void setGetTodayWeatherByCityLocationResult(TodayWeather value) {
        this.getTodayWeatherByCityLocationResult = value;
    }

}
