package org.acme.domain.dto;


public class PixDTO {
    private String key;

    private Double amount;

    private String id;

    private MerchantDTO merchant;

    private Long transactionId;

    private String Emv;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MerchantDTO getMerchant() {
        return merchant;
    }

    public void setMerchant(MerchantDTO merchant) {
        this.merchant = merchant;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getEmv() {
        return Emv;
    }

    public void setEmv(String emv) {
        Emv = emv;
    }

}
