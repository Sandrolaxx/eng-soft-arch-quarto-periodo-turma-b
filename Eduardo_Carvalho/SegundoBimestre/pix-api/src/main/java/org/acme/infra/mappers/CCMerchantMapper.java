package org.acme.infra.mappers;

import org.acme.domain.dto.MerchantDTO;
import org.acme.infra.dto.CCMerchantDTO;

public class CCMerchantMapper {

    public static MerchantDTO toAppDTO(CCMerchantDTO pixDTO) {
        MerchantDTO dto = new MerchantDTO();

        dto.setPostalCode(pixDTO.getPostalCode());
        dto.setCity(pixDTO.getCity());
        dto.setMerchantCategoryCode(pixDTO.getMerchantCategoryCode());
        dto.setName(pixDTO.getName());

        return dto;
    }

    public static CCMerchantDTO toVendorDTO(MerchantDTO appDTO) {
        CCMerchantDTO dto = new CCMerchantDTO();

        dto.setPostalCode(appDTO.getPostalCode());
        dto.setCity(appDTO.getCity());
        dto.setMerchantCategoryCode(appDTO.getMerchantCategoryCode());
        dto.setName(appDTO.getName());

        return dto;
    }
}
