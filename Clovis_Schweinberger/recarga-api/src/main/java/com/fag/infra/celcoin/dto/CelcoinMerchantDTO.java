package com.fag.infra.celcoin.dto;

public class CelcoinMerchantDTO {
    
    private String postalCode;
    
    private String city;

    private Integer mcCategoryCode;

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

    public Integer getmcCategoryCode() {
        return mcCategoryCode;
    }

    public void setmcCategoryCode(Integer merchantCategoryCode) {
        this.mcCategoryCode = merchantCategoryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
