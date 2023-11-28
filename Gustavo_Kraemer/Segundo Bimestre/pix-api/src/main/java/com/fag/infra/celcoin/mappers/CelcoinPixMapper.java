package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.CcPixDTO;
import com.fag.infra.celcoin.dto.CelcoinPixDTO;

public class CelcoinPixMapper {

  public static CcPixDTO toAppDTO(CelcoinPixDTO vendorDTO) {
    CcPixDTO dto = new CcPixDTO();
    dto.setKey(vendorDTO.getKey());
    dto.setAmount(vendorDTO.getAmount());
    dto.setMerchant(CelcoinMerchantMapper.toAppDTO(vendorDTO.getMerchant()));

    return dto;
  }

  public static CelcoinPixDTO toVendorDTO(CcPixDTO appDTO) {
    CelcoinPixDTO dto = new CelcoinPixDTO();

    dto.setKey(appDTO.getKey());
    dto.setAmount(appDTO.getAmount());
    dto.setMerchant(CelcoinMerchantMapper.toVendorDTO(appDTO.getMerchant()));

    return dto;
  }

}