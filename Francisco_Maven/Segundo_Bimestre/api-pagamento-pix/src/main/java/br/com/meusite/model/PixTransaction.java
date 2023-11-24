package br.com.meusite.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.math.BigDecimal;

@Entity
public class PixTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "payment_key", nullable = false)
    private String paymentKey;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "merchant_info")
    private String merchantInfo;

    @Column(name = "transaction_id")
    private String transactionId;

    // Construtor padrão
    public PixTransaction() {
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getPaymentKey() {
        return paymentKey;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getMerchantInfo() {
        return merchantInfo;
    }

    public String getTransactionId() {
        return transactionId;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setPaymentKey(String paymentKey) {
        this.paymentKey = paymentKey;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setMerchantInfo(String merchantInfo) {
        this.merchantInfo = merchantInfo;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    
}
