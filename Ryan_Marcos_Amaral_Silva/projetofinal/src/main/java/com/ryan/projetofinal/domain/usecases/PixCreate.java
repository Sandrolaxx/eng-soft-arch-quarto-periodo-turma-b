package com.ryan.projetofinal.domain.usecases;

import com.ryan.projetofinal.domain.dto.PixDTO;
import com.ryan.projetofinal.domain.entities.PixBO;
import com.ryan.projetofinal.domain.mappers.PixMapper;
import com.ryan.projetofinal.domain.repositories.IPixRepository;

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
