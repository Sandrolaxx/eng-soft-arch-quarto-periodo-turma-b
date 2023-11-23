package com.fag.infra.panache.mappers;

import com.fag.domain.entities.PixBO;
import com.fag.infra.panache.model.PanacheCode;

public class PanachePixMapper {
    public static PixBO toDomain(PanacheCode entity) {

        return new PixBO(entity.getId(), entity.getKey(), entity.getAmount(), entity.getEmvqrcps(),
                entity.getTransactionId());
    }

    public static PanacheCode toEntity(PixBO bo) {
        PanacheCode entity = new PanacheCode();
        entity.setId(bo.getId());
        entity.setKey(bo.getKey());
        entity.setTransactionId(bo.getTransactionId());
        entity.setEmvqrcps(bo.getQrCode());
        entity.setAmount(bo.getAmount());

        return entity;
    }

}
