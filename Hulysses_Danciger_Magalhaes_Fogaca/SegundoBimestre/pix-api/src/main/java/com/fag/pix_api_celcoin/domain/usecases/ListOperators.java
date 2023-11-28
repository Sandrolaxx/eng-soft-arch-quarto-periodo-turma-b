package com.fag.pix_api_celcoin.domain.usecases;

import com.fag.pix_api_celcoin.domain.dto.OperatorDTO;
import com.fag.pix_api_celcoin.domain.repositories.IRechargeVendorRepository;

import java.util.List;

public class ListOperators {

    private IRechargeVendorRepository vendor;

    public ListOperators(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    public List<OperatorDTO> execute(Integer stateCode, Integer category) {
        return (List<OperatorDTO>) vendor.listOperators(stateCode, category);
    }

}
