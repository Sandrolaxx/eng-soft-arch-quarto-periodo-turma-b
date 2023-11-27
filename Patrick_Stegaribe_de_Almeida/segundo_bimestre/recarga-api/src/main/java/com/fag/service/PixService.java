package com.fag.service;

import com.fag.domain.dto.CCpixDTO;
import com.fag.domain.usecases.PixCreate;
import com.fag.infra.celcoin.repository.CelcoinPixRepository;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;


@ApplicationScoped
public class PixService {

    @Inject
    CelcoinPixRepository celcoinPixRepository;

    @Transactional
    public Response handlePix(CCpixDTO dto){

        PixCreate pixCreate = new PixCreate(celcoinPixRepository); 

        CCpixDTO createdPix = pixCreate.execute(dto); 

        return Response.ok(createdPix).build();
    }
}

