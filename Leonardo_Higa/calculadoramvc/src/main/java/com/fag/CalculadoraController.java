package com.fag;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.POST;

import static java.util.Objects.requireNonNull;

@Path("/calculadora")
public class CalculadoraController {

    private final Template page;

    public CalculadoraController(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        
        return page.data("result", null);
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calcular(
            @FormParam("name") String name,
            @FormParam("valor1") Double valor1,
            @FormParam("valor2") Double valor2) {
        double result = valor1 + valor2;

        return page.data("result", result);
    }
}
