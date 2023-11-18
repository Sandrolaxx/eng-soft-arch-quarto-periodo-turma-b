package com.fag.infra.mercadopago.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class MpPixResponseTrxData {
    
    @JsonbProperty("qr_code")
    private String emv;

    public String getEmv() {
        return emv;
    }

    public void setEmv(String emv) {
        this.emv = emv;
    }

}
