/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package maven.calculadora_simples;

/**
 *
 * @author Marcos
 */
import java.util.Scanner;

public class Calculadora_simples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o valor 2: ");
        double valor2 = scanner.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        
        int operacao = scanner.nextInt();

        double total = 0;

        switch (operacao) {
            case 1:
                total = valor1 + valor2;
                break;
            case 2:
                total = valor1 - valor2;
                break;
            case 3:
                total = valor1 * valor2;
                break;
            case 4:
                if (valor2 != 0) {
                    total = valor1 / valor2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
        System.out.println("Total: " + total);

        scanner.close();
    }
}

