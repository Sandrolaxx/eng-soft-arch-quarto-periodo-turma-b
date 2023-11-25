/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.MerchantDTO;
import com.fag.infra.celcoin.dto.CelMerchantDTO;

/**
 *
 * @author molin
 */
public class CelMerchantMapper {
    public static MerchantDTO toAppDTO(CelMerchantDTO merchantDTO) {
        MerchantDTO dto = new MerchantDTO();

        dto.setPostalCode(merchantDTO.getPostalCode());
        dto.setCity(merchantDTO.getCity());
        dto.setCategoryCode(merchantDTO.getMerchantCategoryCode());
        dto.setName(merchantDTO.getName());

        return dto;
    }

    public static CelMerchantDTO toVendorDTO(MerchantDTO merchantDTO) {
        CelMerchantDTO dto = new CelMerchantDTO();

        dto.setPostalCode(merchantDTO.getPostalCode());
        dto.setCity(merchantDTO.getCity());
        dto.setMerchantCategoryCode(merchantDTO.getCategoryCode());
        dto.setName(merchantDTO.getName());

        return dto;
    }
}
