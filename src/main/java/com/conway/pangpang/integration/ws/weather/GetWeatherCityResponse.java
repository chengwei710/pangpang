
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
 *         &lt;element name="getWeatherCityResult" type="{Yangzhili}ArrayOfWeatherCity" minOccurs="0"/>
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
    "getWeatherCityResult"
})
@XmlRootElement(name = "getWeatherCityResponse")
public class GetWeatherCityResponse {

    protected ArrayOfWeatherCity getWeatherCityResult;

    /**
     * Gets the value of the getWeatherCityResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWeatherCity }
     *     
     */
    public ArrayOfWeatherCity getGetWeatherCityResult() {
        return getWeatherCityResult;
    }

    /**
     * Sets the value of the getWeatherCityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWeatherCity }
     *     
     */
    public void setGetWeatherCityResult(ArrayOfWeatherCity value) {
        this.getWeatherCityResult = value;
    }

}
