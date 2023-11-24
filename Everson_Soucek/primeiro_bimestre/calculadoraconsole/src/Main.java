import Operadores.Divisao;
import Operadores.Multiplicacao;
import Operadores.Soma;
import Operadores.Subtracao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha qual operador deseja usar");
        String operador = scanner.nextLine();
            while (true) {
                if (operador.equals("+")) {
                    Soma soma = new Soma();
                    System.out.println(soma.calculo());
                    break;
                } else if (operador.equals("-")) {
                    Subtracao subtracao = new Subtracao();
                    System.out.println(subtracao.calculo());
                    break;
                } else if (operador.equals("*")) {
                    Multiplicacao multiplicacao = new Multiplicacao();
                    System.out.println(multiplicacao.calculo());
                    break;
                } else if (operador.equals("/")) {
                    Divisao divisao = new Divisao();
                    System.out.println(divisao.calculo());
                    break;
                } else {
                    System.out.println("Operador não aceito digite novamente");
                }
            }
        }
}