package com.fag.dto;

public class ResultadoDTO {
    private Double resultado;
    private String error;
   
    public Double getResultado() {
        return resultado;
    }
    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    public String getError() {
        return error;
    }
    public void setError(String error) {
        this.error = error;
    }
}
