package com.devdojo.calculadora;

public class Sub implements Calculo{
    @Override
    public double calcular(double pnum, double snum) {
        return pnum - snum;
    }
}
