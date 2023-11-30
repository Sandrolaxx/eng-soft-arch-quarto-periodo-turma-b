package com.aktie.domain.mappers;
import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.entities.PixBO;
import java.util.UUID;
public class CelCPixMapper {
    public static PixBO toBO(PixDTO dto){
        return new PixBO(
                dto.getId() != null ? UUID.fromString(dto.getId()) : null,
                dto.getKey(),
                dto.getAmount(),
                dto.getQrCode(),
                dto.getTransactionId());
    }

    public static PixDTO toDto(PixBO bo){
        PixDTO dto = new PixDTO();
        dto.setId(bo.getId() != null ? bo.getId().toString() : null);
        dto.setKey(bo.getKey());
        dto.setAmount(bo.getAmount());
        dto.setQrCode(bo.getQrCode());
        dto.setTransactionId(bo.getTransactionId());
        return dto;
    }
}