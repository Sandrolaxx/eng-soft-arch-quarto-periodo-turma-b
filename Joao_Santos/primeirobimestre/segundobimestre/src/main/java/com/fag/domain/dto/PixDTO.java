package com.fag.domain.dto;

public class PixDTO {
  private String id;
  private String key;
  private Double amount;
  private MerchantDTO merchant;
  private Long transactionId;

  private String qrCode;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public String getQrCode() {
    return qrCode;
  }

  public void setQrCode(String qrCode) {
    this.qrCode = qrCode;
  }

  public MerchantDTO getMerchant() {
    return merchant;
  }

  public void setMerchant(MerchantDTO merchant) {
    this.merchant = merchant;
  }

  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }
}