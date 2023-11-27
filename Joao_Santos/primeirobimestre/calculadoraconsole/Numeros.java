package calculadora;

import java.util.Scanner;

public class Numeros implements OperacaoMatematica {
	
	private static float valor1;
	private static float valor2;
	private static float resultado;
	
	public static float getValor1() {
		return valor1;
	}

	public static void setValor1(float valor1) {
		Numeros.valor1 = valor1;
	}

	public static float getValor2() {
		return valor2;
	}
	
	public static void setValor2(float valor2) {
		Numeros.valor2 = valor2;
	}

	public static float getResultado() {
		return resultado;
	}

	public static void setResultado(float resultado) {
		Numeros.resultado = resultado;
	}

	public void calculo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor:\n");
		Numeros.setValor1(scanner.nextFloat());
		
		System.out.println("Insira o segundo valor:\n");
		Numeros.setValor2(scanner.nextFloat());
	}
}
