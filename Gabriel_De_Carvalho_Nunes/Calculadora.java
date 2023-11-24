import java.util.Scanner;

public class CalculadoraConsole {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operacao;

        while (true) {
            System.out.println("Selecione a operação:");
            System.out.println("1. Adição (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            System.out.println("5. Sair");

            operacao = scanner.next().charAt(0);

            if (operacao == '5') {
                System.out.println("Encerrando a calculadora.");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextDouble();

            switch (operacao) {
                case '1':
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case '2':
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case '3':
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case '4':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

        scanner.close();
    }
}
