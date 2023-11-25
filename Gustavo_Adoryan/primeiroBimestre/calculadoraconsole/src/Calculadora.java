import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Calculadora Simples");
		System.out.print("Digite o primeiro número: ");
		double num1 = scanner.nextDouble();

		System.out.print("Digite o segundo número: ");
		double num2 = scanner.nextDouble();

		System.out.println("Escolha a operação:");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("5 - Sair");
		int escolha = scanner.nextInt();

		double resultado = 0;

		switch (escolha) {
		case 1:
			resultado = num1 + num2;
			break;
		case 2:
			resultado = num1 - num2;
			break;
		case 3:
			resultado = num1 * num2;
			break;
		case 4:
			if (num2 != 0) {
				resultado = num1 / num2;
			} else {
				System.out.println("Não é possível dividir por zero.");
				return;
			}
			break;
		case 5:
			System.out.println("Saindo.");
			break;
		default:
			System.out.println("Escolha inválida.");
			return;
		}

		System.out.println("Resultado: " + resultado);
	}

}
