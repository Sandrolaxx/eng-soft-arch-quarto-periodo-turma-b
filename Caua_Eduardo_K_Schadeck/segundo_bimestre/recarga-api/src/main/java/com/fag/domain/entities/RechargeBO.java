package com.fag.domain.entities;

public class RechargeBO{
    
    public Double value;

    public Integer documents;

    public Integer providerID;

    public PhoneBO phone;

    public Double getValue() {
        return value;
    }

    public Integer getDocuments() {
        return documents;
    }

    public Integer getProviderID() {
        return providerID;
    }

    public PhoneBO getPhone() {
        return phone;
    }

    public RechargeBO(Double value, Integer documents, Integer providerID, PhoneBO phone) {
        this.value = value;
        this.documents = documents;
        this.providerID = providerID;
        this.phone = phone;
    }

}