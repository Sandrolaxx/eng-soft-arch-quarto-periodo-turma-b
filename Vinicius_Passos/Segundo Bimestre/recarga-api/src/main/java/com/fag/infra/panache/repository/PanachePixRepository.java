package com.fag.infra.panache.repository;

import jakarta.enterprise.context.ApplicationScoped;
import com.fag.domain.entities.CoinPixBO;
import com.fag.domain.repositories.IPixDatabaseRepository;
import com.fag.infra.panache.mappers.PanachePixMapper;
import com.fag.infra.panache.model.PanachePix;

@ApplicationScoped
public class PanachePixRepository implements IPixDatabaseRepository {
    @Override
    public CoinPixBO persist(CoinPixBO bo){
        PanachePix entity = PanachePixMapper.toEntity(bo);
        entity.persistAndFlush();
        return PanachePixMapper.toDomain(entity);
    }
}
