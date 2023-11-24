package Gustavo_Kraemer;

public class Divisao implements OperacaoMatematica {
    @Override
    public double operacao(double a, double b) {
        if(b == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero.");
        }
        return a / b;
    }
}
