package com.fag.domain.mappers;

import com.fag.domain.dto.MPPixDTO;
import com.fag.domain.entities.MPPixBO;

public class MPPixMapper {

    public static MPPixDTO toDTO(MPPixBO bo) {
        MPPixDTO dto = new MPPixDTO();

        dto.setId(bo.getId().toString());
        dto.setAmount(bo.getAmount());
        dto.setBase64(bo.getBase64());
        dto.setDescription(bo.getDescription());
        dto.setEmail(bo.getEmail());
        dto.setEmv(bo.getEmv());
        dto.setExpiration(bo.getExpiration());

        return dto;
    }

    public static MPPixBO toBO(MPPixDTO dto) {
        return new MPPixBO(
                dto.getId(),
                dto.getAmount(),
                dto.getEmail(),
                dto.getDescription(),
                dto.getEmv(),
                dto.getBase64(),
                dto.getExpiration());
    }

}
