class Subtracao extends OperacaoBasica {
    public Subtracao(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double calcular(double num1, double num2) {
        return num1 - num2;
    }
}