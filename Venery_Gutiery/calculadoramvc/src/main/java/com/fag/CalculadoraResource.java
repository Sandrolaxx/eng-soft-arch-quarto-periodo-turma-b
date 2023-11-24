package com.fag;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculadora")
public class CalculadoraResource {

    @Inject
    Template calculadora;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculadora() {
        return calculadora.data("resultado", "");
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public TemplateInstance calcular(
            @FormParam("valor1") double valor1,
            @FormParam("valor2") double valor2,
            @FormParam("operacao") String operacao) {
        double resultado = 0;

        switch (operacao) {
            case "soma":
                resultado = valor1 + valor2;
                break;
            case "subtracao":
                resultado = valor1 - valor2;
                break;
            case "multiplicacao":
                resultado = valor1 * valor2;
                break;
            case "divisao":
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                } else {
                    return calculadora.data("resultado", "Divisão por zero não é permitida.");
                }
                break;
            default:
                return calculadora.data("resultado", "Operação inválida.");
        }

        return calculadora.data("resultado", "Resultado: " + resultado);
    }
}
