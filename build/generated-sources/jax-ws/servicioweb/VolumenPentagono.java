
package servicioweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VolumenPentagono complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VolumenPentagono"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lado" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="apotema" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
@XmlType(name = "VolumenPentagono", propOrder = {
    "lado",
    "apotema",
    "altura"
})
public class VolumenPentagono {

    protected double lado;
    protected double apotema;
    protected double altura;

    /**
     * Obtiene el valor de la propiedad lado.
     * 
     */
    public double getLado() {
        return lado;
    }

    /**
     * Define el valor de la propiedad lado.
     * 
     */
    public void setLado(double value) {
        this.lado = value;
    }

    /**
     * Obtiene el valor de la propiedad apotema.
     * 
     */
    public double getApotema() {
        return apotema;
    }

    /**
     * Define el valor de la propiedad apotema.
     * 
     */
    public void setApotema(double value) {
        this.apotema = value;
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
