package com.aktie.infra.celcoin.mapper;

import com.aktie.domain.dto.MDTO;
import com.aktie.infra.celcoin.dto.CelcoinMerchantDTO;

public class CelcoinMerchantMapper {
    public static MDTO toAppDTO(CelcoinMerchantDTO vendorDTO) {
    MDTO dto = new MDTO();

    dto.setPostalCode(vendorDTO.getPostalCode());
    dto.setCity(vendorDTO.getCity());
    dto.setCategoryCode(vendorDTO.getMerchantCategoryCode());
    dto.setName(vendorDTO.getName());

    return dto;
  }

  public static CelcoinMerchantDTO toVendorDTO(MDTO appDTO) {
    CelcoinMerchantDTO dto = new CelcoinMerchantDTO();

    dto.setPostalCode(appDTO.getPostalCode());
    dto.setCity(appDTO.getCity());
    dto.setMerchantCategoryCode(appDTO.getCategoryCode());
    dto.setName(appDTO.getName());

    return dto;
  }
}
