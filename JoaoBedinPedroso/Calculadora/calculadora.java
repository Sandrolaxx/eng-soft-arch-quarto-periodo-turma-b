import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.println("Operações suportadas: +, -, *, /");
        
        while (true) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o operador (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Digite o segundo número: ");
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
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                        continue;  // Volta ao início do loop para evitar o cálculo com divisão por zero
                    }
                    break;
                default:
                    System.out.println("Operador inválido!");
                    continue;  // Volta ao início do loop para lidar com operador inválido
            }

            System.out.println("Resultado: " + resultado);

            System.out.print("Deseja realizar outra operação? (S/N): ");
            char novamente = scanner.next().charAt(0);
            if (novamente != 'S' && novamente != 's') {
                break;  // Sai do loop se a resposta não for 'S' ou 's'
            }
        }

        System.out.println("Calculadora encerrada.");
    }
}
