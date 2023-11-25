package main.java.com.fag.infra.panache;

import jakarta.enterprise.context.ApplicationScoped;
import main.java.com.fag.domain.entities.RechargeBO;
import main.java.com.fag.domain.repositories.IRechargeDataBaseRepository;
import main.java.com.fag.infra.panache.mappers.PanacheRechargeMapper;
import main.java.com.fag.infra.panache.model.PanacheRecharge;

@ApplicationScoped
public class PanacheDataBaseRepository implements IRechargeDataBaseRepository{

    @Override
    public RechargeBO persist(RechargeBO bo) {
        PanacheRecharge entity = PanacheRechargeMapper.toEntity(bo);
        
        entity.persistAndFlush();
        
        return PanacheRechargeMapper.toDomain(entity);
    }
}
