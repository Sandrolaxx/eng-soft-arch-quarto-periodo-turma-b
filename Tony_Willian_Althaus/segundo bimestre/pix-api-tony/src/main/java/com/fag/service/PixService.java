package main.java.com.fag.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import main.java.com.fag.domain.dto.PixDTO;
import main.java.com.fag.domain.repositories.IPixDatabaseRepository;
import main.java.com.fag.domain.usecases.CreatePixQR;
import main.java.com.fag.infra.celcoin.repository.PixCelcoinRepository;

@ApplicationScoped
public class PixService {

    @Inject
    PixCelcoinRepository celcoin;

    @Inject
    IPixDatabaseRepository panacheRepo;

    @Transactional
    public Response handlePix(PixDTO dto) {
        CreatePixQR createPix = new CreatePixQR(celcoin, panacheRepo);

        PixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }
}

