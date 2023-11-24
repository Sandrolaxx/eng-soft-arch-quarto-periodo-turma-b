package com.ryan.projetofinal.infra.celcoin.mappers;

import com.ryan.projetofinal.domain.dto.CoinPixDTO;
import com.ryan.projetofinal.infra.celcoin.dto.CelcoinPixDTO;

public class CelcoinPixMapper {

  public static CoinPixDTO toAppDTO(CelcoinPixDTO vendorDTO) {
    CoinPixDTO dto = new CoinPixDTO();
    dto.setKey(vendorDTO.getKey());
    dto.setAmount(vendorDTO.getAmount());
    dto.setMerchant(CelcoinMerchantMapper.toAppDTO(vendorDTO.getMerchant()));

    return dto;
  }

  public static CelcoinPixDTO toVendorDTO(CoinPixDTO appDTO) {
    CelcoinPixDTO dto = new CelcoinPixDTO();

    dto.setKey(appDTO.getKey());
    dto.setAmount(appDTO.getAmount());
    dto.setMerchant(CelcoinMerchantMapper.toVendorDTO(appDTO.getMerchant()));

    return dto;
  }

}