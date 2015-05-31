
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
 *         &lt;element name="GetTrainDetailInfoByTrainNumberResult" type="{Yangzhili}ArrayOfTrainDetailInfo" minOccurs="0"/>
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
    "getTrainDetailInfoByTrainNumberResult"
})
@XmlRootElement(name = "GetTrainDetailInfoByTrainNumberResponse")
public class GetTrainDetailInfoByTrainNumberResponse {

    @XmlElement(name = "GetTrainDetailInfoByTrainNumberResult")
    protected ArrayOfTrainDetailInfo getTrainDetailInfoByTrainNumberResult;

    /**
     * Gets the value of the getTrainDetailInfoByTrainNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTrainDetailInfo }
     *     
     */
    public ArrayOfTrainDetailInfo getGetTrainDetailInfoByTrainNumberResult() {
        return getTrainDetailInfoByTrainNumberResult;
    }

    /**
     * Sets the value of the getTrainDetailInfoByTrainNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTrainDetailInfo }
     *     
     */
    public void setGetTrainDetailInfoByTrainNumberResult(ArrayOfTrainDetailInfo value) {
        this.getTrainDetailInfoByTrainNumberResult = value;
    }

}
