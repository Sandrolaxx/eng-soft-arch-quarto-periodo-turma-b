import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        int opcao;
        interfaceTexto();
        opcao = userIn.nextInt();
        while (opcao != 5) {
            switch (opcao) {
                case 1:
                    double num1 = userIn.nextDouble();
                    double num2 = userIn.nextDouble();
                    resultado((num1 + num2));
                    break;
                case 2:
                    num1 = userIn.nextDouble();
                    num2 = userIn.nextDouble();
                    resultado((num1 + num2));
                    break;
                case 3:
                    num1 = userIn.nextDouble();
                    num2 = userIn.nextDouble();
                    resultado((num1 + num2));
                    break;
                case 4:
                    num1 = userIn.nextDouble();
                    num2 = userIn.nextDouble();
                    resultado((num1 + num2));
                    break;
                default:
                    break;
            }
            interfaceTexto();
            opcao = userIn.nextInt();
        }
    }

    static double soma() {

        double num1 = userIn.nextDouble();
        double num2 = userIn.nextDouble();
    }

    static void resultado(double resultado) {
        System.out.printf("\nO resultado da operação é:", +resultado);
    }

    static void interfaceTexto() {
        System.out.println(
                "============================\nDigite uma das opções abaixo:\n1: Soma\n2: Subtração\n3: Divisão\n4: Multiplicação\n5: Sair");
    }
}
