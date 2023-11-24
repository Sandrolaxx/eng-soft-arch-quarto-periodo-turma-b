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

import java.util.HashMap;
import java.util.Map;

@Path("/calculadora")
public class Calculadora {

    @Inject
    Template CalculadoraTemplate;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculadora() {
        return CalculadoraTemplate.data("resultado", "");
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public TemplateInstance calcular(@FormParam("numero1") double numero1,
            @FormParam("numero2") double numero2,
            @FormParam("operacao") String operacao) {
        Map<String, Object> data = new HashMap<>();
        double resultado;

        switch (operacao) {
            case "adicao":
                resultado = numero1 + numero2;
                break;
            case "subtracao":
                resultado = numero1 - numero2;
                break;
            case "multiplicacao":
                resultado = numero1 * numero2;
                break;
            case "divisao":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    data.put("resultado", "Erro: Divisão por zero.");
                    return CalculadoraTemplate.data(data);
                }
                break;
            default:
                data.put("resultado", "Operação não suportada.");
                return CalculadoraTemplate.data(data);
        }

        data.put("resultado", "Resultado: " + resultado);
        return CalculadoraTemplate.data("resultado", "Resultado: " + resultado);

    }
}
