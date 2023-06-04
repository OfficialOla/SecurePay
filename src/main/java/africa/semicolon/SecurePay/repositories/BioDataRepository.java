package africa.semicolon.SecurePay.repositories;

import africa.semicolon.SecurePay.models.BioData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BioDataRepository extends JpaRepository<BioData, Long> {
}
