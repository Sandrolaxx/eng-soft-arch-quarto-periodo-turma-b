package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.RechargeDTO;
import com.fag.infra.celcoin.dto.CelRechargeDTO;
import com.fag.infra.celcoin.dto.CelRechargeValueDTO;

public class CelRechargeMapper {

    public static CelRechargeDTO toVendorDTO(RechargeDTO appDTO) {
        CelRechargeDTO vendorDTO = new CelRechargeDTO();
        CelRechargeValueDTO topUpData = new CelRechargeValueDTO();

        topUpData.setValue(appDTO.getValue());

        vendorDTO.setCpfCnpj(appDTO.getDocument());
        vendorDTO.setPhone(CelRechargePhoneMapper.toVendorDTO(appDTO.getPhone()));
        vendorDTO.setProviderId(appDTO.getOperatorId());
        vendorDTO.setTopupData(topUpData);

        return vendorDTO;
    }

}
