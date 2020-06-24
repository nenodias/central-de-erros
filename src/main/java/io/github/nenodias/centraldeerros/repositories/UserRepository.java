package io.github.nenodias.centraldeerros.repositories;

import io.github.nenodias.centraldeerros.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

}
