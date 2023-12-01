public class PixDTO {
    private String id; 
    private String email;
    private String description; 
    private String emv; 
    private String base64;
    private LocalDateTime expirate; 
    private BigDecimal amount;


    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getEmv() {
        return emv;
    }
    public void setEmv(String emv) {
        this.emv = emv;
    }
    public String getBase64() {
        return base64;
    }
    public void setBase64(String base64) {
        this.base64 = base64;
    }
    public LocalDateTime getExpirate() {
        return expirate;
    }
    public void setExpirate(LocalDateTime expirate) {
        this.expirate = expirate;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    
}
