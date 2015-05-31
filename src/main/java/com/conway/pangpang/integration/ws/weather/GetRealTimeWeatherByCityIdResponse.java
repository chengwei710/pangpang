
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
 *         &lt;element name="getRealTimeWeatherByCityIdResult" type="{Yangzhili}RealTimeWeather" minOccurs="0"/>
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
    "getRealTimeWeatherByCityIdResult"
})
@XmlRootElement(name = "getRealTimeWeatherByCityIdResponse")
public class GetRealTimeWeatherByCityIdResponse {

    protected RealTimeWeather getRealTimeWeatherByCityIdResult;

    /**
     * Gets the value of the getRealTimeWeatherByCityIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link RealTimeWeather }
     *     
     */
    public RealTimeWeather getGetRealTimeWeatherByCityIdResult() {
        return getRealTimeWeatherByCityIdResult;
    }

    /**
     * Sets the value of the getRealTimeWeatherByCityIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealTimeWeather }
     *     
     */
    public void setGetRealTimeWeatherByCityIdResult(RealTimeWeather value) {
        this.getRealTimeWeatherByCityIdResult = value;
    }

}
