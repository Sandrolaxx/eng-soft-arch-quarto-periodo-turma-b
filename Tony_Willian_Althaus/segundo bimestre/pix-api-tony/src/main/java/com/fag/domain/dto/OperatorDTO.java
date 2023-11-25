package main.java.com.fag.domain.dto;

public class OperatorDTO {
    private Integer category;
    private String name;
    private Integer providerId;
    private Double maxValue;
    private Double minValue;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMaxValue() {
        return maxValue;
    }
    public Integer getCategory() {
        return category;
    }
    
    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public void setCategory(Integer category) {
        this.category = category;
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
}