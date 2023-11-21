package com.calculadora.models;

public class CalculadoraModel {

    private Double resultado;

    public Double calculadora(String operacao, Double valor1, Double valor2) {
        switch (operacao) {
            case "+":
                resultado = valor1 + valor2;
                break;

            case "-":
                resultado = valor1 - valor2;
                break;

            case "*":
                resultado = valor1 * valor2;
                break;

            case "/":
                resultado = (valor2 != 0) ? valor1 / valor2 : 0;
                break;
                
            default:
                return null;
        }

        return resultado;
    }
}