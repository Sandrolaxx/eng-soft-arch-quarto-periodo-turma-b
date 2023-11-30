package com.aktie.infra.celcoin.mappers;
import com.aktie.domain.dto.MerchantDTO;
import com.aktie.infra.celcoin.dto.CelMerchantDTO;

public class CelMerchantMapper {
    public static MerchantDTO toAppDTO(CelMerchantDTO vendorDTO) {
        MerchantDTO dto = new MerchantDTO();
        dto.setPostalCode(vendorDTO.getPostalCode());
        dto.setCity(vendorDTO.getCity());
        dto.setCategoryCode(vendorDTO.getMerchantCategoryCode());
        dto.setName(vendorDTO.getName());
        return dto;
    }

    public static CelMerchantDTO toVendorDTO(MerchantDTO appDTO) {
        CelMerchantDTO dto = new CelMerchantDTO();
        dto.setPostalCode(appDTO.getPostalCode());
        dto.setCity(appDTO.getCity());
        dto.setMerchantCategoryCode(appDTO.getCategoryCode());
        dto.setName(appDTO.getName());
        return dto;
    }

}