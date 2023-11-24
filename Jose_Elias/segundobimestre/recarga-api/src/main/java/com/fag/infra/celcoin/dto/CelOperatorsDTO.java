package com.fag.infra.celcoin.dto;

import java.util.List;

public class CelOperatorsDTO {
    
    private List<CelOperatorDTO> providers;

    public List<CelOperatorDTO> getProviders() {
        return providers;
    }

    public void setProviders(List<CelOperatorDTO> providers) {
        this.providers = providers;
    }

}
