package com.rian.domain.mapper;

import com.rian.domain.dto.PixDTO;
import com.rian.domain.entities.PixBO;

// Classe responsável por realizar a conversão entre PixBO (entidade de negócio) e PixDTO (DTO para transferência de dados)

public class PixMapper {

    public static PixDTO toDTO(PixBO bo){
        
        PixDTO dto = new PixDTO();

        // Preenche o objeto PixDTO com dados do PixBO
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

