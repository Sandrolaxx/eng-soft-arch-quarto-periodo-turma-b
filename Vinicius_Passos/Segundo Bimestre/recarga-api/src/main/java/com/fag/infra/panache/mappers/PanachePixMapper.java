package com.fag.infra.panache.mappers;

import com.fag.domain.entities.CoinPixBO;

import com.fag.infra.panache.model.PanachePix;

public class PanachePixMapper {

public static CoinPixBO toDomain(PanachePix entity){

return new CoinPixBO(entity.getId(), entity.getKey(), entity.getAmount(), entity.getEmvqrcps(), entity.getTransactionIdentification());
}

public static PanachePix toEntity(CoinPixBO bo){
    PanachePix entity = new PanachePix();
    entity.setId(bo.getId());
    entity.setKey(bo.getKey());
    entity.setTransactionIdentification(bo.getTransactionIdentification());
    entity.setEmvqrcps(bo.getQrCode());
    entity.setAmount(bo.getAmount());
    return entity;
}
}