package com.fag.infra.mercadopago.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class MPPixPoiDTO {

    @JsonbProperty("transaction_data")
    private MPPixResponseTrxData trxData;

    public MPPixResponseTrxData getTrxData() {
        return trxData;
    }

    public void setTrxData(MPPixResponseTrxData trxData) {
        this.trxData = trxData;
    }

}
