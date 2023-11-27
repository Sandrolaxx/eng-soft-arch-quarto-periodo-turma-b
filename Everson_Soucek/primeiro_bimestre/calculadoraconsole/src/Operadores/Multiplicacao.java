package Operadores;

import OperacaoMatematica.OperacaoMatematica;
import RecebeNumero.RecebeNumero;

public class Multiplicacao extends RecebeNumero implements OperacaoMatematica {

    @Override
    public double calculo(){
        double n1 = recebePrimeiroNumero();
        double n2 = recebeSegundoNumero();
        return n1 * n2;
    }

}
