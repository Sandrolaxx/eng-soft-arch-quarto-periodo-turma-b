package com.rian.infra.CC.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class PixCCoinDTO {

    private String key;

    private Double amount;

    private CCoinMerchantDTO merchant;

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

    public CCoinMerchantDTO getMerchant() {
        return this.merchant;
    }

    public void setMerchant(CCoinMerchantDTO merchant) {
        this.merchant = merchant;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}
