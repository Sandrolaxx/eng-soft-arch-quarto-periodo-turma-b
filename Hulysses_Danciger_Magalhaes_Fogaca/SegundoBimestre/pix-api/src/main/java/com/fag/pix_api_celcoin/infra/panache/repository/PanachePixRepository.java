package com.fag.pix_api_celcoin.infra.panache.repository;

import jakarta.enterprise.context.ApplicationScoped;
import com.fag.pix_api_celcoin.domain.entities.PixBO;
import com.fag.pix_api_celcoin.domain.repositories.IPixDatabaseRepository;
import com.fag.pix_api_celcoin.infra.panache.mappers.PanachePixMapper;
import com.fag.pix_api_celcoin.infra.panache.model.PanachePix;

@ApplicationScoped
public class PanachePixRepository implements IPixDatabaseRepository {

    @Override
    public PixBO persist(PixBO bo) {
        PanachePix entity = PanachePixMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanachePixMapper.toDomain(entity);
    }
}