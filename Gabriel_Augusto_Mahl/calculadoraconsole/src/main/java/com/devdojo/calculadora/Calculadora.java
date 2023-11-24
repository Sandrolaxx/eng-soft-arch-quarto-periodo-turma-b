package com.devdojo.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        String dnv = "s";
        while (dnv.equalsIgnoreCase("s")) {
            System.out.println("Digite o primeiro número: ");

            try (Scanner scanner = new Scanner(System.in)) {
                double pnum = scanner.nextDouble();

                System.out.println("Digite o segundo número: ");
                double snum = scanner.nextDouble();

                System.out.println("Escolha a operação matemática (+,-,*,/): ");
                String operador = scanner.next();

                Calculo operacao;

                switch (operador) {
                    case "+":
                        operacao = new Soma();
                        break;
                        
                    case "-":
                        operacao = new Sub();
                        break;
                        
                    case "*":
                        operacao = new Mult();
                        break;
                        
                    case "/":
                        operacao = new Div();
                        break;
                        
                    default:
                        System.out.println("Operador inválido");
                        return;
                }
                
                double resultado = operacao.calcular(pnum, snum);
                System.out.println("Resultado: " + resultado);
                scanner = new Scanner(System.in);
                System.out.println("Deseja realizar outra operação? (S/N)");
                dnv = scanner.nextLine();
            }
            
        }
    }
}

