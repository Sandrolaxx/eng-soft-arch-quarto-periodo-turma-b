package com.fag.domain.dto;

public class OperatorDTO {


    private Integer category;
    private Double maxValue;
    private Double minValue;
    private Integer rechargeType;
    private Integer providerId;
    private String name;

  public Integer getCategory() {
    return category;
  }

  public void setCategory(Integer category) {
    this.category = category;
  }

  public Double getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }

  public Double getMinValue() {
    return minValue;
  }

  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }

  public Integer getRechargeType() {
    return rechargeType;
  }

  public void setRechargeType(Integer rechargeType) {
    this.rechargeType = rechargeType;
  }

  public Integer getProviderId() {
    return providerId;
  }

  public void setProviderId(Integer providerId) {
    this.providerId = providerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
