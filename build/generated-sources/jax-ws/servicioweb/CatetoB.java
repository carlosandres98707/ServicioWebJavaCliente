
package servicioweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CatetoB complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CatetoB"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hipotenusa" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="catetoA" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatetoB", propOrder = {
    "hipotenusa",
    "catetoA"
})
public class CatetoB {

    protected double hipotenusa;
    protected double catetoA;

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
     * Obtiene el valor de la propiedad catetoA.
     * 
     */
    public double getCatetoA() {
        return catetoA;
    }

    /**
     * Define el valor de la propiedad catetoA.
     * 
     */
    public void setCatetoA(double value) {
        this.catetoA = value;
    }

}
