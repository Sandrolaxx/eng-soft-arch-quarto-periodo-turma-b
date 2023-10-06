package com.fag.domain.usecases;

import com.fag.domain.entities.RechargeBO;
import com.fag.domain.interfaces.IRecharge;

public class CreateRecharge {
    
    private IRecharge vendor;

    public CreateRecharge(IRecharge vendor) {
        this.vendor = vendor;
    }
    
    public void execute (){
        RechargeBO rechargeBO = vendor.create(null);
    }
}