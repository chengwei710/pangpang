
package com.conway.pangpang.integration.ws.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeatherIndex complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherIndex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ac_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ac_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ac_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ag_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ag_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ag_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="be_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="be_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="be_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cl_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cl_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cl_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="co_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="co_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="co_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ct_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ct_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ct_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dy_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dy_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dy_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fs_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fs_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fs_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gj_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gj_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gj_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gm_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gm_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gm_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hc_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hc_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hc_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jt_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jt_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jt_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lk_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lk_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lk_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ls_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ls_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ls_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mf_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mf_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mf_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nl_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nl_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nl_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pj_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pj_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pj_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pk_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pk_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pk_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pl_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pl_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pl_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pp_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pp_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pp_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sg_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sg_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sg_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tr_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tr_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tr_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uv_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uv_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uv_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xc_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xc_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xc_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xq_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xq_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xq_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yd_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yd_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yd_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yh_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yh_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yh_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ys_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ys_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ys_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zs_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zs_hint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zs_des" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherIndex", propOrder = {
    "acName",
    "acHint",
    "acDes",
    "agName",
    "agHint",
    "agDes",
    "beName",
    "beHint",
    "beDes",
    "clName",
    "clHint",
    "clDes",
    "coName",
    "coHint",
    "coDes",
    "ctName",
    "ctHint",
    "ctDes",
    "dyName",
    "dyHint",
    "dyDes",
    "fsName",
    "fsHint",
    "fsDes",
    "gjName",
    "gjHint",
    "gjDes",
    "gmName",
    "gmHint",
    "gmDes",
    "hcName",
    "hcHint",
    "hcDes",
    "jtName",
    "jtHint",
    "jtDes",
    "lkName",
    "lkHint",
    "lkDes",
    "lsName",
    "lsHint",
    "lsDes",
    "mfName",
    "mfHint",
    "mfDes",
    "nlName",
    "nlHint",
    "nlDes",
    "pjName",
    "pjHint",
    "pjDes",
    "pkName",
    "pkHint",
    "pkDes",
    "plName",
    "plHint",
    "plDes",
    "ppName",
    "ppHint",
    "ppDes",
    "sgName",
    "sgHint",
    "sgDes",
    "trName",
    "trHint",
    "trDes",
    "uvName",
    "uvHint",
    "uvDes",
    "xcName",
    "xcHint",
    "xcDes",
    "xqName",
    "xqHint",
    "xqDes",
    "ydName",
    "ydHint",
    "ydDes",
    "yhName",
    "yhHint",
    "yhDes",
    "ysName",
    "ysHint",
    "ysDes",
    "zsName",
    "zsHint",
    "zsDes"
})
public class WeatherIndex {

