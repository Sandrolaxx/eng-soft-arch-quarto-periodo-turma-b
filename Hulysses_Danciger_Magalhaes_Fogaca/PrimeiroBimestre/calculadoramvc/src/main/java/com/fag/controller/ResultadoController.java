package com.fag.controller;

import com.fag.model.CalculadoraService;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

@Path("/resultado")
public class ResultadoController {

    private final Template resultado;

    public ResultadoController(Template resultado) {
        this.resultado = requireNonNull(resultado, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("val1") double val1,
            @QueryParam("val2") double val2,
            @QueryParam("operador") String operador) {

        CalculadoraService service = new CalculadoraService();
        Double resultadoOperacao = service.realizarCalculo(val1, val2, operador);

        return resultado.instance().data("resultadoOperacao", resultadoOperacao);
    }
}
