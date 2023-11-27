package org.acme.infra.dto;



import jakarta.json.bind.annotation.JsonbProperty;

public class CCResponseDTO {
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
    }}
