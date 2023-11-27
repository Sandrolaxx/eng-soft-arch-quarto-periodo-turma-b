package com.rian.infra.CC.dto;

import jakarta.json.bind.annotation.JsonbProperty;

//DTO para resposta de transação Pix com atributos transactionId e qrCode
public class CCoinPixReponseDTO {

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
