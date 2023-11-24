package Escolha;

import Operacoes.OperacoesMatematicas;

import java.util.Scanner;

public class Subtracao implements OperacoesMatematicas {
    @Override
    public double calculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro valor");
        double n1 = scanner.nextDouble();
        System.out.println("Digite o valor do segundo valor");
        double n2 = scanner.nextDouble();
        return n1 - n2;
    }
}
