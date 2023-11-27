package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Olá senhor, curta sua nova calculadora \uD83D\uDDFF\uD83C\uDF77");


        
        System.out.println("Digite o primeiro número:");
        double a = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double b = scanner.nextDouble();
        
        System.out.println("Escolha a operação: (soma, subtracao, multiplicacao, divisao)");
        String opcao = scanner.next();

        switch (opcao) {
            case "soma":
                calculadora.executarOperacao(a, b, new Soma());
                break;
            case "subtracao":
                calculadora.executarOperacao(a, b, new Subtracao());
                break;
            case "multiplicacao":
                calculadora.executarOperacao(a, b, new Multiplicacao());
                break;
            case "divisao":
                try {
                    calculadora.executarOperacao(a, b, new Divisao());
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Operação não reconhecida.");
                break;
        }

        scanner.close();
    }
}
