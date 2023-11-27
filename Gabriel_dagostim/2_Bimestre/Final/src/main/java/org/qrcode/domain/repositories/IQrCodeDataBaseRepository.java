package org.qrcode.domain.repositories;

import org.qrcode.domain.entities.QrCodeBO;

public interface IQrCodeDataBaseRepository {
    QrCodeBO persist(QrCodeBO bo);
}