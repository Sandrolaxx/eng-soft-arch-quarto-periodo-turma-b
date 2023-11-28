package com.rian.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class PixBO {

    private UUID id;
    private String email;
    private String description;
    private BigDecimal amount;
    private String emv;
    private String base64;
    private LocalDateTime expiration;

    public PixBO(String id, String email, String description, BigDecimal amount, String emv, String base64,
            LocalDateTime expiration) {

        this.id = id != null ? UUID.fromString(id) : UUID.randomUUID();
        this.email = email;
        this.description = description;
        this.amount = amount;
        this.emv = emv;
        this.base64 = base64;
        this.expiration = expiration;

        validate(); //Implementação de regra de negócio
    }

    private void validate() {

        if (this.email == null) {
            throw new RuntimeException("Campo obrigatório = email!");
        }
        if (this.description == null) {
            throw new RuntimeException("Campo obrigatório = description!");
        }
        if (this.amount == null) {
            throw new RuntimeException("Campo obrigatório = amount!");
        }
        if (this.emv == null) {
            throw new RuntimeException("Campo obrigatório = emv!");
        }
        if (this.base64 == null) {
            throw new RuntimeException("Campo obrigatório = base64!");
        }
        if (this.expiration == null) {
            throw new RuntimeException("Campo obrigatório = expiration!");
        }
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getEmv() {
        return emv;
    }

    public String getBase64() {
        return base64;
    }

    public LocalDateTime getExpiration() {
        return expiration;
    }

    public void updateQRcode(String emv, String base64, LocalDateTime expiration) {
        this.emv = emv;
        this.base64 = base64;
        this.expiration = expiration;
    }

}