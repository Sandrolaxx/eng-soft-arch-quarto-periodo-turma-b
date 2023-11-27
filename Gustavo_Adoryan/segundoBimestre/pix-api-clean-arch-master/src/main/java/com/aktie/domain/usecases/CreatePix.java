package com.aktie.domain.usecases;

import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.entities.PixBO;
import com.aktie.domain.mappers.PixMapper;
import com.aktie.domain.repositories.IPixRepository;

public class CreatePix {

    private IPixRepository pixRepo;

    public CreatePix(IPixRepository pixRepo) {
        this.pixRepo = pixRepo;
    }

    public PixDTO execute(PixDTO dto) {
        PixBO bo = PixMapper.toBO(dto);

        PixDTO response = pixRepo.create(dto);

        return response;
    }

}
