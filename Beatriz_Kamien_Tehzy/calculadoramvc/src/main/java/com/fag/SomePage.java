package com.fag;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.FormParam;

import static java.util.Objects.requireNonNull;

import java.util.HashMap;
import java.util.Map;

@Path("/some-page")
public class SomePage {

    private final Template page;
    private final Template telaresultado;

    public SomePage(Template page, Template telaresultado) {
        this.page = requireNonNull(page, "page is required");
        this.telaresultado = requireNonNull(telaresultado, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        return page.data("name", null);
    }

    @POST
    @Path("/calculate")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calcular(
            @FormParam("numero1") double num1,
            @FormParam("numero2") double num2,
            @FormParam("operation") String operation) {
        double result = 0.0;

        if ("add".equals(operation)) {
            result = num1 + num2;
        } else 
        if ("subtract".equals(operation)) {
                result = num1 - num2;
        } else 
        if ("multiply".equals(operation)) {
                result = num1 * num2;
        } else 
        if ("divide".equals(operation)) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                Map<String, Object> data = new HashMap<>();
                data.put("resultado", "Erro: Divisão por zero não permitida.");
                return telaresultado.instance().data(data);
            }
        } else {
            Map<String, Object> data = new HashMap<>();
            data.put("resultado", "Erro: Operador inválido");
            return telaresultado.instance().data(data);
        }
        Map<String, Object> data = new HashMap<>();
        data.put("resultado", "Resultado: "+result);
        return telaresultado.instance().data(data);
    }
}