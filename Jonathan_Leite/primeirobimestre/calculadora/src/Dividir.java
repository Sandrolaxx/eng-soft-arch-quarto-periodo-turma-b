import java.util.Scanner;

public class Dividir implements OperacaoMatematica{
    @Override
    public void calcular() {
        boolean validar = false;
        Scanner leitura = new Scanner(System.in);
        Numeros.setPrimeiroValor(Numeros.getResultado());
       System.out.println("informe o valor: \n ");
        Numeros.setSegundoValor( leitura.nextDouble());

        while(!validar) {
            if (Numeros.getSegundoValor() == 0) {
                System.out.print("Não é possivel dividir um numero por 0, escolha novamente.");
                System.out.println("informe o valor: \n ");
                Numeros.setSegundoValor(leitura.nextDouble());

            }else {
                validar = true;
            }
        }
        Numeros.setResultado(Numeros.getPrimeiroValor() / Numeros.getSegundoValor());
    }
}
