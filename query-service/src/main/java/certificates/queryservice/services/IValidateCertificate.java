package certificates.queryservice.services;

import certificates.queryservice.dtos.CertificateDto;
import certificates.queryservice.dtos.QueryDto;
import certificates.queryservice.entities.Certificate;

public interface IValidateCertificate {

    public CertificateDto isValid(String validationCode, QueryDto query);
} 