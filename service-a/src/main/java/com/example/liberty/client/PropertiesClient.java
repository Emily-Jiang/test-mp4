package com.example.liberty.client;

import java.util.Properties;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
@RegisterRestClient(baseUri="http://localhost:9081/system") // (1)
public interface PropertiesClient {
    
    @GET // (2)
    @Produces(MediaType.APPLICATION_JSON) // (3)
    @Path("/properties") // (4)
    public Properties getProperities();
}
