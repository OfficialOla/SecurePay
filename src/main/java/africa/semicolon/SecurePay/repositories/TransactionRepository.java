package africa.semicolon.SecurePay.repositories;

import africa.semicolon.SecurePay.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
