package com.fag;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.FormParam;
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
    public TemplateInstance get(@QueryParam("name") String name) {
        //Executar aplicacao ./mvnw quarkus:dev
        
        return page.data("name", name);
    }
@post
@produces(mediatype.text_html)
http://localhost:8080/calculadora
public templateinstance calculate9(@formparam("valor1"
@FormParam("valor2")double valor2){
    double reault=valor1+valor2;
    service.soma(valor1,valor2);
    return page.data(key:"result",result);
})
}
