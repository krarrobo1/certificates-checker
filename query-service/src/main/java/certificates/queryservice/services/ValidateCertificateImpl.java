package certificates.queryservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import certificates.queryservice.dtos.CertificateDto;
import certificates.queryservice.entities.Certificate;
import certificates.queryservice.exceptions.InvalidCertificateException;
import certificates.queryservice.repositories.CertificateRepository;

@Service
public class ValidateCertificateImpl implements IValidateCertificate{

    @Autowired
    private CertificateRepository certificateRepository;

    @Override
    public CertificateDto isValid(String validationCode) {
        
        Certificate certificate = certificateRepository.findByValidationCode(validationCode);
        if(certificate == null){
            throw new InvalidCertificateException("Invalid certificate !");
        }
        CertificateDto certificateDto = new CertificateDto();
        return certificateDto;
    }
    
}
