package com.aktie.service;

import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.usecases.CreatePix;
import com.aktie.infra.mercadoPago.repository.MpPixRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PixService {

    @Inject
    MpPixRepository mpPixRepository;

    public PixDTO genPix(PixDTO dto) {

        CreatePix createPix = new CreatePix(mpPixRepository);
        dto = createPix.execute(dto);
        return createPix.execute(dto);

    }
}