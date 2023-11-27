package Calculadora;

public class Calculadora {

    public void executarOperacao(double a, double b, Operacao operacao) {
        double resultado = operacao.executar(a, b);
        System.out.println("Resultado: " + resultado);
    }
}
