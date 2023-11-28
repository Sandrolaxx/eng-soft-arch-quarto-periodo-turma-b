/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fag.domain.mappers;

import com.fag.domain.dto.MerchantDTO;
import com.fag.domain.entities.MerchantBO;

/**
 *
 * @author joseem
 */
public class MerchantMapper {

    public static MerchantBO toBO(MerchantDTO dto) {
        return new MerchantBO(dto.getPostalCode(), dto.getCity(), dto.getCategoryCode(), dto.getName());
    }

    public static MerchantDTO toDTO(MerchantBO bo) {
        MerchantDTO dto = new MerchantDTO();

        dto.setPostalCode(bo.getPostalCode());
        dto.setCity(bo.getCity());
        dto.setCategoryCode(bo.getCategoryCode());
        dto.setName(bo.getName());

        return dto;
    }
}
