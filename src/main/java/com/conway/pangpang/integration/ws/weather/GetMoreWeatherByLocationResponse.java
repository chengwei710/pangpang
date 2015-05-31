
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
 *         &lt;element name="getMoreWeatherByLocationResult" type="{Yangzhili}MoreWeather" minOccurs="0"/>
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
    "getMoreWeatherByLocationResult"
})
@XmlRootElement(name = "getMoreWeatherByLocationResponse")
public class GetMoreWeatherByLocationResponse {

    protected MoreWeather getMoreWeatherByLocationResult;

    /**
     * Gets the value of the getMoreWeatherByLocationResult property.
     * 
     * @return
     *     possible object is
     *     {@link MoreWeather }
     *     
     */
    public MoreWeather getGetMoreWeatherByLocationResult() {
        return getMoreWeatherByLocationResult;
    }

    /**
     * Sets the value of the getMoreWeatherByLocationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoreWeather }
     *     
     */
    public void setGetMoreWeatherByLocationResult(MoreWeather value) {
        this.getMoreWeatherByLocationResult = value;
    }

}
