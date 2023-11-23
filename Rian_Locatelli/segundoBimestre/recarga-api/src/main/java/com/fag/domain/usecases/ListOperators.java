package com.fag.domain.usecases;

import java.util.List;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.repositories.IRechargeVendor;

public class ListOperators {

  private IRechargeVendor rechargeVendor;

  public ListOperators(IRechargeVendor vendor) {
    
    this.rechargeVendor = vendor;
    
  }

  public List<OperatorDTO> execute(Integer stateCode, Integer category) {
    
    return rechargeVendor.listOperators(stateCode, category);

  }

}
