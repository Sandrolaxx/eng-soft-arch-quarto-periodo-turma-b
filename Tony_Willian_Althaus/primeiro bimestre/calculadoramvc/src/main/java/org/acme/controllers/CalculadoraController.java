package org.acme.controllers;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import jakarta.inject.Inject;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

import org.acme.models.CalculadoraModel;

@Path("/calculadora")
public class CalculadoraController {
    CalculadoraModel calculadora = new CalculadoraModel();
    private final Template page;
    private final List<String> operations = List.of("+", "-", "*", "/");

    @Inject
    public CalculadoraController(Template page) {
        this.page = page;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        return page.data("op", operations);
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calcular(@FormParam("valor1") Double valor1, @FormParam("valor2") Double valor2, @FormParam("operacao") String operacao) {
        Double resultado = 0.0;
    
        resultado=calculadora.calcular(operacao, valor1,valor2);
        return page.data("resultado", resultado);
    }
}
