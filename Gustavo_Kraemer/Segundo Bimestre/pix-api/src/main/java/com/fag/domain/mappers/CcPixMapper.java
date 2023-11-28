package com.fag.domain.mappers;

import java.util.UUID;

import com.fag.domain.dto.CcPixDTO;
import com.fag.domain.entities.CcPixBO;

public class CcPixMapper {

    public static CcPixBO toBO(CcPixDTO dto) {

        return new CcPixBO(
        dto.getId() != null ? UUID.fromString(dto.getId()) : null,
        dto.getKey(), 
        dto.getAmount(),
        dto.getQrCode(), 
        dto.getTransactionId());
    }

    public static CcPixDTO toDTO(CcPixBO bo) {

        CcPixDTO dto = new CcPixDTO();

        dto.setId(bo.getId() != null ? bo.getId().toString() : null);
        dto.setKey(bo.getKey());
        dto.setAmount(bo.getAmount());
        dto.setQrCode(bo.getQrCode());
        dto.setTransactionId(bo.getTransactionId());

        return dto;

    }

}
