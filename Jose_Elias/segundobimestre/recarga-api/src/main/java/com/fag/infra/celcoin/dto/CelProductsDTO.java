package com.fag.infra.celcoin.dto;

import java.util.List;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelProductsDTO {

    @JsonbProperty("value")
    private List<CelProductDTO> procucts;

    public List<CelProductDTO> getProcucts() {
        return procucts;
    }

    public void setProcucts(List<CelProductDTO> procucts) {
        this.procucts = procucts;
    }

    public Object getProducts() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
