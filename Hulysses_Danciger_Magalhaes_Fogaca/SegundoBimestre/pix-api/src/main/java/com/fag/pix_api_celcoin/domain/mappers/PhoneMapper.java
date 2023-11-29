package com.fag.pix_api_celcoin.domain.mappers;

import com.fag.pix_api_celcoin.domain.dto.PhoneDTO;
import com.fag.pix_api_celcoin.domain.entities.PhoneBO;

public class PhoneMapper {

    public static PhoneBO toBO(PhoneDTO dto) {
        return new PhoneBO(dto.getStateCode(), dto.getCountryCode(), dto.getNumber());
    }

    public static PhoneDTO toDTO(PhoneBO bo) {
        PhoneDTO phone = new PhoneDTO();

        phone.setCountryCode(bo.getCountryCode());
        phone.setStateCode(bo.getStateCode());
        phone.setNumber(bo.getNumber());

        return phone;
    }
}