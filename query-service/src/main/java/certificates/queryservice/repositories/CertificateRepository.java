package certificates.queryservice.repositories;

import org.springframework.data.repository.Repository;

import certificates.queryservice.entities.Certificate;

public interface CertificateRepository extends Repository<Certificate, Long> {
    Certificate findByValidationCode(String validationCode);
}
