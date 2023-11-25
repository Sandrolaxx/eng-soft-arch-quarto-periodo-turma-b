package main.java.com.fag.infra.celcoin.mappers;

import main.java.com.fag.domain.dto.OperatorDTO;
import main.java.com.fag.infra.celcoin.dto.CelcoinOperatorDTO;


public class CelcoinOperatorMapper {

    public static OperatorDTO toAppDTO(CelcoinOperatorDTO vendorDTO) {
        OperatorDTO appDTO = new OperatorDTO();

        appDTO.setCategory(vendorDTO.getCategory());
        appDTO.setMaxValue(vendorDTO.getMaxValue());
        appDTO.setMinValue(vendorDTO.getMinValue());
        appDTO.setName(vendorDTO.getName());
        appDTO.setProviderId(vendorDTO.getProviderID());

        return appDTO;
    }
}