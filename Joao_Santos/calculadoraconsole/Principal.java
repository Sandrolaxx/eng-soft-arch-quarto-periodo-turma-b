package calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int operador;
		Numeros valores = new Numeros();
		Adicao soma = new Adicao();
		Subtracao subtrair = new Subtracao();
		Multiplicacao multiplicar = new Multiplicacao();
		Divisao dividir = new Divisao();

		System.out.println("Calculadora - Escolha uma operação:");
		System.out.println("1. Adição");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");

		operador = scanner.nextInt();
		
		while(operador != 1 && operador != 2 && operador != 3 && operador != 4) {
			System.out.println("Opção de operador escolhido inválido, favor digitar novamente a operação desejada.\n");
			System.out.println("Calculadora - Escolha uma operação:");
			System.out.println("1. Adição");
			System.out.println("2. Subtração");
			System.out.println("3. Multiplicação");
			System.out.println("4. Divisão");
			
			operador = scanner.nextInt();
		}

		switch (operador) {
			case 1:
				valores.calculo();
				soma.calculo();
				
			break;
			
			case 2:
				valores.calculo();
				subtrair.calculo();
				break;
			
			case 3:
				valores.calculo();
				multiplicar.calculo();
			break;
			
			case 4:
				valores.calculo();
				dividir.calculo();
				break;
				
			default:
                System.out.println("Operação inválida.");
                break;
		}
	}
}
