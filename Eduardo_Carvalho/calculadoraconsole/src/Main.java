import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double result = 0.0;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return;
                }
            }
            default -> {
                System.out.println("Operador inválido.");
                return;
            }
        }

        System.out.println("Resultado: " + result);

        scanner.close();
    }
}