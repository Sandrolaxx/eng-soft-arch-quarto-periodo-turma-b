package com.fag;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

import java.util.Arrays;
import java.util.List;

@Path("/some-page")
public class SomePage {
    @Inject
    Calculadora service;

    private final Template page;

    public SomePage(Template page) {
        this.page = page;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("val1") Double val1, @QueryParam("val2") Double val2) {
        List<String> operacoes = Arrays.asList("Soma", "Subtracao", "Multiplicacao", "Divisao");
        return page.data("operacoes", operacoes);
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculate(@FormParam("valor1") Double valor1, @FormParam("valor2") Double valor2,
                                      @FormParam("opcao") String opcao) {
        if (valor1 == null || valor2 == null) {
        }

        switch (opcao) {
            case "Soma":
                resultado = service.soma(valor1, valor2);
                break;
            case "Subtracao":
                resultado = service.subtracao(valor1, valor2);
                break;
            case "Multiplicacao":
                resultado = service.multiplica(valor1, valor2);
                break;
            case "Divisao":
                resultado = service.divisao(valor1, valor2);
                break;
        }
        return page.data("result", resultado);
    }
}

