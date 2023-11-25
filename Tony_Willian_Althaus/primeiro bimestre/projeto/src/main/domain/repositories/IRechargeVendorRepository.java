package main.domain.repositories;


import java.util.List;

import main.domain.dto.OperatorDTO;
import main.domain.dto.ProductDTO;
import main.domain.dto.RechargeDTO;

public interface IRechargeVendorRepository {
    RechargeDTO create(RechargeDTO recharge);

    List<OperatorDTO> listOperators(Integer stateCode, Integer category);

    List<ProductDTO> listProducts(Integer stateCode, Integer operatorId);
}
