package com.fag.domain.usecases;

import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.entities.RechargeBO;
import com.fag.domain.mappers.RechargeMapper;
import com.fag.domain.repositories.IRechargeDataBaseRepository;
import com.fag.domain.repositories.IRechargeVendor;

public class CreateRecharge {

  private IRechargeVendor rechargeVendor;

  private IRechargeDataBaseRepository databaseRepository;

  public CreateRecharge(IRechargeVendor vendor, IRechargeDataBaseRepository databaseRepository) {
    this.rechargeVendor = rechargeVendor;
    this.databaseRepository = databaseRepository;
  }

  public RechargeDTO execute(RechargeDTO dto) {
    RechargeBO bo = RechargeMapper.toBO(dto);

    RechargeDTO rechargeResponse = rechargeVendor.create(dto);

    if (rechargeResponse.isSuccess()) {
      bo.handleSuccess(rechargeResponse.getReceipt(), rechargeResponse.getTransactionId());
    } else {
      bo.handleError();
    }

    databaseRepository.persist(bo);

    return rechargeResponse;
  }

}
