package com.fag.domain.usecases;

import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.entities.RechargeBO;
import com.fag.domain.mappers.RechargeMapper;
import com.fag.domain.repositories.IRechargeDataBaseRepository;
import com.fag.domain.repositories.IRechargeVendor;

public class CreateRecharge {

    private IRechargeVendor vendor;

    private IRechargeDataBaseRepository dbRepository;

    public CreateRecharge(IRechargeVendor vendor) {
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
