package java.infra.celcoin.mappers;

import java.domain.dto.RechargeDTO;
import java.infra.celcoin.dto.CelcoinRechargeDTO;
import java.infra.celcoin.dto.CelcoinRechargeValueDTO;

public class CelcoinRechargeMapper {

  public static CelcoinRechargeDTO toVendorDTO(RechargeDTO appDTO) {
    CelcoinRechargeDTO vendorDTO = new CelcoinRechargeDTO();
    CelcoinRechargeValueDTO topUpData = new CelcoinRechargeValueDTO();

    topUpData.setValue(appDTO.getValue());

    vendorDTO.setCpfCnpj(appDTO.getDocument());
    vendorDTO.setPhone(CelcoinRechargePhoneMapper.toVendorDTO(appDTO.getPhone()));
    vendorDTO.setProviderId(appDTO.getOperatorId());
    vendorDTO.setTopupData(topUpData);

    return vendorDTO;
  }

}