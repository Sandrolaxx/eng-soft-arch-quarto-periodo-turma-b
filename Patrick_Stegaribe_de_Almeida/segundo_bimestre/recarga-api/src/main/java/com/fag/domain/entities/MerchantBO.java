package com.fag.domain.entities;

public class MerchantBO {

    private String postalCode;

    private String city;

    private String merchantCategoryCode;
    
    private String name;

    public MerchantBO(String postalCode, String city, String merchantCategoryCode, String name) {
        this.postalCode = postalCode;
        this.city = city;
        this.merchantCategoryCode = merchantCategoryCode;
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public String getName() {
        return name;
    }

    
    
}
