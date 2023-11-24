package com.aktie.service;

import com.aktie.domain.dto.CPixDTO;
import com.aktie.domain.usecases.QrCodePix;
import com.aktie.infra.celcoin.repository.CelcoinPixRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class CelcoinPixService {
    @Inject
    CelcoinPixRepository celcoin;

    @Transactional
    public Response handlePix(CPixDTO dto) {

        QrCodePix createPix = new QrCodePix(celcoin);

        CPixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }

}
