package com.ryan.projetofinal.infra.celcoin.dto;

public class CelcoinMerchantDTO {
    private String postalCode;
    private String city;
    private Integer merchantCategoryCode;
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
  
    public Integer getMerchantCategoryCode() {
      return this.merchantCategoryCode;
    }
  
    public void setMerchantCategoryCode(Integer merchantCategoryCode) {
      this.merchantCategoryCode = merchantCategoryCode;
    }
  
    public String getName() {
      return this.name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
}