package main.java.com.fag.infra.celcoin.mappers;

import main.java.com.fag.domain.dto.ProductDTO;
import main.java.com.fag.infra.celcoin.dto.CelcoinProductDTO;


public class CelcoinProductMapper {

    public static ProductDTO toAppDTO(CelcoinProductDTO vendorDTO){
        ProductDTO appDTO = new ProductDTO();

        appDTO.setDue(vendorDTO.getDueProduct());
        appDTO.setName(vendorDTO.getProductName());
        appDTO.setValue(vendorDTO.getMinValue());

        return appDTO;
    }
}