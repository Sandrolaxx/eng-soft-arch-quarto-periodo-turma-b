package main.domain.usecases;

import java.util.List;

import main.domain.dto.ProductDTO;
import main.domain.repositories.IRechargeVendorRepository;

public class ListProducts {
    private final IRechargeVendorRepository vendor;

    public ListProducts(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    public List<ProductDTO> execute(Integer operatorId) {
        return vendor.listProducts(operatorId, operatorId);
    }
}
