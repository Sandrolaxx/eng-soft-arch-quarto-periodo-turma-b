package com.fag;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import static java.util.Objects.requireNonNull;
import jakarta.ws.rs.BadRequestException;

@Path("/result")
public class ControllerResult {

    private final Template resultado;

    public ControllerResult(Template resultado) {
        this.resultado = requireNonNull(resultado, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("valor1") double valor1,
                                @QueryParam("valor2") double valor2,
                                @QueryParam("operacoes") String operacoes) {

        double resultadoOperacao;

        switch (operacoes) {
            case "Soma":
                resultadoOperacao = valor1 + valor2;
                break;

            case "Subtracao":
                resultadoOperacao = valor1 - valor2;
                break;

            case "Multiplicacao":
                resultadoOperacao = valor1 * valor2;
                break;

            case "Divisao":
                resultadoOperacao = valor2 != 0 ? valor1 / valor2 : 0;
                break;

            default:
                throw new BadRequestException("Operação inválida");
        }
        return resultado.instance().data("resultadoOperacao", resultadoOperacao);
    }
}
