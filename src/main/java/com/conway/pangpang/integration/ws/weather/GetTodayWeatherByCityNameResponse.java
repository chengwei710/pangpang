
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
 *         &lt;element name="getTodayWeatherByCityNameResult" type="{Yangzhili}TodayWeather" minOccurs="0"/>
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
    "getTodayWeatherByCityNameResult"
})
@XmlRootElement(name = "getTodayWeatherByCityNameResponse")
public class GetTodayWeatherByCityNameResponse {

    protected TodayWeather getTodayWeatherByCityNameResult;

    /**
     * Gets the value of the getTodayWeatherByCityNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link TodayWeather }
     *     
     */
    public TodayWeather getGetTodayWeatherByCityNameResult() {
        return getTodayWeatherByCityNameResult;
    }

    /**
     * Sets the value of the getTodayWeatherByCityNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TodayWeather }
     *     
     */
    public void setGetTodayWeatherByCityNameResult(TodayWeather value) {
        this.getTodayWeatherByCityNameResult = value;
    }

}
