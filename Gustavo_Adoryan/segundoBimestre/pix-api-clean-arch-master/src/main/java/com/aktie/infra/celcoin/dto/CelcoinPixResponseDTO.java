package com.aktie.infra.celcoin.dto;


import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinPixResponseDTO {
    
    private Long transactionId;

    @JsonbProperty(value = "emvqrcps")
    private String emv;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getEmv() {
        return emv;
    }

    public void setEmv(String emv) {
        this.emv = emv;
    }
}
