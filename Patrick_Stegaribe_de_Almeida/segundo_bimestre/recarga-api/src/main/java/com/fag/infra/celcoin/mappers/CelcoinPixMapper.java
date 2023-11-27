package com.fag.infra.celcoin.mappers;

import com.fag.domain.dto.CCpixDTO;
import com.fag.infra.celcoin.dto.CelcoinPixDTO;

public class CelcoinPixMapper {
    
    public static CCpixDTO toAppDTO(CelcoinPixDTO vendorDTO) {

        CCpixDTO appDTO = new CCpixDTO();

        appDTO.setKey(vendorDTO.getKey());
        appDTO.setAmount(vendorDTO.getAmount());
        appDTO.setMerchant(CelcoinMerchantMapper.toAppDTO(vendorDTO.getMerchant()));

        return appDTO;
    }

    public static CelcoinPixDTO toVendorDTO(CCpixDTO appDTO) {

        CelcoinPixDTO vendorDTO = new CelcoinPixDTO();

        vendorDTO.setKey(appDTO.getKey());
        vendorDTO.setAmount(appDTO.getAmount());
        vendorDTO.setMerchant((CelcoinMerchantMapper.toVendorDTO(appDTO.getMerchant())));

        return vendorDTO;
    }


}
