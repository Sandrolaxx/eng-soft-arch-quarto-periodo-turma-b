package br.fag.calculator;

public class Dividir implements Operacoes{
    @Override
    public void executar(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("Não podemos dividir por zero.");
        } else {
            float resultado = num1 / num2;
            System.out.println("Divisão = " + resultado);
        }
    }
}
