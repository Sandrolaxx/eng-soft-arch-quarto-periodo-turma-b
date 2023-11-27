import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();

		System.out.println("Calculadora Simples");
		System.out.print("Digite o primeiro número: ");
		double num1 = scanner.nextDouble();

		System.out.print("Digite o operador (+, -, *, /): ");
		char operador = scanner.next().charAt(0);

		System.out.print("Digite o segundo número: ");
		double num2 = scanner.nextDouble();

		double resultado = 0.0;

		switch (operador) {
		case '+':
			resultado = calculadora.somar(num1, num2);
			break;
		case '-':
			resultado = calculadora.subtrair(num1, num2);
			break;
		case '*':
			resultado = calculadora.multiplicar(num1, num2);
			break;
		case '/':
			resultado = calculadora.dividir(num1, num2);
			break;
		default:
			System.out.println("Operador inválido.");
			return;
		}

		System.out.println("Resultado: " + resultado);
	}
}
