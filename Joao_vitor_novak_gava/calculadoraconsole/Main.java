import java.util.Scanner;

import operacoes.Adicao;
import operacoes.Multiplicar;
import operacoes.Subtrair;
import operacoes.Divisao;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num1, num2, num3 = 0;
        int operacao;


        System.out.println("Informe o primero número");
        num1 = getInput(scan);

        System.out.println("Informe o segundo número");
        num2 = getInput(scan);


        System.out.println("Qual operação você gostaria de fazer?\n 1) A + B \t 2) A - B \n 3) A * B \t 4) A / B");
        operacao = (int)getInput(scan);


        scan.close();


        switch (operacao){
            case 1:
               num3 = Adicao.calcular(num1, num2);

                System.out.println("O resultado é " + num3);

                break;

            case 2:
                num3 = Subtrair.calcular(num1, num2);

                System.out.println("O resultado é " + num3);

                break;

            case 3:
                num3 = Multiplicar.calcular(num1, num2);

                System.out.println("O resultado é " + num3);

                break;

            case 4:
                num3 = Divisao.calcular(num1, num2);

                System.out.println("O resultado é " + num3);

                break;
        }
    }

    static double getInput(Scanner scan){
        return scan.nextDouble();
    }

}