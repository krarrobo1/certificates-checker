package certificates.queryservice.helpers;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import certificates.queryservice.dtos.QueryDto;

public class LogRequest {
    public static void sendToLogService(QueryDto queryDto) {
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://localhost:" + "3000" + "/logger";
        URI uri;
        try {
            uri = new URI(baseUrl);
            ResponseEntity<String> result = restTemplate.postForEntity(uri, queryDto, String.class);
            System.out.println(result.getStatusCode());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
