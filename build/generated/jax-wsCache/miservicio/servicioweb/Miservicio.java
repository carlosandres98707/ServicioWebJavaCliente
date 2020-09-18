
package servicioweb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "miservicio", targetNamespace = "http://servicioweb/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Miservicio {


    /**
     * 
     * @param hipotenusa
     * @param catetoB
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CatetoA")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CatetoA", targetNamespace = "http://servicioweb/", className = "servicioweb.CatetoA")
    @ResponseWrapper(localName = "CatetoAResponse", targetNamespace = "http://servicioweb/", className = "servicioweb.CatetoAResponse")
    @Action(input = "http://servicioweb/miservicio/CatetoARequest", output = "http://servicioweb/miservicio/CatetoAResponse")
    public String catetoA(
        @WebParam(name = "hipotenusa", targetNamespace = "")
        double hipotenusa,
        @WebParam(name = "catetoB", targetNamespace = "")
        double catetoB);

    /**
     * 
     * @param alturacuerpo
     * @param altura
     * @param base
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "VolumenTriangulo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "VolumenTriangulo", targetNamespace = "http://servicioweb/", className = "servicioweb.VolumenTriangulo")
    @ResponseWrapper(localName = "VolumenTrianguloResponse", targetNamespace = "http://servicioweb/", className = "servicioweb.VolumenTrianguloResponse")
    @Action(input = "http://servicioweb/miservicio/VolumenTrianguloRequest", output = "http://servicioweb/miservicio/VolumenTrianguloResponse")
    public String volumenTriangulo(
        @WebParam(name = "base", targetNamespace = "")
        double base,
        @WebParam(name = "altura", targetNamespace = "")
        double altura,
        @WebParam(name = "alturacuerpo", targetNamespace = "")
        double alturacuerpo);

    /**
     * 
     * @param altura
     * @param lado2
     * @param lado1
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "VolumenCubo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "VolumenCubo", targetNamespace = "http://servicioweb/", className = "servicioweb.VolumenCubo")
    @ResponseWrapper(localName = "VolumenCuboResponse", targetNamespace = "http://servicioweb/", className = "servicioweb.VolumenCuboResponse")
    @Action(input = "http://servicioweb/miservicio/VolumenCuboRequest", output = "http://servicioweb/miservicio/VolumenCuboResponse")
    public String volumenCubo(
        @WebParam(name = "lado1", targetNamespace = "")
        double lado1,
        @WebParam(name = "lado2", targetNamespace = "")
        double lado2,
        @WebParam(name = "altura", targetNamespace = "")
        double altura);

    /**
     * 
     * @param ancho
     * @param largo
     * @param alto
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "VolumenRectangulo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "VolumenRectangulo", targetNamespace = "http://servicioweb/", className = "servicioweb.VolumenRectangulo")
    @ResponseWrapper(localName = "VolumenRectanguloResponse", targetNamespace = "http://servicioweb/", className = "servicioweb.VolumenRectanguloResponse")
    @Action(input = "http://servicioweb/miservicio/VolumenRectanguloRequest", output = "http://servicioweb/miservicio/VolumenRectanguloResponse")
    public String volumenRectangulo(
        @WebParam(name = "largo", targetNamespace = "")
        double largo,
        @WebParam(name = "ancho", targetNamespace = "")
        double ancho,
        @WebParam(name = "alto", targetNamespace = "")
        double alto);

    /**
     * 
     * @param hipotenusa
     * @param catetoA
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CatetoB")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CatetoB", targetNamespace = "http://servicioweb/", className = "servicioweb.CatetoB")
    @ResponseWrapper(localName = "CatetoBResponse", targetNamespace = "http://servicioweb/", className = "servicioweb.CatetoBResponse")
    @Action(input = "http://servicioweb/miservicio/CatetoBRequest", output = "http://servicioweb/miservicio/CatetoBResponse")
    public String catetoB(
        @WebParam(name = "hipotenusa", targetNamespace = "")
        double hipotenusa,
        @WebParam(name = "catetoA", targetNamespace = "")
        double catetoA);

    /**
     * 
     * @param lado
     * @param altura
     * @param apotema
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "VolumenPentagono")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "VolumenPentagono", targetNamespace = "http://servicioweb/", className = "servicioweb.VolumenPentagono")
    @ResponseWrapper(localName = "VolumenPentagonoResponse", targetNamespace = "http://servicioweb/", className = "servicioweb.VolumenPentagonoResponse")
    @Action(input = "http://servicioweb/miservicio/VolumenPentagonoRequest", output = "http://servicioweb/miservicio/VolumenPentagonoResponse")
    public String volumenPentagono(
        @WebParam(name = "lado", targetNamespace = "")
        double lado,
        @WebParam(name = "apotema", targetNamespace = "")
        double apotema,
        @WebParam(name = "altura", targetNamespace = "")
        double altura);

    /**
     * 
     * @param catetoA
     * @param catetoB
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Hipotenusa")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Hipotenusa", targetNamespace = "http://servicioweb/", className = "servicioweb.Hipotenusa")
    @ResponseWrapper(localName = "HipotenusaResponse", targetNamespace = "http://servicioweb/", className = "servicioweb.HipotenusaResponse")
    @Action(input = "http://servicioweb/miservicio/HipotenusaRequest", output = "http://servicioweb/miservicio/HipotenusaResponse")
    public String hipotenusa(
        @WebParam(name = "catetoA", targetNamespace = "")
        double catetoA,
        @WebParam(name = "catetoB", targetNamespace = "")
        double catetoB);

}
