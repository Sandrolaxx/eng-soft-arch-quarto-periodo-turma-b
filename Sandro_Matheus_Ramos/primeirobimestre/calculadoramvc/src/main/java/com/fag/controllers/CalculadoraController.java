package com.fag.controllers;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.core.MediaType;
import com.fag.model.CalculadoraService;

import static java.util.Objects.requireNonNull;

import com.fag.model.CalculadoraService;

@Path("/calculadora")
public class CalculadoraController {
    
    private final Template page;
    
    public CalculadoraController(Template page) {
        this.page = requireNonNull(page, "page is required");
    }
    
    @GET
    @Path("/calculadora")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        return page.data("resultado", null);
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calcular(
            @FormParam("valor1") Double valor1,
            @FormParam("valor2") Double valor2,
            @FormParam("opcao") String opcao) {

        CalculadoraService service = new CalculadoraService();
        Double resultado = service.realizarCalculo(valor1, valor2, opcao);

        return page.data("resultado", resultado);
    }

}
