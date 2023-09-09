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
    @Inject
    CalculadoraService service;
    List<String> operacoes = List.of("Soma", "Subtracao", "Multiplicacao", "Divisao");

    private final Template page;

    public SomePage(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("val1") Double val1, @QueryParam("val2") Double val2) {
        return page.data("operacoes",operacoes );
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculate(@FormParam("valor1") Double valor1, @FormParam("valor2") Double valor2, @FormParam("opcao") String opcao) {
        
        return page.data("result", service.soma(valor1, valor2)).data("operacoes", operacoes);
        
        
    }

}
