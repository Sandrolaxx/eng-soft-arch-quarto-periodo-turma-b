package com.ryan.projetofinal.service;

import com.ryan.projetofinal.domain.dto.CoinPixDTO;
import com.ryan.projetofinal.domain.repositories.IPixDatabaseRepository;
import com.ryan.projetofinal.domain.usecases.PixQRCodeCreate;
import com.ryan.projetofinal.infra.celcoin.repository.CelcoinPixRepository;

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
    public Response handlePix(CoinPixDTO dto) {
        
        PixQRCodeCreate createPix = new PixQRCodeCreate(celcoin, panacheRepo);

        CoinPixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }

}
