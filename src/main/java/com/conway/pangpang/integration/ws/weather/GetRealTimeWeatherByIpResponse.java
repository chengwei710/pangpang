
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
 *         &lt;element name="getRealTimeWeatherByIpResult" type="{Yangzhili}RealTimeWeather" minOccurs="0"/>
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
    "getRealTimeWeatherByIpResult"
})
@XmlRootElement(name = "getRealTimeWeatherByIpResponse")
public class GetRealTimeWeatherByIpResponse {

    protected RealTimeWeather getRealTimeWeatherByIpResult;

    /**
     * Gets the value of the getRealTimeWeatherByIpResult property.
     * 
     * @return
     *     possible object is
     *     {@link RealTimeWeather }
     *     
     */
    public RealTimeWeather getGetRealTimeWeatherByIpResult() {
        return getRealTimeWeatherByIpResult;
    }

    /**
     * Sets the value of the getRealTimeWeatherByIpResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealTimeWeather }
     *     
     */
    public void setGetRealTimeWeatherByIpResult(RealTimeWeather value) {
        this.getRealTimeWeatherByIpResult = value;
    }

}
