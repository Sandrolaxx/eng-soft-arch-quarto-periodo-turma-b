package com.aktie.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelPixDTO {
    private String key;
    private Double amount;
    private CelMerchantDTO merchant;

    @JsonbProperty(value = "transactionIdentification")
    private String transactionId;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public CelMerchantDTO getMerchant() {
        return this.merchant;
    }

    public void setMerchant(CelMerchantDTO merchant) {
        this.merchant = merchant;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}
