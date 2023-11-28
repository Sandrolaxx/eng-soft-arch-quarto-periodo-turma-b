package com.fag.domain.usecases; //mercado pago

import com.fag.domain.repositories.IPixRepositoty;
import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;
import com.fag.domain.mappers.PixMapper;

public class PixCreate {

    private IPixRepositoty pixRepo;

    public PixCreate(IPixRepositoty pixRepo){
        this.pixRepo = pixRepo;
    }
    
    public PixDTO execute(PixDTO pixDTO){
        
        PixBO bo = PixMapper.toBO(pixDTO);

        PixDTO createdpix = pixRepo.create(pixDTO);

        bo.updateQRcode(createdpix.getEmv(), createdpix.getBase64(), createdpix.getExpiration());

        return createdpix;
    }
}