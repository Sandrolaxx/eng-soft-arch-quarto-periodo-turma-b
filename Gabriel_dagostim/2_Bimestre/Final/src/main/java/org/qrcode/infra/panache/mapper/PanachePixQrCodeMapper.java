package org.qrcode.infra.panache.mapper;

import org.qrcode.domain.entities.QrCodeBO;
import org.qrcode.infra.panache.PanacheQrCode;

public class PanachePixQrCodeMapper {
    public static PanacheQrCode toEntity(QrCodeBO pixQrCodeBO) {
        PanacheQrCode panachePixQrCode = new PanacheQrCode();
        panachePixQrCode.setId(pixQrCodeBO.getId());
        panachePixQrCode.setKey(pixQrCodeBO.getKey());
        panachePixQrCode.setPostalCode(pixQrCodeBO.getPostalCode());
        panachePixQrCode.setQrcode(pixQrCodeBO.getQrcode());
        panachePixQrCode.setMerchantName(pixQrCodeBO.getMerchantName());
        panachePixQrCode.setCity(pixQrCodeBO.getCity());
        panachePixQrCode.setAmount(pixQrCodeBO.getAmount());
        panachePixQrCode.setDescription(pixQrCodeBO.getDescription());
        return panachePixQrCode;
    }

    public static QrCodeBO toDomain(PanacheQrCode panachePix) {
        QrCodeBO pixQrCodeBO = new QrCodeBO();
        pixQrCodeBO.setId(panachePix.getId());
        pixQrCodeBO.setKey(panachePix.getKey());
        pixQrCodeBO.setPostalCode(panachePix.getPostalCode());
        pixQrCodeBO.setQrcode(panachePix.getQrcode());
        pixQrCodeBO.setMerchantName(panachePix.getMerchantName());
        pixQrCodeBO.setCity(panachePix.getCity());
        pixQrCodeBO.setAmount(panachePix.getAmount());
        pixQrCodeBO.setDescription(panachePix.getDescription());
        return pixQrCodeBO;
    }
}