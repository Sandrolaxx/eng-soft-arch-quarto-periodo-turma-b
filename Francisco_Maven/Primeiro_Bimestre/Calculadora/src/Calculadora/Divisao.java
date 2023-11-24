package Calculadora;

public class Divisao implements Operacao {
    
    public double executar(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero!");
        }
        return a / b;
    }
}
