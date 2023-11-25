package main.java.com.fag.infra.celcoin.dto;


public class CelcoinRechargeDTO {

    private String cpfCnpj;

    private Integer providerID;

    private CelcoinPhoneDTO phone;

    private CelcoinRechargeValueDTO topupData;

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Integer getProviderID() {
        return providerID;
    }

    public void setProviderID(Integer providerID) {
        this.providerID = providerID;
    }

    public CelcoinPhoneDTO getPhone() {
        return phone;
    }

    public void setPhone(CelcoinPhoneDTO phone) {
        this.phone = phone;
    }

    public CelcoinRechargeValueDTO getTopupData() {
        return topupData;
    }

    public void setTopupData(CelcoinRechargeValueDTO topupData) {
        this.topupData = topupData;
    }


}