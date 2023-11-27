package com.rian.infra.CC.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CCoinTokenDTO {

    @JsonbProperty("access_token")
    private String accessToken;

    @JsonbProperty("token_type")
    private String tokenType;

    @JsonbProperty("expires_in")
    private Integer expiresIn;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Integer getExpiresIn() {
        return this.expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }
}
