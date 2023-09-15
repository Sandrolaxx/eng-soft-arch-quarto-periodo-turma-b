package org.fag.model;

public class CalculadoraService {
    public double realizarCalculo(double num1, double num2, String operador){
        
        switch (operador) {
            case "adicao":
                return num1 + num2;
                
            case "subtracao":
                return num1 - num2;
                
            case "multiplicacao":
                return num1 * num2;
               
            case "divisao":
                return num2 != 0 ? num1 / num2 : 0;
                
            default:
                return 0.0;
        }
    }
}
