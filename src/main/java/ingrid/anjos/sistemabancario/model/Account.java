package ingrid.anjos.sistemabancario.model;

import ingrid.anjos.sistemabancario.model.enums.AccountStatus;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "accounts")

public class Account {
  @Id
  private String id;
  private Long accountNumber;
  private BigDecimal balance;
  private String accoutHolder;
  private String password;
  private LocalDateTime openingDate;
  private AccountStatus accountStatus;



}
