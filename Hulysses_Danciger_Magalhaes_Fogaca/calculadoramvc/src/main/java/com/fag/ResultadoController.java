package com.fag;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.BadRequestException;

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
        
        double resultadoOperacao = 0.0;

        switch (operador) {
            case "soma":
                resultadoOperacao = val1 + val2;
                break;
            case "subtracao":
                resultadoOperacao = val1 - val2;
                break;
            case "multiplicacao":
                resultadoOperacao = val1 * val2;
                break;
            case "divisao":
                resultadoOperacao = val2 != 0 ? val1 / val2 : 0;
                break;
            default:
                throw new BadRequestException("Operação inválida");
        }

        return resultado.instance().data("resultadoOperacao", resultadoOperacao);
    }
}
