package com.fag.controllers;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

import com.fag.services.CalculadoraService;

@Path("/resultado")
public class ResultadoController {

    private final Template resultado;

    public ResultadoController(Template resultado) {
        this.resultado = requireNonNull(resultado, "page is required");

    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculate(@FormParam("valor1") double valor1, @FormParam("valor2") double valor2,
            @FormParam("operador") String operador) {

        CalculadoraService service = new CalculadoraService();
        Double result = service.calcular(valor1, valor2, operador);

        System.out.println(result);
        
        return resultado.data("result", result);

    }
}
