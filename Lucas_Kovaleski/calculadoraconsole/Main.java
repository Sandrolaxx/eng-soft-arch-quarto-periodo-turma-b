package br.fag.calculator;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Subtrair subtrair = new Subtrair();
        Somar somar = new Somar();
        Dividir dividir = new Dividir();
        Multiplicar multiplicar = new Multiplicar();
        ChamarCalc chamarCalc = new ChamarCalc();
        Scanner scanner = new Scanner(System.in);
        int valor;
        float num1, num2;
        String opc = "";
        do {
            chamarCalc.chamarCalc();
            valor = scanner.nextInt();

            if (valor == 1) {
                System.out.println("Informe o primeiro valor");
                num1 = scanner.nextFloat();

                System.out.println("Informe o segundo valor.");
                num2 = scanner.nextFloat();
                somar.executar(num1, num2);
                scanner.nextLine();
            } else if (valor == 2) {
                System.out.println("Informe o primeiro valor");
                num1 = scanner.nextFloat();

                System.out.println("digite o segundo valor.");
                num2 = scanner.nextFloat();
                subtrair.executar(num1, num2);
                scanner.nextLine();

            } else if (valor == 3) {
                System.out.println("Informe o primeiro valor");
                num1 = scanner.nextFloat();

                System.out.println("digite o segundo valor.");
                num2 = scanner.nextFloat();
                multiplicar.executar(num1, num2);
                scanner.nextLine();

            } else if (valor == 4) {
                System.out.println("Informe o primeiro valor");
                num1 = scanner.nextFloat();

                System.out.println("Informe o segundo valor.");
                num2 = scanner.nextFloat();
                dividir.executar(num1, num2);
                scanner.nextLine();

            } else {
                System.out.println("Opcao invalida");
            }
            System.out.println("Deseja realizar outro calculo[Sim/Não]");
            opc = scanner.nextLine();
            if (opc.equalsIgnoreCase("sim")) {
                continue;
            } else {
                System.out.println("Fechando calculadora");
                break;
            }

        }while (opc.equalsIgnoreCase("Sim"));
    }
}

