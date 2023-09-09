package Main;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora ===");
        System.out.println("Escolha a operação a ser realizada:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potenciação");
        System.out.println("6 - Raiz");
        System.out.print("Digite o número correspondente à operação: ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        OperacaoMatematica operacaoMatematica;

        switch (operacao) {
            case 1:
                operacaoMatematica = new Adicao();
                break;
            case 2:
                operacaoMatematica = new Subtracao();
                break;
            case 3:
                operacaoMatematica = new Multiplicacao();
                break;
            case 4:
                operacaoMatematica = new Divisao();
                break;
            case 5:
                operacaoMatematica = new Potencia();
                break;
            case 6:
                operacaoMatematica = new Raiz();
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        double resultado = operacaoMatematica.calcular(num1, num2);
        System.out.println("Resultado: " + resultado);
    }
}

interface OperacaoMatematica {
    double calcular(double a, double b);
}

class Adicao implements OperacaoMatematica {
    public double calcular(double a, double b) {
        return a + b;
    }
}

class Subtracao implements OperacaoMatematica {
    public double calcular(double a, double b) {
        return a - b;
    }
}

class Multiplicacao implements OperacaoMatematica {
    public double calcular(double a, double b) {
        return a * b;
    }
}

class Divisao implements OperacaoMatematica {
    public double calcular(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Não é possível dividir por zero!");
        }
    }
}

class Potencia implements OperacaoMatematica {
    public double calcular(double a, double b) {
        return Math.pow(a, b);
    }
}

class Raiz implements OperacaoMatematica {
    public double calcular(double a, double b) {
        if (b != 0) {
            return Math.pow(a, 1.0 / b);
        } else {
            throw new IllegalArgumentException("Não é possível calcular a raiz com expoente zero!");
        }
    }
};