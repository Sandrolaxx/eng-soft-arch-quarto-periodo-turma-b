package org.fag.controllers;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

import org.fag.model.CalculadoraService;

@Path("/resultado")
public class ResultadoController {
    private final Template resultado;

    public ResultadoController(Template resultado) {
        this.resultado = requireNonNull(resultado, "page is required");
    }
    @POST 
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@FormParam("num1") double num1,
                                          @FormParam("num2") double num2,
                                          @FormParam("operador") String operador)
                                           {
                                            
        CalculadoraService service = new CalculadoraService();
        double resultadoOperacao = service.realizarCalculo(num1, num2, operador);


        return resultado.data("resultadoOperacao", resultadoOperacao);
    }
    
}



