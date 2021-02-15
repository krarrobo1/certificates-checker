package certificates.queryservice.services;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import certificates.queryservice.dtos.CertificateDto;
import certificates.queryservice.dtos.QueryDto;
import certificates.queryservice.entities.Certificate;
import certificates.queryservice.exceptions.InvalidCertificateException;
import certificates.queryservice.helpers.LogRequest;
import certificates.queryservice.repositories.CertificateRepository;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ValidateCertificateImpl implements IValidateCertificate {

    @Autowired
    private CertificateRepository certificateRepository;

    

    @Override
    public CertificateDto isValid(String validationCode, QueryDto queryDto) {
        CertificateDto certificateDto;
        // query Date
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String queryDate = formatter.format(date);
        queryDto.setQueryDate(queryDate);
        // Query certificate
        Certificate certificate = certificateRepository.findByValidationCode(validationCode);

        if (Objects.isNull(certificate)) {
            queryDto.setIsValid(false);
            // send the query log 
            LogRequest.sendToLogService(queryDto);
            throw new InvalidCertificateException("Invalid certificate !");
        } else {
            String studentName = certificate.getStudent().getFirstName() + " " + certificate.getStudent().getLastName();
            String issuerName = certificate.getCourse().getInstitutionName();
            String courseTitle = certificate.getCourse().getTitle();
            Double totalHours = certificate.getCourse().getDuration();
            certificateDto = new CertificateDto(studentName, issuerName, courseTitle, totalHours);
            queryDto.setIsValid(true);
            // send the query log 
            LogRequest.sendToLogService(queryDto);
        }
      
        return certificateDto;
    }
}
