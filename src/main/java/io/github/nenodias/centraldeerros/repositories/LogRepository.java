package io.github.nenodias.centraldeerros.repositories;

import io.github.nenodias.centraldeerros.models.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {

}
