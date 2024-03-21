package ingrid.anjos.sistemabancario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SistemaBancarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaBancarioApplication.class, args);
	}

}
