package fag.com;

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

@Path("/calculadora")
public class Calculadora {

    private final Template page;
    private final Template calculo;

    public Calculadora(Template page, Template calculo) {
        this.page = requireNonNull(page, "page is required");
        this.calculo = requireNonNull(calculo, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        return page.data("name", null);
    }

    @POST
    @Path("/calcular")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calcular(
            @FormParam("numero1") double num1,
            @FormParam("numero2") double num2,
            @FormParam("opera") String opera) {
        double result = 0.0;

        if ("soma".equals(opera)) {
            result = num1 + num2;
        } else 
        if ("multiplica".equals(opera)) {
                result = num1 * num2;
        } else       
        if ("subtrai".equals(opera)) {
                result = num1 - num2;
        } else 
        if ("divide".equals(opera)) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                Map<String, Object> data = new HashMap<>();
                data.put("resultado", "Erro: Divisão por zero não permitida.");
                return calculo.instance().data(data);
            }
        } else {
            Map<String, Object> data = new HashMap<>();
            data.put("resultado", "Erro: Operador inválido");
            return calculo.instance().data(data);
        }
        Map<String, Object> data = new HashMap<>();
        data.put("resultado", "Resultado: "+result);
        return calculo.instance().data(data);
    }
}