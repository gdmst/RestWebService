/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:Calculate [calculate]<br>
 * USAGE:
 * <pre>
 *        CalculateJerseyClient client = new CalculateJerseyClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author bismuth
 */
public class CalculateJerseyClient {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8080/CalculateRestfulService/webresources";

    public CalculateJerseyClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("calculate");
    }

    public String getAreaXml(String radius) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findArea/{0}", new Object[]{radius}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(String.class);
    }

    public String getPeriXml(String radius) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("findPeri/{0}", new Object[]{radius}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(String.class);
    }

    public void putXml(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_XML).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_XML));
    }

    public void close() {
        client.close();
    }
    
}
