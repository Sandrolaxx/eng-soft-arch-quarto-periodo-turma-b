package RecebeNumero;

import OperacaoMatematica.OperacaoMatematica;

import java.util.Scanner;

public class RecebeNumero{
    Scanner scanner = new Scanner(System.in);
    public double recebePrimeiroNumero() {
        System.out.println("Digite o primeiro número:");
        return scanner.nextDouble();
    }
    public double recebeSegundoNumero() {
        System.out.println("Digite o segundo número");
        return scanner.nextDouble();
    }
}
