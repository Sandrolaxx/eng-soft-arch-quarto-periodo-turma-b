package org.Everson;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

@Path("/some-page")
public class SomePage {

    private final Template page;

    public SomePage(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("num1") float num1,@QueryParam("num2") float num2, @QueryParam("operacao") String operacao ) {
        float resultado = 0;
         if (operacao != null && operacao.equals("+")) {
        resultado = num1 + num2;
        }
        else if(operacao != null && operacao.equals("-")) {
            resultado = num1 - num2;
        }
        else if ( operacao != null && operacao.equals("*")){
            resultado = num1 * num2;
        }
        else if (operacao != null && operacao.equals("/")){
            resultado = num1 / num2;
        }
        return page.data("resultado", resultado);
    }
}
