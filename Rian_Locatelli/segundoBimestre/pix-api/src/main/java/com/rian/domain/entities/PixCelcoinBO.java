package com.rian.domain.entities;

import java.util.UUID;

public class PixCelcoinBO {

    private UUID id;

    private String key;

    private Double amount;

    private String qrCode;

    private Long transactionId;

    public PixCelcoinBO(UUID id, String key, Double amount, String qrCode, Long transactionId) {
        this.id = id != null ? id : UUID.randomUUID();
        this.key = key;
        this.amount = amount;
        this.qrCode = qrCode;
        this.transactionId = transactionId;

        validate(); // Implementação de regra de negócio
    }

    private void validate() {

        if (this.key == null) {
            throw new RuntimeException("Campo obrigatório = key!");
        }
        if (this.qrCode == null) {
            throw new RuntimeException("Campo obrigatório = qrCode!");
        }
        if (this.transactionId == null) {
            throw new RuntimeException("Campo obrigatório = transactionId!");
        }
    }

    public UUID getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public Double getAmount() {
        return amount;
    }

    public String getQrCode() {
        return qrCode;
    }

    public Long getTransactionId() {
        return transactionId;
    }

}
