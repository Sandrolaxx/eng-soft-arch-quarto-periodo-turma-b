package calculadoramvc.src.main.java.com.fag.controller;

import static java.util.Objects.requireNonNull;

import calculadoramvc.src.main.java.com.fag.model.Resultado;
import calculadoramvc.src.main.java.com.fag.service.ResultadoService;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.BadRequestException;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/result")
public class ResultController {

    @Inject
    ResultadoService resultadoService;
    private final Template result;

    public ResultController(Template result) {
        this.result = requireNonNull(result, "page is required");
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

        Resultado resultado = new Resultado();
        resultado.setResultado(resultadoOperacao);
        
        resultadoService.salvar(resultado);
        return result.instance().data("resultadoOperacao", resultadoOperacao);
    }
}
