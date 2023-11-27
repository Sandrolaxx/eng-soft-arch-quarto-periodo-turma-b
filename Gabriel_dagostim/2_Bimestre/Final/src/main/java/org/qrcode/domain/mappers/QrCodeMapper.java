package org.qrcode.domain.mappers;

import org.qrcode.domain.dto.QrCodeDTO;
import org.qrcode.domain.entities.QrCodeBO;

public class QrCodeMapper {
    public static QrCodeDTO toDTO(QrCodeBO bo) {
        QrCodeDTO dto = new QrCodeDTO();
        dto.setId(bo.getId().toString());
        dto.setAmount(bo.getAmount());
        dto.setCity(bo.getCity());
        dto.setKey(bo.getKey());
        dto.setDescription(bo.getDescription());
        dto.setMerchantName(bo.getMerchantName());
        dto.setPostalCode(bo.getPostalCode());
        return dto;
    }

    public static QrCodeBO toBO(QrCodeDTO dto) {
        return new QrCodeBO(dto.getId(), dto.getKey(), dto.getPostalCode(), dto.getCity(), dto.getMerchantName(), dto.getDescription(), dto.getQrCode(), dto.getAmount());
    }
}