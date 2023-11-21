package com.fag;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.List;
import com.services.Calculadora;
import static java.util.Objects.requireNonNull;

@Path("/some-page")
public class SomePage {
    @Inject
    Calculadora service;

    private final Template page;
    private final Template resultado;
    private final Template erroPag;

    public SomePage(Template page,Template resultado,Template erroPag) {
        this.page = requireNonNull(page, "page is required");
        this.resultado = requireNonNull(resultado, "page is required");
        this.erroPag = requireNonNull(erroPag, "page is required");
    }

    List<String> operacoes = Arrays.asList("Soma", "Subtracao", "Multiplicacao", "Divisao");
    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("val1") Double val1, @QueryParam("val2") Double val2) {
        return page.data("operacoes", operacoes);
    }

    @POST
    @Path("/resultado")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculate(@FormParam("valor1") Double valor1,
                                    @FormParam("valor2") Double valor2,
                                    @FormParam("opcao") String opcao) {

        Double result = 0.0;
        String operaSinal  = "";

        switch (opcao) {
            case "Soma":
                result = service.soma(valor1, valor2);
                operaSinal = "+";
                break;
            case "Subtracao":
                result = service.subtracao(valor1, valor2);
                operaSinal = "-";
                break;
            case "Multiplicacao":
                result = service.multiplica(valor1, valor2);
                operaSinal = "*";
                break;
            case "Divisao":
                operaSinal = "/";
                if (valor2 == 0) {
                    return erroPag.data("opcao",opcao).data("valor1",valor1)
                    .data("valor2",valor2).data("operaSinal",operaSinal);
                }
                result = service.divisao(valor1, valor2);
                break;
        }
        return resultado.data("resultado", result).data("opcao",opcao)
        .data("valor1",valor1).data("valor2",valor2).data("operaSinal",operaSinal);
    }
}
