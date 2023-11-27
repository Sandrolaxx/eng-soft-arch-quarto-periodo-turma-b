package com.fag.celcoin.domain.usecases;

import com.fag.celcoin.domain.dto.PixDTO;
import com.fag.celcoin.domain.entities.PixBO;
import com.fag.celcoin.domain.mappers.PixMapper;
import com.fag.celcoin.domain.repositories.IPixVendorRepository;

public class CreatePixQRCode {

    private IPixVendorRepository vendor;

    public CreatePixQRCode(IPixVendorRepository vendor) {
        this.vendor = vendor;
        
    }

    public PixDTO execute(PixDTO dto) {
        PixBO bo = PixMapper.toBO(dto);

        PixDTO response = vendor.create(dto);

        return response;
    }


}
