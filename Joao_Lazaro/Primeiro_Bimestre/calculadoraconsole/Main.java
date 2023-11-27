package calc;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        int operador;
        Scanner scanner = new Scanner(System.in);
            System.out.println("Qual é o operador? \n (1) SOMA \n (2) SUBTRAÇÃO \n (3) DIVISÃO \n (4) MULTIPLICAÇÃO");
                operador = scanner.nextInt();
    
                switch (operador) {
                    case 1:
                        Numeros.setNum1();
                        Numeros.setNum2();
                        Somar.calcular();
                        break;
                    case 2:
                        Numeros.setNum1();
                        Numeros.setNum2();
                        Subtrair.calcular();
                        break;
                    case 3:
                        Numeros.setNum1();
                        Numeros.setNum2();                      
                        Dividir.calcular();
                        break;
                    case 4:
                        Numeros.setNum1();
                        Numeros.setNum2();
                        Multiplicar.calcular();
                        break;
                    default:
                        break;
                }
    }
		
	
}