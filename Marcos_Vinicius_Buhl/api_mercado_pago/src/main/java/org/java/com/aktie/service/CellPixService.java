package com.aktie.service;
import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.repositories.IPixDatabaseRepository;
import com.aktie.domain.usercases.PixQrCodeCreate;
import com.aktie.infra.celcoin.repository.CelPixRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class CelPixService {
    @Inject
    CelPixRepository celcoin;
    @Inject
    IPixDatabaseRepository panacheRepo;
    @Transactional
    public Response handlePix(PixDTO dto) {
        PixQrCodeCreate createPix = new PixQrCodeCreate(celcoin, panacheRepo);
        PixDTO createdPix = createPix.execute(dto);
        return Response.ok(createdPix).build();
    }
}