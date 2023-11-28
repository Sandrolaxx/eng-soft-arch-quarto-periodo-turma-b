package com.fag.infra.celcoin.dto;


public class CelcoinPixDTO {
    private String key;
    private Double amount;
    private CelcoinMercanteDTO mercante;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public CelcoinMercanteDTO getMercante() {
        return mercante;
    }

    public void setMercante(CelcoinMercanteDTO mercante) {
        this.mercante = mercante;
    }
}
