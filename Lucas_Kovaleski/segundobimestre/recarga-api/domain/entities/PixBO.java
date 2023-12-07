import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class PixBO {
    private UUID id; 
    private String email;
    private String description; 
    private String emv; 
    private String base64;
    private LocalDateTime expirate; 
    private BigDecimal amount;
    
    public PixBO(UUID id, String email, String description, String emv, String base64, LocalDateTime expirate,
            BigDecimal amount) {
        this.id = id;
        this.email = email;
        this.description = description;
        this.emv = emv;
        this.base64 = base64;
        this.expirate = expirate;
        this.amount = amount;

        validate();
    }

    private void validate(){

        
    }

    private void updateQRCode(String emv, String base64, LocalDateTime expirate){
        this.emv;
        this.base64;
        this.expirate;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public String getEmv() {
        return emv;
    }

    public String getBase64() {
        return base64;
    }

    public LocalDateTime getExpirate() {
        return expirate;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
