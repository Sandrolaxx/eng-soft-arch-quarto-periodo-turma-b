package org.acme;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

@Path("/calculadora")
public class CalculadoraController {

    private final Template page;

    public CalculadoraController(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    public TemplateInstance get() {
        return page.data(null);
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance post(@FormParam("num1") float num1, @FormParam("num2") float num2,
            @FormParam("operacao") String operacao) {

                System.out.println(operacao);

        float result = 0;
        if (operacao.equals("soma")) {
            result = num1 + num2;
        }
        if (operacao.equals("sub")) {
            result = num1 - num2;
        }
        if (operacao.equals("div")) {

            result = num1 / num2;
        }
        if (operacao.equals("mult")) {

            result = num1 * num2;
        }

        return page.data("result", result);
    }

}
