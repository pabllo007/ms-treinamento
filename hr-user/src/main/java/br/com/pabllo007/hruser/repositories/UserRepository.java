package br.com.pabllo007.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pabllo007.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}
