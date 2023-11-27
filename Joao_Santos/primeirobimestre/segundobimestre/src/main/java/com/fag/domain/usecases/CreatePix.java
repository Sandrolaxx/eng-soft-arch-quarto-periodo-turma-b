package com.fag.domain.usecases;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;
import com.fag.domain.mappers.PixMapper;
import com.fag.domain.repositories.IPixDataBaseRepository;
import com.fag.domain.repositories.IPixRepository;

public class CreatePix {
  private IPixRepository pixRepository;
  private IPixDataBaseRepository databaseRepository;

  public PixDTO execute(PixDTO dto) {
    PixBO bo = PixMapper.toBO(dto);

    PixDTO response = pixRepository.create(dto);

    databaseRepository.persist(bo);

    return response;
  }

  public CreatePix(IPixRepository pixRepository, IPixDataBaseRepository databaseRepository) {
    this.pixRepository = pixRepository;
    this.databaseRepository = databaseRepository;
  }
}
