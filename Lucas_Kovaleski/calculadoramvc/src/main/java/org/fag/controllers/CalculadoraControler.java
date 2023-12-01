package org.fag.controllers;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

@Path("/calculadora")
@Produces(MediaType.TEXT_HTML)
public class CalculadoraControler {

    private final Template calculadora;

    public CalculadoraControler(Template calculadora) {
        this.calculadora = requireNonNull(calculadora, "page is required");
    }

    @GET
    public TemplateInstance get() {
    
        return calculadora.data("name", null);
    }
}

