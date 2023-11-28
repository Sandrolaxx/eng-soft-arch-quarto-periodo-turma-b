package com.fag.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class PixBO {

    private UUID id;

    private BigDecimal amount;

    private String email;

    private String description;

    private String emv;

    private String base64;

    private LocalDateTime expiration;

    public PixBO(UUID id, BigDecimal amount, String email,
            String description, String emv, String base64,
            LocalDateTime expiration) {
        this.id = id;
        this.amount = amount;
        this.email = email;
        this.description = description;
        this.emv = emv;
        this.base64 = base64;
        this.expiration = expiration;

        validate();
    }

    private void validate() {
        // validações dos dados do nosso BO - Exception
    }

    public void updateQRCode(String emv, String base64,
            LocalDateTime expiration) {
        this.base64 = base64;
        this.emv = emv;
        this.expiration = expiration;
    }

    public UUID getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
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

}
