package org.acme.infra.celcoin.pix;

import java.math.BigDecimal;

import org.acme.domain.entities.Pix;

public class CelcoinRequestStaticPix extends Pix {

    private String transactionIdentification;

    private CelcoinMerchant merchant;

    private String additionalInformation;

    public CelcoinRequestStaticPix(final String key, 
            final BigDecimal amount,
            final CelcoinMerchant merchant,
            final String txId,
            final String additionalInfo) {
        super(key, amount);
        this.merchant = merchant;
        this.transactionIdentification = txId;
        this.additionalInformation = additionalInfo;
    }

    public String getTransactionIdentification() {
        return transactionIdentification;
    }

    public CelcoinMerchant getMerchant() {
        return merchant;
    }
    
    public String getAdditionalInformation() {
        return additionalInformation;
    }
}