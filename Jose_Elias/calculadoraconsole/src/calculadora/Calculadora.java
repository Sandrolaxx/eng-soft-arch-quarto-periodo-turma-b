package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int loop = 1;

        while (loop == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n---- CALCULADORA BASICA ----");

            try {
                System.out.println("Digite o primeiro valor: ");
                float valor1 = scanner.nextFloat();

                System.out.println("\nSelecione um operador, sendo:\n[+] Soma\n[-] Subtracao[X] Multiplicacao\n[/] Divisao\n");
                String operador = scanner.next();
                if (!operador.equals("+") && !operador.equals("-") && !operador.equals("X") && !operador.equals("x") && !operador.equals("*") && !operador.equals("/")) {
                    throw new IllegalArgumentException("Operador invalido! Digite novamente.");
                }

                System.out.println("Digite o segundo valor: ");
                float valor2 = scanner.nextFloat();

                if (operador.equals("+")) {
                    soma(valor1, valor2);
                } else if (operador.equals("-")) {
                    subtracao(valor1, valor2);
                } else if (operador.equals("X") || operador.equals("x") || operador.equals("*")) {
                    mult(valor1, valor2);
                } else if (operador.equals("/")) {
                    div(valor1, valor2);
                }
            } catch (InputMismatchException e) {
                limpaTela();
                System.out.println("Valor invalido! Digite novamente");
                scanner.nextLine();

            } catch (IllegalArgumentException e) {
                limpaTela();
                System.out.println(e.getMessage()); 
            }

        }

    }

    public static void soma(float valor1, float valor2) {
        float result = valor1 + valor2;
        limpaTela();
        System.out.println("O resultado da soma e: " + result);
    }

    public static void subtracao(float valor1, float valor2) {
        float result = valor1 - valor2;
        limpaTela();
        System.out.println("O resultado da subtracao e: " + result);
    }

    public static void mult(float valor1, float valor2) {
        float result = valor1 * valor2;
        limpaTela();
        System.out.println("O resultado da multiplicacao e: " + result);
    }

    public static void div(float valor1, float valor2) {
        if (valor2 == 0) {
            throw new IllegalArgumentException("O divisor nao pode ser 0.");
        } else {
            float result = valor1 / valor2;
            limpaTela();
            System.out.println("O resultado da divisao e: " + result);
        }

    }

    public static void limpaTela() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }

    }

}
