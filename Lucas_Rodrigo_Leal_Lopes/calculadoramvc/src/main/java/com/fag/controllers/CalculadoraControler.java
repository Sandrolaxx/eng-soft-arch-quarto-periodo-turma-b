package com.fag;

import static java.util.Objects.requireNonNull;

import java.util.List;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import main.java.com.fag.dto.ResultadoDTO;
import main.java.com.fag.model.CalculadoraService;

@Path("/calculadora")
public class CalculadoraControler {

    private final Template page;
    private final List<String> operations = List.of("+", "-", "*", "/");
    
    public CalculadoraControler(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(){
        return page.data("test", operations);
    }
    
    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculate(@FormParam("num1") Double valor1, @FormParam("num2") Double valor2, @FormParam("operation") String operation) {
        CalculadoraService service = new CalculadoraService();

        ResultadoDTO result = service.realizarCalculo(valor1, valor2, operation);

        return page.data("result", result).data("test", operations);
    }
}