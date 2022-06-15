package br.com.mudi.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mudi.mudi.model.User;

public interface UserRepository extends JpaRepository<User, String>{
	
	User findByUsername(String username);

}
