/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 *
 * @author molin
 */
public class CelPixDTO {
    private String key;
    private Double amount;
    private CelMerchantDTO merchant;

    @JsonbProperty(value = "transactionIdentification")
    private String transactionId;

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

    public CelMerchantDTO getMerchant() {
        return merchant;
    }

    public void setMerchant(CelMerchantDTO merchant) {
        this.merchant = merchant;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    
    
}
