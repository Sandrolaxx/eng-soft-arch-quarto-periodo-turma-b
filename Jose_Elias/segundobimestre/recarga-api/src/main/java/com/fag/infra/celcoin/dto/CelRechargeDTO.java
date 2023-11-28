package com.fag.infra.celcoin.dto;

public class CelRechargeDTO {

    private String cpfCnpj;

    private Integer providerId;

    private CelPhoneDTO phone;

    private CelRechargeValueDTO topupData;

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public CelPhoneDTO getPhone() {
        return phone;
    }

    public void setPhone(CelPhoneDTO phone) {
        this.phone = phone;
    }

    public CelRechargeValueDTO getTopupData() {
        return topupData;
    }

    public void setTopupData(CelRechargeValueDTO topupData) {
        this.topupData = topupData;
    }

}
