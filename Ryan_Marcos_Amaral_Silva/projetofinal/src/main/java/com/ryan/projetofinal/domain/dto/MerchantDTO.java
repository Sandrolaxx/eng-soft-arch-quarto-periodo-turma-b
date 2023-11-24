package com.ryan.projetofinal.domain.dto;

public class MerchantDTO {

    private String postalCode;
    private String city;
    private Integer categoryCode;
    private String name;
    
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
    public Integer getCategoryCode() {
        return categoryCode;
    }
    public void setCategoryCode(Integer categoryCode) {
        this.categoryCode = categoryCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}