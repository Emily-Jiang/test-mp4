package com.example.liberty.client;

import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.eclipse.microprofile.rest.client.RestClientDefinitionException;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/client")
@ApplicationScoped
public class ClientController {

    // @Inject @RestClient private PropertiesClient propertiesClient;
    @GET
    @Path("/props")
    @Produces(MediaType.APPLICATION_JSON)
    public Properties displayProps()
            throws IllegalStateException, RestClientDefinitionException, URISyntaxException, MalformedURLException {
        PropertiesClient propertiesClient =  RestClientBuilder.newBuilder().baseUrl(new URL("http://localhost:9081/system/properties")).build(PropertiesClient.class); // (1)
        return propertiesClient.getProperities(); // (2)
    }
}
