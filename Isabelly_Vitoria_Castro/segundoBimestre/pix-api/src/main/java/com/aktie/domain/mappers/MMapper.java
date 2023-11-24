package com.aktie.domain.mappers;

import com.aktie.domain.dto.MDTO;
import com.aktie.domain.entities.MBO;

public class MMapper {
    public static MDTO toDTO(MBO bo) {

        MDTO dto = new MDTO();

        dto.setPostalCode(bo.getPostalCode());
        dto.setCity(bo.getCity());
        dto.setCategoryCode(bo.getCategoryCode());
        dto.setName(bo.getName());

        return dto;
    }

    public static MBO toBO(MDTO dto) {

        return new MBO(
            dto.getPostalCode(),
            dto.getCity(),
            dto.getCategoryCode(),
            dto.getName());
    }
}
