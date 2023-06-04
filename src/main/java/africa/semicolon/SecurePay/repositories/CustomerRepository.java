package africa.semicolon.SecurePay.repositories;

import africa.semicolon.SecurePay.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
