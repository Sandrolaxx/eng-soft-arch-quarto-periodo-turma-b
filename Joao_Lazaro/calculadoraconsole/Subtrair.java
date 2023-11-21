package calc;

public class Subtrair implements OperacaoMatematica {
    public static void calcular(){
        Numeros.setResult(Numeros.getNum1() - Numeros.getNum2());
        System.out.println("O resultado da subtração é: " + Numeros.getResult());
    }
}