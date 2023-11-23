package com.fag.infra.mercadopago.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class MPPixResponse {
    
    @JsonbProperty("point_of_interaction")
    private MPPixPoiDTO poi;

    public MPPixPoiDTO getPoi() {
        return poi;
    }

    public void setPoi(MPPixPoiDTO poi) {
        this.poi = poi;
    }

}
