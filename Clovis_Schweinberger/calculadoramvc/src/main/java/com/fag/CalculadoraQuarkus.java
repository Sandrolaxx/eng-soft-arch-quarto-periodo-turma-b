package com.fag;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

import java.util.List;

import com.fag.Services.Sinal;

@Path("/CalculadoraQuarkus")
public class CalculadoraQuarkus {

    private final Template page;
    private final Template page_result;
    private final Template error;

    public CalculadoraQuarkus(Template page, Template page_result, Template error) {
        this.page = requireNonNull(page, "page is required");
        this.page_result = requireNonNull(page_result, "page is required");
        this.error = requireNonNull(error, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        return page.data("operacao", List.of("Soma", "Sub", "Mult", "Div"));
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calcular(
            @FormParam("valor1") Double valor1,
            @FormParam("valor2") Double valor2,
            @FormParam("operacao") String operacao) {
        Double resultado = 0d;
        Sinal sinal = new Sinal();
        resultado = sinal.calcular(valor1, valor2, operacao);

        if (resultado == null) {
            return error.data("mensagem", "Divisão por 0 é inválido");
        }
        return page_result.data( "mensagem", "Calculado com sucesso","valor1",valor1,"operacao",operacao,"valor2", valor2,"resultado", resultado); 
    }

}
