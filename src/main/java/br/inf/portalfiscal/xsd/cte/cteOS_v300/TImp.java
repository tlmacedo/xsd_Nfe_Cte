//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementaxe7xe3o de Referxeancia (JAXB) de Bind XML, v2.3.1-b171012.0423 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificaxe7xf5es neste arquivo serxe3o perdidas apxf3s a recompilaxe7xe3o do esquema de origem. 
// Gerado em: 2020.06.27 xe0s 02:46:55 PM AMT 
//


package br.inf.portalfiscal.xsd.cte.cteOS_v300;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Dados do Imposto CT-e
 * 
 * <p>Classe Java de TImp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o contexFAdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TImp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ICMS00"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CST"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="00"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ICMS20"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CST"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc"/&gt;
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ICMS45"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CST"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="40"/&gt;
 *                         &lt;enumeration value="41"/&gt;
 *                         &lt;enumeration value="51"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ICMS60"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CST"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="60"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                   &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                   &lt;element name="pICMSSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
 *                   &lt;element name="vCred" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ICMS90"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CST"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="90"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/&gt;
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                   &lt;element name="vCred" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ICMSOutraUF"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CST"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="90"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="pRedBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/&gt;
 *                   &lt;element name="vBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                   &lt;element name="pICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
 *                   &lt;element name="vICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ICMSSN"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CST"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="90"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="indSN"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TImp", propOrder = {
    "icms00",
    "icms20",
    "icms45",
    "icms60",
    "icms90",
    "icmsOutraUF",
    "icmssn"
})
public class TImp {

    @XmlElement(name = "ICMS00")
    protected TImp.ICMS00 icms00;
    @XmlElement(name = "ICMS20")
    protected TImp.ICMS20 icms20;
    @XmlElement(name = "ICMS45")
    protected TImp.ICMS45 icms45;
    @XmlElement(name = "ICMS60")
    protected TImp.ICMS60 icms60;
    @XmlElement(name = "ICMS90")
    protected TImp.ICMS90 icms90;
    @XmlElement(name = "ICMSOutraUF")
    protected TImp.ICMSOutraUF icmsOutraUF;
    @XmlElement(name = "ICMSSN")
    protected TImp.ICMSSN icmssn;

    /**
     * ObtxE9m o valor da propriedade icms00.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMS00 }
     *     
     */
    public TImp.ICMS00 getICMS00() {
        return icms00;
    }

    /**
     * Define o valor da propriedade icms00.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMS00 }
     *     
     */
    public void setICMS00(TImp.ICMS00 value) {
        this.icms00 = value;
    }

    /**
     * ObtxE9m o valor da propriedade icms20.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMS20 }
     *     
     */
    public TImp.ICMS20 getICMS20() {
        return icms20;
    }

    /**
     * Define o valor da propriedade icms20.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMS20 }
     *     
     */
    public void setICMS20(TImp.ICMS20 value) {
        this.icms20 = value;
    }

    /**
     * ObtxE9m o valor da propriedade icms45.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMS45 }
     *     
     */
    public TImp.ICMS45 getICMS45() {
        return icms45;
    }

    /**
     * Define o valor da propriedade icms45.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMS45 }
     *     
     */
    public void setICMS45(TImp.ICMS45 value) {
        this.icms45 = value;
    }

    /**
     * ObtxE9m o valor da propriedade icms60.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMS60 }
     *     
     */
    public TImp.ICMS60 getICMS60() {
        return icms60;
    }

    /**
     * Define o valor da propriedade icms60.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMS60 }
     *     
     */
    public void setICMS60(TImp.ICMS60 value) {
        this.icms60 = value;
    }

    /**
     * ObtxE9m o valor da propriedade icms90.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMS90 }
     *     
     */
    public TImp.ICMS90 getICMS90() {
        return icms90;
    }

    /**
     * Define o valor da propriedade icms90.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMS90 }
     *     
     */
    public void setICMS90(TImp.ICMS90 value) {
        this.icms90 = value;
    }

    /**
     * ObtxE9m o valor da propriedade icmsOutraUF.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMSOutraUF }
     *     
     */
    public TImp.ICMSOutraUF getICMSOutraUF() {
        return icmsOutraUF;
    }

    /**
     * Define o valor da propriedade icmsOutraUF.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMSOutraUF }
     *     
     */
    public void setICMSOutraUF(TImp.ICMSOutraUF value) {
        this.icmsOutraUF = value;
    }

