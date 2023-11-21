package Gustavo_Kraemer;

import java.util.Scanner;

public class Caculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a operação: (soma, subtracao, multiplicacao, divisao)");
        String escolha = sc.nextLine();

        OperacaoMatematica operacao;

        switch (escolha) {
            case "soma":
                operacao = new Soma();
                break;
            case "subtracao":
                operacao = new Subtracao();
                break;
            case "multiplicacao":
                operacao = new Multiplicacao();
                break;
            case "divisao":
                operacao = new Divisao();
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println("Informe o primeiro valor:");
        double a = sc.nextDouble();

        System.out.println("Informe o segundo valor:");
        double b = sc.nextDouble();

        try {
            double resultado = operacao.operacao(a, b);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
