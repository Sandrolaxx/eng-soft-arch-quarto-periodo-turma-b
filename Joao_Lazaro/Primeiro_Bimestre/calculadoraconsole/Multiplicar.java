package calc;

public class Multiplicar implements OperacaoMatematica {
    public static void calcular(){
        Numeros.setResult(Numeros.getNum1() * Numeros.getNum2());
        System.out.println("O resultado da multiplicação é: " + Numeros.getResult());
    }
}