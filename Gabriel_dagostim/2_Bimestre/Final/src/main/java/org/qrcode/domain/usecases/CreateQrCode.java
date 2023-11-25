package org.qrcode.domain.usecases;

import org.qrcode.domain.dto.QrCodeDTO;
import org.qrcode.domain.entities.QrCodeBO;
import org.qrcode.domain.mappers.QrCodeMapper;
import org.qrcode.domain.repositories.IQrCodeDataBaseRepository;
import org.qrcode.domain.repositories.IQrCodeRepository;

public class CreateQrCode {
    private final IQrCodeRepository pixQrCodeRepos;
    private final IQrCodeDataBaseRepository dataBaseRepos;

    public CreateQrCode(IQrCodeRepository pixQrCodeRepo, IQrCodeDataBaseRepository dataBaseRepos) {
        this.pixQrCodeRepos = pixQrCodeRepo;
        this.dataBaseRepos = dataBaseRepos;
    }

    public QrCodeDTO execute(QrCodeDTO pixQrCodeDTO) {
        QrCodeDTO createdPix = this.pixQrCodeRepos.create(pixQrCodeDTO);
        QrCodeBO bo = QrCodeMapper.toBO(createdPix);
        this.dataBaseRepos.persist(bo);
        return createdPix;
    }
}