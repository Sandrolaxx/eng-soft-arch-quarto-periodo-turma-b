package main.java.com.fag.domain.usecases;

import java.util.List;

import main.java.com.fag.domain.dto.ProductDTO;
import main.java.com.fag.domain.repositories.IRechargeVendorRepository;

public class ListProducts {
    private final IRechargeVendorRepository vendor;

    public ListProducts(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    public List<ProductDTO> execute(Integer operatorId, Integer stateCode) {
        return vendor.listProducts(stateCode, operatorId);
    }
}
