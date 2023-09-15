package main.java.com.fag.model;

import main.java.com.fag.dto.ResultadoDTO;

public class CalculadoraService {
    public ResultadoDTO realizarCalculo(Double valor1, Double valor2, String operation) {
        ResultadoDTO resultadoDTO = new ResultadoDTO();
        if (operation != null) {
            switch (operation) {
                case "+":
                    resultadoDTO.setResultado(valor1 + valor2);
                    break;
                case "-":
                    resultadoDTO.setResultado(valor1 - valor2);
                    break;
                case "*":
                    resultadoDTO.setResultado(valor1 * valor2);
                    break;
                case "/":
                    if (valor2 != 0) {
                        resultadoDTO.setResultado(valor1 / valor2);
                    } else {
                        resultadoDTO.setError("Não é possível dividir por 0");
                    }
                    break;
                default:
                    break;
            }
        }
        return resultadoDTO;
    }
}
