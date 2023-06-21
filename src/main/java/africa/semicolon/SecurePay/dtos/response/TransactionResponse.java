package africa.semicolon.SecurePay.dtos.response;

import africa.semicolon.SecurePay.models.Payment;
import africa.semicolon.SecurePay.models.Status;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
@Builder
public class TransactionResponse {
    private Long id;
    private Payment payment;
    private Long sellerId;
    private Long buyerId;
    private String description;
    private LocalDateTime createdAt;
    private BigDecimal amount;
    private Status status;
}