    @XmlElement(name = "ac_name")
    protected String acName;
    @XmlElement(name = "ac_hint")
    protected String acHint;
    @XmlElement(name = "ac_des")
    protected String acDes;
    @XmlElement(name = "ag_name")
    protected String agName;
    @XmlElement(name = "ag_hint")
    protected String agHint;
    @XmlElement(name = "ag_des")
    protected String agDes;
    @XmlElement(name = "be_name")
    protected String beName;
    @XmlElement(name = "be_hint")
    protected String beHint;
    @XmlElement(name = "be_des")
    protected String beDes;
    @XmlElement(name = "cl_name")
    protected String clName;
    @XmlElement(name = "cl_hint")
    protected String clHint;
    @XmlElement(name = "cl_des")
    protected String clDes;
    @XmlElement(name = "co_name")
    protected String coName;
    @XmlElement(name = "co_hint")
    protected String coHint;
    @XmlElement(name = "co_des")
    protected String coDes;
    @XmlElement(name = "ct_name")
    protected String ctName;
    @XmlElement(name = "ct_hint")
    protected String ctHint;
    @XmlElement(name = "ct_des")
    protected String ctDes;
    @XmlElement(name = "dy_name")
    protected String dyName;
    @XmlElement(name = "dy_hint")
    protected String dyHint;
    @XmlElement(name = "dy_des")
    protected String dyDes;
    @XmlElement(name = "fs_name")
    protected String fsName;
    @XmlElement(name = "fs_hint")
    protected String fsHint;
    @XmlElement(name = "fs_des")
    protected String fsDes;
    @XmlElement(name = "gj_name")
    protected String gjName;
    @XmlElement(name = "gj_hint")
    protected String gjHint;
    @XmlElement(name = "gj_des")
    protected String gjDes;
    @XmlElement(name = "gm_name")
    protected String gmName;
    @XmlElement(name = "gm_hint")
    protected String gmHint;
    @XmlElement(name = "gm_des")
    protected String gmDes;
    @XmlElement(name = "hc_name")
    protected String hcName;
    @XmlElement(name = "hc_hint")
    protected String hcHint;
    @XmlElement(name = "hc_des")
    protected String hcDes;
    @XmlElement(name = "jt_name")
    protected String jtName;
    @XmlElement(name = "jt_hint")
    protected String jtHint;
    @XmlElement(name = "jt_des")
    protected String jtDes;
    @XmlElement(name = "lk_name")
    protected String lkName;
    @XmlElement(name = "lk_hint")
    protected String lkHint;
    @XmlElement(name = "lk_des")
    protected String lkDes;
    @XmlElement(name = "ls_name")
    protected String lsName;
    @XmlElement(name = "ls_hint")
    protected String lsHint;
    @XmlElement(name = "ls_des")
    protected String lsDes;
    @XmlElement(name = "mf_name")
    protected String mfName;
    @XmlElement(name = "mf_hint")
    protected String mfHint;
    @XmlElement(name = "mf_des")
    protected String mfDes;
    @XmlElement(name = "nl_name")
    protected String nlName;
    @XmlElement(name = "nl_hint")
    protected String nlHint;
    @XmlElement(name = "nl_des")
    protected String nlDes;
    @XmlElement(name = "pj_name")
    protected String pjName;
    @XmlElement(name = "pj_hint")
    protected String pjHint;
    @XmlElement(name = "pj_des")
    protected String pjDes;
    @XmlElement(name = "pk_name")
    protected String pkName;
    @XmlElement(name = "pk_hint")
    protected String pkHint;
    @XmlElement(name = "pk_des")
    protected String pkDes;
    @XmlElement(name = "pl_name")
    protected String plName;
    @XmlElement(name = "pl_hint")
    protected String plHint;
    @XmlElement(name = "pl_des")
    protected String plDes;
    @XmlElement(name = "pp_name")
    protected String ppName;
    @XmlElement(name = "pp_hint")
    protected String ppHint;
    @XmlElement(name = "pp_des")
    protected String ppDes;
    @XmlElement(name = "sg_name")
    protected String sgName;
    @XmlElement(name = "sg_hint")
    protected String sgHint;
    @XmlElement(name = "sg_des")
    protected String sgDes;
    @XmlElement(name = "tr_name")
    protected String trName;
    @XmlElement(name = "tr_hint")
    protected String trHint;
    @XmlElement(name = "tr_des")
    protected String trDes;
    @XmlElement(name = "uv_name")
    protected String uvName;
    @XmlElement(name = "uv_hint")
    protected String uvHint;
    @XmlElement(name = "uv_des")
    protected String uvDes;
    @XmlElement(name = "xc_name")
    protected String xcName;
    @XmlElement(name = "xc_hint")
    protected String xcHint;
    @XmlElement(name = "xc_des")
    protected String xcDes;
    @XmlElement(name = "xq_name")
    protected String xqName;
    @XmlElement(name = "xq_hint")
    protected String xqHint;
    @XmlElement(name = "xq_des")
    protected String xqDes;
    @XmlElement(name = "yd_name")
    protected String ydName;
    @XmlElement(name = "yd_hint")
    protected String ydHint;
    @XmlElement(name = "yd_des")
    protected String ydDes;
    @XmlElement(name = "yh_name")
    protected String yhName;
    @XmlElement(name = "yh_hint")
    protected String yhHint;
    @XmlElement(name = "yh_des")
    protected String yhDes;
    @XmlElement(name = "ys_name")
    protected String ysName;
    @XmlElement(name = "ys_hint")
    protected String ysHint;
    @XmlElement(name = "ys_des")
    protected String ysDes;
    @XmlElement(name = "zs_name")
    protected String zsName;
    @XmlElement(name = "zs_hint")
    protected String zsHint;
    @XmlElement(name = "zs_des")
    protected String zsDes;

