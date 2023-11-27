package com.fag.domain.mappers;

import com.fag.domain.entities.PixBO;

public class PixMapper {
    
    public static PixDTO toDTO(PixBO bo){
        PixDTO dto = new PixDTO();

        dto.setId(bo.getId().toString());
        dto.setAmount(bo.getAmount());
        dto.setBase64(bo.getBase64());
        dto.setDescription(bo.getDescription());
        dto.setEmail(bo.getEmail());
        dto.setEmv(bo.getemv());
        dto.setExpiration(bo.getExpiration());

        return dto();

    }
}
