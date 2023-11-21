package com.fag.controllers;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import com.fag.model.CalculadoraService;

import static java.util.Objects.requireNonNull;

@Path("/calcular")
public class CalculadoraController {

    private final Template page;

    public CalculadoraController(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {

        return page.data("resultado", null);
    }
    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance Calculador(
            @FormParam("valor1") Double valor1,
            @FormParam("valor2") Double valor2,
            @FormParam("opcao") String opcao) {
        CalculadoraService servico = new CalculadoraService();
        double resultado = servico.calculoBasico(valor1, valor2, opcao);
        return page.data("resultado", resultado);
    }
}
