package com.ryan.projetofinal.infra.panache.repository;

import com.ryan.projetofinal.domain.entities.CoinPixBO;
import com.ryan.projetofinal.domain.repositories.IPixDatabaseRepository;
import com.ryan.projetofinal.infra.panache.mappers.PanachePixMapper;
import com.ryan.projetofinal.infra.panache.model.PanachePixModel;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PanachePixRepository implements IPixDatabaseRepository {

  @Override
  public CoinPixBO persist(CoinPixBO bo) {
    PanachePixModel entity = PanachePixMapper.toEntity(bo);

    entity.persistAndFlush();

    return PanachePixMapper.toDomain(entity);
  }

}