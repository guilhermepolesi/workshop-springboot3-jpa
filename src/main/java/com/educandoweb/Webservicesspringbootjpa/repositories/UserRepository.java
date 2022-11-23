package com.educandoweb.Webservicesspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Webservicesspringbootjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
