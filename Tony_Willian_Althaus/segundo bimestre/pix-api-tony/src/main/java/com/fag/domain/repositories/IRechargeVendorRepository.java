package main.java.com.fag.domain.repositories;


import java.util.List;
import main.java.com.fag.domain.dto.OperatorDTO;
import main.java.com.fag.domain.dto.ProductDTO;
import main.java.com.fag.domain.dto.RechargeDTO;


public interface IRechargeVendorRepository {
    RechargeDTO create(RechargeDTO recharge);

    List<OperatorDTO> listOperators(Integer stateCode, Integer category);

    List<ProductDTO> listProducts(Integer stateCode, Integer operatorId);
}
