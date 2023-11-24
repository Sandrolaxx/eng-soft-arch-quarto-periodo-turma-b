package com.fag.domain.usecases;

import com.fag.domain.dto.ProductDTO;
import com.fag.domain.repositories.IRechargeVendor;
import java.util.List;

public class ListProducts {

    private IRechargeVendor vendor;

    public ListProducts(IRechargeVendor vendor) {
        this.vendor = vendor;
    }

    public List<ProductDTO> execute(Integer operatorId, Integer stateCode) {
        return vendor.listProducts(stateCode, operatorId);
    }
}
