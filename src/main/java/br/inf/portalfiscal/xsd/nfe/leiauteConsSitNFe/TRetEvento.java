//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementaxe7xe3o de Referxeancia (JAXB) de Bind XML, v2.3.1-b171012.0423 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificaxe7xf5es neste arquivo serxe3o perdidas apxf3s a recompilaxe7xe3o do esquema de origem. 
// Gerado em: 2020.12.02 xe0s 10:02:59 AM AMT 
//


package br.inf.portalfiscal.xsd.nfe.leiauteConsSitNFe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Tipo retorno do Evento
 * 
 * <p>Classe Java de TRetEvento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o contexFAdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TRetEvento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infEvento"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/&gt;
 *                   &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/nfe}TVerAplic"/&gt;
 *                   &lt;element name="cOrgao" type="{http://www.portalfiscal.inf.br/nfe}TCOrgaoIBGE"/&gt;
 *                   &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/nfe}TStat"/&gt;
 *                   &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/nfe}TMotivo"/&gt;
 *                   &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe" minOccurs="0"/&gt;
 *                   &lt;element name="tpEvento" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;pattern value="[0-9]{6}"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="xEvento" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString"&gt;
 *                         &lt;minLength value="5"/&gt;
 *                         &lt;maxLength value="60"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="nSeqEvento" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;pattern value="[1-9][0-9]{0,1}"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;choice minOccurs="0"&gt;
 *                     &lt;element name="CNPJDest" type="{http://www.portalfiscal.inf.br/nfe}TCnpjOpc"/&gt;
 *                     &lt;element name="CPFDest" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="emailDest" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="60"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="dhRegEvento" type="{http://www.portalfiscal.inf.br/nfe}TDateTimeUTC"/&gt;
 *                   &lt;element name="nProt" type="{http://www.portalfiscal.inf.br/nfe}TProt" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Id"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID"&gt;
 *                       &lt;pattern value="ID[0-9]{15}"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TRetVerEvento" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRetEvento", namespace = "http://www.portalfiscal.inf.br/nfe", propOrder = {
    "infEvento",
    "signature"
})
public class TRetEvento {

    @XmlElement(required = true)
    protected TRetEvento.InfEvento infEvento;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * ObtxE9m o valor da propriedade infEvento.
     * 
     * @return
     *     possible object is
     *     {@link TRetEvento.InfEvento }
     *     
     */
    public TRetEvento.InfEvento getInfEvento() {
        return infEvento;
    }

    /**
     * Define o valor da propriedade infEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link TRetEvento.InfEvento }
     *     
     */
    public void setInfEvento(TRetEvento.InfEvento value) {
        this.infEvento = value;
    }

