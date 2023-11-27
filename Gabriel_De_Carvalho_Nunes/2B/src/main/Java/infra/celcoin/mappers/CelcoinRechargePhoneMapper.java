package java.infra.celcoin.mappers;

import java.domain.dto.PhoneDTO;
import java.infra.celcoin.dto.CelcoinPhoneDTO;

public class CelcoinRechargePhoneMapper {
  public static PhoneDTO toAppDTO(CelcoinPhoneDTO vendorDTO) {
    PhoneDTO appDTO = new PhoneDTO();

    appDTO.setStateCode(vendorDTO.getStateCode());
    appDTO.setCountryCode(vendorDTO.getCountryCode());
    appDTO.setNumber(vendorDTO.getNumber());

    return appDTO;
  }

  public static CelcoinPhoneDTO toVendorDTO(PhoneDTO appDTO) {
    CelcoinPhoneDTO vendorDTO = new CelcoinPhoneDTO();

    vendorDTO.setStateCode(appDTO.getStateCode());
    vendorDTO.setCountryCode(appDTO.getCountryCode());
    vendorDTO.setNumber(appDTO.getNumber());

    return vendorDTO;
  }
}