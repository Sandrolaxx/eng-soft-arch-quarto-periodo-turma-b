package com.aktie.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinPixDTO {

    private String key;

    private Double amount;

    private CelcoinMerchantDTO merchant;

    @JsonbProperty(value = "transactionIdentification")
    private Long transactionId;

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

    public CelcoinMerchantDTO getMerchant() {
        return merchant;
    }

    public void setMerchant(CelcoinMerchantDTO celcoinMerchantDTO) {
        this.merchant = celcoinMerchantDTO;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long long1) {
        this.transactionId = long1;
    }
}
