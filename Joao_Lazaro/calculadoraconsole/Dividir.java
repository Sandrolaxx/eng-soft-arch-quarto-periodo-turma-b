package calc;

public class Dividir implements OperacaoMatematica {
    public static void calcular(){

            if(Numeros.getNum2() == 0){
              
                System.out.println("Não é possível dividir por 0!");

            } else {

                Numeros.setResult(Numeros.getNum1() / Numeros.getNum2());
                System.out.println("O resultado da divisão é: " + Numeros.getResult());

            }
    }
}