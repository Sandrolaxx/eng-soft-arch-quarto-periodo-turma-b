package com.fag.infra.celcoin.dto;

public class CelcoinMercanteDTO {
    
    private String postalCode;
    private String city;
    private String mercanteCategoryCode;
    private String name;

    public String getPostalCode() {
      return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
      this.postalCode = postalCode;
    }

    public String getCity() {
      return this.city;
    }

    public void setCity(String city) {
      this.city = city;
    }

    public String getMercanteCategoryCode() {
      return this.mercanteCategoryCode;
    }

    public void setMercanteCategoryCode(String mercanteCategoryCode) {
      this.mercanteCategoryCode = mercanteCategoryCode;
    }

    public String getName() {
      return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }

}
