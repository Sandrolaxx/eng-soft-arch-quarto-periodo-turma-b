package com.calculadoraptor;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import io.quarkus.qute.TemplateInstance;
import io.quarkus.qute.Template;

@Path("/calculadora")
public class CalculatorResource {

    @Inject
    Template calculator;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calcular(
            @QueryParam("num1") int num1,
            @QueryParam("num2") int num2,
            @QueryParam("operacao") String operacao) {

        double resultado = 0.0;

        //Esssa cara poderia ser um switch case
        if (operacao != null) {
            if (operacao.equals("adicao")) {
                resultado = num1 + num2;
            } else if (operacao.equals("subtracao")) {
                resultado = num1 - num2;
            } else if (operacao.equals("multiplicacao")) {
                resultado = num1 * num2;
            } else if (operacao.equals("divisao")) {
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                } else {
                    return calculator.data("resultado", "Erro: Divisão por zero.");
                }
            }
        }
        return calculator.data("resultado", +resultado);
    }
}