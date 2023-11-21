package com.fag.domain.entities;

import java.math.BigDecimal;
import java.util.UUID;

import com.fag.domain.dto.PixDTO.Merchant;

public class PixBO {

    public UUID id;
    public String key;
    public BigDecimal amount;
    public String transactionIdentification;
    private Merchant merchant;

    private String emv;

    public PixBO(String id, String key, BigDecimal amount, String transactionIdentification, Merchant merchant,
            String emv) {
        this.id = id != null ? UUID.fromString(id) : UUID.randomUUID();
        this.key = key;
        this.amount = amount;
        this.transactionIdentification = transactionIdentification;
        this.merchant = merchant;
        this.emv = emv;

        validate();
    }

    public void validate(){
        //validações erros e execeções
    }

    public void updateEmv(String emv){
        this.emv = emv;
    }

    public UUID getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getTransactionIdentification() {
        return transactionIdentification;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public String getEmv() {
        return emv;
    }

    
    
}
