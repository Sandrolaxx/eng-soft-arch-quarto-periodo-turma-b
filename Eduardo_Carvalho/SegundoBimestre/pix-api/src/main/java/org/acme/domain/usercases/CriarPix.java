package org.acme.domain.usercases;


import org.acme.domain.dto.PixDTO;
import org.acme.domain.entities.PixBO;
import org.acme.domain.mappers.PixMapper;
import org.acme.domain.repositories.IPixRepository;

public class CriarPix {

    private IPixRepository pixRepo;

    public CriarPix(IPixRepository pixRepo) {
        this.pixRepo = pixRepo;
    }

    public PixDTO execute(PixDTO dto) {
        PixBO bo = PixMapper.toBO(dto);

        PixDTO response = pixRepo.create(dto);

        return response;
    }
}

