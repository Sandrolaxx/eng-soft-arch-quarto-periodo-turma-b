import Escolha.Divisao;
import Escolha.Multiplicacao;
import Escolha.Soma;
import Escolha.Subtracao;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para soma, 2 para subtração, 3 para multiplicação 4 para Divisão");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                Soma soma = new Soma();
                System.out.println(soma.calculo());
                break;

            case 2:
                Subtracao subtracao = new Subtracao();
                System.out.println(subtracao.calculo());
                break;

            case 3:
                Multiplicacao multiplicacao = new Multiplicacao();
                System.out.println(multiplicacao.calculo());
                break;

            case 4:
                Divisao divisao = new Divisao();
                System.out.println(divisao.calculo());
                break;
        }
    }
}