package com.fag.domain.usecases;

import com.fag.domain.dto.CCpixDTO;
import com.fag.domain.repositories.ICcPixRepository;


public class PixCreate {

    private ICcPixRepository pixRepo;

    public PixCreate(ICcPixRepository pixRepo) {
        this.pixRepo = pixRepo;
    }

    public CCpixDTO execute(CCpixDTO dto) {


        CCpixDTO createdCCpixDTO = pixRepo.create(dto);


        return createdCCpixDTO;


    }

}
