
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
 *         &lt;element name="getRealTimeWeatherByCityNameResult" type="{Yangzhili}RealTimeWeather" minOccurs="0"/>
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
    "getRealTimeWeatherByCityNameResult"
})
@XmlRootElement(name = "getRealTimeWeatherByCityNameResponse")
public class GetRealTimeWeatherByCityNameResponse {

    protected RealTimeWeather getRealTimeWeatherByCityNameResult;

    /**
     * Gets the value of the getRealTimeWeatherByCityNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link RealTimeWeather }
     *     
     */
    public RealTimeWeather getGetRealTimeWeatherByCityNameResult() {
        return getRealTimeWeatherByCityNameResult;
    }

    /**
     * Sets the value of the getRealTimeWeatherByCityNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealTimeWeather }
     *     
     */
    public void setGetRealTimeWeatherByCityNameResult(RealTimeWeather value) {
        this.getRealTimeWeatherByCityNameResult = value;
    }

}
