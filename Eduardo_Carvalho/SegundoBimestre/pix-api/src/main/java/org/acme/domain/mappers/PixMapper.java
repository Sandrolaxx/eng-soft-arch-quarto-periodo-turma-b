package org.acme.domain.mappers;


import org.acme.domain.dto.PixDTO;
import org.acme.domain.entities.PixBO;

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
        return new PixBO(dto.getId(), dto.getKey(), dto.getAmount(),
                dto.getTransactionId());
    }

}
