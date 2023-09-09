import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            Operacao operacao;

            switch (opcao) {
                case 1:
                    operacao = new Soma(num1, num2);
                    break;
                case 2:
                    operacao = new Subtracao(num1, num2);
                    break;
                case 3:
                    operacao = new Multiplicacao(num1, num2);
                    break;
                case 4:
                    operacao = new Divisao(num1, num2);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            double resultado = operacao.calcular(num1, num2);
            System.out.println("Resultado: " + resultado);

            System.out.print("Deseja continuar? (Digite 'S' para sim ou 'N' para não): ");
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("S");
        }

        System.out.println("Encerrando a calculadora. Até mais!");
        scanner.close();
    }
}