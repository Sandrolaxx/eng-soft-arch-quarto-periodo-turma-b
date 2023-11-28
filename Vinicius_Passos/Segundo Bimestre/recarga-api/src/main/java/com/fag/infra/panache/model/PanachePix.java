package com.fag.infra.panache.model;

import java.util.UUID;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AKT_PIX_CODE")
public class PanachePix extends PanacheEntityBase {

    @Id
    private UUID id;

    @Column(name = "TRANSACTION_ID")
    private Long transactionIdidentification;

    @Column(name = "EMV")
    private String emvqrcps;

    @Column(name = "KEY")
    private String key;

    @Column(name = "AMOUNT")
    private Double amount;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getTransactionIdentification() {
        return transactionIdidentification;
    }

    public void setTransactionIdentification(Long transactionId) {
        this.transactionIdidentification = transactionId;
    }

    public String getEmvqrcps() {
        return emvqrcps;
    }

    public void setEmvqrcps(String emvqrcps) {
        this.emvqrcps = emvqrcps;
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

}