package br.fag.calculator;

public class Subtrair implements Operacoes {
    @Override
    public void executar(float num1, float num2) {
        float resultado = num1 - num2;
        System.out.println("Subtração = " + resultado);
    }
}
