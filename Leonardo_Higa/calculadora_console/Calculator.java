import java.util.Scanner;
public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples em Java");

        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Adição (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            System.out.println("5. Sair");

            System.out.print("Opção: ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double result = 0.0;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            System.out.println("Resultado: " + result);
        }

        System.out.println("Obrigado por usar a Calculadora!");
        scanner.close();
    }
}

