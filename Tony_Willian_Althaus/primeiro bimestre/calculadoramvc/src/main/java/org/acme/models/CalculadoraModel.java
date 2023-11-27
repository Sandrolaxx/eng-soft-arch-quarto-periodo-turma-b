package org.acme.models;

public class CalculadoraModel{
    private Double resultado;
    public Double calcular(String op, Double valor1, Double valor2) {
        switch (op) {
            case "+":
                this.resultado = valor1 + valor2;
                return this.resultado;
            case "-":
                this.resultado = valor1 - valor2;
                return this.resultado;
            case "*":
                this.resultado = valor1 * valor2;
                return this.resultado;
            case "/":
                this.resultado = (valor2 != 0.0) ? valor1 / valor2 : 0.0;
                return this.resultado;
            default: return null;
        }
    }
    
        
}