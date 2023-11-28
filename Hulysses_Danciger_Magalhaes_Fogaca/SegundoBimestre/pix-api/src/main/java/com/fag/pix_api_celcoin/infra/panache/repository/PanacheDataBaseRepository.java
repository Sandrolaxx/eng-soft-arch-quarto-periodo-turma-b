package com.fag.pix_api_celcoin.infra.panache.repository;

import jakarta.enterprise.context.ApplicationScoped;
import com.fag.pix_api_celcoin.domain.entities.RechargeBO;
import com.fag.pix_api_celcoin.domain.repositories.IRechargeDataBaseRepository;
import com.fag.pix_api_celcoin.infra.panache.mappers.PanacheRechargeMapper;
import com.fag.pix_api_celcoin.infra.panache.model.PanacheRecharge;

@ApplicationScoped
public class PanacheDataBaseRepository implements IRechargeDataBaseRepository {

    @Override
    public RechargeBO persist(RechargeBO bo) {
        PanacheRecharge entity = PanacheRechargeMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanacheRechargeMapper.toDomain(entity);
    }
}