import java.util.Scanner;

public class CalculadoraConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo a CalculadoraConsole!");

        while (true) {
            System.out.print("Digite o primeiro numero: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o operador (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Digite o segundo numero: ");
            double num2 = scanner.nextDouble();

            double resultado;

            switch (operator) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Operador invalido!");
                    continue;
            }

            System.out.println("Resultado: " + resultado);

            System.out.print("Deseja fazer uma nova operacao? (S/N): ");
            char continuar = scanner.next().charAt(0);
            if (continuar != 'S' && continuar != 's') {
                System.out.println("Encerrando a CalculadoraConsole. Até logo!");
                break;
            }
        }

        scanner.close();
    }
}