    /**
     * ObtxE9m o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * ObtxE9m o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
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
     *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/&gt;
     *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/nfe}TVerAplic"/&gt;
     *         &lt;element name="cOrgao" type="{http://www.portalfiscal.inf.br/nfe}TCOrgaoIBGE"/&gt;
     *         &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/nfe}TStat"/&gt;
     *         &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/nfe}TMotivo"/&gt;
     *         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/nfe}TChNFe" minOccurs="0"/&gt;
     *         &lt;element name="tpEvento" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;pattern value="[0-9]{6}"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="xEvento" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString"&gt;
     *               &lt;minLength value="5"/&gt;
     *               &lt;maxLength value="60"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="nSeqEvento" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;pattern value="[1-9][0-9]{0,1}"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;choice minOccurs="0"&gt;
     *           &lt;element name="CNPJDest" type="{http://www.portalfiscal.inf.br/nfe}TCnpjOpc"/&gt;
     *           &lt;element name="CPFDest" type="{http://www.portalfiscal.inf.br/nfe}TCpf"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="emailDest" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/nfe}TString"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="60"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="dhRegEvento" type="{http://www.portalfiscal.inf.br/nfe}TDateTimeUTC"/&gt;
     *         &lt;element name="nProt" type="{http://www.portalfiscal.inf.br/nfe}TProt" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Id"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID"&gt;
     *             &lt;pattern value="ID[0-9]{15}"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpAmb",
        "verAplic",
        "cOrgao",
        "cStat",
        "xMotivo",
        "chNFe",
        "tpEvento",
        "xEvento",
        "nSeqEvento",
        "cnpjDest",
        "cpfDest",
        "emailDest",
        "dhRegEvento",
        "nProt"
    })
    public static class InfEvento {

        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
        protected String tpAmb;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
        protected String verAplic;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
        protected String cOrgao;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
        protected String cStat;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
        protected String xMotivo;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        protected String chNFe;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        protected String tpEvento;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        protected String xEvento;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        protected String nSeqEvento;
        @XmlElement(name = "CNPJDest", namespace = "http://www.portalfiscal.inf.br/nfe")
        protected String cnpjDest;
        @XmlElement(name = "CPFDest", namespace = "http://www.portalfiscal.inf.br/nfe")
        protected String cpfDest;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        protected String emailDest;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe", required = true)
        protected String dhRegEvento;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/nfe")
        protected String nProt;
        @XmlAttribute(name = "Id")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * ObtxE9m o valor da propriedade tpAmb.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpAmb() {
            return tpAmb;
        }

        /**
         * Define o valor da propriedade tpAmb.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpAmb(String value) {
            this.tpAmb = value;
        }

        /**
         * ObtxE9m o valor da propriedade verAplic.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVerAplic() {
            return verAplic;
        }

        /**
         * Define o valor da propriedade verAplic.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerAplic(String value) {
            this.verAplic = value;
        }

        /**
         * ObtxE9m o valor da propriedade cOrgao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOrgao() {
            return cOrgao;
        }

        /**
         * Define o valor da propriedade cOrgao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOrgao(String value) {
            this.cOrgao = value;
        }

        /**
         * ObtxE9m o valor da propriedade cStat.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCStat() {
            return cStat;
        }

        /**
         * Define o valor da propriedade cStat.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCStat(String value) {
            this.cStat = value;
        }

        /**
         * ObtxE9m o valor da propriedade xMotivo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXMotivo() {
            return xMotivo;
        }

        /**
         * Define o valor da propriedade xMotivo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXMotivo(String value) {
            this.xMotivo = value;
        }

        /**
         * ObtxE9m o valor da propriedade chNFe.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChNFe() {
            return chNFe;
        }

        /**
         * Define o valor da propriedade chNFe.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChNFe(String value) {
            this.chNFe = value;
        }

        /**
         * ObtxE9m o valor da propriedade tpEvento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpEvento() {
            return tpEvento;
        }

        /**
         * Define o valor da propriedade tpEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpEvento(String value) {
            this.tpEvento = value;
        }

        /**
         * ObtxE9m o valor da propriedade xEvento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXEvento() {
            return xEvento;
        }

        /**
         * Define o valor da propriedade xEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXEvento(String value) {
            this.xEvento = value;
        }

        /**
         * ObtxE9m o valor da propriedade nSeqEvento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNSeqEvento() {
            return nSeqEvento;
        }

        /**
         * Define o valor da propriedade nSeqEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNSeqEvento(String value) {
            this.nSeqEvento = value;
        }

        /**
         * ObtxE9m o valor da propriedade cnpjDest.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNPJDest() {
            return cnpjDest;
        }

        /**
         * Define o valor da propriedade cnpjDest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNPJDest(String value) {
            this.cnpjDest = value;
        }

        /**
         * ObtxE9m o valor da propriedade cpfDest.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPFDest() {
            return cpfDest;
        }

        /**
         * Define o valor da propriedade cpfDest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPFDest(String value) {
            this.cpfDest = value;
        }

        /**
         * ObtxE9m o valor da propriedade emailDest.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailDest() {
            return emailDest;
        }

        /**
         * Define o valor da propriedade emailDest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailDest(String value) {
            this.emailDest = value;
        }

        /**
         * ObtxE9m o valor da propriedade dhRegEvento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDhRegEvento() {
            return dhRegEvento;
        }

        /**
         * Define o valor da propriedade dhRegEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDhRegEvento(String value) {
            this.dhRegEvento = value;
        }

        /**
         * ObtxE9m o valor da propriedade nProt.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNProt() {
            return nProt;
        }

        /**
         * Define o valor da propriedade nProt.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNProt(String value) {
            this.nProt = value;
        }

        /**
         * ObtxE9m o valor da propriedade id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
