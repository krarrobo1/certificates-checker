package certificates.queryservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Entity
@Table(name = "queries")
@AllArgsConstructor
@NoArgsConstructor
public class Query extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "verificationID")
    private String verificationID;
    @Column(name = "host")
    private String host;
    @Column(name = "user_agent")
    private String userAgent;
    @Column(name = "is_valid")
    private Boolean isValid;
}
