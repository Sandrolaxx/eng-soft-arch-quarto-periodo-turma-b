package org.qrcode.infra.panache;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "qrcode_master")
public class PanacheQrCode extends PanacheEntityBase {
    @Id
    private UUID id;
    @Column
    private String qrcode;
    @Column
    private String key;
    @Column
    private String postalCode;
    @Column
    private String city;
    @Column
    private String merchantName;
    @Column
    private String description;
    @Column
    private BigDecimal amount;

    public UUID getId() {
        return this.id;
    }

    public String getQrcode() {
        return this.qrcode;
    }

    public String getKey() {
        return this.key;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getCity() {
        return this.city;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public void setQrcode(final String qrcode) {
        this.qrcode = qrcode;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public void setMerchantName(final String merchantName) {
        this.merchantName = merchantName;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setAmount(final BigDecimal amount) {
        this.amount = amount;
    }
}