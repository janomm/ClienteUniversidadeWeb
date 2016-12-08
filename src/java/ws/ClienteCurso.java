/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import model.Curso;

/**
 * Jersey REST client generated for REST resource:CursoWS [curso]<br>
 * USAGE:
 * <pre>
 *        ClienteCurso client = new ClienteCurso();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author mi
 */
public class ClienteCurso {

    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://localhost:8083/CursoRest/webresources";

    public ClienteCurso() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("curso");
    }

    public String adicionarCurso(Curso c) throws ClientErrorException {
        String retorno = webTarget.request(MediaType.TEXT_PLAIN).post(Entity.entity(c, MediaType.APPLICATION_XML), String.class);
        return retorno;
    }
    
    public <T> T getCursos(GenericType<T> responseType) throws ClientErrorException {
        WebTarget resource = webTarget;
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public void alterarCurso(Object requestEntity, String id) throws ClientErrorException {
        webTarget.path(java.text.MessageFormat.format("{0}", new Object[]{id})).request(javax.ws.rs.core.MediaType.APPLICATION_XML).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_XML));
    }
    
    public <T> T getCurso(GenericType<T> responseType, String id) throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path(java.text.MessageFormat.format("{0}", new Object[]{id}));
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(responseType);
    }

    public <T> T removerCurso(GenericType<T> responseType, String id) throws ClientErrorException {
        return webTarget.path(java.text.MessageFormat.format("{0}", new Object[]{id})).request().delete(responseType);
    }

    public void close() {
        client.close();
    }
    
}
