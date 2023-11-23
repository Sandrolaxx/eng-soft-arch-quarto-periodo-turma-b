package com.fag.domain.usecases;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;
import com.fag.domain.mappers.PixMapper;
import com.fag.domain.repositories.IPixDataBaseRepository;
import com.fag.domain.repositories.IPixVendor;

public class PixCreate {
  private IPixVendor pixVendor;
  private IPixDataBaseRepository dataBaseRepository;

  public PixDTO execute(PixDTO dto) {
    PixBO bo = PixMapper.toBO(dto);

    PixDTO response = pixVendor.create(dto);

    dataBaseRepository.persist(bo);

    return response;
  }

  public PixCreate(IPixVendor pixVendor, IPixDataBaseRepository dataBaseRepository) {
    this.pixVendor = pixVendor;
    this.dataBaseRepository = dataBaseRepository;
  }
}