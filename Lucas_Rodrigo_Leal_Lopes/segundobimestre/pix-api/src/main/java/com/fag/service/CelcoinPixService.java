package com.fag.service;

import com.fag.domain.dto.CcPixDTO;
import com.fag.domain.repositories.IPixDatabaseRepository;
import com.fag.domain.usecases.PixQrCodeCreate;
import com.fag.infra.celcoin.repository.CelcoinPixRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class CelcoinPixService {
    @Inject //talvez tira aqui
    CelcoinPixRepository celcoin;

    @Inject
    IPixDatabaseRepository panacheRepo;

    @Transactional
    public Response handlePix(CcPixDTO dto) {
        
        PixQrCodeCreate createPix = new PixQrCodeCreate(celcoin, panacheRepo);

        CcPixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }

}