    /**
     * ObtxE9m o valor da propriedade icmssn.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMSSN }
     *     
     */
    public TImp.ICMSSN getICMSSN() {
        return icmssn;
    }

    /**
     * Define o valor da propriedade icmssn.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMSSN }
     *     
     */
    public void setICMSSN(TImp.ICMSSN value) {
        this.icmssn = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o contexFAdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CST"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="00"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cst",
        "vbc",
        "picms",
        "vicms"
    })
    public static class ICMS00 {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        @XmlElement(name = "vBC", required = true)
        protected String vbc;
        @XmlElement(name = "pICMS", required = true)
        protected String picms;
        @XmlElement(name = "vICMS", required = true)
        protected String vicms;

        /**
         * ObtxE9m o valor da propriedade cst.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * ObtxE9m o valor da propriedade vbc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBC() {
            return vbc;
        }

        /**
         * Define o valor da propriedade vbc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBC(String value) {
            this.vbc = value;
        }

        /**
         * ObtxE9m o valor da propriedade picms.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPICMS() {
            return picms;
        }

        /**
         * Define o valor da propriedade picms.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPICMS(String value) {
            this.picms = value;
        }

        /**
         * ObtxE9m o valor da propriedade vicms.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVICMS() {
            return vicms;
        }

        /**
         * Define o valor da propriedade vicms.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVICMS(String value) {
            this.vicms = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o contexFAdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CST"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="20"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc"/&gt;
     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cst",
        "pRedBC",
        "vbc",
        "picms",
        "vicms"
    })
    public static class ICMS20 {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        @XmlElement(required = true)
        protected String pRedBC;
        @XmlElement(name = "vBC", required = true)
        protected String vbc;
        @XmlElement(name = "pICMS", required = true)
        protected String picms;
        @XmlElement(name = "vICMS", required = true)
        protected String vicms;

        /**
         * ObtxE9m o valor da propriedade cst.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * ObtxE9m o valor da propriedade pRedBC.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRedBC() {
            return pRedBC;
        }

        /**
         * Define o valor da propriedade pRedBC.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRedBC(String value) {
            this.pRedBC = value;
        }

        /**
         * ObtxE9m o valor da propriedade vbc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBC() {
            return vbc;
        }

        /**
         * Define o valor da propriedade vbc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBC(String value) {
            this.vbc = value;
        }

        /**
         * ObtxE9m o valor da propriedade picms.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPICMS() {
            return picms;
        }

        /**
         * Define o valor da propriedade picms.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPICMS(String value) {
            this.picms = value;
        }

        /**
         * ObtxE9m o valor da propriedade vicms.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVICMS() {
            return vicms;
        }

        /**
         * Define o valor da propriedade vicms.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVICMS(String value) {
            this.vicms = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o contexFAdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CST"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="40"/&gt;
     *               &lt;enumeration value="41"/&gt;
     *               &lt;enumeration value="51"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cst"
    })
    public static class ICMS45 {

        @XmlElement(name = "CST", required = true)
        protected String cst;

        /**
         * ObtxE9m o valor da propriedade cst.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCST(String value) {
            this.cst = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o contexFAdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CST"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="60"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *         &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *         &lt;element name="pICMSSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
     *         &lt;element name="vCred" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cst",
        "vbcstRet",
        "vicmsstRet",
        "picmsstRet",
        "vCred"
    })
    public static class ICMS60 {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        @XmlElement(name = "vBCSTRet", required = true)
        protected String vbcstRet;
        @XmlElement(name = "vICMSSTRet", required = true)
        protected String vicmsstRet;
        @XmlElement(name = "pICMSSTRet", required = true)
        protected String picmsstRet;
        protected String vCred;

        /**
         * ObtxE9m o valor da propriedade cst.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * ObtxE9m o valor da propriedade vbcstRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBCSTRet() {
            return vbcstRet;
        }

        /**
         * Define o valor da propriedade vbcstRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBCSTRet(String value) {
            this.vbcstRet = value;
        }

        /**
         * ObtxE9m o valor da propriedade vicmsstRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVICMSSTRet() {
            return vicmsstRet;
        }

        /**
         * Define o valor da propriedade vicmsstRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVICMSSTRet(String value) {
            this.vicmsstRet = value;
        }

        /**
         * ObtxE9m o valor da propriedade picmsstRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPICMSSTRet() {
            return picmsstRet;
        }

        /**
         * Define o valor da propriedade picmsstRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPICMSSTRet(String value) {
            this.picmsstRet = value;
        }

        /**
         * ObtxE9m o valor da propriedade vCred.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVCred() {
            return vCred;
        }

        /**
         * Define o valor da propriedade vCred.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVCred(String value) {
            this.vCred = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o contexFAdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CST"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="90"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/&gt;
     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *         &lt;element name="vCred" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cst",
        "pRedBC",
        "vbc",
        "picms",
        "vicms",
        "vCred"
    })
    public static class ICMS90 {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        protected String pRedBC;
        @XmlElement(name = "vBC", required = true)
        protected String vbc;
        @XmlElement(name = "pICMS", required = true)
        protected String picms;
        @XmlElement(name = "vICMS", required = true)
        protected String vicms;
        protected String vCred;

        /**
         * ObtxE9m o valor da propriedade cst.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * ObtxE9m o valor da propriedade pRedBC.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRedBC() {
            return pRedBC;
        }

        /**
         * Define o valor da propriedade pRedBC.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRedBC(String value) {
            this.pRedBC = value;
        }

        /**
         * ObtxE9m o valor da propriedade vbc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBC() {
            return vbc;
        }

        /**
         * Define o valor da propriedade vbc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBC(String value) {
            this.vbc = value;
        }

        /**
         * ObtxE9m o valor da propriedade picms.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPICMS() {
            return picms;
        }

        /**
         * Define o valor da propriedade picms.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPICMS(String value) {
            this.picms = value;
        }

        /**
         * ObtxE9m o valor da propriedade vicms.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVICMS() {
            return vicms;
        }

        /**
         * Define o valor da propriedade vicms.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVICMS(String value) {
            this.vicms = value;
        }

        /**
         * ObtxE9m o valor da propriedade vCred.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVCred() {
            return vCred;
        }

        /**
         * Define o valor da propriedade vCred.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVCred(String value) {
            this.vCred = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o contexFAdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CST"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="90"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="pRedBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/&gt;
     *         &lt;element name="vBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *         &lt;element name="pICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
     *         &lt;element name="vICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cst",
        "pRedBCOutraUF",
        "vbcOutraUF",
        "picmsOutraUF",
        "vicmsOutraUF"
    })
    public static class ICMSOutraUF {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        protected String pRedBCOutraUF;
        @XmlElement(name = "vBCOutraUF", required = true)
        protected String vbcOutraUF;
        @XmlElement(name = "pICMSOutraUF", required = true)
        protected String picmsOutraUF;
        @XmlElement(name = "vICMSOutraUF", required = true)
        protected String vicmsOutraUF;

        /**
         * ObtxE9m o valor da propriedade cst.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * ObtxE9m o valor da propriedade pRedBCOutraUF.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRedBCOutraUF() {
            return pRedBCOutraUF;
        }

        /**
         * Define o valor da propriedade pRedBCOutraUF.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRedBCOutraUF(String value) {
            this.pRedBCOutraUF = value;
        }

        /**
         * ObtxE9m o valor da propriedade vbcOutraUF.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBCOutraUF() {
            return vbcOutraUF;
        }

        /**
         * Define o valor da propriedade vbcOutraUF.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBCOutraUF(String value) {
            this.vbcOutraUF = value;
        }

        /**
         * ObtxE9m o valor da propriedade picmsOutraUF.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPICMSOutraUF() {
            return picmsOutraUF;
        }

        /**
         * Define o valor da propriedade picmsOutraUF.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPICMSOutraUF(String value) {
            this.picmsOutraUF = value;
        }

        /**
         * ObtxE9m o valor da propriedade vicmsOutraUF.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVICMSOutraUF() {
            return vicmsOutraUF;
        }

        /**
         * Define o valor da propriedade vicmsOutraUF.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVICMSOutraUF(String value) {
            this.vicmsOutraUF = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o contexFAdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CST"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="90"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="indSN"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cst",
        "indSN"
    })
    public static class ICMSSN {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        @XmlElement(required = true)
        protected String indSN;

        /**
         * ObtxE9m o valor da propriedade cst.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * ObtxE9m o valor da propriedade indSN.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndSN() {
            return indSN;
        }

        /**
         * Define o valor da propriedade indSN.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndSN(String value) {
            this.indSN = value;
        }

    }

}
