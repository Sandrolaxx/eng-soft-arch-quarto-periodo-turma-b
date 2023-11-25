package main.java.com.fag.domain.entities;

import java.util.UUID;

public class PhoneBO {
    private Integer countryCode;
    private String number;
    private UUID id;
    private Integer stateCode;

    public UUID getId() {
        return id;
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
    public PhoneBO(Integer stateCode, Integer countryCode, String number) {
        this.stateCode = stateCode;
        this.countryCode = countryCode;
        this.number = number;
    }
}