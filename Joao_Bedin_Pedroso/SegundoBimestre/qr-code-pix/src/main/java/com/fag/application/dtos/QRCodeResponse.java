package com.fag.application.dtos;

public class QRCodeResponse {

    private String qrCode; 

    public QRCodeResponse() {
    }

    public QRCodeResponse(String qrCode) {
        this.qrCode = qrCode;
    }

    // Getter e setter
    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
}
