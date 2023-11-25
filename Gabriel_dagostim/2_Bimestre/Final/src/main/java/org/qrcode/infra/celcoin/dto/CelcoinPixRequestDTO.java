package org.qrcode.infra.celcoin.dto;

import java.math.BigDecimal;

public class CelcoinPixRequestDTO {
    private String key;
    private String transactionIdentification;
    private String additionalInformation;
    private CelcoinMerchantDTO merchant;
    private BigDecimal amount;

    public String getKey() {
        return this.key;
    }

    public String getTransactionIdentification() {
        return this.transactionIdentification;
    }

    public String getAdditionalInformation() {
        return this.additionalInformation;
    }

    public CelcoinMerchantDTO getMerchant() {
        return this.merchant;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setTransactionIdentification(final String transactionIdentification) {
        this.transactionIdentification = transactionIdentification;
    }

    public void setAdditionalInformation(final String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public void setMerchant(final CelcoinMerchantDTO merchant) {
        this.merchant = merchant;
    }

    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
    }
}