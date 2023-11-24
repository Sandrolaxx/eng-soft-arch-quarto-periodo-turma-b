package org.acme;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

import static java.util.Objects.requireNonNull;

@Path("/some-page")
public class SomePage {

    private final Template calculator;

    public SomePage(Template page) {

        this.calculator = requireNonNull(page, "page is required");

    }


    @GET
    public TemplateInstance get() {

        return calculator.data("result", "");

    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public TemplateInstance calculate(

            @FormParam("number1") double number1,
            @FormParam("number2") double number2,
            @FormParam("operation") String operation) {

            double result = 0.0; // Inicialize com um valor padrão

        switch (operation) {

            case "add":
                result = number1 + number2;

                break;

            case "sub":

                result = number1 - number2;

                break;

            case "multi":

                result = number1 * number2;

                break;

            case "divi":

                if (number2 == 0) {

                    return calculator.data("result", "Não é possível dividir por zero.");

                } else {

                    result = number1 / number2;

                }

                break;

            default:

                return calculator.data("result", "Selecione uma operação válida.");

        }
                

        return calculator.data("result", result);

    }

    
}
