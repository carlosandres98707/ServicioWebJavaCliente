
package servicioweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VolumenTriangulo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VolumenTriangulo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="altura" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="alturacuerpo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumenTriangulo", propOrder = {
    "base",
    "altura",
    "alturacuerpo"
})
public class VolumenTriangulo {

    protected double base;
    protected double altura;
    protected double alturacuerpo;

    /**
     * Obtiene el valor de la propiedad base.
     * 
     */
    public double getBase() {
        return base;
    }

    /**
     * Define el valor de la propiedad base.
     * 
     */
    public void setBase(double value) {
        this.base = value;
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

    /**
     * Obtiene el valor de la propiedad alturacuerpo.
     * 
     */
    public double getAlturacuerpo() {
        return alturacuerpo;
    }

    /**
     * Define el valor de la propiedad alturacuerpo.
     * 
     */
    public void setAlturacuerpo(double value) {
        this.alturacuerpo = value;
    }

}
