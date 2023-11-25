package org.qrcode.infra.celcoin.dto;

public class CelcoinMerchantDTO {
    private String name;
    private String merchantCategoryCode;
    private String city;
    private String postalCode;

    public String getName() {
        return this.name;
    }

    public String getMerchantCategoryCode() {
        return this.merchantCategoryCode;
    }

    public String getCity() {
        return this.city;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setMerchantCategoryCode(final String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }
    
    public void setCity(final String city) {
        this.city = city;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }
}