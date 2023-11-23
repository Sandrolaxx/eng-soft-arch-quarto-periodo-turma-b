package java.infra.celcoin.mappers;

import java.domain.dto.ProductDTO;
import java.infra.celcoin.dto.CelcoinProductDTO;

public class CelcoinProductMapper {

  public static ProductDTO toAppDTO(CelcoinProductDTO vendorDTO) {
    ProductDTO appDTO = new ProductDTO();

    appDTO.setCode(vendorDTO.getCode());
    appDTO.setCost(vendorDTO.getCost());
    appDTO.setName(vendorDTO.getProductName());
    appDTO.setValue(vendorDTO.getMinValue());
    appDTO.setDueProduct(vendorDTO.getDueProduct());

    return appDTO;
  }
}