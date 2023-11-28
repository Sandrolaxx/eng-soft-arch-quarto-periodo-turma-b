package com.fag.pix_api_celcoin.domain.usecases;

import com.fag.pix_api_celcoin.domain.dto.ProductDTO;
import com.fag.pix_api_celcoin.domain.repositories.IRechargeVendorRepository;

import java.util.List;

public class ListProducts {

    private IRechargeVendorRepository vendor;

    public ListProducts(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    public List<ProductDTO> execute(Integer operatorId, Integer stateCode) {
        return vendor.listProducts(stateCode, operatorId);
    }

}
