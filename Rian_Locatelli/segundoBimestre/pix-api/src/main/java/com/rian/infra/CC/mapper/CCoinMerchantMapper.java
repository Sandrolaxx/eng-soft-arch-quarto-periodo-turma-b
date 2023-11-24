package com.rian.infra.CC.mapper;

import com.rian.domain.dto.MerchantDTO;
import com.rian.infra.CC.dto.CCoinMerchantDTO;

// Converter entre objetos MerchantDTO e CCoinMerchantDTO
public class CCoinMerchantMapper {

    public static CCoinMerchantDTO toVendorDTO(MerchantDTO appDTO) {

        CCoinMerchantDTO dto = new CCoinMerchantDTO();

        dto.setPostalCode(appDTO.getPostalCode());
        dto.setMerchantCategoryCode(appDTO.getCategoryCode());
        dto.setCity(appDTO.getCity());
        dto.setName(appDTO.getName());

        return dto;
    }

    public static MerchantDTO toDTO(CCoinMerchantDTO vendorDTO) {

        MerchantDTO dto = new MerchantDTO();

        dto.setPostalCode(vendorDTO.getPostalCode());
        dto.setCategoryCode(vendorDTO.getMerchantCategoryCode());
        dto.setCity(vendorDTO.getCity());
        dto.setName(vendorDTO.getName());

        return dto;
    }
}
