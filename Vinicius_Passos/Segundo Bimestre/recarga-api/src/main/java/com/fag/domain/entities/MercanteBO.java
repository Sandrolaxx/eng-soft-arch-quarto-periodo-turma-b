package com.fag.domain.entities;

public class MercanteBO {

    private String postalCode;

    private String city;

    private String mercanteCategoryCode;

    private String name;

    public MercanteBO(String postalCode, String city, String mercanteCategoryCode, String name) {
        this.postalCode = postalCode;
        this.city = city;
        this.mercanteCategoryCode = mercanteCategoryCode;
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getMercanteCategoryCode() {
        return mercanteCategoryCode;
    }

    public String getName() {
        return name;
    }



}