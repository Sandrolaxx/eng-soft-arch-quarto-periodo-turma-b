package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();
        String opc = "S";

        while (opc.equalsIgnoreCase("s")) {
            System.out.printf("%nDigite o Valor 1: ");
            n1.setValor(scan.nextInt());
            System.out.printf("%nDigite o Valor 2: ");
            n2.setValor(scan.nextInt());
            System.out.printf("%nQual a operacao desejada: ");
            System.out.printf("%n1 - Adicao");
            System.out.printf("%n2 - Subtracao");
            System.out.printf("%n3 - Multiplicacao");
            System.out.printf("%n4 - Divisao%n");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    res.setValor(Soma.somar(n1.getValor(), n2.getValor()));
                    System.out.printf("%nA soma de %d com %d é igual a %d.", n1.getValor(), n2.getValor(), res.getValor());
                    break;
                case 2:
                    res.setValor(Subtracao.subtrair(n1.getValor(), n2.getValor()));
                    System.out.printf("%nA subtracao de %d por %d é igual a %d.", n1.getValor(), n2.getValor(), res.getValor());
                    break;
                case 3:
                    res.setValor(Multiplicacao.multiplicar(n1.getValor(), n2.getValor()));
                    System.out.printf("%nA multiplicação de %d por %d é igual a %d.", n1.getValor(), n2.getValor(), res.getValor());
                    break;
                case 4:
                    res.setValor(Divisao.dividir(n1.getValor(), n2.getValor()));
                    System.out.printf("%nA divisão de %d por %d é igual a %d.", n1.getValor(), n2.getValor(), res.getValor());
                    break;
                default:
                    System.out.printf("%nOpção inválida.");
                    break;
            }

            System.out.printf("%nDeseja realizar outra operação? (S/N) ");
            opc = scan.next();
            System.out.printf("%n%n%n");
        }
    }
}
