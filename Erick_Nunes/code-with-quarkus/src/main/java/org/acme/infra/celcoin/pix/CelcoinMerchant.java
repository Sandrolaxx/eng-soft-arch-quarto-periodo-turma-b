package org.acme.infra.celcoin.pix;

import org.acme.domain.entities.Merchant;

public class CelcoinMerchant extends Merchant {
    
    private String merchantCategoryCode;

    public CelcoinMerchant(String postalCode, String city, String name) {
            super(postalCode, name, city);
            this.merchantCategoryCode = "0";
    }

    public CelcoinMerchant(String postalCode, String city,
        String merchantCategoryCode, String name) {
            super(postalCode, name, city);
            this.merchantCategoryCode = merchantCategoryCode;
    }

    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }
}