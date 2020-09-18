
package servicioweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VolumenRectangulo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VolumenRectangulo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="largo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ancho" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="alto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumenRectangulo", propOrder = {
    "largo",
    "ancho",
    "alto"
})
public class VolumenRectangulo {

    protected double largo;
    protected double ancho;
    protected double alto;

    /**
     * Obtiene el valor de la propiedad largo.
     * 
     */
    public double getLargo() {
        return largo;
    }

    /**
     * Define el valor de la propiedad largo.
     * 
     */
    public void setLargo(double value) {
        this.largo = value;
    }

    /**
     * Obtiene el valor de la propiedad ancho.
     * 
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * Define el valor de la propiedad ancho.
     * 
     */
    public void setAncho(double value) {
        this.ancho = value;
    }

    /**
     * Obtiene el valor de la propiedad alto.
     * 
     */
    public double getAlto() {
        return alto;
    }

    /**
     * Define el valor de la propiedad alto.
     * 
     */
    public void setAlto(double value) {
        this.alto = value;
    }

}
