package com.devdojo.calculadora;

public class Soma implements Calculo{
    @Override
    public double calcular(double pnum, double snum) {
        return pnum + snum;
    }
}
