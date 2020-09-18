
package servicioweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VolumenCubo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VolumenCubo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lado1" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="lado2" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumenCubo", propOrder = {
    "lado1",
    "lado2",
    "altura"
})
public class VolumenCubo {

    protected double lado1;
    protected double lado2;
    protected double altura;

    /**
     * Obtiene el valor de la propiedad lado1.
     * 
     */
    public double getLado1() {
        return lado1;
    }

    /**
     * Define el valor de la propiedad lado1.
     * 
     */
    public void setLado1(double value) {
        this.lado1 = value;
    }

    /**
     * Obtiene el valor de la propiedad lado2.
     * 
     */
    public double getLado2() {
        return lado2;
    }

    /**
     * Define el valor de la propiedad lado2.
     * 
     */
    public void setLado2(double value) {
        this.lado2 = value;
    }

    /**
     * Obtiene el valor de la propiedad altura.
     * 
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Define el valor de la propiedad altura.
     * 
     */
    public void setAltura(double value) {
        this.altura = value;
    }

}
