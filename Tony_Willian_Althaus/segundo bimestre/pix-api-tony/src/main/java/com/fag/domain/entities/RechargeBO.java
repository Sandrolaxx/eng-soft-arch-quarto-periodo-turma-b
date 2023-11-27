package main.java.com.fag.domain.entities;

import java.util.UUID;

public class RechargeBO {
    private String receipt;
    private Long transactionId;
    private boolean success;
    private UUID id;
    private Double value;
    private String document;
    private Integer providerId;
    private PhoneBO phone;

    public RechargeBO(UUID id, Double value, String document, Integer providerId, PhoneBO phone, String receipt, Long transactionId, boolean success) {
        this.id = id;
        this.value = value;
        this.document = document;
        this.providerId = providerId;
        this.phone = phone;
        this.receipt = receipt;
        this.transactionId = transactionId;
        this.success = success;
    }

    public UUID getId() {
        return id;
    }

    public Double getValue() {
        return value;
    }

    public String getDocument() {
        return document;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public PhoneBO getPhone() {
        return phone;
    }

    public String getReceipt() {
        return receipt;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public void setPhone(PhoneBO phone) {
        this.phone = phone;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void handleSucess(String receipt, Long transactionId) {
        this.receipt = receipt;
        this.transactionId = transactionId;
        this.success = true;
    }

    public void handleError(){
        this.success = false;
    }

}