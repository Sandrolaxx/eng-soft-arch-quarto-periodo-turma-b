package org.acme.controller;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

@Path("/result")
public class ResultadoController {
    private final Template resultado;

    public ResultadoController(Template resultado) {
        this.resultado = requireNonNull(resultado, "resultado is required");
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calcular(@FormParam("valor1") double valor1,
            @FormParam("valor2") double valor2,
            @FormParam("operador") String operador) {
        CalculadoraService service = new CalculadoraService();
        double resultadoOperacao = 0.0;
        resultadoOperacao = service.realizarCalculo(valor1, valor2, operador);

        return resultado.data("result", resultadoOperacao);
    }

}
