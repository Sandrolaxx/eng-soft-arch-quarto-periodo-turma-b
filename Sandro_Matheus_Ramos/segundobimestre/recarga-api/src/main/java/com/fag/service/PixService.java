package com.fag.service;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.usecases.PixCreate;
//import com.fag.infra.mercadopago.repository.MpPixRepository;
import com.fag.infra.celcoin.repository.RechargeCelcoin;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class PixService {

    //antigo
    @Inject
    MpPixRepository mpPixRepository;

    public Response genQRCode(PixDTO dto) {

        PixCreate pixCreate = new PixCreate(mpPixRepository);

        return Response.ok(pixCreate.execute(dto)).build();

    }
    
    //novo  
    @Inject
    RechargeCelcoin RechargeCelcoin;

    public Response genQRCode(getToken() token) {

        PixCreate pixCreate = new PixCreate(mpPixRepository);

        return Response.ok(pixCreate.execute(token)).build();

    }
}
