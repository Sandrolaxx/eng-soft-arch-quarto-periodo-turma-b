package calculadora_simples;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" ");
        System.out.println("___Calculadora básica___");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o operador (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = 0.0;
        
        switch (operator) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                }
                break;
            default:
                System.out.println("Operador inválido!");
        }
        
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }
}
