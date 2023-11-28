package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.CoinPixDTO;
import com.fag.infra.celcoin.dto.CelcoinPixDTO;

public class CelcoinPixMapper {

  public static CoinPixDTO toAppDTO(CelcoinPixDTO vendorDTO) {
    CoinPixDTO dto = new CoinPixDTO();
    dto.setKey(vendorDTO.getKey());
    dto.setAmount(vendorDTO.getAmount());
    dto.setMercante(CelcoinMercanteMapper.toAppDTO(vendorDTO.getMercante()));

    return dto;
  }

  public static CelcoinPixDTO toVendorDTO(CoinPixDTO appDTO) {
    CelcoinPixDTO dto = new CelcoinPixDTO();

    dto.setKey(appDTO.getKey());
    dto.setAmount(appDTO.getAmount());
    dto.setMercante(CelcoinMercanteMapper.toVendorDTO(appDTO.getMercante()));

    return dto;
  }

}