package com.aktie.infra.celcoin.mappers;

import com.aktie.domain.dto.PixDTO;
import com.aktie.infra.celcoin.dto.CelPixDTO;

public class CelPixMapper {
    public static PixDTO toAppDTO(CelPixDTO vendorDTO) {
        PixDTO dto = new PixDTO();
        dto.setKey(vendorDTO.getKey());
        dto.setAmount(vendorDTO.getAmount());
        dto.setMerchant(CelMerchantMapper.toAppDTO(vendorDTO.getMerchant()));

        return dto;
    }

    public static CelPixDTO toVendorDTO(PixDTO appDTO) {
        CelPixDTO dto = new CelPixDTO();

        dto.setKey(appDTO.getKey());
        dto.setAmount(appDTO.getAmount());
        dto.setMerchant(CelMerchantMapper.toVendorDTO(appDTO.getMerchant()));

        return dto;
    }
}
