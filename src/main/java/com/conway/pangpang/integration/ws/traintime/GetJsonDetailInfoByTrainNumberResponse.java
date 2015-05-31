
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
 *         &lt;element name="GetJsonDetailInfoByTrainNumberResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getJsonDetailInfoByTrainNumberResult"
})
@XmlRootElement(name = "GetJsonDetailInfoByTrainNumberResponse")
public class GetJsonDetailInfoByTrainNumberResponse {

    @XmlElement(name = "GetJsonDetailInfoByTrainNumberResult")
    protected String getJsonDetailInfoByTrainNumberResult;

    /**
     * Gets the value of the getJsonDetailInfoByTrainNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetJsonDetailInfoByTrainNumberResult() {
        return getJsonDetailInfoByTrainNumberResult;
    }

    /**
     * Sets the value of the getJsonDetailInfoByTrainNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetJsonDetailInfoByTrainNumberResult(String value) {
        this.getJsonDetailInfoByTrainNumberResult = value;
    }

}
