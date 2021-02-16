package certificates.queryservice.controllers;


import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import certificates.queryservice.dtos.CertificateDto;
import certificates.queryservice.dtos.QueryDto;
import certificates.queryservice.services.IValidateCertificate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/certificate")
public class CertificateController {
    @Autowired
    IValidateCertificate certificateService;

    @GetMapping()
    public ResponseEntity<CertificateDto> getMethodName(@RequestParam String code, HttpServletRequest req) {

        // String origin = request.getHeader("origin");
        Map<String, String> result = new HashMap<>();

        Enumeration headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = req.getHeader(key);
            // result.put(key, value);
            System.out.printf("\n key %s ---> %s", key, value);
        }

      
        String clientIp = req.getHeader("x-forwarded-for");
        String userAgent = req.getHeader("user-agent");
        
        QueryDto queryDto = new QueryDto();
        queryDto.setHost(clientIp);
        queryDto.setVerificationID(code);
        queryDto.setUserAgent(userAgent);

        CertificateDto response = certificateService.isValid(code, queryDto); 
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
