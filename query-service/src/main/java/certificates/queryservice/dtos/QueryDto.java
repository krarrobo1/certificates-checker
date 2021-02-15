package certificates.queryservice.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class QueryDto {
    private String verificationID;
    private String host;
    private String userAgent;
    private String queryDate;
    private Boolean isValid;
}
