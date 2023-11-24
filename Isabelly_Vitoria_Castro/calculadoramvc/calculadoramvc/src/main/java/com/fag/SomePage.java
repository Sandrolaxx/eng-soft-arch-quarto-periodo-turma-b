package com.fag;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;
 
import java.util.HashMap;
import java.util.Map;

@Path("/calculadora")
public class SomePage {

    private final Template page;
    private final Template resultTemplate;

    public SomePage(Template page, Template result) { 
        this.page = requireNonNull(page, "page is required");
        this.resultTemplate = requireNonNull(result, "resultTemplate is required");
        
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        return page.data("dados",  "Isa");
    }

    @POST
    @Path("/calculate")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculate(
            @FormParam("numero1") double num1,
            @FormParam("numero2") double num2,
            @FormParam("operation") String operation) {

        double result = 0.0;

        if ("somar".equals(operation)) {
            result = num1 + num2;
        } else if ("subtrair".equals(operation)) {
            result = num1 - num2;
        } else if ("multiplicar".equals(operation)) {
            result = num1 * num2;
        } else if ("dividir".equals(operation)) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                Map<String, Object> data = new HashMap<>();
                data.put("resultado", "Erro: Divisão por zero não permitida.");
                return resultTemplate.instance().data(data);
            }
        } else {
            Map<String, Object> data = new HashMap<>();
            data.put("resultado", "Erro: Operação inválida.");
            return resultTemplate.instance().data(data);
        }

        Map<String, Object> data = new HashMap<>();
        data.put("resultado", "Resultado: " + result);
        return resultTemplate.instance().data(data);
    }

}