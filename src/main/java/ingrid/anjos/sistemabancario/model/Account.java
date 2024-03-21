package ingrid.anjos.sistemabancario.model;

import ingrid.anjos.sistemabancario.model.enums.AccountStatus;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

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
  private String accountHolder;
  private String password;
  private LocalDateTime openingDate;
  private AccountStatus accountStatus;

  public Account(AccountDTO accountDTO) {
    this.balance = BigDecimal.ZERO;
    this.accountHolder = accountDTO.accountHolder();
    this.openingDate = LocalDateTime.now();
    this.password = encrypPassword(accountDTO.password());
    this.accountStatus = AccountStatus.ACTIVE;
  }
  public String encrypPassword(String rawPassword) {
    return new BCryptPasswordEncoder().encode(rawPassword);
  }
}
