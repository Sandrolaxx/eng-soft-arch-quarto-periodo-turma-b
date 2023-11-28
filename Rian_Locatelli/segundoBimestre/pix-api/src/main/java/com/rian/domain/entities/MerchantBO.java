package com.rian.domain.entities;

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

        validate(); //Implementação de regra de negócio
    }

    private void validate() {

        if (this.postalCode == null) {
            throw new RuntimeException("Campo obrigatório = postalCode!");
        }
        if (this.city == null) {
            throw new RuntimeException("Campo obrigatório = city!");
        }
        if (this.categoryCode == null) {
            throw new RuntimeException("Campo obrigatório = categoryCode!");
        }
        if (this.name == null) {
            throw new RuntimeException("Campo obrigatório = name!");
        }
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