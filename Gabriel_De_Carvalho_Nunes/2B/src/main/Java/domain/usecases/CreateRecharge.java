package java.domain.usecases;

import java.domain.dto.RechargeDTO;
import java.domain.entities.RechargeBO;
import java.domain.mappers.RechargeMapper;
import java.domain.repositories.IRechargeDataBaseRepository;
import java.domain.repositories.IRechargeVendorRepository;

public class CreateRecharge {
  private IRechargeVendorRepository vendor;

  private IRechargeDataBaseRepository dbRepository;

  public CreateRecharge(IRechargeVendorRepository vendor, IRechargeDataBaseRepository dbRepository) {
    this.vendor = vendor;
    this.dbRepository = dbRepository;
  }

  public RechargeDTO execute(RechargeDTO dto) {
    RechargeBO bo = RechargeMapper.toBO(dto);

    RechargeDTO rechargeResponse = vendor.create(dto);

    if (rechargeResponse.isSuccess()) {
      bo.handleSuccess(rechargeResponse.getReceipt(), rechargeResponse.getTransactionId());
    } else {
      bo.handleError();
    }

    dbRepository.persist(bo);

    return rechargeResponse;
  }
}