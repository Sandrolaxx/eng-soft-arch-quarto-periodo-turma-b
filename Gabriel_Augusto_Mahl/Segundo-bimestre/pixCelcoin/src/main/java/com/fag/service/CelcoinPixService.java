package com.fag.service;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.repositories.IPixDatabaseRepository;
import com.fag.domain.usercases.PixQrCodeCreate;
import com.fag.infra.celcoin.repository.CelcoinPixRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class CelcoinPixService {
    @Inject
    CelcoinPixRepository celcoin;

    @Inject
    IPixDatabaseRepository panacheRepo;

    @Transactional
    public Response handlePix(PixDTO dto) {

        PixQrCodeCreate createPix = new PixQrCodeCreate(celcoin, panacheRepo);

        PixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }
}
