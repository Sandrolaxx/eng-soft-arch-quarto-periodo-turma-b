package calculadoraSimples;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float valor1 = (float)0.0;
		float valor2 = (float)0.0;
		float total = (float)0.0;
		String operador = "";
		
		System.out.println("Qual o primeiro numero da operacao?");
		valor1 = input.nextFloat();
		
		System.out.println("Escolha um operador(+, -, *, /):");
		operador = input.next();
		
		switch(operador) {
		
		case "+":
			
			System.out.println(valor1+" + ");
			System.out.println("Agora digite o segundo numero da operacao");
			valor2 = input.nextFloat();
			
			total = valor1 + valor2;
			System.out.println(valor1+" + "+valor2+" = "+total);
			
			break;
		case "-":
			
			System.out.println(valor1+" - ");
			System.out.println("Agora digite o segundo numero da operacao");
			valor2 = input.nextFloat();
			
			total = valor1 - valor2;
			System.out.println(valor1+" - "+valor2+" = "+total);
			break;
		case "*":
			
			System.out.println(valor1+" * ");
			System.out.println("Agora digite o segundo numero da operacao");
			valor2 = input.nextFloat();
			
			total = valor1 * valor2;
			System.out.println(valor1+" * "+valor2+" = "+total);
			break;
		case "/":
			
			System.out.println(valor1+" / ");
			System.out.println("Agora digite o segundo numero da operacao");
			valor2 = input.nextFloat();
			
			total = valor1 / valor2;
			System.out.println(valor1+" / "+valor2+" = "+total);
			break;
		}
		
	}
}
