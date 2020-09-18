
package servicioweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CatetoA complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CatetoA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hipotenusa" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="catetoB" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatetoA", propOrder = {
    "hipotenusa",
    "catetoB"
})
public class CatetoA {

    protected double hipotenusa;
    protected double catetoB;

    /**
     * Obtiene el valor de la propiedad hipotenusa.
     * 
     */
    public double getHipotenusa() {
        return hipotenusa;
    }

    /**
     * Define el valor de la propiedad hipotenusa.
     * 
     */
    public void setHipotenusa(double value) {
        this.hipotenusa = value;
    }

    /**
     * Obtiene el valor de la propiedad catetoB.
     * 
     */
    public double getCatetoB() {
        return catetoB;
    }

    /**
     * Define el valor de la propiedad catetoB.
     * 
     */
    public void setCatetoB(double value) {
        this.catetoB = value;
    }

}
