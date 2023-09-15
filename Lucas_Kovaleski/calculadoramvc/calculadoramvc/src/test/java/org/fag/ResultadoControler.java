package org.fag;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

@Path("resultado")
public class ResultadoControler {

    private final Template resultado;

    public ResultadoControler(Template resultado) {
        this.resultado = requireNonNull(resultado, "page is required");
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculadora(@QueryParam("num1") double num1,
                                          @QueryParam("num2") double num2,
                                          @QueryParam("operador") String operador) {

        double resultadoOperacao = 0.0;

        switch (operador) {
            case "adicao":
                resultadoOperacao = num1 + num2;
                break;
            case "subtracao":
                resultadoOperacao = num1 - num2;
                break;
            case "multiplicacao":
                resultadoOperacao = num1 * num2;
                break;
            case "divisao":
                resultadoOperacao = num2 != 0 ? num1 / num2 : 0;
                break;
            default:
                throw new BadRequestException("Operação inválida");
        }

        return resultado.instance().data("resultadoOperacao", resultadoOperacao);
    }
}


