package main.domain.mappers;

import main.domain.dto.PhoneDTO;
import main.domain.entities.PhoneBO;

public class PhoneMapper {
    public static PhoneDTO toDTO(PhoneBO bo) {
        PhoneDTO dto = new PhoneDTO();
        dto.setStateCode(bo.getStateCode());
        dto.setCountryCode(bo.getCountryCode());
        dto.setNumber(bo.getNumber());
        return dto;
    }

    public static PhoneBO toBO(PhoneDTO dto) {
        return new PhoneBO(null, dto.getStateCode(), dto.getCountryCode(), dto.getNumber());
    }
}
