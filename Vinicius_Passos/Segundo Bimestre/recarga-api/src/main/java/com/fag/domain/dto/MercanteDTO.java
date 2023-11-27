package com.fag.domain.dto;

public class MercanteDTO {

    private String postalCode;

    private String city;

    private String mercanteCategoryCode;

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

    public String getMercanteCategoryCode() {
        return mercanteCategoryCode;
    }

    public void setMercanteCategoryCode(String mercanteCategoryCode) {
        this.mercanteCategoryCode = mercanteCategoryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}