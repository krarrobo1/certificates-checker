package certificates.queryservice.helpers;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import certificates.queryservice.dtos.QueryDto;

public class LogRequest {
    public static String sendToLogService(QueryDto queryDto) {
        RestTemplate restTemplate = new RestTemplate();

        // final String baseUrl = "http://localhost:" + "3000" + "/logger";
        final String baseUrl = "http://log-service/logger";

        URI uri;
        String resultStr = "";
        try {
            uri = new URI(baseUrl);
            ResponseEntity<String> result = restTemplate.postForEntity(uri, queryDto, String.class);
            resultStr = result.getBody();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return resultStr;
    }
}
