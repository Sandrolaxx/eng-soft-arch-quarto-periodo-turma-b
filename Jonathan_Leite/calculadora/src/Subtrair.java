import java.util.Scanner;

public class Subtrair implements OperacaoMatematica{

    @Override
    public void calcular() {
        Scanner leitura = new Scanner(System.in);
        Numeros.setPrimeiroValor(Numeros.getResultado());
        System.out.println("informe o valor: \n ");
        Numeros.setSegundoValor( leitura.nextDouble());
        Numeros.setResultado(Numeros.getPrimeiroValor() - Numeros.getSegundoValor());
    }
}
