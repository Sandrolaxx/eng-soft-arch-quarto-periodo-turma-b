package br.fag.calculator;

public class Multiplicar implements Operacoes{
    @Override
    public void executar(float num1, float num2) {
        float resultado = num1 * num2;
        System.out.println("Multiplicação é = " + resultado);
    }
}
