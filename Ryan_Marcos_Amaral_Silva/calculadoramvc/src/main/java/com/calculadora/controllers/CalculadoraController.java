package com.calculadora.controllers;

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

import com.calculadora.models.CalculadoraModel;

@Path("/calc")
public class CalculadoraController {

    private final Template page;
    private final List<String> operations = List.of("+", "-", "*", "/");
    CalculadoraModel calc = new CalculadoraModel();

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
    public TemplateInstance calcular(@FormParam("operacao") String operacao, @FormParam("valor1") double valor1, @FormParam("valor2") double valor2) {
        double result;

        result = calc.calculadora(operacao, valor1, valor2);

        return page.data("result", result);
    }
}
