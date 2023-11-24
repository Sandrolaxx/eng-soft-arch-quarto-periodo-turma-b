package com.ryan.projetofinal.domain.mappers;

import com.ryan.projetofinal.domain.dto.PixDTO;
import com.ryan.projetofinal.domain.entities.PixBO;

public class PixMapper {
   
    public static PixDTO toDTO(PixBO bo){
        PixDTO dto = new PixDTO();
        //definir os sets
        dto.setId(bo.getId().toString());
        dto.setAmount(bo.getAmount());
        dto.setBase64(bo.getBase64());
        dto.setDescription(bo.getDescription());
        dto.setEmail(bo.getEmail());
        dto.setEmv(bo.getEmv());
        dto.setExpiration(bo.getExpiration());

        return dto;
    }

    public static PixBO toBO(PixDTO dto){
        return new PixBO(
            dto.getId(),
            dto.getEmail(),
            dto.getDescription(),
            dto.getAmount(),
            dto.getEmv(),
            dto.getBase64(),
            dto.getExpiration());
    }
}