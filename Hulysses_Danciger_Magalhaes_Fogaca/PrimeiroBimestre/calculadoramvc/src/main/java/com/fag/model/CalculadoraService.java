package com.fag.model;

import jakarta.ws.rs.BadRequestException;

/**
 *
 * @author hulys
 */

public class CalculadoraService {

    public Double realizarCalculo(Double val1, Double val2, String operador) {
        
        switch (operador) {
            case "soma":
                return val1 + val2;
            case "subtracao":
                return val1 - val2;
            case "multiplicacao":
                return val1 * val2;
            case "divisao":
                return val2 != 0 ? val1 / val2 : 0;
            default:
                throw new BadRequestException("Operação inválida");
        }
    }
}
