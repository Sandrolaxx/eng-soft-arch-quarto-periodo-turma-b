package com.ryan.projetofinal.service;

import com.ryan.projetofinal.domain.dto.PixDTO;	
import com.ryan.projetofinal.domain.usecases.PixCreate;
import com.ryan.projetofinal.infra.mercadopago.repository.MpPixRepository;

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
