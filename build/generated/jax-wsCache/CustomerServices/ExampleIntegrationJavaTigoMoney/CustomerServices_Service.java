
package ExampleIntegrationJavaTigoMoney;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CustomerServices", targetNamespace = "http://services.vlink.com.bo/", wsdlLocation = "https://190.104.0.116/PasarelaServices_V2/CustomerServices?wsdl")
public class CustomerServices_Service
    extends Service
{

    private final static URL CUSTOMERSERVICES_WSDL_LOCATION;
    private final static WebServiceException CUSTOMERSERVICES_EXCEPTION;
    private final static QName CUSTOMERSERVICES_QNAME = new QName("http://services.vlink.com.bo/", "CustomerServices");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://190.104.0.116/PasarelaServices_V2/CustomerServices?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CUSTOMERSERVICES_WSDL_LOCATION = url;
        CUSTOMERSERVICES_EXCEPTION = e;
    }

    public CustomerServices_Service() {
        super(__getWsdlLocation(), CUSTOMERSERVICES_QNAME);
    }

    public CustomerServices_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), CUSTOMERSERVICES_QNAME, features);
    }

    public CustomerServices_Service(URL wsdlLocation) {
        super(wsdlLocation, CUSTOMERSERVICES_QNAME);
    }

    public CustomerServices_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CUSTOMERSERVICES_QNAME, features);
    }

    public CustomerServices_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CustomerServices_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CustomerServices
     */
    @WebEndpoint(name = "CustomerServicesPort")
    public CustomerServices getCustomerServicesPort() {
        return super.getPort(new QName("http://services.vlink.com.bo/", "CustomerServicesPort"), CustomerServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CustomerServices
     */
    @WebEndpoint(name = "CustomerServicesPort")
    public CustomerServices getCustomerServicesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.vlink.com.bo/", "CustomerServicesPort"), CustomerServices.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CUSTOMERSERVICES_EXCEPTION!= null) {
            throw CUSTOMERSERVICES_EXCEPTION;
        }
        return CUSTOMERSERVICES_WSDL_LOCATION;
    }

}