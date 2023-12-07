package org.fag;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

@Path("calculadora")
public class CalculadoraControler {

    private final Template calculadora;

    public CalculadoraControler(Template calculadora) {
        this.calculadora = requireNonNull(calculadora, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("name") String name) {
    
        return calculadora.data("name", name);
    }

}
