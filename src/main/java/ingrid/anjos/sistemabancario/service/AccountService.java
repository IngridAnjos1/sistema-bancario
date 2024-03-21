package ingrid.anjos.sistemabancario.service;

import ingrid.anjos.sistemabancario.model.Account;
import ingrid.anjos.sistemabancario.model.AccountDTO;

import ingrid.anjos.sistemabancario.repositories.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
  private final AccountRepository repository;


  public AccountService(AccountRepository repository) {
    this.repository = repository;
  }

  public Account createAccount(AccountDTO accountDTO) {
    Account newAccount = new Account(accountDTO);
    newAccount.setAccountNumber(accountNumber());
    this.repository.save(newAccount);
    return newAccount;
  }

  public List<Account> getAll() {
    return this.repository.findAll();
  }

  public Optional<Account> getById(String id) {
    return this.repository.findById(id);
  }

  private Long accountNumber() {
    var intSize = this.repository.findAll().size();
    return (long) intSize + 1;
  }
}


