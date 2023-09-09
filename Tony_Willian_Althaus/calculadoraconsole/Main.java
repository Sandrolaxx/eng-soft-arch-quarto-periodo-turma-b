package calculadora;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Multiplicar mult = new Multiplicar();
		Dividir div = new Dividir();
		Subtrair subacu = new Subtrair();
		Somar soma = new Somar();
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual o primeiro numero?");
		double primeiro = scan.nextDouble();
		
		System.out.println("Qual o segundo numero?");
		double segundo = scan.nextDouble();
		
		System.out.println("Qual a operação? \n1 - somar \n2 - subtrair \n3 - dividir \n4-multiplicar");
		int escolha = scan.nextInt();
		
		switch (escolha) {
		case 1: 
			System.out.println(soma.calcular(primeiro, segundo));
			break;
		case 2:
			System.out.println(subacu.calcular(primeiro, segundo));
			break;
		case 4:
			System.out.println(mult.calcular(primeiro, segundo));
			break;
		case 3: 
			System.out.println(div.calcular(primeiro, segundo));
			break;
		default: System.out.println("Valor invalido"); 
		}
		
		
	}
}
