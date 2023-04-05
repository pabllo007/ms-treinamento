package br.com.pabllo007.hrworker.repositories;

import br.com.pabllo007.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
