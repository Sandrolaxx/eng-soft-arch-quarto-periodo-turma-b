package com.fag.domain.entities;

public class RechargeBO {
    private Double value;
    private String document;
    private Integer providerId;
    private PhoneBO phone;
    
    public RechargeBO(Double value, String document, Integer providerId, PhoneBO phone) {
        this.value = value;
        this.document = document;
        this.providerId = providerId;
        this.phone = phone;
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
    


}
