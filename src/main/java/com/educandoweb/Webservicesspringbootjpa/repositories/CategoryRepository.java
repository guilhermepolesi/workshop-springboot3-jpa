package com.educandoweb.Webservicesspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Webservicesspringbootjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
