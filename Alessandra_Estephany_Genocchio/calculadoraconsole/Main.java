import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double numero1, numero2, resultado;
        String operacao;
        OperacaoMatematica operacaoMatematica = null;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o 1° número: ");
        numero1 = input.nextDouble();
        System.out.println("Informe o 2° número: ");
        numero2 = input.nextDouble();

        System.out.println("Informe uma operação matemática +, -, / ou *: ");
        operacao = input.next();


        switch (operacao) {
            case "/":
                operacaoMatematica = new Dividir();
                break;
            case "*":
                operacaoMatematica = new Multiplicar();
                break;
            case "+":
                operacaoMatematica = new Somar();
                break;
            case "-":
                operacaoMatematica = new Subtrair();
                break;
            default:
                System.out.println("Operação Matemática Invalida");
        }
        resultado = operacaoMatematica.calcular(numero1, numero2);
        System.out.println("Resultado: " + resultado);


    }

}