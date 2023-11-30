import java.math.BigDecimal;

import jakarta.json.bind.annotation.JsonbProperty;

public class MpPixDto {

    private String description;
    @JsonbProperty ("payment_method_id");
    private String paymentMethod;

    @JsonbProperty ("transaction_amount");
    private BigDecimal amount;

    
}