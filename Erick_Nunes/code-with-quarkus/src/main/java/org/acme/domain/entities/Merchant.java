package org.acme.domain.entities;

public class Merchant {
    
    private String postalCode;

    private String name;

    private String city;

    public Merchant(String postalCode, String name, String city) {
        this.postalCode = postalCode;
        this.name = name;
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}