package com.fag.domain.usecases;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;
import com.fag.domain.mappers.PixMapper;
import com.fag.domain.repositories.IPixRepository;

public class CreatePix {

    private IPixRepository pixRepo;

    public CreatePix(IPixRepository pixRepo){
        this.pixRepo = pixRepo;
    }

    public PixDTO execute(PixDTO pixDTO){

        PixBO bo = PixMapper.toBO(pixDTO);

        PixDTO createdPix = pixRepo.create(pixDTO);

        bo.updateEmv(createdPix.getEmv());

        return createdPix;

    }
    
}

