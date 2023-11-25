package com.fag.domain.mappers;


import com.fag.domain.dto.CoinPixDTO;
import com.fag.domain.entities.CoinPixBO;

public class CoinPixMapper {

    public static CoinPixDTO toDTO(CoinPixBO bo) {
        CoinPixDTO dto = new CoinPixDTO();
        dto.setId(bo.getId());
        dto.setKey(bo.getKey());
        dto.setAmount(bo.getAmount());
        dto.setQrCode(bo.getQrCode());
        dto.setTransactionIdentification(bo.getTransactionIdentification());
        return dto;
    }

    public static CoinPixBO toBO(CoinPixDTO dto) {

        return new CoinPixBO(
        dto.getId() ,
        dto.getKey(), 
        dto.getAmount(),
        dto.getQrCode(), 
        dto.getTransactionIdentification());
    }

}
