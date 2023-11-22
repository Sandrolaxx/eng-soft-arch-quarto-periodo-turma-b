package com.fag.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinTokenDTO {

    @JsonbProperty("access_token")
    private String accessToken;

    @JsonbProperty("expires_in")
    private Integer expiresIn;

    @JsonbProperty("token_type")
    private String tokenType;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}
