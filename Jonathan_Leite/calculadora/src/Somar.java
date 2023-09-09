import java.util.Scanner;

public class Somar implements OperacaoMatematica{
    private static Numeros numero;

    @Override
    public void calcular() {
        Scanner leitura = new Scanner(System.in);
        Numeros.setPrimeiroValor(Numeros.getResultado());
        System.out.println("informe o valor: \n ");
        Numeros.setSegundoValor( leitura.nextDouble());
        Numeros.setResultado(Numeros.getPrimeiroValor() + Numeros.getSegundoValor());
    }
}
