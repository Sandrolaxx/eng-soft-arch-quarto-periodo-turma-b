package main.java.com.fag.infra.panache;

import jakarta.enterprise.context.ApplicationScoped;
import main.java.com.fag.domain.entities.PixBO;
import main.java.com.fag.domain.repositories.IPixDatabaseRepository;
import main.java.com.fag.infra.panache.mappers.PanachePixMapper;
import main.java.com.fag.infra.panache.model.PanachePix;


@ApplicationScoped
public class PanachePixRepository implements IPixDatabaseRepository {

    @Override
    public PixBO persist(PixBO bo) {
        PanachePix entity = PanachePixMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanachePixMapper.toDomain(entity);
    }

}