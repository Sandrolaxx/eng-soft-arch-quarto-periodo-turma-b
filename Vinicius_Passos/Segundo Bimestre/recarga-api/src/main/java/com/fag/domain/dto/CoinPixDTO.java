package com.fag.domain.dto;

import java.util.UUID;

public class CoinPixDTO {
    

    private UUID id;
    private String key;
    private Double amount;
    private String qrCode;
    private Long transactionIdentification;

    private MercanteDTO mercante;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
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
    public String getQrCode() {
        return qrCode;
    }
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
    public MercanteDTO getMercante() {
        return mercante;
    }
    public void setMercante(MercanteDTO merchant) {
        this.mercante = merchant;
    }
    public Long getTransactionIdentification() {
        return transactionIdentification;
    }
    public void setTransactionIdentification(Long transactionId) {
        this.transactionIdentification = transactionId;
    }



}
