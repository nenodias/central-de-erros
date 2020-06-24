package io.github.nenodias.centraldeerros;

import io.github.nenodias.centraldeerros.models.User;
import io.github.nenodias.centraldeerros.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableJpaRepositories
@SpringBootApplication
public class CentralDeErrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralDeErrosApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(final UserRepository repository) {
		return (args) -> {
			User user = repository.findByUsername("nenodias").orElse(null);
			if(user == null){
				user = new User();
				user.setUsername("nenodias");
				user.setEmail("horacio.dias92@gmail.com");
				user.setName("Horácio Dias");
				user.setPassword(new BCryptPasswordEncoder().encode("123"));
				user.setAccountNonExpired(true);
				user.setAccountNonLocked(true);
				user.setCredentialsNonExpired(true);
				user.setEnabled(true);
				repository.saveAndFlush(user);
			}
		};
	}
}
