package com.ryan.projetofinal.infra.panache.mappers;

import com.ryan.projetofinal.domain.entities.CoinPixBO;
import com.ryan.projetofinal.infra.panache.model.PanachePixModel;

public class PanachePixMapper {
  public static CoinPixBO toDomain(PanachePixModel entity) {

    return new CoinPixBO(entity.getId(), entity.getKey(), entity.getAmount(), entity.getEmvqrcps(), entity.getTransactionId());
  }

  public static PanachePixModel toEntity(CoinPixBO bo) {
    PanachePixModel entity = new PanachePixModel();
    entity.setId(bo.getId());
    entity.setKey(bo.getKey());
    entity.setTransactionId(bo.getTransactionId());
    entity.setEmvqrcps(bo.getQrCode());
    entity.setAmount(bo.getAmount());

    return entity;
  }

}