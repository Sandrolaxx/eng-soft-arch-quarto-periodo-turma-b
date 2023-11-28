/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

/**
 *
 * @author molin
 */
public class CelPixResponseDTO {
    private Long transactionId;
    @JsonbProperty(value = "emvqrcps")
    private String qrCode;

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
    
    
}
