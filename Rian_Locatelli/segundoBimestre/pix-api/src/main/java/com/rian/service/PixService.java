package com.rian.service;

import com.rian.domain.dto.PixCelcoinDTO;
import com.rian.domain.repositories.IPixDataBaseRepository;
import com.rian.domain.usecases.QrCodePixCreate;
import com.rian.infra.CC.repository.PixCCoinRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class PixService {
    @Inject
    PixCCoinRepository  celcoin;

    @Inject
    IPixDataBaseRepository panacheRepo;

    @Transactional
    public Response handlePix(PixCelcoinDTO  dto) {

        QrCodePixCreate  createPix = new QrCodePixCreate (celcoin, panacheRepo);

        PixCelcoinDTO  createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }

}