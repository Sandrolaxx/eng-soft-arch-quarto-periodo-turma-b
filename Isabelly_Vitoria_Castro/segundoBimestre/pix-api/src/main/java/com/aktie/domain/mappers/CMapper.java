package com.aktie.domain.mappers;

import java.util.UUID;

import com.aktie.domain.dto.CPixDTO;
import com.aktie.domain.entities.CBO;

public class CMapper {

    public static CBO toBO(CPixDTO dto) {

        return new CBO(
                dto.getId() != null ? UUID.fromString(dto.getId()) : null,
                dto.getKey(),
                dto.getAmount(),
                dto.getQrCode(),
                dto.getTransactionId());
    }

    public static CPixDTO toDTO(CBO bo) {

        CPixDTO dto = new CPixDTO();

        dto.setId(bo.getId() != null ? bo.getId().toString() : null);
        dto.setKey(bo.getKey());
        dto.setAmount(bo.getAmount());
        dto.setQrCode(bo.getQrCode());
        dto.setTransactionId(bo.getTransactionId());

        return dto;

    }

}
