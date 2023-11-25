package main.java.com.fag.domain.mappers;

import main.java.com.fag.domain.dto.PhoneDTO;
import main.java.com.fag.domain.entities.PhoneBO;

public class PhoneMapper {
    public static PhoneDTO toDTO(PhoneBO bo) {
        PhoneDTO dto = new PhoneDTO();
        dto.setStateCode(bo.getStateCode());
        dto.setCountryCode(bo.getCountryCode());
        dto.setNumber(bo.getNumber());
        return dto;
    }

    public static PhoneBO toBO(PhoneDTO dto) {
        return new PhoneBO(dto.getStateCode(), dto.getCountryCode(), dto.getNumber());
    }
}
