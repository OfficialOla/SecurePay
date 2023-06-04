package africa.semicolon.SecurePay.repositories;

import africa.semicolon.SecurePay.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
