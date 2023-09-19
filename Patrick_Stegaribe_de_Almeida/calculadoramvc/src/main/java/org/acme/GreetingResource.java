package org.acme;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    private final Template inicio ; // Use o nome correto do template

    public GreetingResource(Template inicio) {
        this.inicio = inicio;
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        // Renderiza o novo template e passa os dados necessários
        return inicio.instance().data("result", "Meu Resultado Personalizado");
    }

}
