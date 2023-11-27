package com.fag.service;

import com.fag.domain.dto.CoinPixDTO;
import com.fag.infra.celcoin.repository.CelcoinPixRepository;
import com.fag.domain.repositories.IPixDatabaseRepository;
import com.fag.domain.usecases.CreateQrCode;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;


@ApplicationScoped
public class CelcoinPixService {
    @Inject
    CelcoinPixRepository cel;

    @Inject
    IPixDatabaseRepository repo;

    @Transactional
    public Response handlePix(CoinPixDTO dto){

        CreateQrCode createCode = new CreateQrCode(cel, repo);
        CoinPixDTO pix = createCode.execute(dto);
        return Response.ok(pix).build();
    }
   

}
