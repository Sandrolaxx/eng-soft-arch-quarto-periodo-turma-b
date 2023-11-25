package org.qrcode.domain.entities;

import java.math.BigDecimal;
import java.util.UUID;

public class QrCodeBO {
    private UUID id;
    private String qrcode;
    private String key;
    private String postalCode;
    private String city;
    private String merchantName;
    private String description;
    private BigDecimal amount;

    public QrCodeBO() {
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getQrcode() {
        return this.qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    
    public QrCodeBO(String id, String key, String postalCode, String city, String merchantName, String description, String qrcode, BigDecimal amount) {
        this.id = id != null ? UUID.fromString(id) : UUID.randomUUID();
        this.key = key;
        this.postalCode = postalCode;
        this.city = city;
        this.merchantName = merchantName;
        this.description = description;
        this.qrcode = qrcode;
        this.amount = amount;
    }
}