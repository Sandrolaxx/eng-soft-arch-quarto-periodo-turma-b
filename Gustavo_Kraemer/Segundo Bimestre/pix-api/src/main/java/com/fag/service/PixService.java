package com.fag.service;

import com.fag.domain.dto.PixDTO;	
import com.fag.domain.usecases.PixCreate;
import com.fag.infra.mercadopago.repository.MpPixRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PixService {
    
    @Inject
    MpPixRepository mpPixRepository;

    public PixDTO genPix(PixDTO dto){
        
        PixCreate createPix = new PixCreate(mpPixRepository);
        dto = createPix.execute(dto);
        return createPix.execute(dto);

    }
}
