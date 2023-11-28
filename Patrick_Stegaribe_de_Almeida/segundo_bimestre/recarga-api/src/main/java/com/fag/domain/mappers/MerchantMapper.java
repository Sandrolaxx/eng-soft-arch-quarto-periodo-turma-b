package com.fag.domain.mappers;

import com.fag.domain.dto.MerchantDTO;
import com.fag.domain.entities.MerchantBO;

public class MerchantMapper {
    
    public static MerchantDTO toBO(MerchantBO bo) {
        MerchantDTO dto = new MerchantDTO();

        dto.setPostalCode(bo.getPostalCode());
        dto.setCity(bo.getCity());
        dto.setMerchantCategoryCode(bo.getMerchantCategoryCode());
        dto.setName(bo.getName());

        return dto;
    }

     public static MerchantBO toDTO(MerchantDTO bo) {
        
        return new MerchantBO(

                bo.getPostalCode(),
                bo.getCity(),
                bo.getMerchantCategoryCode(),
                bo.getName());

    }

}
