import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        boolean validar = false;
        Scanner leitura = new Scanner(System.in);
        Dividir dividir = new Dividir();
        Multiplicar multiplicar = new Multiplicar();
        Somar somar = new Somar();
        Subtrair subtrair = new Subtrair();

        System.out.println("informe o valor:\n ");
        Numeros.setResultado(leitura.nextDouble());

        while (!validar) {
            System.out.println("Escolha a operação que deseja:\n " +
                    "'=' Para mostrar o resultado e encerrar ");
            String opcao = leitura.next();

            if (opcao.equalsIgnoreCase("/")) {
                dividir.calcular();
                System.out.println(Numeros.getPrimeiroValor() + " " + opcao + " "
                        + Numeros.getSegundoValor() +
                        " = " + Numeros.getResultado());
            } else if (opcao.equalsIgnoreCase("*")) {
                multiplicar.calcular();
                System.out.println(Numeros.getPrimeiroValor() + " " + opcao + " "
                        + Numeros.getSegundoValor() +
                        " = " + Numeros.getResultado());

            } else if (opcao.equalsIgnoreCase("-")) {
                subtrair.calcular();
                System.out.println(Numeros.getPrimeiroValor() + " " + opcao + " "
                        + Numeros.getSegundoValor() +
                        " = " + Numeros.getResultado());

            } else if (opcao.equalsIgnoreCase("+")) {
                somar.calcular();
                System.out.println(Numeros.getPrimeiroValor() + " " + opcao + " "
                        + Numeros.getSegundoValor() +
                        " = " + Numeros.getResultado());

            } else if (opcao.equalsIgnoreCase("=")) {
                System.out.println(Numeros.getPrimeiroValor() + " " + opcao + " "
                        + Numeros.getSegundoValor() + " = " + Numeros.getResultado());
                validar = true;

            } else {
                System.out.println("Operação invalida");
            }
        }
    }
}
