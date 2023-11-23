package com.fag.service;

import com.fag.domain.dto.MPPixDTO;
import com.fag.domain.usecases.MPCreatePix;
import com.fag.infra.mercadopago.repository.MPixRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MPPixService {
    
    @Inject
    MPixRepository mpPixRepository;

    public MPPixDTO genPix(MPPixDTO dto) {

        MPCreatePix createPix = new MPCreatePix(mpPixRepository);

        return createPix.execute(dto);
    }

}
