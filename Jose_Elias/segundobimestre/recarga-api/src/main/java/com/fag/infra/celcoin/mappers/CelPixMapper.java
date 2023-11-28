/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.PixDTO;
import com.fag.infra.celcoin.dto.CelPixDTO;

/**
 *
 * @author molin
 */
public class CelPixMapper {
    public static PixDTO toAppDTO(CelPixDTO pixDTO) {
        PixDTO dto = new PixDTO();
        dto.setKey(pixDTO.getKey());
        dto.setAmount(pixDTO.getAmount());
        dto.setMerchant(CelMerchantMapper.toAppDTO(pixDTO.getMerchant()));

        return dto;
    }

    public static CelPixDTO toVendorDTO(PixDTO pixDTO) {
        CelPixDTO dto = new CelPixDTO();

        dto.setKey(pixDTO.getKey());
        dto.setAmount(pixDTO.getAmount());
        dto.setMerchant(CelMerchantMapper.toVendorDTO(pixDTO.getMerchant()));

        return dto;
    }
}
