package org.acme.domain.entities;

import java.util.UUID;

public class PixBO {

    private String key;

    private Double amount;

    private UUID id;

    private Long transactionId;

    public PixBO(String key, Double amount, UUID id, Long transactionId) {
        this.key = key;
        this.amount = amount;
        this.id = id;
        this.transactionId = transactionId;
    }

    public PixBO(Object key2, String key3, Double amount2, Long transactionId2) {
    }

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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
}
