package com.fag.controllers;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

import java.util.List;

import com.fag.services.CalculadoraService;

@Path("/calculadora")
public class CalculadoraController {

    private final Template page;
    private List<String> opcoes = List.of("Soma", "Subtração", "Multiplicação", "Divisão");

    public CalculadoraController(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        return page.data("op",opcoes);
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculate(
        @FormParam("valor1") double valor1,
        @FormParam("valor2") double valor2,
        @FormParam("opt") String opc) {

            double resultado = 0.0;

            switch(opc) {
                case "Soma":
                    resultado =  valor1 + valor2;
                    break;
                case "Subtração":
                    resultado =  valor1 - valor2;
                    break;
                case "Multiplicação":
                    resultado =  valor1 * valor2;
                    break;
                case "Divisão":
                    if(valor2 == 0){
                        // throw new ArithmeticException("Não é possível dividir por zero");
                    } else {
                        resultado =  valor1 / valor2;
                    }
                    break;
                default:
                    resultado =  0d;
                    break;
            }

        //CalculadoraService calcular = new CalculadoraService();
        //double resultado = calcular.calculo(valor1, valor2, opc);
        
        return page.data("resultado", resultado)
        .data("op", opcoes);
    }
}