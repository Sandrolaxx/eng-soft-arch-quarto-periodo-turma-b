package com.aktie.domain.mappers;

import java.util.UUID;

import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.entities.PixBO;

public class PixMapper {

    public static PixDTO toDTO(PixBO bo) {
        PixDTO dto = new PixDTO();

        dto.setId(bo.getId().toString());
        dto.setAmount(bo.getAmount());
        dto.setKey(bo.getKey());
        dto.setTransactionId(bo.getTransactionId());

        return dto;
    }

    public static PixBO toBO(PixDTO dto) {
        return new PixBO(dto.getId() != null ? UUID.fromString(dto.getId()) : null, dto.getKey(), dto.getAmount(),
                dto.getTransactionId());
    }

}
