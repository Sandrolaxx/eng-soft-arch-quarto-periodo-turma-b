package com.fag.domain.dto;


public class MerchantDTO {
  private Integer categoryCode;
  private String postalCode;
  private String city;
  private String name;

  public Integer getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(Integer categoryCode) {
    this.categoryCode = categoryCode;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
