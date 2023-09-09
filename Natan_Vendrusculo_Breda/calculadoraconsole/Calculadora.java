import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Double valor1, valor2;

        int resposta;

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Insira:\n1 Para Soma\n2 Para Subtração\n3 Para Multiplicação\n4 Para Divisão");
            resposta = scan.nextInt();

            System.out.println("Insira o primeiro valor.");
            valor1 = scan.nextDouble();
            System.out.println("Insira o segundo valor.");
            valor2 = scan.nextDouble();
            switch (resposta) {

                case 1:
                    System.out.println("A resposta é:" + (valor1 + valor2));
                    break;
                case 2:
                    System.out.println("A resposta é:" + (valor1 - valor2));
                    break;
                case 3:
                    System.out.println("A resposta é:" + (valor1 * valor2));
                    break;
                case 4:
                    if (valor2 == 0) {
                        System.out.println("Não é possivel dividir algo por zero.");
                    } else {
                        System.out.println("A resposta é:" + (valor1 / valor2));
                    }
                    break;
            }
        }
    }

}