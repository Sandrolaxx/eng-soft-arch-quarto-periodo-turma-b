package com.ryan.projetofinal.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinPixDTO {
  private String key;
  private Double amount;
  private CelcoinMerchantDTO merchant;

  @JsonbProperty(value = "transactionIdentification")
  private String transactionId;

  public String getKey() {
    return this.key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Double getAmount() {
    return this.amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public CelcoinMerchantDTO getMerchant() {
    return this.merchant;
  }

  public void setMerchant(CelcoinMerchantDTO merchant) {
    this.merchant = merchant;
  }

  public String getTransactionId() {
    return this.transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


}