package calculadora;

public class Divisao {
    public static int dividir(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Não é possível dividir por zero.");
            return 0;
        } else {
            return num1 / num2;
        }
    }
}
