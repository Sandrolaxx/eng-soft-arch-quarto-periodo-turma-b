package org.qrcode.infra.celcoin.dto;

public class CelcoinTokenResponseDTO {
    private String access_token;
    private Integer expires_in;
    private String token_type;

    public CelcoinTokenResponseDTO(final String access_token, final Integer expires_in, final String token_type) {
        this.access_token = access_token;
        this.expires_in = expires_in;
        this.token_type = token_type;
    }

    public CelcoinTokenResponseDTO() {
    }

    public String getAccess_token() {
        return this.access_token;
    }

    public Integer getExpires_in() {
        return this.expires_in;
    }

    public String getToken_type() {
        return this.token_type;
    }

    public void setAccess_token(final String access_token) {
        this.access_token = access_token;
    }

    public void setExpires_in(final Integer expires_in) {
        this.expires_in = expires_in;
    }

    public void setToken_type(final String token_type) {
        this.token_type = token_type;
    }
}