/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.domain.entities;

/**
 *
 * @author joseem
 */
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
