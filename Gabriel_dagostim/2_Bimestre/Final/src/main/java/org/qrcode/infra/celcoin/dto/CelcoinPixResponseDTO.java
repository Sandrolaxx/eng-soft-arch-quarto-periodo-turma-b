package org.qrcode.infra.celcoin.dto;

public class CelcoinPixResponseDTO {
    private String transactionId;
    private String emvqrcps;
    private String transactionIdentification;

    public String getTransactionId() {
        return this.transactionId;
    }

    public String getEmvqrcps() {
        return this.emvqrcps;
    }

    public String getTransactionIdentification() {
        return this.transactionIdentification;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public void setEmvqrcps(final String emvqrcps) {
        this.emvqrcps = emvqrcps;
    }

    public void setTransactionIdentification(final String transactionIdentification) {
        this.transactionIdentification = transactionIdentification;
    }
}