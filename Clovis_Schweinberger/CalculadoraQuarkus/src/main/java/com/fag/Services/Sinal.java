package com.fag.Services;

public class Sinal {

    public Double calcular(Double val1, Double val2, String opcao) {
        switch (opcao) {
            case "Soma":
                return val1 + val2;

            case "Sub":
                return val1 - val2;

            case "Mult":
                return val1 * val2;

            case "Div":
                if (val2 == 0) {
                    return null;
                }
                return val1 / val2;
            default:
                return 0d;
        }
    }
}
