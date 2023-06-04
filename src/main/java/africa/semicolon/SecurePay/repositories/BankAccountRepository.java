package africa.semicolon.SecurePay.repositories;

import africa.semicolon.SecurePay.models.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
