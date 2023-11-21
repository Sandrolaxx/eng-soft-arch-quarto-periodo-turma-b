package com.mycompany.calculadora;

public class Divisao implements OperacaoMatematica {

    @Override
    public float calcular(float a, float b) {
       
        if (b == 0) {
            
            System.out.println("Digite um valor diferente de 0 no valor 2");
            
            Principal.pedirOperacao();
            
        }
        
            return a / b;

    }
  
}
