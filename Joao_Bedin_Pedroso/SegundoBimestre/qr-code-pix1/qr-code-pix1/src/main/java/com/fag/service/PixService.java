package com.fag.service;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.usecases.CreatePix;
import com.fag.infra.celcoin.dto.CelcoinTokenDTO;
import com.fag.infra.celcoin.repository.CelocinPixRepository;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

public class PixService {
    @Inject
    CelocinPixRepository PixRepository;

    public Response genQRCode(PixDTO dto) {

        CreatePix pixCreate = new CreatePix(PixRepository);

        return Response.ok(pixCreate.execute(dto)).build();

    }
}
