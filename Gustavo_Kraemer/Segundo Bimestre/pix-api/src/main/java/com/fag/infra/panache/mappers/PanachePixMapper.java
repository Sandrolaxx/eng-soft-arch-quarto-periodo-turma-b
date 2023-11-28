package com.fag.infra.panache.mappers;

import com.fag.domain.entities.CcPixBO;
import com.fag.infra.panache.model.PanachePixCode;

public class PanachePixMapper {
  public static CcPixBO toDomain(PanachePixCode entity) {

    return new CcPixBO(entity.getId(), entity.getKey(), entity.getAmount(), entity.getEmvqrcps(), entity.getTransactionId());
  }

  public static PanachePixCode toEntity(CcPixBO bo) {
    PanachePixCode entity = new PanachePixCode();
    entity.setId(bo.getId());
    entity.setKey(bo.getKey());
    entity.setTransactionId(bo.getTransactionId());
    entity.setEmvqrcps(bo.getQrCode());
    entity.setAmount(bo.getAmount());

    return entity;
  }

}