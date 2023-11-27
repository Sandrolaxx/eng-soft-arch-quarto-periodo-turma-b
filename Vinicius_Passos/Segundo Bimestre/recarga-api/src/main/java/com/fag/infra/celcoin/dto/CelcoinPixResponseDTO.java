package com.fag.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinPixResponseDTO {
    private Long transactionIdentification;
    @JsonbProperty(value = "emvqrcps")
    private String qrCode;
    public Long getTransactionIdentification() {
        return transactionIdentification;
    }
    public void setTransactionIdentification(Long transactionIdentification) {
        this.transactionIdentification = transactionIdentification;
    }
    public String getQrCode() {
        return qrCode;
    }
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
    
}
