package com.fag.application.dtos;

import java.math.BigDecimal;

public class QRCodeRequest {

    private String key;        
    private BigDecimal amount; 
    private String merchant;   

    public QRCodeRequest() {
    }

    public QRCodeRequest(String key, BigDecimal amount, String merchant) {
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

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

}
