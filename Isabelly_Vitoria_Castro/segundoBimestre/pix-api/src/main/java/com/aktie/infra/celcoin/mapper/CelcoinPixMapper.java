package com.aktie.infra.celcoin.mapper;

import com.aktie.domain.dto.CPixDTO;
import com.aktie.infra.celcoin.dto.CelcoinPixDTO;

public class CelcoinPixMapper {

     public static CPixDTO toAppDTO(CelcoinPixDTO vendorDTO) {
    CPixDTO dto = new CPixDTO();
    dto.setKey(vendorDTO.getKey());
    dto.setAmount(vendorDTO.getAmount());
    dto.setMerchant(CelcoinMerchantMapper.toAppDTO(vendorDTO.getMerchant()));

    return dto;
  }

  public static CelcoinPixDTO toVendorDTO(CPixDTO appDTO) {
    CelcoinPixDTO dto = new CelcoinPixDTO();

    dto.setKey(appDTO.getKey());
    dto.setAmount(appDTO.getAmount());
    dto.setMerchant(CelcoinMerchantMapper.toVendorDTO(appDTO.getMerchant()));

    return dto;
  }
}
