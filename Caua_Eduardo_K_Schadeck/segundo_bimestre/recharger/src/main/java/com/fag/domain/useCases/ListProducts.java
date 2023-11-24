package com.fag.domain.usecases;

import java.util.List;

import com.fag.domain.dto.ProductDTO;
import com.fag.domain.repositories.IRechargeVendor;

public class ListProducts {

  private IRechargeVendor vendor;

  public ListProducts(IRechargeVendor vendor) {
    this.vendor = vendor;
  }

  public List<ProductDTO> execute(Integer operatorId, Integer stateCode) {
    return vendor.listProducts(stateCode, operatorId);
  }

}
