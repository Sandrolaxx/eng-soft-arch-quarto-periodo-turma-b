package com.fag.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CalculadoraService {

    public double calcular(double valor1, double valor2, String operador) {
        switch (operador) {
            case "add":
                return valor1 + valor2;

            case "subtract":
                return valor1 - valor2;
            case "divide":
                if (valor2 == 0) {
                    throw new ArithmeticException("Divisão por zero não é permitida.");
                } else {
                    return valor1 / valor2;
                }
            case "multiplication":
                return valor1 * valor2;
            default:
                return 0d;

        }

    }
}