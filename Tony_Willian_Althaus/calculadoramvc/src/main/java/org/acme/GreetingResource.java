package org.acme;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.QueryParam;
import static java.util.Objects.requireNonNull;

@Path("/")
public class GreetingResource {
    
    private final Template page;

    public GreetingResource (Template page) {
        this.page = requireNonNull(page, "page ir required");
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public TemplateInstance get(@QueryParam("resultado") String resultado) {
        return page.data("resultado",resultado);
    }
}
