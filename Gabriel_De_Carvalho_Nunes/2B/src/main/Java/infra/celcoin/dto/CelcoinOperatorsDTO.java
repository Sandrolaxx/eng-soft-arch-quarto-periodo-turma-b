package java.infra.celcoin.dto;

import java.util.List;

public class CelcoinOperatorsDTO {
  private List<CelcoinOperatorDTO> providers;

  public List<CelcoinOperatorDTO> getProviders() {
    return providers;
  }

  public void setProviders(List<CelcoinOperatorDTO> providers) {
    this.providers = providers;
  }
}