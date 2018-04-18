
package ExampleIntegrationJavaTigoMoney;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ExampleIntegrationJavaTigoMoney package. 
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

    private final static QName _SolicitarPago_QNAME = new QName("http://services.vlink.com.bo/", "solicitarPago");
    private final static QName _ConsultarEstadoResponse_QNAME = new QName("http://services.vlink.com.bo/", "consultarEstadoResponse");
    private final static QName _SolicitarPagoAsincrono_QNAME = new QName("http://services.vlink.com.bo/", "solicitarPagoAsincrono");
    private final static QName _SolicitarPagoResponse_QNAME = new QName("http://services.vlink.com.bo/", "solicitarPagoResponse");
    private final static QName _ConsultarEstado_QNAME = new QName("http://services.vlink.com.bo/", "consultarEstado");
    private final static QName _SolicitarPagoAsincronoResponse_QNAME = new QName("http://services.vlink.com.bo/", "solicitarPagoAsincronoResponse");
    private final static QName _RevertirPago_QNAME = new QName("http://services.vlink.com.bo/", "revertirPago");
    private final static QName _RevertirPagoResponse_QNAME = new QName("http://services.vlink.com.bo/", "revertirPagoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ExampleIntegrationJavaTigoMoney
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarEstado }
     * 
     */
    public ConsultarEstado createConsultarEstado() {
        return new ConsultarEstado();
    }

    /**
     * Create an instance of {@link SolicitarPagoResponse }
     * 
     */
    public SolicitarPagoResponse createSolicitarPagoResponse() {
        return new SolicitarPagoResponse();
    }

    /**
     * Create an instance of {@link RevertirPago }
     * 
     */
    public RevertirPago createRevertirPago() {
        return new RevertirPago();
    }

    /**
     * Create an instance of {@link RevertirPagoResponse }
     * 
     */
    public RevertirPagoResponse createRevertirPagoResponse() {
        return new RevertirPagoResponse();
    }

    /**
     * Create an instance of {@link SolicitarPagoAsincronoResponse }
     * 
     */
    public SolicitarPagoAsincronoResponse createSolicitarPagoAsincronoResponse() {
        return new SolicitarPagoAsincronoResponse();
    }

    /**
     * Create an instance of {@link SolicitarPago }
     * 
     */
    public SolicitarPago createSolicitarPago() {
        return new SolicitarPago();
    }

    /**
     * Create an instance of {@link ConsultarEstadoResponse }
     * 
     */
    public ConsultarEstadoResponse createConsultarEstadoResponse() {
        return new ConsultarEstadoResponse();
    }

    /**
     * Create an instance of {@link SolicitarPagoAsincrono }
     * 
     */
    public SolicitarPagoAsincrono createSolicitarPagoAsincrono() {
        return new SolicitarPagoAsincrono();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.vlink.com.bo/", name = "solicitarPago")
    public JAXBElement<SolicitarPago> createSolicitarPago(SolicitarPago value) {
        return new JAXBElement<SolicitarPago>(_SolicitarPago_QNAME, SolicitarPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEstadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.vlink.com.bo/", name = "consultarEstadoResponse")
    public JAXBElement<ConsultarEstadoResponse> createConsultarEstadoResponse(ConsultarEstadoResponse value) {
        return new JAXBElement<ConsultarEstadoResponse>(_ConsultarEstadoResponse_QNAME, ConsultarEstadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarPagoAsincrono }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.vlink.com.bo/", name = "solicitarPagoAsincrono")
    public JAXBElement<SolicitarPagoAsincrono> createSolicitarPagoAsincrono(SolicitarPagoAsincrono value) {
        return new JAXBElement<SolicitarPagoAsincrono>(_SolicitarPagoAsincrono_QNAME, SolicitarPagoAsincrono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarPagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.vlink.com.bo/", name = "solicitarPagoResponse")
    public JAXBElement<SolicitarPagoResponse> createSolicitarPagoResponse(SolicitarPagoResponse value) {
        return new JAXBElement<SolicitarPagoResponse>(_SolicitarPagoResponse_QNAME, SolicitarPagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarEstado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.vlink.com.bo/", name = "consultarEstado")
    public JAXBElement<ConsultarEstado> createConsultarEstado(ConsultarEstado value) {
        return new JAXBElement<ConsultarEstado>(_ConsultarEstado_QNAME, ConsultarEstado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitarPagoAsincronoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.vlink.com.bo/", name = "solicitarPagoAsincronoResponse")
    public JAXBElement<SolicitarPagoAsincronoResponse> createSolicitarPagoAsincronoResponse(SolicitarPagoAsincronoResponse value) {
        return new JAXBElement<SolicitarPagoAsincronoResponse>(_SolicitarPagoAsincronoResponse_QNAME, SolicitarPagoAsincronoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevertirPago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.vlink.com.bo/", name = "revertirPago")
    public JAXBElement<RevertirPago> createRevertirPago(RevertirPago value) {
        return new JAXBElement<RevertirPago>(_RevertirPago_QNAME, RevertirPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevertirPagoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.vlink.com.bo/", name = "revertirPagoResponse")
    public JAXBElement<RevertirPagoResponse> createRevertirPagoResponse(RevertirPagoResponse value) {
        return new JAXBElement<RevertirPagoResponse>(_RevertirPagoResponse_QNAME, RevertirPagoResponse.class, null, value);
    }

}
