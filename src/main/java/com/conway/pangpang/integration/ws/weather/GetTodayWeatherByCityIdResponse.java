
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
 *         &lt;element name="getTodayWeatherByCityIdResult" type="{Yangzhili}TodayWeather" minOccurs="0"/>
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
    "getTodayWeatherByCityIdResult"
})
@XmlRootElement(name = "getTodayWeatherByCityIdResponse")
public class GetTodayWeatherByCityIdResponse {

    protected TodayWeather getTodayWeatherByCityIdResult;

    /**
     * Gets the value of the getTodayWeatherByCityIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link TodayWeather }
     *     
     */
    public TodayWeather getGetTodayWeatherByCityIdResult() {
        return getTodayWeatherByCityIdResult;
    }

    /**
     * Sets the value of the getTodayWeatherByCityIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TodayWeather }
     *     
     */
    public void setGetTodayWeatherByCityIdResult(TodayWeather value) {
        this.getTodayWeatherByCityIdResult = value;
    }

}
