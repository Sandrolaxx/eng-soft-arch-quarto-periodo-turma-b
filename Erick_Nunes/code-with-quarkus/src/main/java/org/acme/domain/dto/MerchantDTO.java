package org.acme.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MerchantDTO {
    
    @JsonProperty("postalCode")
    private String postalCode;

    @JsonProperty("city")
    private String city;

    @JsonProperty("name")
    private String name;

    public MerchantDTO(String postalCode, String city, String name) {
        this.postalCode = postalCode;
        this.city = city;
        this.name = name;
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