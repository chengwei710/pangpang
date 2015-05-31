
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
 *         &lt;element name="getExponentByCityNameResult" type="{Yangzhili}WeatherIndex" minOccurs="0"/>
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
    "getExponentByCityNameResult"
})
@XmlRootElement(name = "getExponentByCityNameResponse")
public class GetExponentByCityNameResponse {

    protected WeatherIndex getExponentByCityNameResult;

    /**
     * Gets the value of the getExponentByCityNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherIndex }
     *     
     */
    public WeatherIndex getGetExponentByCityNameResult() {
        return getExponentByCityNameResult;
    }

    /**
     * Sets the value of the getExponentByCityNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherIndex }
     *     
     */
    public void setGetExponentByCityNameResult(WeatherIndex value) {
        this.getExponentByCityNameResult = value;
    }

}
