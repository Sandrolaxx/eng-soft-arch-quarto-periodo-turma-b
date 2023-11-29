package com.fag.pix_api_celcoin.domain.usecases;

import com.fag.pix_api_celcoin.domain.dto.RechargeDTO;
import com.fag.pix_api_celcoin.domain.entities.RechargeBO;
import com.fag.pix_api_celcoin.domain.mappers.RechargeMapper;
import com.fag.pix_api_celcoin.domain.repositories.IRechargeDataBaseRepository;
import com.fag.pix_api_celcoin.domain.repositories.IRechargeVendorRepository;

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
