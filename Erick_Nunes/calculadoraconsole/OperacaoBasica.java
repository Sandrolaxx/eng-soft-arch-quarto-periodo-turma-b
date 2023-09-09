// Classe abstrata para representar uma operação básica
abstract class OperacaoBasica implements Operacao {
    protected double num1;
    protected double num2;

    public OperacaoBasica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}