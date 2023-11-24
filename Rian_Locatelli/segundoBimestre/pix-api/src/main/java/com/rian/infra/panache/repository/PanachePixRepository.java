package com.rian.infra.panache.repository;

import com.rian.domain.entities.PixCelcoinBO;
import com.rian.domain.repositories.IPixDataBaseRepository;
import com.rian.infra.panache.mapper.PixPanacheMapper;
import com.rian.infra.panache.model.PanachePixCode;

import jakarta.enterprise.context.ApplicationScoped;

//Implementa a interface IPixDataBaseRepository e utiliza a 
// classe PixPanacheMapper para realizar a conversão entre objetos de domínio e entidades Panache
@ApplicationScoped
public class PanachePixRepository implements IPixDataBaseRepository {

  @Override
  public PixCelcoinBO persist(PixCelcoinBO bo) {
    PanachePixCode entity = PixPanacheMapper.toEntity(bo);

    entity.persistAndFlush();

    return PixPanacheMapper.toDomain(entity);
  }
}
