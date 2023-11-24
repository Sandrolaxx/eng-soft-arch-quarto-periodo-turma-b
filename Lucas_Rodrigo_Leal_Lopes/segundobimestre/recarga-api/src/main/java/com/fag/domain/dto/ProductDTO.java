package com.fag.domain.dto;

public class ProductDTO {

    private Integer code;
    private Integer cost;
    private Integer dueProduct;
    private String name;
    private Double value;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String productName) {
        this.name = productName;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getDueProduct() {
        return dueProduct;
    }

    public void setDueProduct(Integer dueProduct) {
        this.dueProduct = dueProduct;
    }

}
