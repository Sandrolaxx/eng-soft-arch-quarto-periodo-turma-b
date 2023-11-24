package com.fag;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

import java.util.List;

import com.services.CalculadoraService;

@Path("/some-page")
public class SomePage {
    
    boolean warn = false;

    @Inject
    CalculadoraService service;
    List<String> operacoes = List.of("Soma", "Subtracao", "Multiplicacao", "Divisao");

    private final Template page;
    private final Template result;

    public SomePage(Template page, Template result) {
        this.page = requireNonNull(page, "page is required");
        this.result = requireNonNull(result, "page is required");

    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("val1") Double val1, @QueryParam("val2") Double val2) {
        return page.data("operacoes", operacoes);
    }

    @POST
    @Path("/result")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculate(@FormParam("valor1") Double valor1, @FormParam("valor2") Double valor2,
            @FormParam("opcao") String opcao) {
        Double resultado = 0d;

        warn = false;
        if (opcao.equals("Soma")) {
            warn = false;
            resultado = service.soma(valor1, valor2);
            System.out.println(valor1 + "" + valor2);
        } else if (opcao.equals("Subtracao")) {
            warn = false;
            resultado = service.subtracao(valor1, valor2);
        } else if (opcao.equals("Multiplicacao")) {
            warn = false;
            resultado = service.multiplicacao(valor1, valor2);
        } else if (opcao.equals("Divisao")) {
            if (valor2 == 0) {
                warn = true;
            } else {
                warn = false;
                resultado = service.divisao(valor1, valor2);
            }
        }

        return result.data("result", resultado)
                .data("opcao", opcao)
                .data("warn", warn);
    }

}