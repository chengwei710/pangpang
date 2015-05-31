
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
 *         &lt;element name="getExponentByCityIdResult" type="{Yangzhili}WeatherIndex" minOccurs="0"/>
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
    "getExponentByCityIdResult"
})
@XmlRootElement(name = "getExponentByCityIdResponse")
public class GetExponentByCityIdResponse {

    protected WeatherIndex getExponentByCityIdResult;

    /**
     * Gets the value of the getExponentByCityIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherIndex }
     *     
     */
    public WeatherIndex getGetExponentByCityIdResult() {
        return getExponentByCityIdResult;
    }

    /**
     * Sets the value of the getExponentByCityIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherIndex }
     *     
     */
    public void setGetExponentByCityIdResult(WeatherIndex value) {
        this.getExponentByCityIdResult = value;
    }

}
