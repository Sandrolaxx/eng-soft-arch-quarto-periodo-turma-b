package com.fag.domain.entities;

import java.util.UUID;

public class CCpix {
    
    private UUID id;

    private String key;

    private double amount;

    private String qrCode;

    private String transactionIdentification;

    public CCpix(UUID id, String key, double amount, String qrCode, String transactionIdentification) {
        this.id = id != null ? id : UUID.randomUUID();
        this.key = key;
        this.amount = amount;
        this.qrCode = qrCode;
        this.transactionIdentification = transactionIdentification;
    }

    public UUID getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public double getAmount() {
        return amount;
    }

    public String getQrCode() {
        return qrCode;
    }

    public String getTransactionIdentification() {
        return transactionIdentification;
    }


    



}
