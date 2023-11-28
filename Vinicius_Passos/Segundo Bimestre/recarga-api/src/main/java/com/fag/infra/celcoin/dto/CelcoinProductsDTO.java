package com.fag.infra.celcoin.dto;

import java.util.List;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinProductsDTO {

    @JsonbProperty("value")
    private List<CelcoinProductDTO> procucts;

    public List<CelcoinProductDTO> getProcucts() {
        return procucts;
    }

    public void setProcucts(List<CelcoinProductDTO> procucts) {
        this.procucts = procucts;
    }

}
