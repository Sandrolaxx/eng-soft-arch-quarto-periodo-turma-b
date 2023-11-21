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

import org.jboss.resteasy.annotations.Form;

@Path("/calculadora")
public class SomePage {

    private final Template page;

    public SomePage(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    public TemplateInstance get() {
        return page.data(null);
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance post(@FormParam("n1") float n1,@FormParam("n2") float n2,@FormParam("tipo") String tipo) {
        float resultado = 0;

        if (tipo.equals("a")) {
            resultado = n1 + n2;
        }
        if (tipo.equals("b")) {
            resultado = n1 - n2;
        }
        if (tipo.equals("c")) {

            resultado = n1 / n2;
        }
        if (tipo.equals("d")) {

            resultado = n1 * n2;
        }
        return page.data("resultado", resultado);
    }

}
