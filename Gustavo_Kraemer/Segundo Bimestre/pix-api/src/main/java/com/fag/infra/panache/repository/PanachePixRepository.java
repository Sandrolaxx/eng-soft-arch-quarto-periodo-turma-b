package com.fag.infra.panache.repository;

import com.fag.domain.entities.CcPixBO;
import com.fag.domain.repositories.IPixDatabaseRepository;
import com.fag.infra.panache.mappers.PanachePixMapper;
import com.fag.infra.panache.model.PanachePixCode;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PanachePixRepository implements IPixDatabaseRepository {

  @Override
  public CcPixBO persist(CcPixBO bo) {
    PanachePixCode entity = PanachePixMapper.toEntity(bo);

    entity.persistAndFlush();

    return PanachePixMapper.toDomain(entity);
  }

}