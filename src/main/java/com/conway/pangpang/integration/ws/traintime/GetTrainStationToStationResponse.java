
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
 *         &lt;element name="GetTrainStationToStationResult" type="{Yangzhili}ArrayOfTrainInfo" minOccurs="0"/>
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
    "getTrainStationToStationResult"
})
@XmlRootElement(name = "GetTrainStationToStationResponse")
public class GetTrainStationToStationResponse {

    @XmlElement(name = "GetTrainStationToStationResult")
    protected ArrayOfTrainInfo getTrainStationToStationResult;

    /**
     * Gets the value of the getTrainStationToStationResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrainInfo }
     *     
     */
    public ArrayOfTrainInfo getGetTrainStationToStationResult() {
        return getTrainStationToStationResult;
    }

    /**
     * Sets the value of the getTrainStationToStationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrainInfo }
     *     
     */
    public void setGetTrainStationToStationResult(ArrayOfTrainInfo value) {
        this.getTrainStationToStationResult = value;
    }

}
