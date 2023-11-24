package com.fag.celcoin.service;

import com.fag.celcoin.domain.dto.PixDTO;
import com.fag.celcoin.domain.usecases.CreatePixQRCode;
import com.fag.celcoin.infra.celcoin.repository.PixCelcoinRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class PixService {

    @Inject
    PixCelcoinRepository celcoin;



    @Transactional
    public Response handlePix(PixDTO dto) {
        CreatePixQRCode createPix = new CreatePixQRCode(celcoin);

        PixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }
}
