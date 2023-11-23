package java.infra.celcoin.dto;

import java.util.List;

import jakarta.json.bind.annotation.JsonbProperty;

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