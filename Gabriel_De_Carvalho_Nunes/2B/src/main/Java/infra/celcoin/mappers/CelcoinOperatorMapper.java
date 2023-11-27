package java.infra.celcoin.mappers;

import java.domain.dto.OperatorDTO;
import java.infra.celcoin.dto.CelcoinOperatorDTO;

public class CelcoinOperatorMapper {

  public static OperatorDTO toAppDTO(CelcoinOperatorDTO vendorDTO) {
    OperatorDTO appDTO = new OperatorDTO();

    appDTO.setCategory(vendorDTO.getCategory());
    appDTO.setMaxValue(vendorDTO.getMaxValue());
    appDTO.setMinValue(vendorDTO.getMinValue());
    appDTO.setName(vendorDTO.getName());
    appDTO.setProviderId(vendorDTO.getProviderId());
    appDTO.setRechargeType(vendorDTO.getRechargeType());

    return appDTO;
  }
}