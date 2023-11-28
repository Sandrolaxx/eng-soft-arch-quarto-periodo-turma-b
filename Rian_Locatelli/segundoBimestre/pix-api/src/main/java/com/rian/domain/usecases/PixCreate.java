package com.rian.domain.usecases;

import com.rian.domain.dto.PixDTO;
import com.rian.domain.entities.PixBO;
import com.rian.domain.mapper.PixMapper;
import com.rian.domain.repositories.IPixRepository;

public class PixCreate {

    //Executa a criação de um objeto PixDTO, convertendo-o para PixBO, persistindo-o e atualizando informações.
    public PixDTO execute(PixDTO pixDTO) {

        PixBO bo = PixMapper.toBO(pixDTO);

        PixDTO createpix = pixRepo.create(pixDTO);

        bo.updateQRcode(createpix.getEmv(), createpix.getBase64(), createpix.getExpiration());

        return createpix;
    }

    //Construtor que recebe um IPixRepository para interação com o repositório Pix.
    private IPixRepository pixRepo;

    public PixCreate(IPixRepository pixRepo) {
        this.pixRepo = pixRepo;
    }
}
