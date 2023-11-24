import java.util.Scanner;

public class classeUnica {
	static Scanner inserir = new Scanner(System.in);
	public static void main(String[] args) {
		int contador = 0;
		while (contador == 0) {
			while (contador == 0) {
				double valor1, valor2;
				String operador;
				System.out.println("Valor 1");
				valor1 = inserir.nextDouble();
				System.out.println(
						"Insira um operador valido: \n[+] MULTIPLICACAO \n[-] SUBTRACAO \n[/] DIVISAO \n[*] MULTIPLICACAO");
				operador = inserir.next();
				System.out.println("Valor 2");
				valor2 = inserir.nextDouble();
				switch (operador) {
				case "+":
					System.out.println(valor1 + valor2);
					break;
				case "-":
					System.out.println(valor1 - valor2);
					break;
				case "/":
					if (valor2 == 0) {
						System.out.println("Nao ha divisao por zero");
					} else
						System.out.println(valor1 / valor2);
					break;
				case "*":
					System.out.println(valor1 * valor2);
					break;
				default:
					System.out.println("Insira um operador valido");
					break;
				}
			}
		}
	}
}