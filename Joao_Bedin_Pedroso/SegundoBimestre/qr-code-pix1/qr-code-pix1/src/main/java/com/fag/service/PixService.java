package com.fag.service;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.usecases.CreatePix;
import com.fag.infra.celcoin.repository.CelcoinPixRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class PixService {
    @Inject
    CelcoinPixRepository PixRepository;

    public Response genQRCode(PixDTO dto) {

        CreatePix pixCreate = new CreatePix(PixRepository);

        return Response.ok(pixCreate.execute(dto)).build();

    }
}
