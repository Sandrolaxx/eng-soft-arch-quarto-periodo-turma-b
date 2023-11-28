package com.fag.pix_api_celcoin.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import com.fag.pix_api_celcoin.domain.dto.PixDTO;
import com.fag.pix_api_celcoin.domain.repositories.IPixDatabaseRepository;
import com.fag.pix_api_celcoin.domain.usecases.CreatePixQRCode;
import com.fag.pix_api_celcoin.infra.celcoin.repository.PixCelcoinRepository;

@ApplicationScoped
public class PixService {

    @Inject
    PixCelcoinRepository pixCelcoinRepository;

    @Inject
    IPixDatabaseRepository pixDatabaseRepository;

    @Transactional
    public Response handlePix(PixDTO dto) {
        CreatePixQRCode createPix = new CreatePixQRCode(pixCelcoinRepository, pixDatabaseRepository);

        PixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }
}