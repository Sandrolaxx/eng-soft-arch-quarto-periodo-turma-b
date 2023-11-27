package com.fag.domain.mappers;

import com.fag.domain.dto.MercanteDTO;
import com.fag.domain.entities.MercanteBO;

public class MercanteMapper {

    public static MercanteDTO toBO(MercanteBO bo) {
        MercanteDTO dto = new MercanteDTO();

        dto.setPostalCode(bo.getPostalCode());
        dto.setCity(bo.getCity());
        dto.setMercanteCategoryCode(bo.getMercanteCategoryCode());
        dto.setName(bo.getName());

        return dto;
    }

     public static MercanteBO toDTO(MercanteDTO bo) {

        return new MercanteBO(

                bo.getPostalCode(),
                bo.getCity(),
                bo.getMercanteCategoryCode(),
                bo.getName());

    }

}