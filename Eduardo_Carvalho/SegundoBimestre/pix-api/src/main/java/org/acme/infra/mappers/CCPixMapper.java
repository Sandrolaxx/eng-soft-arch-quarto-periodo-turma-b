package org.acme.infra.mappers;

import org.acme.domain.dto.PixDTO;
import org.acme.infra.dto.CCPixDTO;

public class CCPixMapper {

    public static PixDTO toAppDTO(CCPixDTO pixDTO) {
        PixDTO dto = new PixDTO();
        dto.setKey(pixDTO.getKey());
        dto.setAmount(pixDTO.getAmount());
        dto.setMerchant(CCMerchantMapper.toAppDTO(pixDTO.getMerchant()));

        return dto;
    }

    public static CCPixDTO toVendorDTO(PixDTO appDTO) {
        CCPixDTO dto = new CCPixDTO();

        dto.setKey(appDTO.getKey());
        dto.setAmount(appDTO.getAmount());
        dto.setMerchant(CCMerchantMapper.toVendorDTO(appDTO.getMerchant()));

        return dto;
    }
}
