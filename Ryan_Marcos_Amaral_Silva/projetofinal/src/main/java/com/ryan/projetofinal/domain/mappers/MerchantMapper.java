package com.ryan.projetofinal.domain.mappers;

import com.ryan.projetofinal.domain.dto.MerchantDTO;
import com.ryan.projetofinal.domain.entities.MerchantBO;

public class MerchantMapper {

    public static MerchantDTO toDTO(MerchantBO bo) {

        MerchantDTO dto = new MerchantDTO();

        dto.setPostalCode(bo.getPostalCode());
        dto.setCity(bo.getCity());
        dto.setCategoryCode(bo.getCategoryCode());
        dto.setName(bo.getName());

        return dto;
    }

    public static MerchantBO toBO(MerchantDTO dto) {

        return new MerchantBO(
            dto.getPostalCode(),
            dto.getCity(),
            dto.getCategoryCode(),
            dto.getName());
    }

}