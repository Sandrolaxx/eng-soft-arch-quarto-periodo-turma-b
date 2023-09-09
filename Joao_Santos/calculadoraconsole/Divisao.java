package calculadora;

import java.util.Scanner;

public class Divisao implements OperacaoMatematica{
	 
	public void calculo() {
		
		Scanner scanner = new Scanner(System.in);
		
		while(Numeros.getValor2() == 0 ) {
			System.out.println("Caso o segundo valor seja '0', o resultado da conta é infinito, oque não é uma resposta válida, insira outro número:");
			System.out.println("Insira o segundo valor:");
			Numeros.setValor2(scanner.nextFloat());
		}
		
		Numeros.setResultado(Numeros.getValor1() / Numeros.getValor2());
		System.out.println(Numeros.getValor1() + " / " + Numeros.getValor2() + " = " + Numeros.getResultado());
	}
}

