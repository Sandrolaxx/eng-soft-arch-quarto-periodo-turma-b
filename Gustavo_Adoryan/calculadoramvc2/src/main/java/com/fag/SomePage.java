package com.fag;

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
        return page.data("resultado", "").data("mensagemErro", "");
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance post(@FormParam("valor1") double valor1,
            @FormParam("valor2") double valor2,
            @FormParam("tipo") String tipo) {
        double resultado = 0;
        String mensagemErro = null;

        try {
            switch (tipo) {
                case "soma":
                    resultado = valor1 + valor2;
                    break;
                case "subtracao":
                    resultado = valor1 - valor2;
                    break;
                case "multiplicacao":
                    resultado = valor1 * valor2;
                    break;
                case "divisao":
                    if (valor2 != 0) {
                        resultado = valor1 / valor2;
                    } else {
                        mensagemErro = "Divisão por zero não é permitida.";
                    }
                    break;
                default:
                    mensagemErro = "Operação inválida.";
                    break;
            }
        } catch (Exception e) {
            mensagemErro = "Ocorreu um erro durante o cálculo.";
        }
        return page.data("resultado", resultado).data("mensagemErro", mensagemErro);
    }
}
