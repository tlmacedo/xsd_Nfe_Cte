//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementaxe7xe3o de Referxeancia (JAXB) de Bind XML, v2.3.1-b171012.0423 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificaxe7xf5es neste arquivo serxe3o perdidas apxf3s a recompilaxe7xe3o do esquema de origem. 
// Gerado em: 2020.06.27 xe0s 02:47:15 PM AMT 
//


package br.inf.portalfiscal.xsd.cte.procCTeOS_v300;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="CTeOS" type="{http://www.portalfiscal.inf.br/cte}TCTeOS"/&gt;
 *         &lt;element name="protCTe" type="{http://www.portalfiscal.inf.br/cte}TProtCTeOS"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerCTe" /&gt;
 *       &lt;attribute name="ipTransmissor" type="{http://www.portalfiscal.inf.br/cte}TIPv4" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cTeOS",
    "protCTe"
})
@XmlRootElement(name = "cteOSProc")
public class CteOSProc {

    @XmlElement(name = "CTeOS", required = true)
    protected TCTeOS cTeOS;
    @XmlElement(required = true)
    protected TProtCTeOS protCTe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;
    @XmlAttribute(name = "ipTransmissor")
    protected String ipTransmissor;

    /**
     * ObtxE9m o valor da propriedade cTeOS.
     * 
     * @return
     *     possible object is
     *     {@link TCTeOS }
     *     
     */
    public TCTeOS getCTeOS() {
        return cTeOS;
    }

    /**
     * Define o valor da propriedade cTeOS.
     * 
     * @param value
     *     allowed object is
     *     {@link TCTeOS }
     *     
     */
    public void setCTeOS(TCTeOS value) {
        this.cTeOS = value;
    }

    /**
     * ObtxE9m o valor da propriedade protCTe.
     * 
     * @return
     *     possible object is
     *     {@link TProtCTeOS }
     *     
     */
    public TProtCTeOS getProtCTe() {
        return protCTe;
    }

    /**
     * Define o valor da propriedade protCTe.
     * 
     * @param value
     *     allowed object is
     *     {@link TProtCTeOS }
     *     
     */
    public void setProtCTe(TProtCTeOS value) {
        this.protCTe = value;
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
     * ObtxE9m o valor da propriedade ipTransmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpTransmissor() {
        return ipTransmissor;
    }

    /**
     * Define o valor da propriedade ipTransmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpTransmissor(String value) {
        this.ipTransmissor = value;
    }

}
