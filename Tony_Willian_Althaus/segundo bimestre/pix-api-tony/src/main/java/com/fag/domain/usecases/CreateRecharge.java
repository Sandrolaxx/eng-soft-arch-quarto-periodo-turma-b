package main.java.com.fag.domain.usecases;

import main.java.com.fag.domain.dto.RechargeDTO;
import main.java.com.fag.domain.entities.RechargeBO;
import main.java.com.fag.domain.mappers.RechargeMapper;
import main.java.com.fag.domain.repositories.IRechargeDataBaseRepository;
import main.java.com.fag.infra.celcoin.repository.IRechargeVendor;

public class CreateRecharge {
    private final IRechargeVendor vendor;
    private final IRechargeDataBaseRepository dbRepository;

    public CreateRecharge(IRechargeVendor vendor, IRechargeDataBaseRepository dbRepository) {
        this.vendor = vendor;
        this.dbRepository = dbRepository;
    }

    public RechargeDTO execute(RechargeDTO dto) {
        RechargeBO bo = RechargeMapper.toBO(dto);

        RechargeDTO rechargeResponse = vendor.create(dto);

        if(rechargeResponse.isSuccess()){
            bo.handleSucess(rechargeResponse.getReceipt(), rechargeResponse.getTransactionId());
        } else {
            bo.handleError();
        }

        dbRepository.persist(bo);

        return rechargeResponse;
    }
}