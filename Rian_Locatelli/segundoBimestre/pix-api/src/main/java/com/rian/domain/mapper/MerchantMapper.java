package com.rian.domain.mapper;

import com.rian.domain.dto.MerchantDTO;
import com.rian.domain.entities.MerchantBO;

// Classe responsável por realizar a conversão entre MerchantBO (entidade de negócio) e MerchantDTO (DTO para transferência de dados)
public class MerchantMapper {

    public static MerchantBO toBO(MerchantDTO dto) {

        return new MerchantBO(
                dto.getPostalCode(),
                dto.getCity(),
                dto.getCategoryCode(),
                dto.getName());
    }

    public static MerchantDTO toDTO(MerchantBO bo) {

        MerchantDTO dto = new MerchantDTO();

        dto.setPostalCode(bo.getPostalCode());
        dto.setCity(bo.getCity());
        dto.setCategoryCode(bo.getCategoryCode());
        dto.setName(bo.getName());

        return dto;
    }
}

