package com.example.ProjetoWebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjetoWebService.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	

}
