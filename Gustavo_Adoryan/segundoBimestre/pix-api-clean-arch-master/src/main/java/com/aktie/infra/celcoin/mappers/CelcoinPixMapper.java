package com.aktie.infra.celcoin.mappers;

import com.aktie.domain.dto.PixDTO;
import com.aktie.infra.celcoin.dto.CelcoinPixDTO;

public class CelcoinPixMapper {

    public static PixDTO toAppDTO(CelcoinPixDTO pixDTO) {
        PixDTO dto = new PixDTO();
        dto.setKey(pixDTO.getKey());
        dto.setAmount(pixDTO.getAmount());
        dto.setMerchant(CelcoinMerchantMapper.toAppDTO(pixDTO.getMerchant()));

        return dto;
    }

    public static CelcoinPixDTO toPixDTO(PixDTO appDTO) {
        CelcoinPixDTO dto = new CelcoinPixDTO();

        dto.setKey(appDTO.getKey());
        dto.setAmount(appDTO.getAmount());
        dto.setMerchant(CelcoinMerchantMapper.toPixDTO(appDTO.getMerchant()));

        return dto;
    }

}
