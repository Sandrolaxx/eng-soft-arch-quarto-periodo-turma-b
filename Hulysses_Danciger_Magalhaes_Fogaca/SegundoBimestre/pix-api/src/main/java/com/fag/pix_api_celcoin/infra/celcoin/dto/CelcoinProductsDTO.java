package com.fag.pix_api_celcoin.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;
import java.util.List;

public class CelcoinProductsDTO {

    @JsonbProperty("value")
    private List<CelcoinProductDTO> products;

    public List<CelcoinProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<CelcoinProductDTO> products) {
        this.products = products;
    }
}