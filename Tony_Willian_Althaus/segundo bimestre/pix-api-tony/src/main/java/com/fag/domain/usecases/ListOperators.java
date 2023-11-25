package main.java.com.fag.domain.usecases;

import java.util.List;

import main.java.com.fag.domain.dto.OperatorDTO;
import main.java.com.fag.domain.repositories.IRechargeVendorRepository;

public class ListOperators {
    private final IRechargeVendorRepository vendor;

    public ListOperators(IRechargeVendorRepository vendor) {
        this.vendor = vendor;
    }

    public List<OperatorDTO> execute(Integer stateCode, Integer category) {
        return vendor.listOperators(stateCode, category);
    }
}
