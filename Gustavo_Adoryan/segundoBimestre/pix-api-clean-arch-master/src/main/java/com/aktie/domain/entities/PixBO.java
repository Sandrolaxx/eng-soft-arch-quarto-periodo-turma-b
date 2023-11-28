package com.aktie.domain.entities;

import java.util.UUID;

public class PixBO {

    private String key;

    private Double amount;

    private UUID id;

    private Long transactionId;

    public PixBO(String key, Double amount, UUID id, Long transactionId) {
        this.key = key;
        this.amount = amount;
        this.id = id != null ? id : UUID.randomUUID();
        this.transactionId = transactionId;

        validate();
    }

    public PixBO(Object key2, String key3, Double amount2, Long transactionId2) {
    }

    public void validate() {
        if (key == null || key.isEmpty()) {
            throw new IllegalArgumentException("A chave Pix não pode ser nula ou vazia.");
        }

        if (amount == null || amount <= 0) {
            throw new IllegalArgumentException("O valor da transação deve ser maior que zero.");
        }

        if (transactionId == null || transactionId <= 0) {
            throw new IllegalArgumentException("O ID da transação deve ser maior que zero.");
        }
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