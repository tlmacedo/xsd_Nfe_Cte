//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementaxe7xe3o de Referxeancia (JAXB) de Bind XML, v2.3.1-b171012.0423 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificaxe7xf5es neste arquivo serxe3o perdidas apxf3s a recompilaxe7xe3o do esquema de origem. 
// Gerado em: 2020.06.27 xe0s 02:46:46 PM AMT 
//


package br.inf.portalfiscal.xsd.cte.cteModalDutoviario_v300;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="vTar" type="{http://www.portalfiscal.inf.br/cte}TDec_0906Opc" minOccurs="0"/&gt;
 *         &lt;element name="dIni" type="{http://www.portalfiscal.inf.br/cte}TData"/&gt;
 *         &lt;element name="dFim" type="{http://www.portalfiscal.inf.br/cte}TData"/&gt;
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
    "vTar",
    "dIni",
    "dFim"
})
@XmlRootElement(name = "duto")
public class Duto {

    protected String vTar;
    @XmlElement(required = true)
    protected String dIni;
    @XmlElement(required = true)
    protected String dFim;

    /**
     * ObtxE9m o valor da propriedade vTar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTar() {
        return vTar;
    }

    /**
     * Define o valor da propriedade vTar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTar(String value) {
        this.vTar = value;
    }

    /**
     * ObtxE9m o valor da propriedade dIni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIni() {
        return dIni;
    }

    /**
     * Define o valor da propriedade dIni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIni(String value) {
        this.dIni = value;
    }

    /**
     * ObtxE9m o valor da propriedade dFim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFim() {
        return dFim;
    }

    /**
     * Define o valor da propriedade dFim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFim(String value) {
        this.dFim = value;
    }

}
