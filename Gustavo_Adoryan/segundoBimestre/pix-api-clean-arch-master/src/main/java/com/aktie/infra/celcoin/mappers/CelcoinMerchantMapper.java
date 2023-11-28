package com.aktie.infra.celcoin.mappers;

import com.aktie.domain.dto.MerchantDTO;
import com.aktie.infra.celcoin.dto.CelcoinMerchantDTO;

public class CelcoinMerchantMapper {

    public static MerchantDTO toAppDTO(CelcoinMerchantDTO pixDTO) {
        MerchantDTO dto = new MerchantDTO();

        dto.setPostalCode(pixDTO.getPostalCode());
        dto.setCity(pixDTO.getCity());
        dto.setMerchantCategoryCode(pixDTO.getMerchantCategoryCode());
        dto.setName(pixDTO.getName());

        return dto;
    }

    public static CelcoinMerchantDTO toPixDTO(MerchantDTO appDTO) {
        CelcoinMerchantDTO dto = new CelcoinMerchantDTO();

        dto.setPostalCode(appDTO.getPostalCode());
        dto.setCity(appDTO.getCity());
        dto.setMerchantCategoryCode(appDTO.getMerchantCategoryCode());
        dto.setName(appDTO.getName());

        return dto;
    }
}
