package com.rian.infra.CC.mapper;

import com.rian.domain.dto.PixCelcoinDTO;
import com.rian.infra.CC.dto.PixCCoinDTO;

public class PixCCoinMapper{

  public static PixCelcoinDTO  toAppDTO(PixCCoinDTO vendorDTO) {
    PixCelcoinDTO  dto = new PixCelcoinDTO ();
    dto.setKey(vendorDTO.getKey());
    dto.setAmount(vendorDTO.getAmount());
    dto.setMerchant(CCoinMerchantMapper.toDTO(vendorDTO.getMerchant()));

    return dto;
  }

  public static PixCCoinDTO  toVendorDTO(PixCelcoinDTO appDTO) {
    PixCCoinDTO  dto = new PixCCoinDTO ();

    dto.setKey(appDTO.getKey());
    dto.setAmount(appDTO.getAmount());
    dto.setMerchant(CCoinMerchantMapper.toVendorDTO(appDTO.getMerchant()));

    return dto;
  }

}
