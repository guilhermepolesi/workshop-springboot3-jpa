package com.educandoweb.Webservicesspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Webservicesspringbootjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
