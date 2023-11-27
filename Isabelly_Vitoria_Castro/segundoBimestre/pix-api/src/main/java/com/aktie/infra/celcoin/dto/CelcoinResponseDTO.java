package com.aktie.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinResponseDTO {
    private Long transactionId;
    @JsonbProperty(value = "emvqrcps")
    private String qrCode;

    public Long getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getQrCode() {
        return this.qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
}
