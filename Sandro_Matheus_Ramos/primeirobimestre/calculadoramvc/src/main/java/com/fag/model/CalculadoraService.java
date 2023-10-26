package com.fag.model;

public class CalculadoraService {
    
    public Double realizarCalculo(Double valor1, Double valor2, String opcao) {
        switch (opcao) {
            case "Soma":
                return valor1 + valor2;
            case "Sub":
                return valor1 - valor2;
            case "Mult":
                return valor1 * valor2;
            case "Div":
                return valor1 / valor2;
            default:
                return 0d;
        }
    }

}
