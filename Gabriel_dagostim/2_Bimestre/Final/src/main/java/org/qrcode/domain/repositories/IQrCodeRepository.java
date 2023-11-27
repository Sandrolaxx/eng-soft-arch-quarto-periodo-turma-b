package org.qrcode.domain.repositories;

import org.qrcode.domain.dto.QrCodeDTO;

public interface IQrCodeRepository {
    QrCodeDTO create(QrCodeDTO dto);
}