package main.domain.usecases;

import java.util.List;

import main.domain.dto.OperatorDTO;
import main.domain.repositories.IRechargeVendorRepository;

public class ListOperators {
    private final IRechargeVendorRepository vendor;

    public ListOperators(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    public List<OperatorDTO> execute(Integer stateCode, Integer category) {
        return vendor.listOperators(stateCode, category);
    }
}
