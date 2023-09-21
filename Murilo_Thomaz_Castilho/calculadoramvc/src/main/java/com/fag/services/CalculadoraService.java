package com.fag.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CalculadoraService {

    public double calculo(double valor1, double valor2, String opcao) {
        
        switch(opcao) {
            case "Soma":
                return valor1 + valor2;
            case "Subtração":
                return valor1 - valor2;
            case "Multiplicação":
                return valor1 * valor2;
            case "Divisão":
                if(valor2 == 0){
                    throw new ArithmeticException("Não é possível dividir por zero");
                } else {
                    return valor1 / valor2;
                }
            default:
                return 0d;

        }  
    } 
}