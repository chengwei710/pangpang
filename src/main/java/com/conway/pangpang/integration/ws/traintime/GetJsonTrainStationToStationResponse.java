
package com.conway.pangpang.integration.ws.traintime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetJsonTrainStationToStationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getJsonTrainStationToStationResult"
})
@XmlRootElement(name = "GetJsonTrainStationToStationResponse")
public class GetJsonTrainStationToStationResponse {

    @XmlElement(name = "GetJsonTrainStationToStationResult")
    protected String getJsonTrainStationToStationResult;

    /**
     * Gets the value of the getJsonTrainStationToStationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetJsonTrainStationToStationResult() {
        return getJsonTrainStationToStationResult;
    }

    /**
     * Sets the value of the getJsonTrainStationToStationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetJsonTrainStationToStationResult(String value) {
        this.getJsonTrainStationToStationResult = value;
    }

}
