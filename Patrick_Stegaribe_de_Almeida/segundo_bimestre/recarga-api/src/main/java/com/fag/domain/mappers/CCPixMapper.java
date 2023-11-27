package com.fag.domain.mappers;

import com.fag.domain.dto.CCpixDTO;
import com.fag.domain.entities.CCpix;

public class CCPixMapper {


    public static CCpixDTO toDTO(CCpix bo) {
        CCpixDTO dto = new CCpixDTO();

        dto.setId(bo.getId());
        dto.setKey(bo.getKey());
        dto.setAmount(bo.getAmount());
        dto.setQrCode(bo.getQrCode());
        dto.setTransactionIdentification(bo.getTransactionIdentification());

        return dto;
    }

    public static CCpix toBO(CCpixDTO dto) {
        
        return new CCpix(

                dto.getId(),
                dto.getKey(),
                dto.getAmount(),
                dto.getQrCode(),
                dto.getTransactionIdentification());

    }

}
