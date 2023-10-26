package main.domain.entities;

import java.util.UUID;

public class PhoneBO {
    private UUID id;
    private Integer stateCode;
    private Integer countryCode;
    private String number;

    public PhoneBO(UUID id, Integer stateCode, Integer countryCode, String number) {
        this.id = id;
        this.stateCode = stateCode;
        this.countryCode = countryCode;
        this.number = number;
    }

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
}