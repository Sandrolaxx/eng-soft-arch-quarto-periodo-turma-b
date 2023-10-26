package com.fag.domain.interfaces;

import java.util.List;

import com.fag.domain.entities.RechargeBO;
import com.fag.domain.entities.OperatorBO;

public interface IRecharge {
    
    RechargeBO create(RechargeBO recharge);

    List<OperatorBO> listOperators();

    List<OperatorBO> listProducts(Integer operatorId);

}
