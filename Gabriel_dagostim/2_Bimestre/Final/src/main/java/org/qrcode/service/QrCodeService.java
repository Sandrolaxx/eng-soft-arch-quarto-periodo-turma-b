package org.qrcode.service;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.qrcode.domain.dto.QrCodeDTO;
import org.qrcode.domain.usecases.CreateQrCode;
import org.qrcode.infra.celcoin.repositories.CelcoinPixRepository;
import org.qrcode.infra.panache.PanacheDataBaseRepository;

@ApplicationScoped
public class QrCodeService {
    @Inject
    CelcoinPixRepository ccPixRepository;
    @Inject
    PanacheDataBaseRepository panacheDataBaseRepository;

    public QrCodeDTO genPix(QrCodeDTO dto) {
        CreateQrCode createPixQrCode = new CreateQrCode(this.ccPixRepository, this.panacheDataBaseRepository);
        return createPixQrCode.execute(dto);
    }
}