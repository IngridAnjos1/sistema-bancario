package ingrid.anjos.sistemabancario.repositories;

import ingrid.anjos.sistemabancario.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {
}
