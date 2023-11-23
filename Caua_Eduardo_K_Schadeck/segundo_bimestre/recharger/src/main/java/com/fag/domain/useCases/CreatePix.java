package com.fag.domain.useCases;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;
import com.fag.domain.mappers.PixMapper;
import com.fag.domain.repositories.IPixDatabaseRepository;
import com.fag.domain.repositories.IPixVendor;

public class CreatePix {
  private IPixVendor pixVendor;
  private IPixDatabaseRepository databaseRepository;

  public PixDTO execute(PixDTO dto) {
    PixBO bo = PixMapper.toBO(dto);

    PixDTO response = pixVendor.create(dto);

    databaseRepository.persist(bo);

    return response;
  }

  public CreatePix(IPixVendor pixVendor, IPixDatabaseRepository databaseRepository) {
    this.pixVendor = pixVendor;
    this.databaseRepository = databaseRepository;
  }
}
