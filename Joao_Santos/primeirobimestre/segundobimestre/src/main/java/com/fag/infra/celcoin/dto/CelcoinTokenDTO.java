package com.fag.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;


public class CelcoinTokenDTO {

  @JsonbProperty("access_token")
  private String accessToken;

  @JsonbProperty("expires_in")
  private Integer expires;

  @JsonbProperty("token_type")
  private String tokenType;

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public Integer getExpires() {
    return expires;
  }

  public void setExpiresIn(Integer expires) {
    this.expires = expires;
  }

  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public String getAccessToken() {
    return accessToken;
  }

}
