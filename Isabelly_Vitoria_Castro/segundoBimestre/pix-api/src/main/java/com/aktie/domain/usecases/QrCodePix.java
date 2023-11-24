package com.aktie.domain.usecases;

import com.aktie.domain.dto.CPixDTO;
import com.aktie.domain.repositories.IVendorRepository;

public class QrCodePix {
      private IVendorRepository vendor;
     

    public QrCodePix(IVendorRepository vendor){

        this.vendor = vendor;

    }

    public CPixDTO execute(CPixDTO dto){

       // CBO bo = CMapper.toBO(dto);
        CPixDTO response = vendor.create(dto);
        return response;

    }
}
