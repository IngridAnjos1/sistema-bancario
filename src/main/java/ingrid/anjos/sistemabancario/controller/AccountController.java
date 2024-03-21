package ingrid.anjos.sistemabancario.controller;

import ingrid.anjos.sistemabancario.model.Account;
import ingrid.anjos.sistemabancario.model.AccountDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

  @PostMapping
  public ResponseEntity<Account> create(@RequestBody AccountDTO accountDTO) {
    return
  }
};




//Um controlador é responsável por lidar com as solicitações HTTP,
// geralmente vindo de um cliente da web, e retornar uma resposta apropriada.
// Os métodos dentro de uma classe anotada com @Controller geralmente são mapeados para endpoints HTTP específicos,
// como GET, POST, PUT ou DELETE.//
