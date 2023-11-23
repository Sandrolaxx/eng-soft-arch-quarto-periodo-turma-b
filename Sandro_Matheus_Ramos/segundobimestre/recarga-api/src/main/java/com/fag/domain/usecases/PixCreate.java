package com.fag.domain.usecases;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;
import com.fag.domain.mappers.PixMapper;
import com.fag.domain.repositories.IPixRepository;

public class PixCreate {

    private IPixRepository pixRepo;

    public PixCreate(IPixRepository pixRepo) {
        this.pixRepo = pixRepo;
    }

    public PixDTO execute(PixDTO dto) {
        PixBO bo = PixMapper.toBO(dto);

        PixDTO createdPixDTO = pixRepo.create(dto);

        bo.updateQRCode(createdPixDTO.getEmv(),
                createdPixDTO.getBase64(),
                createdPixDTO.getExpiration());

        // databaserepo.persit(bo);

        return PixMapper.toDTO(bo);
    }

}
