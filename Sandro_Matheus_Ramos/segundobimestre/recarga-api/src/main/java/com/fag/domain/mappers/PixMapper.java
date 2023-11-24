package com.fag.domain.mappers;

import java.util.UUID;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;

public class PixMapper {

    public static PixDTO toDTO(PixBO bo) {
        PixDTO dto = new PixDTO();

        dto.setId(bo.getId().toString());
        dto.setAmount(bo.getAmount());
        dto.setBase64(bo.getBase64());
        dto.setDescription(bo.getDescription());
        dto.setEmail(bo.getEmail());
        dto.setEmv(bo.getEmv());
        dto.setExpiration(bo.getExpiration());

        return dto;
    }

    public static PixBO toBO(PixDTO dto) {
        UUID id = dto.getId() == null ? UUID.randomUUID() : UUID.fromString(dto.getId());

        return new PixBO(id,
                dto.getAmount(),
                dto.getEmail(),
                dto.getDescription(),
                dto.getEmv(),
                dto.getBase64(),
                dto.getExpiration());
    }

}
