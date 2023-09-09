package br.fag.calculator;

public class Somar implements Operacoes{
    @Override
    public void executar(float num1, float num2) {
        float resultado = num1 + num2;
        System.out.println("Soma = " + resultado);
    }

}
