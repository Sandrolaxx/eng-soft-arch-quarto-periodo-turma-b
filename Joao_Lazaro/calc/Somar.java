package calc;

public class Somar implements OperacaoMatematica {
    public static void calcular(){
        Numeros.setResult(Numeros.getNum1() + Numeros.getNum2());
        System.out.println("O resultado da soma é: " + Numeros.getResult());
    }
}