package com.fag.domain.usecases;

import com.fag.domain.dto.MPPixDTO;
import com.fag.domain.entities.MPPixBO;
import com.fag.domain.mappers.MPPixMapper;
import com.fag.domain.repositories.MPIPixRepository;

public class MPCreatePix {

    private MPIPixRepository pixRepo;

    public MPCreatePix(MPIPixRepository pixRepo) {
        this.pixRepo = pixRepo;
    }

    public MPPixDTO execute(MPPixDTO pixDTO) {

        MPPixBO bo = MPPixMapper.toBO(pixDTO);

        MPPixDTO createdPix = pixRepo.create(pixDTO);

        bo.updateEmvData(createdPix.getEmv(), createdPix.getBase64(), createdPix.getExpiration());

        return createdPix;
    
    }

}
