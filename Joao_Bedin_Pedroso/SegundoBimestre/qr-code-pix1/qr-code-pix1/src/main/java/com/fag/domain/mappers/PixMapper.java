package com.fag.domain.mappers;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;

public class PixMapper {

    public static PixDTO toDtO(PixBO bo){
        PixDTO dto = new PixDTO();

        dto.setId(bo.getId().toString());;
        dto.setAmount(bo.getAmount());
        dto.setKey(bo.getKey());
        dto.setTransactionIdentification(bo.getTransactionIdentification());
        dto.setMerchant(bo.getMerchant());
        dto.setEmv(bo.getEmv());

        return dto;

    }

    public static PixBO toBO(PixDTO dto){
        return new PixBO(dto.getId(),
        dto.getKey(), 
        dto.getAmount(), 
        dto.getTransactionIdentification(), 
        dto.getMerchant(), 
        dto.getEmv());

    }
    
}
