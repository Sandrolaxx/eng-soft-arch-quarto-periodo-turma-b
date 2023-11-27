package com.fag.domain.entities; //mercado pago

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
// colocar os costruteres e gets (no final do construtor colocar validate())
public class PixBO {
    
    private UUID id;
    private String email;
    private String description;
    private BigDecimal amount;
    private String emv;
    private String base64;
    private LocalDateTime expiration;

    public PixBO(String id, String email, String description, BigDecimal amount, String emv, String base64, LocalDateTime expiration) {
        
        this.id = id != null ? UUID.fromString(id) : UUID.randomUUID();
        this.email = email;
        this.description = description;
        this.amount = amount;
        this.emv = emv;
        this.base64 = base64;
        this.expiration = expiration;
        validate();
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

    private void validate(){
        //validaçoes dos danos do nosso BO
    }

    public void updateQRcode(String emv, String base64, LocalDateTime expiration){
        this.emv = emv;
        this.base64 = base64;
        this.expiration = expiration;
    }

    
}