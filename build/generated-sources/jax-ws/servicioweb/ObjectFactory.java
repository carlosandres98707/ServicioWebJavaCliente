
package servicioweb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicioweb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CatetoA_QNAME = new QName("http://servicioweb/", "CatetoA");
    private final static QName _CatetoAResponse_QNAME = new QName("http://servicioweb/", "CatetoAResponse");
    private final static QName _CatetoB_QNAME = new QName("http://servicioweb/", "CatetoB");
    private final static QName _CatetoBResponse_QNAME = new QName("http://servicioweb/", "CatetoBResponse");
    private final static QName _Hipotenusa_QNAME = new QName("http://servicioweb/", "Hipotenusa");
    private final static QName _HipotenusaResponse_QNAME = new QName("http://servicioweb/", "HipotenusaResponse");
    private final static QName _VolumenCubo_QNAME = new QName("http://servicioweb/", "VolumenCubo");
    private final static QName _VolumenCuboResponse_QNAME = new QName("http://servicioweb/", "VolumenCuboResponse");
    private final static QName _VolumenPentagono_QNAME = new QName("http://servicioweb/", "VolumenPentagono");
    private final static QName _VolumenPentagonoResponse_QNAME = new QName("http://servicioweb/", "VolumenPentagonoResponse");
    private final static QName _VolumenRectangulo_QNAME = new QName("http://servicioweb/", "VolumenRectangulo");
    private final static QName _VolumenRectanguloResponse_QNAME = new QName("http://servicioweb/", "VolumenRectanguloResponse");
    private final static QName _VolumenTriangulo_QNAME = new QName("http://servicioweb/", "VolumenTriangulo");
    private final static QName _VolumenTrianguloResponse_QNAME = new QName("http://servicioweb/", "VolumenTrianguloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicioweb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CatetoA }
     * 
     */
    public CatetoA createCatetoA() {
        return new CatetoA();
    }

    /**
     * Create an instance of {@link CatetoAResponse }
     * 
     */
    public CatetoAResponse createCatetoAResponse() {
        return new CatetoAResponse();
    }

    /**
     * Create an instance of {@link CatetoB }
     * 
     */
    public CatetoB createCatetoB() {
        return new CatetoB();
    }

    /**
     * Create an instance of {@link CatetoBResponse }
     * 
     */
    public CatetoBResponse createCatetoBResponse() {
        return new CatetoBResponse();
    }

    /**
     * Create an instance of {@link Hipotenusa }
     * 
     */
    public Hipotenusa createHipotenusa() {
        return new Hipotenusa();
    }

    /**
     * Create an instance of {@link HipotenusaResponse }
     * 
     */
    public HipotenusaResponse createHipotenusaResponse() {
        return new HipotenusaResponse();
    }

    /**
     * Create an instance of {@link VolumenCubo }
     * 
     */
    public VolumenCubo createVolumenCubo() {
        return new VolumenCubo();
    }

    /**
     * Create an instance of {@link VolumenCuboResponse }
     * 
     */
    public VolumenCuboResponse createVolumenCuboResponse() {
        return new VolumenCuboResponse();
    }

    /**
     * Create an instance of {@link VolumenPentagono }
     * 
     */
    public VolumenPentagono createVolumenPentagono() {
        return new VolumenPentagono();
    }

    /**
     * Create an instance of {@link VolumenPentagonoResponse }
     * 
     */
    public VolumenPentagonoResponse createVolumenPentagonoResponse() {
        return new VolumenPentagonoResponse();
    }

    /**
     * Create an instance of {@link VolumenRectangulo }
     * 
     */
    public VolumenRectangulo createVolumenRectangulo() {
        return new VolumenRectangulo();
    }

    /**
     * Create an instance of {@link VolumenRectanguloResponse }
     * 
     */
    public VolumenRectanguloResponse createVolumenRectanguloResponse() {
        return new VolumenRectanguloResponse();
    }

    /**
     * Create an instance of {@link VolumenTriangulo }
     * 
     */
    public VolumenTriangulo createVolumenTriangulo() {
        return new VolumenTriangulo();
    }

    /**
     * Create an instance of {@link VolumenTrianguloResponse }
     * 
     */
    public VolumenTrianguloResponse createVolumenTrianguloResponse() {
        return new VolumenTrianguloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatetoA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioweb/", name = "CatetoA")
    public JAXBElement<CatetoA> createCatetoA(CatetoA value) {
        return new JAXBElement<CatetoA>(_CatetoA_QNAME, CatetoA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatetoAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioweb/", name = "CatetoAResponse")
    public JAXBElement<CatetoAResponse> createCatetoAResponse(CatetoAResponse value) {
        return new JAXBElement<CatetoAResponse>(_CatetoAResponse_QNAME, CatetoAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatetoB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioweb/", name = "CatetoB")
    public JAXBElement<CatetoB> createCatetoB(CatetoB value) {
        return new JAXBElement<CatetoB>(_CatetoB_QNAME, CatetoB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatetoBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioweb/", name = "CatetoBResponse")
    public JAXBElement<CatetoBResponse> createCatetoBResponse(CatetoBResponse value) {
        return new JAXBElement<CatetoBResponse>(_CatetoBResponse_QNAME, CatetoBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hipotenusa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioweb/", name = "Hipotenusa")
    public JAXBElement<Hipotenusa> createHipotenusa(Hipotenusa value) {
        return new JAXBElement<Hipotenusa>(_Hipotenusa_QNAME, Hipotenusa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HipotenusaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioweb/", name = "HipotenusaResponse")
    public JAXBElement<HipotenusaResponse> createHipotenusaResponse(HipotenusaResponse value) {
        return new JAXBElement<HipotenusaResponse>(_HipotenusaResponse_QNAME, HipotenusaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumenCubo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioweb/", name = "VolumenCubo")
    public JAXBElement<VolumenCubo> createVolumenCubo(VolumenCubo value) {
        return new JAXBElement<VolumenCubo>(_VolumenCubo_QNAME, VolumenCubo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumenCuboResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioweb/", name = "VolumenCuboResponse")
    public JAXBElement<VolumenCuboResponse> createVolumenCuboResponse(VolumenCuboResponse value) {
        return new JAXBElement<VolumenCuboResponse>(_VolumenCuboResponse_QNAME, VolumenCuboResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumenPentagono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioweb/", name = "VolumenPentagono")
    public JAXBElement<VolumenPentagono> createVolumenPentagono(VolumenPentagono value) {
        return new JAXBElement<VolumenPentagono>(_VolumenPentagono_QNAME, VolumenPentagono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumenPentagonoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioweb/", name = "VolumenPentagonoResponse")
    public JAXBElement<VolumenPentagonoResponse> createVolumenPentagonoResponse(VolumenPentagonoResponse value) {
        return new JAXBElement<VolumenPentagonoResponse>(_VolumenPentagonoResponse_QNAME, VolumenPentagonoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumenRectangulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioweb/", name = "VolumenRectangulo")
    public JAXBElement<VolumenRectangulo> createVolumenRectangulo(VolumenRectangulo value) {
        return new JAXBElement<VolumenRectangulo>(_VolumenRectangulo_QNAME, VolumenRectangulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumenRectanguloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioweb/", name = "VolumenRectanguloResponse")
    public JAXBElement<VolumenRectanguloResponse> createVolumenRectanguloResponse(VolumenRectanguloResponse value) {
        return new JAXBElement<VolumenRectanguloResponse>(_VolumenRectanguloResponse_QNAME, VolumenRectanguloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumenTriangulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioweb/", name = "VolumenTriangulo")
    public JAXBElement<VolumenTriangulo> createVolumenTriangulo(VolumenTriangulo value) {
        return new JAXBElement<VolumenTriangulo>(_VolumenTriangulo_QNAME, VolumenTriangulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumenTrianguloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicioweb/", name = "VolumenTrianguloResponse")
    public JAXBElement<VolumenTrianguloResponse> createVolumenTrianguloResponse(VolumenTrianguloResponse value) {
        return new JAXBElement<VolumenTrianguloResponse>(_VolumenTrianguloResponse_QNAME, VolumenTrianguloResponse.class, null, value);
    }

}
