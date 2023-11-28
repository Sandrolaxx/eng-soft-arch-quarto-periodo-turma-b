package com.rian.infra.panache.mapper;

import com.rian.domain.entities.PixCelcoinBO;
import com.rian.infra.panache.model.PanachePixCode;

//Mapeaia os objetos entre o domínio PixCelcoinBO e a entidade PanachePixCode
public class PixPanacheMapper {
    public static PixCelcoinBO toDomain(PanachePixCode entity) {
        return new PixCelcoinBO(entity.getId(), entity.getKey(), entity.getAmount(), entity.getEmvqrcps(),
                entity.getTransactionId());
    }

    public static PanachePixCode toEntity(PixCelcoinBO bo) {
        PanachePixCode entity = new PanachePixCode();
        entity.setId(bo.getId());
        entity.setKey(bo.getKey());
        entity.setTransactionId(bo.getTransactionId());
        entity.setEmvqrcps(bo.getQrCode());
        entity.setAmount(bo.getAmount());

        return entity;
    }
}
