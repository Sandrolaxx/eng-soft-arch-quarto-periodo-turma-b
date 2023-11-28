package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.MercanteDTO;
import com.fag.infra.celcoin.dto.CelcoinMercanteDTO;

public class CelcoinMercanteMapper {

    public static CelcoinMercanteDTO toVendorDTO(MercanteDTO appDTO) {

        CelcoinMercanteDTO dto = new CelcoinMercanteDTO();

        dto.setPostalCode(appDTO.getPostalCode());
        dto.setCity(appDTO.getCity());
        dto.setMercanteCategoryCode(appDTO.getMercanteCategoryCode());
        dto.setName(appDTO.getName());

        return dto;

    }

    public static MercanteDTO toAppDTO(CelcoinMercanteDTO vendorDTO) {

        MercanteDTO dto = new MercanteDTO();

        dto.setPostalCode(vendorDTO.getPostalCode());
        dto.setCity(vendorDTO.getCity());
        dto.setMercanteCategoryCode(vendorDTO.getMercanteCategoryCode());
        dto.setName(vendorDTO.getName());

        return dto;

    }

}