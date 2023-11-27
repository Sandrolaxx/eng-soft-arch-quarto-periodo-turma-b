package com.fag.domain.repositories; //são os contratos

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;

import java.util.List;

public interface IRechargeVendor {   
    
    // Listar operadores                                 
    List<OperatorDTO> listOperators(Integer stateCode, Integer category);
    // Consultar produtos por operadora
    List<ProductDTO> listProducts(Integer stateCode, Integer operatorId);
    // Realizar a recarga
    RechargeDTO create(RechargeDTO recharge);
}


