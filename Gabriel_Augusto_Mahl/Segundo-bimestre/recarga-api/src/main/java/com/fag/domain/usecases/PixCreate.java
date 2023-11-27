package com.fag.domain.usecases;

import com.fag.domain.repositories.IPixRepository;

public class PixCreate {
    
    private IPixRepository pixRepo;

    public Pixcreate(IPixRepository pixRepo){
        this.pixRepo = pixRepo;
    }

    public PixDTO execute(PixDTO dto){
        Pix bo = new PixMapper.toBO(dto);

        PixDTO createdPixDTO = pixRepo.create(dto);

        return createdPixDTO;
    }
}
