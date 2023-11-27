package org.acme.infra.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CCPixDTO {

    private String key;

    private Double amount;

    private CCMerchantDTO merchant;

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

    public CCMerchantDTO getMerchant() {
        return merchant;
    }

    public void setMerchant(CCMerchantDTO ccMerchantDTO) {
        this.merchant = ccMerchantDTO;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long long1) {
        this.transactionId = long1;
    }
}

