package com.ryan.projetofinal.domain.mappers;

import java.util.UUID;

import com.ryan.projetofinal.domain.dto.CoinPixDTO;
import com.ryan.projetofinal.domain.entities.CoinPixBO;

public class CoinPixMapper {

    public static CoinPixBO toBO(CoinPixDTO dto) {

        return new CoinPixBO(
        dto.getId() != null ? UUID.fromString(dto.getId()) : null, 
        dto.getKey(), 
        dto.getAmount(),
        dto.getQrCode(), 
        dto.getTransactionId());
    }

    public static CoinPixDTO toDTO(CoinPixBO bo) {

        CoinPixDTO dto = new CoinPixDTO();

        dto.setId(bo.getId() != null ? bo.getId().toString() : null);
        dto.setKey(bo.getKey());
        dto.setAmount(bo.getAmount());
        dto.setQrCode(bo.getQrCode());
        dto.setTransactionId(bo.getTransactionId());

        return dto;

    }

}