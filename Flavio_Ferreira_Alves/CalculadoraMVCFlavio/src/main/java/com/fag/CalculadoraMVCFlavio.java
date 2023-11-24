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

@Path("/CalculadoraMVCFlavio")
public class CalculadoraMVCFlavio {

    private final Template page;
    private final Template page_result;
    private final Template error;

    public CalculadoraMVCFlavio(Template page, Template page_result, Template error) {
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
            @FormParam("numero1") Double numero1,
            @FormParam("numero2") Double numero2,
            @FormParam("operacao") String operacao) {
        Double resultado = 0d;
        Sinal sinal = new Sinal();
        resultado = sinal.calcular(numero1, numero2, operacao);

        if (resultado == null) {
            return error.data("mensagem", "Divisão por 0 é inválido");
        }
        return page_result.data( "mensagem", "Calculado com sucesso","numero1",numero1,"operacao",operacao,"numero2", numero2,"resultado", resultado); 
    }

}
