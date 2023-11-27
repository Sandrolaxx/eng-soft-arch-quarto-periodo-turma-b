package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.infra.celcoin.dto.CelPhoneDTO;

public class CelRechargePhoneMapper {

    public static PhoneDTO toAppDTO(CelPhoneDTO vendorDTO) {
        PhoneDTO appDTO = new PhoneDTO();

        appDTO.setStateCode(vendorDTO.getStateCode());
        appDTO.setCountryCode(vendorDTO.getCountryCode());
        appDTO.setNumber(vendorDTO.getNumber());

        return appDTO;
    }

    public static CelPhoneDTO toVendorDTO(PhoneDTO appDTO) {
        CelPhoneDTO vendorDTO = new CelPhoneDTO();

        vendorDTO.setStateCode(appDTO.getStateCode());
        vendorDTO.setCountryCode(appDTO.getCountryCode());
        vendorDTO.setNumber(appDTO.getNumber());

        return vendorDTO;
    }

}
