/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleIntegrationJavaTigoMoney;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
/**
 *
 * @author Ricardo Bejarano Espinoza
 * @email <rbejaranoe@gmail.com>
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // Create a trust manager that does not validate certificate chains
        TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }
                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }
        };
        // Install the all-trusting trust manager
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        // Create all-trusting host name verifier
        HostnameVerifier allHostsValid = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
        // Install the all-trusting host verifier
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        try {
            String linea = "69178351";
            String orderId = "11568827";
            String monto = "20";
            String parametro = "pv_nroDocumento=;pv_linea=" + linea + ";pv_monto=" + monto + ";pv_orderId=" + orderId + ";pv_confirmacion= a TigoMoney;pv_notificacion= a TigoMoney;pv_items=*i1|1|Producto 1|15.50|15.50*i2|3|Producto2|25.00|30.00;pv_razonSocial=FreshiS.R.L;pv_nit=20154589";
            
            String llaveEncriptacion = "9J1OJXI6QRM39WXA8GQQOQH2";
            String llaveIdentificacion = "f401408244902997aa56fb8c6e44a47f4d028a48f8524c938434c70addb6728dc1d7375575390ae2321b549cfc46cbc2e538dda4cdc15453df1b639b1dc577c5";
            byte[] encritpado = CTripleDes.encrypt(parametro, llaveEncriptacion);
            String request = new String(CBase64.encode(encritpado));
            //Opciones
            //Solicitar Pago Sincrono      =    1
            //Solicitar Pago Asincrono     =    2
            //Consultar Pago               =    3
            //Revertir Pago                =    4}
            int operacion = 1;
            String response = "";
            byte[] decode;
            String resultado;
            switch(operacion){
                case 1:response = solicitarPago(llaveIdentificacion, request);break;
                case 2:response = solicitarpagoAsincrono(llaveIdentificacion, request);break;
                case 3:
                    byte[] encritpado1 = CTripleDes.encrypt(orderId, llaveEncriptacion);
                    String request1 = new String(CBase64.encode(encritpado1));
                    response = consultarEstado(llaveIdentificacion, request1);break;
                case 4:
                    byte[] encritpado2 = CTripleDes.encrypt("pv_orderId="+orderId, llaveEncriptacion);
                    String request2 = new String(CBase64.encode(encritpado2));
                    response = revertirPago(llaveIdentificacion, request2);break;
            }
            if (response != null && response.length() > 0) {
                        decode = CBase64.decode(response.toCharArray());
                        resultado = CTripleDes.decrypt(decode, llaveEncriptacion);
                        System.out.println("Respuesta Pasarela :" + resultado);
            };
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static String solicitarPago(java.lang.String key, java.lang.String parametros) {
        try {
            URL url = new URL("https://190.104.0.116/PasarelaServices_V2/CustomerServices?wsdl");
            ExampleIntegrationJavaTigoMoney.CustomerServices_Service service = new ExampleIntegrationJavaTigoMoney.CustomerServices_Service(url);
            ExampleIntegrationJavaTigoMoney.CustomerServices port = service.getCustomerServicesPort();
            return port.solicitarPago(key, parametros);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    private static String solicitarpagoAsincrono(java.lang.String key, java.lang.String parametros){
     try {
            URL url = new URL("https://190.104.0.116/PasarelaServices_V2/CustomerServices?wsdl");
            ExampleIntegrationJavaTigoMoney.CustomerServices_Service service = new ExampleIntegrationJavaTigoMoney.CustomerServices_Service(url);
            ExampleIntegrationJavaTigoMoney.CustomerServices port = service.getCustomerServicesPort();
            return port.solicitarPagoAsincrono(key, parametros);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    private static String consultarEstado(java.lang.String key, java.lang.String parametros){
     try {
            URL url = new URL("https://190.104.0.116/PasarelaServices_V2/CustomerServices?wsdl");
            ExampleIntegrationJavaTigoMoney.CustomerServices_Service service = new ExampleIntegrationJavaTigoMoney.CustomerServices_Service(url);
            ExampleIntegrationJavaTigoMoney.CustomerServices port = service.getCustomerServicesPort();
            return port.consultarEstado(key, parametros);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    private static String revertirPago(java.lang.String key, java.lang.String parametros){
     try {
            URL url = new URL("https://190.104.0.116/PasarelaServices_V2/CustomerServices?wsdl");
            ExampleIntegrationJavaTigoMoney.CustomerServices_Service service = new ExampleIntegrationJavaTigoMoney.CustomerServices_Service(url);
            ExampleIntegrationJavaTigoMoney.CustomerServices port = service.getCustomerServicesPort();
            return port.revertirPago(key, parametros);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
