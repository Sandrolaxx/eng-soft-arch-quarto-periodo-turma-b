package com.aktie.infra.panache.repository;
import com.aktie.domain.entities.PixBO;
import com.aktie.domain.repositories.IPixDatabaseRepository;
import com.aktie.infra.panache.mappers.PanachePixMapper;
import com.aktie.infra.panache.model.PanachePixCode;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PanachePixRepository implements IPixDatabaseRepository {

    @Override
    public PixBO persist(PixBO bo) {
        PanachePixCode entity = PanachePixMapper.toEntity(bo);
        entity.persistAndFlush();
        return PanachePixMapper.toDomain(entity);
    }
}