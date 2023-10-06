package com.fag.domain.interfaces;

import java.util.List;

import com.fag.domain.entities.OperatorBO;
import com.fag.domain.entities.RechargeBO;

public interface IRecharge {
    
    RechargeBO create(RechargeBO recharge);
    List<OperatorBO> listOperators();
    List<ProductsBO> listProducts(Integer operadorId);
}