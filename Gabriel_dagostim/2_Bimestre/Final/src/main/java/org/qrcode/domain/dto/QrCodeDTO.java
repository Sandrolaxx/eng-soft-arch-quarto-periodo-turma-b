package org.qrcode.domain.dto;

import java.math.BigDecimal;

public class QrCodeDTO {
    private String id;
    private String transactionIdentification;
    private String qrCode;
    private String key;
    private String postalCode;
    private String city;
    private String merchantName;
    private String description;
    private BigDecimal amount;

    public String getId() {
        return this.id;
    }

    public String getTransactionIdentification() {
        return this.transactionIdentification;
    }

    public String getQrCode() {
        return this.qrCode;
    }

    public String getKey() {
        return this.key;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getCity() {
        return this.city;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setTransactionIdentification(final String transactionIdentification) {
        this.transactionIdentification = transactionIdentification;
    }

    public void setQrCode(final String qrCode) {
        this.qrCode = qrCode;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public void setMerchantName(final String merchantName) {
        this.merchantName = merchantName;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
    }

    public QrCodeDTO(final String id, final String transactionIdentification, final String qrCode, final String key, final String postalCode, final String city, final String merchantName, final String description, final BigDecimal amount) {
        this.id = id;
        this.transactionIdentification = transactionIdentification;
        this.qrCode = qrCode;
        this.key = key;
        this.postalCode = postalCode;
        this.city = city;
        this.merchantName = merchantName;
        this.description = description;
        this.amount = amount;
    }

    public QrCodeDTO() {
    }

}