package com.fag.pix_api_celcoin.domain.entities;

public class PhoneBO {

    private Integer stateCode;
    private Integer countryCode;
    private String number;

    public PhoneBO(Integer stateCode, Integer countryCode, String number) {
        this.stateCode = stateCode;
        this.countryCode = countryCode;
        this.number = number;
    }

    public Integer getStateCode() {
        return stateCode;
    }

    public Integer getCountryCode() {
        return countryCode;
    }

    public String getNumber() {
        return number;
    }
}