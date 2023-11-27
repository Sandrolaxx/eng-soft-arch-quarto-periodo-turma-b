package org.qrcode.infra.celcoin.dto;

public class CelcoinTokenRequestDTO {
    private final String client_id = "\"###############################################################\";";
    private final String grant_type = "client_credentials";
    private final String client_secret = "###############################################################";

    public String getClient_id() {
        return this.client_id;
    }

    public String getGrant_type() {
        return this.grant_type;
    }

    public String getClient_secret() {
        return this.client_secret;
    }
}