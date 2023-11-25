package org.qrcode.infra.panache;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import org.qrcode.domain.entities.QrCodeBO;
import org.qrcode.domain.repositories.IQrCodeDataBaseRepository;
import org.qrcode.infra.panache.mapper.PanachePixQrCodeMapper;

@ApplicationScoped
public class PanacheDataBaseRepository implements IQrCodeDataBaseRepository {
    @Transactional
    public QrCodeBO persist(QrCodeBO bo) {
        PanacheQrCode entity = PanachePixQrCodeMapper.toEntity(bo);
        entity.persistAndFlush();
        return PanachePixQrCodeMapper.toDomain(entity);
    }
}