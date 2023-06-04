package africa.semicolon.SecurePay.repositories;

import africa.semicolon.SecurePay.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
