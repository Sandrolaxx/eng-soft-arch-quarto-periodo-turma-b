package com.fag.pix_api_celcoin.domain.repositories;

import com.fag.pix_api_celcoin.domain.dto.OperatorDTO;
import com.fag.pix_api_celcoin.domain.dto.ProductDTO;
import com.fag.pix_api_celcoin.domain.dto.RechargeDTO;

import java.util.List;

public interface IRechargeVendorRepository {

    RechargeDTO create(RechargeDTO recharge);

    List<OperatorDTO> listOperators(Integer stateCode, Integer category);

    List<ProductDTO> listProducts(Integer stateCode, Integer operatorId);

}
