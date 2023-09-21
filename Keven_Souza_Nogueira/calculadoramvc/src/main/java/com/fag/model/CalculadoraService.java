package com.fag.model;

import java.util.logging.Logger;

public class CalculadoraService {
    public String calculoComplexo() {
        return "";
    }

    public double calculoBasico(double n1, double n2, String opcao) {
        double resultado = 0.0;
        switch (opcao) {
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                if (n1 == 0.0 || n2 == 0.0) {
                    resultado = 0.0;
                } else {
                    resultado = n1 / n2;
                }
                break;
            default:
                break;
        }
        return resultado;
    }

}
