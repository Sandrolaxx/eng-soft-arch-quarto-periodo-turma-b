package com.fag.domain.entities;


public class MerchantBO {

    private String postalCode;
    private String city;
    private Integer categoryCode;
    private String name;

    public MerchantBO(String postalCode, String city, Integer categoryCode, String name) {
        this.postalCode = postalCode;
        this.city = city;
        this.categoryCode = categoryCode;
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }
    
    public String getCity() {
        return city;
    }

    public Integer getCategoryCode() {
        return categoryCode;
    }

    public String getName() {
        return name;
    }
}