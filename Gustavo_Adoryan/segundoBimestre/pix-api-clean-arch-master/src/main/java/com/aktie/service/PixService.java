package com.aktie.service;

import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.usecases.CreatePix;
import com.aktie.infra.celcoin.repository.CelcoinPixRepository;
//import com.aktie.infra.mercadopago.repository.MpPixRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class PixService {
    
    @Inject
    CelcoinPixRepository celcoinPixRepository;
    //MpPixRepository mpPixRepository;

    public Response genPix(PixDTO dto) {

        CreatePix createPix = new CreatePix(celcoinPixRepository);

        PixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }

}
