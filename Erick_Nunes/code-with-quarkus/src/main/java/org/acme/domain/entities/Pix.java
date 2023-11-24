package org.acme.domain.entities;

import java.math.BigDecimal;

public class Pix {
    
    protected String key;

    protected BigDecimal amount;

    protected String txId;

    public Pix(String key, BigDecimal amount) {
        this.key = key;
        this.amount = amount;
    }

    public Pix(String key, BigDecimal amount, String txId) {
        this.key = key;
        this.amount = amount;
        this.txId = txId;
    }
    
    public String getKey() {
        return key;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getTxId() {
        return txId;
    }

    protected void addKey(String key) {
        this.key = key;
    }

    protected void addAmount(BigDecimal amount) {
        this.amount = amount;
    }

    protected void addTransactionId(String txId) {
        this.txId = txId;
    }
}