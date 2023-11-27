package org.acme.domain.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenPixDTO {
    
    @JsonProperty("key")
    private String key;
    
    @JsonProperty("amount")
    private BigDecimal amount;

    @JsonProperty("merchant")
    private MerchantDTO merchant;

    public GenPixDTO(String key, BigDecimal amount, MerchantDTO merchant) {
        this.key = key;
        this.amount = amount;
        this.merchant = merchant;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public MerchantDTO getMerchant() {
        return merchant;
    }

    public void setMerchant(MerchantDTO merchant) {
        this.merchant = merchant;
    }
}