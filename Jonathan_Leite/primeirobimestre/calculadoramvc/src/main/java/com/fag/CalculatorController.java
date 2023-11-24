import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/calculadora")
public class CalculatorController {

    @Inject
    Template calculatorTemplate; 

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculatorForm() {
        return calculatorTemplate.data("result", "")
                                 .data("errorMessage", "");
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calculate(
        @FormParam("valor01") double valor01,
        @FormParam("operacao") String operacao,
        @FormParam("valor02") double valor02
    ) {
        double result = 0.0;
        String errorMessage = null;


       if (operacao != null) {
        if (operacao.equals("soma")) {
            result = valor01 + valor02;
        } else if (operacao.equals("subtrair")) {
            result = valor01 - valor02;
        } else if (operacao.equals("multiplicar")) {
            result = valor01 * valor02;
        } else if (operacao.equals("divide")) {
            if (valor02 == 0) {
                errorMessage = "Divisão por zero não é permitida.";
               // result = null;
            } else{
                result = valor01 / valor02;
            } 
        }
       }

       if (errorMessage != null) {
            return calculatorTemplate.data("result", "Resultado: ERROR")
                                     .data("errorMessage", errorMessage);
               
        } else{
            return calculatorTemplate.data("result", "Resultado: " + result)
                                     .data("errorMessage", errorMessage);
        }  
    }
}
