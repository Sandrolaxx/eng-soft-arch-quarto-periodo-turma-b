package com.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Calculadora {
    public Double soma(Double valor1, Double valor2) {
        return valor1 + valor2;
    }

    public Double subtracao(Double valor1, Double valor2) {
        return valor1 - valor2;
    }

    public Double multiplica(Double valor1, Double valor2) {
        return valor1 * valor2;
    }

    public Double divisao(Double valor1, Double valor2) {
        return valor1 / valor2;
    }
}