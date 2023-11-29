package com.fag.pix_api_celcoin.infra.panache.mappers;

import com.fag.pix_api_celcoin.domain.entities.PixBO;
import com.fag.pix_api_celcoin.infra.panache.model.PanachePix;

public class PanachePixMapper {

    public static PixBO toDomain(PanachePix entity) {

        return new PixBO(entity.getId(), entity.getKey(), entity.getAmount(), entity.getEmvqrcps(), entity.getTransactionId());
    }

    public static PanachePix toEntity(PixBO bo) {
        PanachePix entity = new PanachePix();
        entity.setId(bo.getId());
        entity.setKey(bo.getKey());
        entity.setTransactionId(bo.getTransactionId());
        entity.setEmvqrcps(bo.getQrCode());
        entity.setAmount(bo.getAmount());

        return entity;
    }
}