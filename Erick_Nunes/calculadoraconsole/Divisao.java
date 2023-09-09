class Divisao extends OperacaoBasica {
    public Divisao(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double calcular(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Não é possível dividir por zero.");
            return Double.NaN;
        }
    }
}