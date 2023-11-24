public class Math {
    private double num1;
    private double num2;



    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void interfaceTexto() {
        System.out.println(
                "============================\nDigite uma das opções abaixo:\n1: Soma\n2: Subtração\n3: Divisão\n4: Multiplicação\n5: Sair");
    }

    public void resultado(double resultado) {
        System.out.printf("\nO resultado da operação é:", +resultado);
    }

}
