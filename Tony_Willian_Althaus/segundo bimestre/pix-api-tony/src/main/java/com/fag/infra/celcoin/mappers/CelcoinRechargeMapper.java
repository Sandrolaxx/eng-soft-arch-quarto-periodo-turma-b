package main.java.com.fag.infra.celcoin.mappers;

import main.java.com.fag.domain.dto.RechargeDTO;
import main.java.com.fag.infra.celcoin.dto.CelcoinRechargeDTO;
import main.java.com.fag.infra.celcoin.dto.CelcoinRechargeValueDTO;

public class CelcoinRechargeMapper {

    public static CelcoinRechargeDTO toVendorDTO(RechargeDTO appDTO) {
        CelcoinRechargeDTO vendorDTO = new CelcoinRechargeDTO();
        CelcoinRechargeValueDTO toUpData = new CelcoinRechargeValueDTO();

        toUpData.setValue(appDTO.getValue());

        vendorDTO.setCpfCnpj(appDTO.getDocument());
        vendorDTO.setPhone(CelcoinRechargePhoneMapper.toVendorDTO(appDTO.getPhone()));
        vendorDTO.setProviderID(appDTO.getOperatorId());
        vendorDTO.setTopupData(toUpData);

        return vendorDTO;
    }

}