package com.fag.infra.celcoin.dto;

public class CelcoinPixDTO {
    
    private String key;

    private double amount;

    private CelcoinMerchantDTO merchant;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public CelcoinMerchantDTO getMerchant() {
        return merchant;
    }

    public void setMerchant(CelcoinMerchantDTO merchant) {
        this.merchant = merchant;
    } 

    

}
