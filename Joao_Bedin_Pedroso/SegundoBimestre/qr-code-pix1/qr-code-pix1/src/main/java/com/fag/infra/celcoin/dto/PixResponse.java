package com.fag.infra.celcoin.dto;

public class PixResponse {

    private MerchantDTO merchant;

    private String emv;

    public MerchantDTO getMerchant() {
        return merchant;
    }

    public void setMerchant(MerchantDTO merchant) {
        this.merchant = merchant;
    }

    public String getEmv() {
        return emv;
    }
}
