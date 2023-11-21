package Operadores;

import OperacaoMatematica.OperacaoMatematica;
import RecebeNumero.RecebeNumero;

public class Divisao extends RecebeNumero implements OperacaoMatematica {
    @Override
    public double calculo() {
        while (true) {
            double n1 = recebePrimeiroNumero();
            double n2 = recebeSegundoNumero();
            if (n2 == 0){
                System.out.println("Não é possivel dividir por 0 digite novamente");
            }
            else {
                return n1 / n2;
            }
        }
    }
}