    /**
     * Gets the value of the acName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcName() {
        return acName;
    }

    /**
     * Sets the value of the acName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcName(String value) {
        this.acName = value;
    }

    /**
     * Gets the value of the acHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcHint() {
        return acHint;
    }

    /**
     * Sets the value of the acHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcHint(String value) {
        this.acHint = value;
    }

    /**
     * Gets the value of the acDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcDes() {
        return acDes;
    }

    /**
     * Sets the value of the acDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcDes(String value) {
        this.acDes = value;
    }

    /**
     * Gets the value of the agName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgName() {
        return agName;
    }

    /**
     * Sets the value of the agName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgName(String value) {
        this.agName = value;
    }

    /**
     * Gets the value of the agHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgHint() {
        return agHint;
    }

    /**
     * Sets the value of the agHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgHint(String value) {
        this.agHint = value;
    }

    /**
     * Gets the value of the agDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgDes() {
        return agDes;
    }

    /**
     * Sets the value of the agDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgDes(String value) {
        this.agDes = value;
    }

    /**
     * Gets the value of the beName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeName() {
        return beName;
    }

    /**
     * Sets the value of the beName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeName(String value) {
        this.beName = value;
    }

    /**
     * Gets the value of the beHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeHint() {
        return beHint;
    }

    /**
     * Sets the value of the beHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeHint(String value) {
        this.beHint = value;
    }

    /**
     * Gets the value of the beDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeDes() {
        return beDes;
    }

    /**
     * Sets the value of the beDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeDes(String value) {
        this.beDes = value;
    }

    /**
     * Gets the value of the clName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClName() {
        return clName;
    }

    /**
     * Sets the value of the clName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClName(String value) {
        this.clName = value;
    }

    /**
     * Gets the value of the clHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClHint() {
        return clHint;
    }

    /**
     * Sets the value of the clHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClHint(String value) {
        this.clHint = value;
    }

    /**
     * Gets the value of the clDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClDes() {
        return clDes;
    }

    /**
     * Sets the value of the clDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClDes(String value) {
        this.clDes = value;
    }

    /**
     * Gets the value of the coName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoName() {
        return coName;
    }

    /**
     * Sets the value of the coName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoName(String value) {
        this.coName = value;
    }

    /**
     * Gets the value of the coHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoHint() {
        return coHint;
    }

    /**
     * Sets the value of the coHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoHint(String value) {
        this.coHint = value;
    }

    /**
     * Gets the value of the coDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoDes() {
        return coDes;
    }

    /**
     * Sets the value of the coDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoDes(String value) {
        this.coDes = value;
    }

    /**
     * Gets the value of the ctName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtName() {
        return ctName;
    }

    /**
     * Sets the value of the ctName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtName(String value) {
        this.ctName = value;
    }

    /**
     * Gets the value of the ctHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtHint() {
        return ctHint;
    }

    /**
     * Sets the value of the ctHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtHint(String value) {
        this.ctHint = value;
    }

    /**
     * Gets the value of the ctDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtDes() {
        return ctDes;
    }

    /**
     * Sets the value of the ctDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtDes(String value) {
        this.ctDes = value;
    }

    /**
     * Gets the value of the dyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDyName() {
        return dyName;
    }

    /**
     * Sets the value of the dyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDyName(String value) {
        this.dyName = value;
    }

    /**
     * Gets the value of the dyHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDyHint() {
        return dyHint;
    }

    /**
     * Sets the value of the dyHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDyHint(String value) {
        this.dyHint = value;
    }

    /**
     * Gets the value of the dyDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDyDes() {
        return dyDes;
    }

    /**
     * Sets the value of the dyDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDyDes(String value) {
        this.dyDes = value;
    }

    /**
     * Gets the value of the fsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsName() {
        return fsName;
    }

    /**
     * Sets the value of the fsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsName(String value) {
        this.fsName = value;
    }

    /**
     * Gets the value of the fsHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsHint() {
        return fsHint;
    }

    /**
     * Sets the value of the fsHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsHint(String value) {
        this.fsHint = value;
    }

    /**
     * Gets the value of the fsDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsDes() {
        return fsDes;
    }

    /**
     * Sets the value of the fsDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsDes(String value) {
        this.fsDes = value;
    }

    /**
     * Gets the value of the gjName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGjName() {
        return gjName;
    }

    /**
     * Sets the value of the gjName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGjName(String value) {
        this.gjName = value;
    }

    /**
     * Gets the value of the gjHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGjHint() {
        return gjHint;
    }

    /**
     * Sets the value of the gjHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGjHint(String value) {
        this.gjHint = value;
    }

    /**
     * Gets the value of the gjDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGjDes() {
        return gjDes;
    }

    /**
     * Sets the value of the gjDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGjDes(String value) {
        this.gjDes = value;
    }

    /**
     * Gets the value of the gmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmName() {
        return gmName;
    }

    /**
     * Sets the value of the gmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmName(String value) {
        this.gmName = value;
    }

    /**
     * Gets the value of the gmHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmHint() {
        return gmHint;
    }

    /**
     * Sets the value of the gmHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmHint(String value) {
        this.gmHint = value;
    }

    /**
     * Gets the value of the gmDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGmDes() {
        return gmDes;
    }

    /**
     * Sets the value of the gmDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGmDes(String value) {
        this.gmDes = value;
    }

    /**
     * Gets the value of the hcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcName() {
        return hcName;
    }

    /**
     * Sets the value of the hcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcName(String value) {
        this.hcName = value;
    }

    /**
     * Gets the value of the hcHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcHint() {
        return hcHint;
    }

    /**
     * Sets the value of the hcHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcHint(String value) {
        this.hcHint = value;
    }

    /**
     * Gets the value of the hcDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHcDes() {
        return hcDes;
    }

    /**
     * Sets the value of the hcDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHcDes(String value) {
        this.hcDes = value;
    }

    /**
     * Gets the value of the jtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJtName() {
        return jtName;
    }

    /**
     * Sets the value of the jtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJtName(String value) {
        this.jtName = value;
    }

    /**
     * Gets the value of the jtHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJtHint() {
        return jtHint;
    }

    /**
     * Sets the value of the jtHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJtHint(String value) {
        this.jtHint = value;
    }

    /**
     * Gets the value of the jtDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJtDes() {
        return jtDes;
    }

    /**
     * Sets the value of the jtDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJtDes(String value) {
        this.jtDes = value;
    }

    /**
     * Gets the value of the lkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkName() {
        return lkName;
    }

    /**
     * Sets the value of the lkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkName(String value) {
        this.lkName = value;
    }

    /**
     * Gets the value of the lkHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkHint() {
        return lkHint;
    }

    /**
     * Sets the value of the lkHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkHint(String value) {
        this.lkHint = value;
    }

    /**
     * Gets the value of the lkDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkDes() {
        return lkDes;
    }

    /**
     * Sets the value of the lkDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkDes(String value) {
        this.lkDes = value;
    }

    /**
     * Gets the value of the lsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsName() {
        return lsName;
    }

    /**
     * Sets the value of the lsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsName(String value) {
        this.lsName = value;
    }

    /**
     * Gets the value of the lsHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsHint() {
        return lsHint;
    }

    /**
     * Sets the value of the lsHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsHint(String value) {
        this.lsHint = value;
    }

    /**
     * Gets the value of the lsDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsDes() {
        return lsDes;
    }

    /**
     * Sets the value of the lsDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsDes(String value) {
        this.lsDes = value;
    }

    /**
     * Gets the value of the mfName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfName() {
        return mfName;
    }

    /**
     * Sets the value of the mfName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfName(String value) {
        this.mfName = value;
    }

    /**
     * Gets the value of the mfHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfHint() {
        return mfHint;
    }

    /**
     * Sets the value of the mfHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfHint(String value) {
        this.mfHint = value;
    }

    /**
     * Gets the value of the mfDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfDes() {
        return mfDes;
    }

    /**
     * Sets the value of the mfDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfDes(String value) {
        this.mfDes = value;
    }

    /**
     * Gets the value of the nlName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlName() {
        return nlName;
    }

    /**
     * Sets the value of the nlName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlName(String value) {
        this.nlName = value;
    }

    /**
     * Gets the value of the nlHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlHint() {
        return nlHint;
    }

    /**
     * Sets the value of the nlHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlHint(String value) {
        this.nlHint = value;
    }

    /**
     * Gets the value of the nlDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNlDes() {
        return nlDes;
    }

    /**
     * Sets the value of the nlDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNlDes(String value) {
        this.nlDes = value;
    }

    /**
     * Gets the value of the pjName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPjName() {
        return pjName;
    }

    /**
     * Sets the value of the pjName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPjName(String value) {
        this.pjName = value;
    }

    /**
     * Gets the value of the pjHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPjHint() {
        return pjHint;
    }

    /**
     * Sets the value of the pjHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPjHint(String value) {
        this.pjHint = value;
    }

    /**
     * Gets the value of the pjDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPjDes() {
        return pjDes;
    }

    /**
     * Sets the value of the pjDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPjDes(String value) {
        this.pjDes = value;
    }

    /**
     * Gets the value of the pkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkName() {
        return pkName;
    }

    /**
     * Sets the value of the pkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkName(String value) {
        this.pkName = value;
    }

    /**
     * Gets the value of the pkHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkHint() {
        return pkHint;
    }

    /**
     * Sets the value of the pkHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkHint(String value) {
        this.pkHint = value;
    }

    /**
     * Gets the value of the pkDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkDes() {
        return pkDes;
    }

    /**
     * Sets the value of the pkDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkDes(String value) {
        this.pkDes = value;
    }

    /**
     * Gets the value of the plName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlName() {
        return plName;
    }

    /**
     * Sets the value of the plName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlName(String value) {
        this.plName = value;
    }

    /**
     * Gets the value of the plHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlHint() {
        return plHint;
    }

    /**
     * Sets the value of the plHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlHint(String value) {
        this.plHint = value;
    }

    /**
     * Gets the value of the plDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlDes() {
        return plDes;
    }

    /**
     * Sets the value of the plDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlDes(String value) {
        this.plDes = value;
    }

    /**
     * Gets the value of the ppName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpName() {
        return ppName;
    }

    /**
     * Sets the value of the ppName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpName(String value) {
        this.ppName = value;
    }

    /**
     * Gets the value of the ppHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpHint() {
        return ppHint;
    }

    /**
     * Sets the value of the ppHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpHint(String value) {
        this.ppHint = value;
    }

    /**
     * Gets the value of the ppDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPpDes() {
        return ppDes;
    }

    /**
     * Sets the value of the ppDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPpDes(String value) {
        this.ppDes = value;
    }

    /**
     * Gets the value of the sgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgName() {
        return sgName;
    }

    /**
     * Sets the value of the sgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgName(String value) {
        this.sgName = value;
    }

    /**
     * Gets the value of the sgHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgHint() {
        return sgHint;
    }

    /**
     * Sets the value of the sgHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgHint(String value) {
        this.sgHint = value;
    }

    /**
     * Gets the value of the sgDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgDes() {
        return sgDes;
    }

    /**
     * Sets the value of the sgDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSgDes(String value) {
        this.sgDes = value;
    }

    /**
     * Gets the value of the trName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrName() {
        return trName;
    }

    /**
     * Sets the value of the trName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrName(String value) {
        this.trName = value;
    }

    /**
     * Gets the value of the trHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrHint() {
        return trHint;
    }

    /**
     * Sets the value of the trHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrHint(String value) {
        this.trHint = value;
    }

    /**
     * Gets the value of the trDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrDes() {
        return trDes;
    }

    /**
     * Sets the value of the trDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrDes(String value) {
        this.trDes = value;
    }

    /**
     * Gets the value of the uvName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUvName() {
        return uvName;
    }

    /**
     * Sets the value of the uvName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUvName(String value) {
        this.uvName = value;
    }

    /**
     * Gets the value of the uvHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUvHint() {
        return uvHint;
    }

    /**
     * Sets the value of the uvHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUvHint(String value) {
        this.uvHint = value;
    }

    /**
     * Gets the value of the uvDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUvDes() {
        return uvDes;
    }

    /**
     * Sets the value of the uvDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUvDes(String value) {
        this.uvDes = value;
    }

    /**
     * Gets the value of the xcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXcName() {
        return xcName;
    }

    /**
     * Sets the value of the xcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXcName(String value) {
        this.xcName = value;
    }

    /**
     * Gets the value of the xcHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXcHint() {
        return xcHint;
    }

    /**
     * Sets the value of the xcHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXcHint(String value) {
        this.xcHint = value;
    }

    /**
     * Gets the value of the xcDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXcDes() {
        return xcDes;
    }

    /**
     * Sets the value of the xcDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXcDes(String value) {
        this.xcDes = value;
    }

    /**
     * Gets the value of the xqName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXqName() {
        return xqName;
    }

    /**
     * Sets the value of the xqName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXqName(String value) {
        this.xqName = value;
    }

    /**
     * Gets the value of the xqHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXqHint() {
        return xqHint;
    }

    /**
     * Sets the value of the xqHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXqHint(String value) {
        this.xqHint = value;
    }

    /**
     * Gets the value of the xqDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXqDes() {
        return xqDes;
    }

    /**
     * Sets the value of the xqDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXqDes(String value) {
        this.xqDes = value;
    }

    /**
     * Gets the value of the ydName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYdName() {
        return ydName;
    }

    /**
     * Sets the value of the ydName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYdName(String value) {
        this.ydName = value;
    }

    /**
     * Gets the value of the ydHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYdHint() {
        return ydHint;
    }

    /**
     * Sets the value of the ydHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYdHint(String value) {
        this.ydHint = value;
    }

    /**
     * Gets the value of the ydDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYdDes() {
        return ydDes;
    }

    /**
     * Sets the value of the ydDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYdDes(String value) {
        this.ydDes = value;
    }

    /**
     * Gets the value of the yhName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYhName() {
        return yhName;
    }

    /**
     * Sets the value of the yhName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYhName(String value) {
        this.yhName = value;
    }

    /**
     * Gets the value of the yhHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYhHint() {
        return yhHint;
    }

    /**
     * Sets the value of the yhHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYhHint(String value) {
        this.yhHint = value;
    }

    /**
     * Gets the value of the yhDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYhDes() {
        return yhDes;
    }

    /**
     * Sets the value of the yhDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYhDes(String value) {
        this.yhDes = value;
    }

    /**
     * Gets the value of the ysName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYsName() {
        return ysName;
    }

    /**
     * Sets the value of the ysName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYsName(String value) {
        this.ysName = value;
    }

    /**
     * Gets the value of the ysHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYsHint() {
        return ysHint;
    }

    /**
     * Sets the value of the ysHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYsHint(String value) {
        this.ysHint = value;
    }

    /**
     * Gets the value of the ysDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYsDes() {
        return ysDes;
    }

    /**
     * Sets the value of the ysDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYsDes(String value) {
        this.ysDes = value;
    }

    /**
     * Gets the value of the zsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZsName() {
        return zsName;
    }

    /**
     * Sets the value of the zsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZsName(String value) {
        this.zsName = value;
    }

    /**
     * Gets the value of the zsHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZsHint() {
        return zsHint;
    }

    /**
     * Sets the value of the zsHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZsHint(String value) {
        this.zsHint = value;
    }

    /**
     * Gets the value of the zsDes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZsDes() {
        return zsDes;
    }

    /**
     * Sets the value of the zsDes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZsDes(String value) {
        this.zsDes = value;
    }

}
